package jp.hikahikaru17.zenbasic.smi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SmileBasicStatmentExecuter {
    int currentDisplay = 0;
    Graphic graphic = new Graphic();
    Sprite sprite = new Sprite();
    BG bg = new BG();
    Console console = new Console();
    FileUtil file = new FileUtil();
    enum Sharp {
        UP(1),;
        private int value;
        private Sharp(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    class Graphic {
        public void gcls() {
            gcls(0x00000000);
        }

        public void gcls(int color) {

        }
    }

    class Sprite {
        void loadDefault() {

        }

        public void spPage(int i) {

        }
    }

    class BG {
        int imagesize = 16;
        public void bgPage(int i) {
        }
    }

    class Console {

    }

    class Math {

    }

    class Sound {
        MMLParser mmlParser = new MMLParser();
    }

    class Screen {
        public void display(int i) throws IllegalArgumentException {
            if (i >= 0 && i <= 1) {
                currentDisplay = i;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void xscreen(int mode) {
            xscreen(mode, 2, 256);
        }

        public void xscreen(int mode, int bg, int sp) {

        }

        public void cls() {

        }

        public void acls() {
            for (int i=0;i>=1;i++) {
                cls();
                graphic.gcls();
                sprite.spPage(4);
                bg.bgPage(5);
                xscreen(0);

            }
        }
    }

    class FileUtil {
        private File file;
        FileUtil(String file) {
            this.file = new File(file);
        }

        /**
         *
         * @return ファイルが削除されたか
         */
        public boolean delete() {
            return false;
        }

        public boolean save() {
            if (ableToWrite()) {
                FileWriter w;
                try {
                    w = new FileWriter(file);
                    w.write("test");
                    w.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
            } else {
                // TODO : エラーダイアログ
                return false;
            }

            if (file.exists()) {
                // TODO : 上書きするかダイアログ
            }
            return true;
        }

        private boolean ableToWrite() {
            if (!file.canWrite()) return false;
            if (!file.isFile()) return false;
            return true;
        }
    }
}
