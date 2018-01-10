package jp.hikahikaru17.zenbasic;

import net.java.games.input.Component;
import net.java.games.input.Controller;
import net.java.games.input.EventQueue;
import net.java.games.input.Rumbler;

final class NullController implements Controller {

    static final Controller INSTANCE = new NullController();

    @Override
    public Controller[] getControllers() {
        return new Controller[0];
    }

    @Override
    public Type getType() {
        return Controller.Type.UNKNOWN;
    }

    @Override
    public Component[] getComponents() {
        return new Component[0];
    }

    @Override
    public Component getComponent(Component.Identifier id) {
        return null;
    }

    @Override
    public Rumbler[] getRumblers() {
        return new Rumbler[0];
    }

    @Override
    public boolean poll() {
        return false;
    }

    @Override
    public void setEventQueueSize(int size) {
    }

    @Override
    public EventQueue getEventQueue() {
        return null;
    }

    @Override
    public PortType getPortType() {
        return Controller.PortType.UNKNOWN;
    }

    @Override
    public int getPortNumber() {
        return -1;
    }

    @Override
    public String getName() {
        return "NullController";
    }

}

