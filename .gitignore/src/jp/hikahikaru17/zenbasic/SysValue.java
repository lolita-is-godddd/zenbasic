package jp.hikahikaru17.zenbasic;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class SysValue {
    int tabStep = 4;
    boolean sysBeep = true;
    boolean debug = false;
    int hardware = -4;
    int version = 0xFF301200;
    public Calendar cld = Calendar.getInstance();
    // YYYY/MM/DD
    String date = cld.get(Calendar.YEAR) + "/" + String.format("%02d", cld.get(Calendar.MONTH)) + "/" + String.format("%02d", cld.get(Calendar.DAY_OF_MONTH));
    // HH:MM:SS
    String time = cld.get(Calendar.HOUR) + ":" + String.format("%02d", cld.get(Calendar.MINUTE)) + "/" + String.format("%02d", cld.get(Calendar.SECOND));
    long millisecFromExecute = 0;


    public void setCld(Calendar cld) {
        this.cld = cld;
    }
}
