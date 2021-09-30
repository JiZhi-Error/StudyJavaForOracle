package com.jizhi.oracle.java.study;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/9/30 19:18
 **/
public class Day01 {
    public static void main(String[] args) {
        //##################2
        int i1 = 88, i2 = -88;
        float d = 88.888F;
        char ch1 = 'A', ch2 = '8';
        boolean flag1 = true, flag2 = false;
        System.out.println("整数变量i1: " + i1 + ", i2:" + i2);
        System.out.println("小数变量d:" + d);
        System.out.println("字符变量ch1:" + ch1 + ",ch2:" + ch2);
        System.out.println("布尔变量flag1:" + flag1 + ",flag2:" + flag2);
        //###################2

        //################3
        System.out.println("好好学习~");
        System.out.println("天天向上~");
        System.out.println("键盘敲烂,月薪过万~~");
        //################3


        //################4
        System.out.println(
                "   *\n" +
                        "  * *\n" +
                        " *   *\n" +
                        "*     *\n" +
                        " *   *\n" +
                        "  * *\n" +
                        "   *"
        );

        System.out.println();

        int size = 4;
        //上半层
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            //上半层右侧
            if (i - 1 > 0) {
                for (int j = 1; j < 2 * (i - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        //下半层
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            //下半层右侧
            if (size - i - 1 > 0) {
                for (int j = 0; j < 5 - (2 * i); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        //################4


        //################5
        System.out.println("{@}");
        System.out.println("/|\\");
        System.out.println(" |");
        //################5

        //################6
        int o = 4;
        for (int i = 0; i < o; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //################6
        new Day01().Test0();
    }

    public void Test0(){
        System.out.println("姓名：王洋");
        System.out.println("年龄：22");
        System.out.println("性别：男");
        System.out.println("职业：学生");
        System.out.println("住址：河北省秦皇岛市东北石油大学");
    }


    static class Task07_01 {
        public static void main(String[] args) {
            int a = 10;
            System.out.println(a);
            {
                int c = 20;
                System.out.println(c);
            }
            int c = 30;
            System.out.println(c);
        }
    }

    static class Task07_02 {
        public static void main(String[] args) {
            int x = 2;
            {
                int y = 6;
                System.out.println("x is " + x);
                System.out.println("y is " + y);
            }
            int y = x;
            System.out.println("x is " + x);
        }
    }
}
