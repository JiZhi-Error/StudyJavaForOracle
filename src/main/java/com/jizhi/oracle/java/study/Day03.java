package com.jizhi.oracle.java.study;

import java.util.Random;
import java.util.Scanner;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/3 19:55
 **/
public class Day03 {
    /**
     * 使用for循环,求出1-100之间的奇数之和.
     */
    static class BasicOne {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }

    /**
     * 求出1到100之间的既是3的倍数又是5倍数的数字之和.
     */
    static class BasicTwo {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        sum += i;
                    }
                }
            }
            System.out.println(sum);
        }
    }

    /**
     * 从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和:
     * 1.数字的个位数不为7;
     * 2.数字的十位数不为5;
     * 3.数字的百位数不为3;
     */
    static class BasicThree {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入个数：");
            int index = scanner.nextInt();
            int sum = 0;
            for (int i = 100; i <= index; i++) {
                String s = "" + i;
                int a = Integer.parseInt(String.valueOf(s.charAt(2)));
                int b = Integer.parseInt(String.valueOf(s.charAt(1)));
                int c = Integer.parseInt(String.valueOf(s.charAt(0)));
                if (a == 7) {
                    continue;
                }
                if (b == 5) {
                    continue;
                }
                if (c == 3) {
                    continue;
                }
                sum += i;
            }
            System.out.println(sum);
        }
    }

    /**
     * 请按如下要求编写程序,打印菜单:
     * 1.从键盘上录入一个1到5的数字;
     * 2.当数字为1时打印菜单"新建";
     * 当数字为2时打印菜单"打开文件";
     * 当数字为3时打印菜单"保存";
     * 当数字为4时打印菜单"刷新";
     * 当数字为5时打印菜单"退出",并退出程序;
     * 此行代码可以终止java程序运行: System.exit(0);
     */
    static class BasicFour {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("1:\"新建\"");
                System.out.println("2:\"打开文件\"");
                System.out.println("3:\"保存\"");
                System.out.println("4:\"刷新\"");
                System.out.println("5:\"退出\"");
                System.out.print("进行选择：");
                int x = scanner.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("新建");
                        break;
                    case 2:
                        System.out.println("打开文件");
                        break;
                    case 3:
                        System.out.println("保存");
                        break;
                    case 4:
                        System.out.println("刷新");
                        break;
                    case 5:
                        System.out.println("退出");
                        System.exit(0);
                        break;
                }
            }
        }
    }

    static class BasicFive {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 100; i <= 999; i++) {
                String s = "" + i;
                int a = Integer.parseInt(String.valueOf(s.charAt(2)));
                int b = Integer.parseInt(String.valueOf(s.charAt(1)));
                int c = Integer.parseInt(String.valueOf(s.charAt(0)));
                if ((a * a * a) + (b * b * b) + (c * c * c) == i) {
                    sum += 1;
                    System.out.print(i);
                    if (sum == 2) {
                        sum = 0;
                        System.out.println();
                    } else {
                        System.out.print("\t");
                    }
                }
            }
        }
    }

    static class BasicSix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int num = random.nextInt(100) + 1;
            while (true) {
                System.out.print("请输入猜得数据：");
                int input = scanner.nextInt();
                if (input < num) {
                    System.out.println("你猜的数据小了");
                } else if (input > num) {
                    System.out.println("你猜的数据大了");
                } else {
                    System.out.println("恭喜你，猜中了");
                    break;
                }
            }
        }
    }

    static class ExtendOne {
        public static void main(String[] args) {
            int time = 0;
            int height = 8848;
            float paperSize = 0.0001F;
            while (height > paperSize) {
                time++;
                paperSize += paperSize;
            }
            System.out.println(time);
        }
    }

    static class ExtendTwo {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i < 100; i++) {
                String s = "" + i;
                if (s.length() == 1) {
                    int a = Integer.parseInt(s);
                    if (a == 9) {
                        continue;
                    }
                } else if (s.length() == 2) {
                    int a = Integer.parseInt(String.valueOf(s.charAt(1)));
                    int b = Integer.parseInt(String.valueOf(s.charAt(0)));
                    if (a == 9) {
                        continue;
                    }
                    if (b == 9) {
                        continue;
                    }
                }
                sum++;
                System.out.print(i);
                if (sum == 5) {
                    System.out.println();
                    sum = 0;
                } else {
                    System.out.print("\t");
                }
            }
        }
    }

    static class ExtendThree {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 9999; i >= 1000; i--) {
                String s = "" + i;
                int a = Integer.parseInt(String.valueOf(s.charAt(3)));
                int b = Integer.parseInt(String.valueOf(s.charAt(2)));
                int c = Integer.parseInt(String.valueOf(s.charAt(1)));
                int d = Integer.parseInt(String.valueOf(s.charAt(0)));
                if (a + c != b + d) {
                    continue;
                }
                sum++;
                System.out.print(i);
                if (sum == 5) {
                    System.out.println();
                    sum = 0;
                } else {
                    System.out.print("\t");
                }
            }
        }
    }

    static class ExtendFour {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            String name;
            System.out.print("输入姓名：");
            name = scanner.nextLine();
            for (int i = 0; i < 5; i++) {
                System.out.print("输入成绩：");
                int score = scanner.nextInt();
                if (score < 0) {
                    System.out.println("录入错误");
                    return;
                } else {
                    sum += score;
                }
            }
            System.out.println(name + "得总分是：" + sum + " 平均分为：" + (sum / 5));
        }
    }

    static class ExtendFive {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random r = new Random();
            int x = r.nextInt(10);
            System.out.print("输入四位会员号：");
            String cardId = scanner.nextLine();
            int a = Integer.parseInt(String.valueOf(cardId.charAt(1)));
            if (x == a) {
                System.out.println("是幸运会员");
            } else {
                System.out.println("不是幸运会员");
//                System.out.println(x);
            }
        }
    }


    static class ExtendSix {
        public static void main(String[] args) {
            float count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入学员数量：");
            int total = scanner.nextInt();
            for (int i = 0; i < total; i++) {
                System.out.print("输入成绩：");
                int score = scanner.nextInt();
                if (score >= 80) {
                    count++;
                }
            }
            System.out.println("大于80分得比例为：" + (count / total));
        }
    }

    static class ExtendSeven {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.print("请输入密码：");
                String password = scanner.nextLine();
                if ("111111".equals(password)) {
                    while (true) {
                        System.out.print("请输入取款金额：");
                        int money = scanner.nextInt();
                        if (money >= 0 && money <= 1000) {
                            if (money % 100 == 0) {
                                System.out.println("请取走现金："+money);
                                System.out.println("交易完成，请取卡");
                                return;
                            }
                        }
                        System.out.println("您输入的取款金额有误，请重新输入");
                    }
                } else {
                    if (i<2){
                        System.out.println("密码错误，请重新输入！");
                    }
                }
            }
            System.out.println("密码错误，请取卡");
        }
    }
}
