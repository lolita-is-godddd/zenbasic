/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.hikahikaru17.zenbasic.joyconLib;

/**
 *
 * @author renardn
 */
public class JoyconConstant {
    
    //Other Values
    public static final short VENDOR_ID = 0x057E;
    public static final String MANUFACTURER = "Nintendo";
    public static final short JOYCON_LEFT = 0x2006;
    public static final short JOYCON_RIGHT = 0x2007;

    //Universal Values
    public static final String SL = "SL";
    public static final int SL_ON = 16;
    public static final int SL_OFF = -SL_ON;

    public static final String SR = "SR";
    public static final int SR_ON = 32;
    public static final int SR_OFF = -SR_ON;

    //Left Joycon Values
    //First Byte
    public static final String LEFT = "LEFT";
    public static final int LEFT_ON = 1;
    public static final int LEFT_OFF = -LEFT_ON;

    public static final String DOWN = "DOWN";
    public static final int DOWN_ON = 2;
    public static final int DOWN_OFF = -DOWN_ON;

    public static final String UP = "UP";
    public static final int UP_ON = 4;
    public static final int UP_OFF = -UP_ON;

    public static final String RIGHT = "RIGHT";
    public static final int RIGHT_ON = 8;
    public static final int RIGHT_OFF = -RIGHT_ON;

    //Second Byte
    public static final String MINUS = "MINUS";
    public static final int MINUS_ON = 1;
    public static final int MINUS_OFF = -MINUS_ON;

    public static final String L_CLICKJOY = "L_CLICKJOY";
    public static final int L_CLICKJOY_ON = 4;
    public static final int L_CLICKJOY_OFF = -L_CLICKJOY_ON;

    public static final String CAPTURE = "CAPTURE";
    public static final int CAPTURE_ON = 32;
    public static final int CAPTURE_OFF = -CAPTURE_ON;

    public static final String L = "L";
    public static final int L_ON = 64;
    public static final int L_OFF = -L_ON;

    public static final String ZL = "ZL";
    public static final int ZL_ON = -128;
    public static final int ZL_OFF = -ZL_ON;

    //Right Joycon Values
    //First Byte
    public static final String A = "A";
    public static final int A_ON = 1;
    public static final int A_OFF = -A_ON;
    
    public static final String X = "X";
    public static final int X_ON = 2;
    public static final int X_OFF = -X_ON;
    
    public static final String B = "B";
    public static final int B_ON = 4;
    public static final int B_OFF = -B_ON;
    
    public static final String Y = "Y";
    public static final int Y_ON = 8;
    public static final int Y_OFF = -Y_ON;
    
    //Second Byte
    public static final String PLUS = "PLUS";
    public static final int PLUS_ON = 4;
    public static final int PLUS_OFF = -PLUS_ON;
    
    public static final String R_CLICKJOY = "R_CLICKJOY";
    public static final int R_CLICKJOY_ON = 8;
    public static final int R_CLICKJOY_OFF = -R_CLICKJOY_ON;
    
    public static final String HOME = "HOME";
    public static final int HOME_ON = 16;
    public static final int HOME_OFF = -HOME_ON;
    
    public static final String R = "R";
    public static final int R_ON = 64;
    public static final int R_OFF = -R_ON;
    
    public static final String ZR = "ZR";
    public static final int ZR_ON = -128;
    public static final int ZR_OFF = -ZR_ON;
}
