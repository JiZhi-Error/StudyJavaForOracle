package com.jizhi.oracle.java.study;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/8 10:43
 **/
public class Day15 {
    static class One {
        public static void main(String[] args) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

    static class Two {
        public static void main(String[] args) {
            try {
                SimpleDateFormat formatter = new SimpleDateFormat();
                formatter.format(new Date());
                formatter.parse("");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    static class Four {
        public static void main(String[] args) throws IOException {
            new File("./test/test04_1").mkdirs();
            new File("./test/test04_1/test04.txt").createNewFile();
            new File("./test/test04_2/testtest").mkdirs();
            File file = new File("./test/");
            deleteFile(file);
        }

        public static void deleteFile(File file) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File listFile : file.listFiles()) {
                    deleteFile(listFile);
                }
            }
            file.delete();
        }
    }


    static class Five {
        public static void main(String[] args) throws IOException {
            new File("./test/test05_1").mkdirs();
            new File("./test/test05_1/test045.txt").createNewFile();
            new File("./test/test05_2/test5/test5").mkdirs();
            File file = new File("./test/");
            deleteFile(file);
        }

        public static void deleteFile(File file) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File listFile : file.listFiles()) {
                    deleteFile(listFile);
                }
            }
            file.delete();
        }
    }
}
