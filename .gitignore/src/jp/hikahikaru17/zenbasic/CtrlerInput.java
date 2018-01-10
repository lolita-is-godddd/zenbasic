package jp.hikahikaru17.zenbasic;

import net.java.games.input.Component;
import net.java.games.input.Controller;

import static jp.hikahikaru17.zenbasic.ZenBasic.print;

public class CtrlerInput {
    private Controller controller;

    /**
     *
     * @param @NotNull c
     */

    CtrlerInput(Controller c) {
        this.controller = c;
    }

    private static boolean isButton(Component c) {
        if (!c.isAnalog() && !c.isRelative()) {
            String cn = c.getIdentifier().getClass().getName();
            if (cn.endsWith("Button")) {
                return true;
            }
        }
        return false;
    }

    public long button() {
        long ret = 0;
        Component.Identifier.Button[] buttons = {
                                                Component.Identifier.Button._0, Component.Identifier.Button._1, Component.Identifier.Button._2, Component.Identifier.Button._3,
                                                Component.Identifier.Button._4, Component.Identifier.Button._5, Component.Identifier.Button._6, Component.Identifier.Button._7,
                                                Component.Identifier.Button._8, Component.Identifier.Button._9, Component.Identifier.Button._10, Component.Identifier.Button._11,
                                                Component.Identifier.Button._12, Component.Identifier.Button._13, Component.Identifier.Button._14, Component.Identifier.Button._15,
                                                Component.Identifier.Button._16, Component.Identifier.Button._17, Component.Identifier.Button._18, Component.Identifier.Button._19,
                                                Component.Identifier.Button._20, Component.Identifier.Button._21, Component.Identifier.Button._22, Component.Identifier.Button._23,
                                                Component.Identifier.Button._24, Component.Identifier.Button._25, Component.Identifier.Button._26, Component.Identifier.Button._27,
                                                Component.Identifier.Button._28, Component.Identifier.Button._29, Component.Identifier.Button._30, Component.Identifier.Button._31,
        };
        //print(controller.getName() + ")");
        for (Component c : controller.getComponents()) {
            //if (!isButton(c)) {
            //continue;
            //}
            //int i = 0;
            try {
                Component.Identifier i = c.getIdentifier();
                //print(i.toString()+"="+c.getPollData()+"\t");
                if (i.toString().matches("^[0-9]*$")) {
                    int buttonidx = Integer.parseInt(i.getName());
                    if (c.getPollData() != 0.0f) {
                        //print(c.toString() + "is in!");
                        ret |= toLong(Math.pow(2, buttonidx));
                    }
                }
                //return ret;
                //for (Component.Identifier.Button b : buttons) {
                //    if (controller.getComponent(b).getPollData() != 0) {
                //        ret = ret << 1 + 1;
                //    }
                //}
            } catch (NullPointerException e) {
                e.printStackTrace();
                return 0;
            }

            //Component.Identifier.Button b = new Component.Identifier.Button(Component.Identifier.Button.);
            //print (c.getIdentifier().getName() + "=" + c.getIdentifier() + ";");
        //print(this.controller.getComponent(Component.Identifier.Button.B).getPollData(), true);
        //    print(c.getIdentifier().getName() + "=" +  + ";");
        }
        //print("",true);
        return ret;
    }

    public long toLong(Double d) {
        return Long.parseLong(String.format("%.0f", d));
    }
}
