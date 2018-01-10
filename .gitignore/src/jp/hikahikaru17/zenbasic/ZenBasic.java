package jp.hikahikaru17.zenbasic;
import javax.swing.*;
import javax.swing.text.JTextComponent;
//import a.b.c;
import net.java.games.input.Component;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

// import net.java.*;
public class ZenBasic extends JFrame implements ActionListener {
    static final String APPNAME = "Zen Basic";
    //static final int MAX_FRAME = 60;
    public static final int MAX_FLAME = 60;
    static JFrame window = new JFrame();
    static ArrayList<Controller> controllers = new ArrayList<>();
    ZenBasic() {
        Controller ctrler = null;// = detectController(Controller.Type.GAMEPAD);
        for (Controller c : ControllerEnvironment.getDefaultEnvironment().getControllers()) {
            //print("[DBG]" + c.getName() + "," + c.getType() + "," + c.getPortNumber(), true);
            if (c.getType() == Controller.Type.GAMEPAD || c.getType() == Controller.Type.STICK) {
                int axises = 0;
                for (Component co : c.getComponents()) {
                    if (co.getIdentifier() == Component.Identifier.Axis.X || co.getIdentifier() == Component.Identifier.Axis.Y) {
                        axises++;
                    }
                }
                if (axises >= 2 && getButtons(c).length >= 2) {
                    ctrler = c;
                    controllers.add(c);
                    print("valid : " + c.getName() + "," + c.getType() + "," + c.getPortNumber() + "," + c.getPortType().toString(), true);
                }
            }
        }
        JFrame window = new JFrame(APPNAME);
        ParseZenBaic parseZen = new ParseZenBaic();
        CtrlerInput cti = new CtrlerInput(ctrler);
        window.setBounds(100, 100, 400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // print(e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                print(e.getExtendedKeyCode(), true);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // print(e.getKeyChar());
            }
        });

        window.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                print(e.getID());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int mouseX = e.getXOnScreen();
                int mouseY = e.getYOnScreen();
            }
        });

        window.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        JPanel p = new JPanel();

        JTextField text1 = new JTextField("住所1", 20);
        JTextField text2 = new JTextField("住所2", 20);
        JButton button = new JButton("取得");
        button.addActionListener(this);
        JLabel label = new JLabel();

        p.add(text1);
        p.add(text2);
        p.add(button);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
        contentPane.add(label, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        ZenBasic zb = new ZenBasic();
        if (args.length == 0) {
            System.out.print("To display help, add \"--help\" argument.");
            System.exit(0);
        }

        switch (args[0].toLowerCase()) {
            case "--compile":
                break;
            case "--help":
                break;
            case "--run":
                break;
            case "--ide":
                break;
            case "--":
                break;
            default:
                System.out.print("To display help, add \"--help\" argument.");
                System.exit(0);
        }
        //ControllerInputDetecter cid0 = new ControllerInputDetecter(controllers.get(0));
        //cid0.run();
        //ControllerInputDetecter cid1 = new ControllerInputDetecter(controllers.get(1));
        //cid1.run();
        ControllerInputDetecter cid2 = new ControllerInputDetecter(controllers.get(2));
        cid2.run();
        //while(window.isActive()) {
            //text.setText(Long.toBinaryString(cti.button()));
            //print(Long.toBinaryString(cti.button()), true);
        //}
        //window.add();
    }

    /**
     * Return the available buttons on this controller (by priority order).
     *
     * @param controller
     * @return
     */
    private static Component[] getButtons(Controller controller) {
        List<Component> buttons = new ArrayList<Component>();
        // Get this controllers components (buttons and axis)
        Component[] components = controller.getComponents();
        for (Component component : components) {
            if (component.getIdentifier() instanceof Component.Identifier.Button) {
                buttons.add(component);
            }
        }
        return buttons.toArray(new Component[0]);
    }

    static public void print(char c) {
        print(c, false);
    }
    static public void print(long l) {
        print(l, false);
    }
    static public void print(String s) {
        print(s, false);
    }
    static public void print(Object o) {
        print(o, false);
    }

    static public void print(char c, boolean ln) {
        if (ln) {
            System.out.println(c);
        } else {
            System.out.print(c);
        }
    }
    static public void print(long l, boolean ln) {
        if (ln) {
            System.out.println(l);
        } else {
            System.out.print(l);
        }
    }
    static public void print(Object o, boolean ln) {
        if (ln) {
            System.out.println(o);
        } else {
            System.out.print(o);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //label.setText(text1.getText() + text2.getText());
    }
}
