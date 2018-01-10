package jp.hikahikaru17.zenbasic;

import net.java.games.input.Controller;
import static jp.hikahikaru17.zenbasic.ZenBasic.print;

public class ControllerInputDetecter extends Thread {
    Controller controller;
    CtrlerInput ci;
    long oldInput = 0;
    ControllerInputDetecter(Controller c) {
        this.controller = c;
        this.ci = new CtrlerInput(c);
    }
    @Override
    public void run() {
        print("Started detect(" + controller.getName() + ")" + "", true);
        while(true) {
            if (!controller.poll()) { //Disconnected
                //no longer avaiable
                this.end();
            }
            //if (oldInput != ci.button()) {
                oldInput = ci.button();
                //print("Input detected : " + oldInput, true);
            //}
            try {
                Thread.sleep(25L);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
        }
    }

    public void end() {
        print(  controller.getName() + " is no longer avaiable");
        controller = null;
        ci = null;
    }
}
