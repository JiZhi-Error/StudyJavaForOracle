package com.jizhi.oracle.java.study;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/9/30 20:16
 **/
public class Day02 {
    static class BasicOne {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入：");
            int i = scanner.nextInt();
            if (i % 2 == 0) {
                System.out.println("是偶数");
            } else {
                System.out.println("是奇数");
            }
        }
    }

    static class BasicTwo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入成绩：");
            int i = scanner.nextInt();
            String result = i >= 60 ? "及格" : "不及格";
            System.out.println(result);
        }
    }

    static class BasicThree {
        public static void main(String[] args) {
            int a = 123;
            int c = a % 10;
            int b = (a % 100 - c) / 10;
            int d = a / 100;
            System.out.print("123得个位是" + c + ",十位是" + b + ",百位是" + d);
        }
    }

    static class BasicFour {
        public static void main(String[] args) {
            int height, width;
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入长方形得长");
            height = scanner.nextInt();
            System.out.print("输入长方形得宽");
            width = scanner.nextInt();
            int area = width * height;
            int girth = (width + height) * 2;
            System.out.println("面积是：" + area);
            System.out.println("周长是：" + girth);
        }
    }

    static class BasicFive {
        public static void main(String[] args) {
            int a = 123;
            int b = 321;
            int c = a > b ? a + b : a * b;
            System.out.println(c);
        }
    }

    static class BasicSix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入成绩：");
            int i = scanner.nextInt();
            if (i >= 90 && i <= 100) {
                System.out.println("优秀");
            } else if (i >= 80 && i < 90) {
                System.out.println("好");
            } else if (i >= 70 && i < 80) {
                System.out.println("良");
            } else if (i >= 60 && i < 70) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        }
    }

    static class ExtendOne {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int left, right;
            System.out.print("请输入小明左手中的纸牌：");
            left = scanner.nextInt();
            System.out.print("请输入小明右手中的纸牌：");
            right = scanner.nextInt();

            System.out.println("\n互换前小明左手中的纸牌：");
            System.out.println("左手中的纸牌：" + left);
            System.out.println("互换前小明右手中的纸牌：");
            System.out.println("右手中的纸牌：" + right);

            int a = left;
            left = right;
            right = a;

            System.out.println("\n互换后小明左手中的纸牌：");
            System.out.println("左手中的纸牌：" + left);
            System.out.println("互换前小明右手中的纸牌：");
            System.out.println("右手中的纸牌：" + right);
        }
    }

    static class ExtendTwo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入本金：");
            float a = scanner.nextInt();
            System.out.println("本金为：" + a);
            System.out.println("存取一年后的本息是：" + (a * 1.0225));
            System.out.println("存取二年后的本息是：" + (a * 1.027F));
            System.out.println("存取三年后的本息是：" + (a * 1.0324F));
            System.out.println("存取四年后的本息是：" + (a * 1.036F));
        }
    }

    static class ExtendThree {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int java, sql, web;
            System.out.print("请输入Java的成绩：");
            java = scanner.nextInt();
            System.out.print("请输入SQL的成绩：");
            sql = scanner.nextInt();
            System.out.print("请输入Web的成绩：");
            web = scanner.nextInt();
            System.out.println("---------------------------");
            System.out.println("Java\tSQL\tWeb");
            System.out.println(java + "\t" + sql + "\t" + web);
            System.out.println("---------------------------");
            System.out.println("Java和SQL的成绩差：" + (java > sql ? java - sql : sql - java));
            System.out.println("三门课的平均分是：" + (java + sql + web) / 3);
        }
    }

    static class ExtendFour {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入4位会员卡号：");
            String id = scanner.nextLine();
            int sum = 0;
            for (int i = 0; i < id.length(); i++) {
                sum += Integer.parseInt(String.valueOf(id.charAt(i)));
            }
            System.out.println("会员卡号" + id + "各位之和：" + sum);
            if (sum > 20) {
                System.out.println("会员卡号" + id + "是幸运客户");
            } else {
                System.out.println("会员卡号" + id + "不是幸运客户");
            }
        }
    }

    static class ExtendFive {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入工龄：");
            int year = scanner.nextInt();
            System.out.print("请输入基本工资：");
            int money = scanner.nextInt();
            System.out.println("您目前工作了" + year + "年");
            System.out.println("基本工资为 " + money + "元");
            if (year >= 10 && year < 15) {
                System.out.println("应涨工资 5000元");
                money += 5000;
            } else if (year >= 5 && year < 10) {
                System.out.println("应涨工资 2500元");
                money += 2500;
            } else if (year >= 3 && year < 5) {
                System.out.println("应涨工资 1000元");
                money += 1000;
            } else if (year >= 1 && year < 3) {
                System.out.println("应涨工资 500元");
                money += 500;
            } else if (year == 0) {
                System.out.println("应涨工资 200元");
                money += 200;
            }
            System.out.println("涨后工资 " + money + "元");
        }
    }

    static class ExtendSix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入第一个整数：");
            int x = scanner.nextInt();
            System.out.print("请输入第二个整数：");
            int i = scanner.nextInt();
            System.out.print("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
            int b = scanner.nextInt();
            switch (b) {
                case 0:
                    System.out.println(x + "+" + i + "=" + (x + i));
                    break;
                case 1:
                    System.out.println(x + "-" + i + "=" + (x - i));
                    break;
                case 2:
                    System.out.println(x + "*" + i + "=" + (x * i));
                    break;
                case 3:
                    System.out.println(x + "/" + i + "=" + (x / i));
                    break;
            }
        }
    }

    static class ExtendSeven {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入X：");
            int x = scanner.nextInt();
            int y = 0;
            if (x < 0) {
                y = -1;
            } else if (x > 0) {
                y = 1;
            }
            System.out.println("x=" + x + ",y=" + y);
        }
    }

    static class ExtendEight {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] a = new int[3];
            System.out.print("请输入第一个数：");
            a[0] = scanner.nextInt();
            System.out.print("请输入第二个数：");
            a[1] = scanner.nextInt();
            System.out.print("请输入第三个数: ");
            a[2] = scanner.nextInt();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i] < a[j]) {
                        int i1 = a[i];
                        a[i] = a[j];
                        a[j] = i1;
                    }
                }
            }
            System.out.println("按照从小到大排序后的顺序为：" + Arrays.toString(a));
        }
    }

    static class ExtendNine {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入月份：");
            int month = scanner.nextInt();
            switch (month) {
                case 3:
                case 4:
                case 5:
                    System.out.println(month + "月份是春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(month + "月份是夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(month + "月份是秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println(month + "月份是冬季");
                    break;
                default:
                    System.out.println("别瞎输入");
                    break;
            }

        }
    }

}

