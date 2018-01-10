package jp.hikahikaru17.zenbasic;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEvent;
import net.java.games.input.ControllerListener;
import net.java.games.input.Rumbler;

import static jp.hikahikaru17.zenbasic.ZenBasic.print;

public class MyControllerEvent implements ControllerListener {

    @Override
    public void controllerRemoved(ControllerEvent controllerEvent) {
        //nothing
    }

    @Override
    public void controllerAdded(ControllerEvent controllerEvent) {
        //nothing
        for (Rumbler r : controllerEvent.getController().getRumblers()) {
            print("Axis:" + r.getAxisName(), true);
        }
    }
}
