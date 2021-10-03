package com.jizhi.oracle.java.study;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/3 21:56
 **/
public class Day05 {
    static class BasicOne {
        public static void main(String[] args) {

            print(15);
        }

        private static void print(int x) {
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    static class BasicTwo {
        public static void main(String[] args) {
            Random random = new Random();
            int a = random.nextInt(100) + 1;
            int b = random.nextInt(100) + 1;
            System.out.println(add(a, b));
        }

        private static int add(int a, int b) {
            return a + b;
        }
    }

    static class BasicThree {
        public static void main(String[] args) {
            int[] arr = {50, 60, 30, 40, 10, 20};
            System.out.println(mix(arr));
        }

        private static int mix(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr[0];
        }
    }

    static class BasicFour {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("给个数：");
            int x = scanner.nextInt();
            System.out.println(find(x));
        }

        private static char find(int x) {
            if (x >= 90 && x <= 100) {
                return 'A';
            } else if (x >= 80 && x < 90) {
                return 'B';
            } else if (x >= 70 && x < 80) {
                return 'C';
            } else if (x >= 60 && x < 70) {
                return 'D';
            } else if (x >= 0 && x < 60) {
                return 'E';
            } else {
                return 'F';
            }
        }
    }

    static class BasicFive {
        public static void main(String[] args) {
            int[] arr = {3, 4, 3, 5, 7, 9};
            System.out.println(count(3, arr));
        }

        private static int count(int x, int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    count++;
                }
            }
            return count;
        }
    }

    static class BasicSix {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2};
            System.out.println(find(5, arr));
        }

        private static String find(int x, int[] arr) {
            String index = "";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    index += i;
                    index += ",";
                }
            }
            if (index.isEmpty()) {
                index = "数组中没有这个数字";
            } else {
                index = index.substring(0, index.length() - 1);
            }
            return index;
        }
    }

    static class BasicSeven {
        public static void main(String[] args) {
            System.out.println(Arrays.toString(calculate(5, 9)));
        }

        private static int[] calculate(int x, int y) {
            int[] ints = new int[4];
            ints[0] = x + y;
            ints[1] = x - y;
            ints[2] = x * y;
            ints[3] = x / y;
            return ints;
        }
    }

    static class ExtendOne {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50, 60};
            System.out.println(findMaxIndex(arr));
        }

        private static int findMaxIndex(int[] arr) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {
                    index = i;
                }
            }
            return index;
        }
    }

    static class ExtendTwo {

        public static void main(String[] args) {
            System.out.println(perimeterRectangle(4, 5));
            System.out.println(rectangularArea(6, 2));
            System.out.println(circleArea(20));
            System.out.println(circumference(30));
        }

        private static double perimeterRectangle(double x, double y) {
            return (x + y) * 2;
        }

        private static double rectangularArea(double x, double y) {
            return x * y;
        }

        private static double circumference(double r) {
            return 2 * Math.PI * r;
        }

        private static double circleArea(double r) {
            return Math.PI * r * r;
        }

    }

    static class ExtendThree {
        public static boolean equals(int[] arr1, int[] arr2) {
            if (arr1.length == arr2.length) {
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i] != arr2[i]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        public static int[] fill(int[] arr, int value) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = value;
            }
            return arr;
        }

        public static int[] fill(int[] arr, int fromIndex, int toIndex, int value) {
            for (int i = fromIndex; i < toIndex; i++) {
                arr[i] = value;
            }
            return arr;
        }

        public static int[] copyOf(int[] arr, int newLength) {
            int[] ints = new int[newLength];
            for (int i = 0; i < newLength; i++) {
                ints[i] = arr[i];
            }
            return ints;
        }

        public static int[] copyOfRange(int[] arr, int from, int to) {
            int[] ints = new int[to - from - 1];
            for (int i = from; i < to; i++) {
                ints[i - from] = arr[i];
            }
            return ints;
        }
    }

    static class ExtendFour {
        public static void main(String[] args) {
            printLeapYear(2000, 2004);
        }

        private static void printLeapYear(int year1, int year2) {
            for (int i = year1; i <= year2; i++) {
                if (i % 100 == 0 && i % 400 == 0) {
                    System.out.println(i);
                } else if (i % 4 == 0) {
                    System.out.println(i);
                }

            }
        }
    }

    static class ExtendFive {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入一个整数:");
            System.out.println("" + count(scanner.nextInt()) + "位数字");
        }

        private static int count(int x) {
            x = x < 0 ? -x : x;
            return String.valueOf(x).length();
        }
    }

    static class ExtendSix {
        public static int add(int x, int y) {
            return x + y;
        }

        public static double add(double x, double y) {
            return x + y;
        }

        public static boolean equals(int x, int y) {
            return x == y;
        }

        public static boolean equals(double x, double y) {
            return x == y;
        }

        public static int mix(int x, int y) {
            if (x < y) {
                return x;
            } else {
                return y;
            }
        }

        public static double mix(double x, double y) {
            if (x < y) {
                return x;
            } else {
                return y;
            }
        }

        public static int max(int x, int y) {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        }

        public static double max(double x, double y) {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        }

        public static int compare(int x, int y,boolean mix){
            if (mix){
                if (x < y) {
                    return x;
                } else {
                    return y;
                }
            }else {
                if (x > y) {
                    return x;
                } else {
                    return y;
                }
            }
        }

    }
}
