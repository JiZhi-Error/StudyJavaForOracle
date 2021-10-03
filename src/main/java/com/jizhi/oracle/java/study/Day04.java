package com.jizhi.oracle.java.study;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/3 21:12
 **/
public class Day04 {
    static class BasicOne {
        public static void main(String[] args) {
            Random random = new Random();
            int[] a = new int[5];
            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(500);
            }
            int min = a[0];
            for (int i = 0; i < a.length; i++) {
                if (min > a[i]) {
                    min = a[i];
                }
            }
            System.out.println(Arrays.toString(a));
            System.out.println("最小值为：" + min);
        }
    }

    static class BasicTwo {
        public static void main(String[] args) {
            int[] a = new int[3];
            Random random = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(10);
            }
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }

    static class BasicThree {
        public static void main(String[] args) {
            int[] nums = {5, 10, 15};
            int[] a = new int[nums.length];
            for (int i = 0; i < a.length; i++) {
                a[i] = nums[i] * 2;
            }
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }

    static class BasicFour {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.print("输入数组长度：");
            int length = scanner.nextInt();
            int[] ints = new int[length];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt(10) + 1;
            }
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] > 5) {
                    if (ints[i] % 2 == 0) {
                        System.out.println(ints[i]);
                    }
                }
            }
        }
    }

    static class BasicFive {
        public static void main(String[] args) {
            Random random = new Random();
            int[] ints = new int[6];
            int sum = 0;
            for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt(101);
                sum += ints[i];
            }
            for (int i = 0; i < ints.length; i++) {
                for (int j = 0; j < ints.length; j++) {
                    if (ints[i] < ints[j]) {
                        int a = ints[i];
                        ints[i] = ints[j];
                        ints[j] = a;
                    }
                }
            }
            System.out.println("平均分为：" + ((sum - ints[0] - ints[ints.length - 1]) / (ints.length - 2)));
            System.out.println(Arrays.toString(ints));
        }
    }

    static class BasicSix {
        public static void main(String[] args) {
            System.out.println("第二十个月的兔子数：" + amount(20));
        }

        private static int amount(int month) {
            if (month == 1) {
                return 1;
            }
            if (month == 2) {
                return 1;
            }
            return amount(month - 1) + amount(month - 2);
        }
    }

    static class ExtendOne {
        public static void main(String[] args) {
            Random random = new Random();
            int[] ints = new int[10];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt(10) + 1;
            }
            System.out.println(Arrays.toString(ints));
            int[] ints1 = new int[3];
            for (int i = 0; i < ints1.length; i++) {
                ints1[i] = ints[random.nextInt(10)];
            }
            System.out.println(Arrays.toString(ints1));
            int sum = 0;
            for (int i = 0; i < ints1.length; i++) {
                sum += ints1[i];
            }
            System.out.println("和是：" + sum);
        }
    }

    static class ExtendTwo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.print("输入班级人数：");
            int number = scanner.nextInt();
            int[] ints = new int[number];
            int sum = 0;
            int numberOfFailing = 0;
            for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt(101);
                sum += ints[i];
                if (ints[i] < 60) {
                    numberOfFailing++;
                }
            }
            System.out.println(Arrays.toString(ints));
            System.out.println("不及格人数：" + numberOfFailing);
            System.out.println("班级平均分：" + (sum / number));
        }
    }

    static class ExtendThree {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int one = 0, two = 0, three = 0;
            int illegal = 0;
            System.out.print("请输入10个整数：");
            for (int i = 0; i < 10; i++) {
                int i1 = scanner.nextInt();
                switch (i1) {
                    case 1:
                        one++;
                        break;
                    case 2:
                        two++;
                        break;
                    case 3:
                        three++;
                        break;
                    default:
                        illegal++;
                        break;
                }
            }
            System.out.println("数字1的个数：" + one);
            System.out.println("数字2的个数：" + two);
            System.out.println("数字3的个数：" + three);
            System.out.println("非法数字的个数：" + illegal);
        }
    }

    static class ExtendFour {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入5个整数：");
            int[] ints = new int[5];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = scanner.nextInt();
            }

            int[] newArr = new int[ints.length];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = Math.max(ints[newArr.length - 1 - i], 0);
            }
            System.out.println(Arrays.toString(ints));
            System.out.println(Arrays.toString(newArr));
        }
    }

    static class ExtendFive {
        public static void main(String[] args) {
            Random random = new Random();
            int[] ints = new int[10];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt(100) + 1;
            }
            System.out.println(Arrays.toString(ints));
            for (int i = 0; i < ints.length; i++) {
                for (int j = 0; j < ints.length; j++) {
                    if (ints[i] < ints[j]) {
                        int a = ints[i];
                        ints[i] = ints[j];
                        ints[j] = a;
                    }
                }
            }
            System.out.println("数组中的第二大的数字为:" + ints[ints.length - 2]);
            System.out.println("数组中的第二小的数字为:" + ints[0]);
        }
    }

    static class ExtendSix {
        public static void main(String[] args) {
            Random random = new Random();
            int[] ints = new int[10];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt(100) + 1;
            }
            System.out.println(Arrays.toString(ints));
        }
    }

}
