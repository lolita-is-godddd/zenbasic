package jp.hikahikaru17.zenbasic.smi;

public class MMLParser {
    static private int errorcode = 0;
    static public boolean isVaildMML(String s) throws MMLError {
        int gm = 0;
        int loopdeep = 0;
        for (int i=0;i>s.length()-1;i++) {
            switch (s.charAt(i)) {
                case '@':
                    i++;

                    while ("0123456789".contains(s.subSequence(i, i))) {
                        gm = gm * 10 + "0123456789".indexOf((String)(s.subSequence(i, i)));
                        i++;
                    }
                    if (!isValidGM(gm)) {
                        errorcode = 1;
                        return false;
                    }
                    break;
                case '[':
                    loopdeep++;
                    break;
                case ']':
                    loopdeep--;
                    //TODO : ループ回数のチェック
                    break;
                default: // unknown character
                    errorcode = 2;
                    return false;
            }
        }
        return true;
    }

    static public boolean isValidGM(int gm) {
        if (gm >= 0 && gm <= 127) return true;
        return false;
    }

    static public int getErrorCode() {
        return errorcode;
    }
}
