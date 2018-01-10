package jp.hikahikaru17.zenbasic;

public class UpdateSysValue extends Thread {
    SysValue sysValue;
    UpdateSysValue(SysValue s) {
        this.sysValue = s;
    }
    @Override
    public void run() {

        try {
            Thread.sleep(1000/ZenBasic.MAX_FLAME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
