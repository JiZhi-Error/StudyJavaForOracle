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

    /**
     * 某人想买车，买什么车决定于此人在银行有多少存款(键盘录入)。
     * 如果此人的存款超过500万，则买雪铁龙DS9；
     * 否则，如果此人的存款超过100万，则买雪铁龙C6；
     * 否则，如果此人的存款超过50万，则买雪铁龙C5；
     * 否则，如果此人的存款超过10万，则买雪铁龙爱丽舍；
     * 否则此人买捷安特。
     */
    static class ExtendTen {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入存款（万元）：");
            int money = scanner.nextInt();
            if (money >= 500) {
                System.out.println("买雪铁龙DS9");
            } else if (money >= 100) {
                System.out.println("买雪铁龙C6");
            } else if (money >= 50) {
                System.out.println("买雪铁龙C5");
            } else if (money >= 10) {
                System.out.println("买雪铁龙爱丽舍");
            } else {
                System.out.println("买捷安特");
            }
        }
    }

    /**
     * 练描述
     * 学校举行运动会，百米赛跑成绩在10秒以内的学生有资格进决赛，根据性别分为男子组和女子组。
     * 操作步骤描述
     *
     * 1.创建键盘录入对象
     * 	2.定义double类型的变量score用于接收成绩，定义String类型的变量gender用于接收性别
     * 	3.给score和gender赋值
     * 	4.首先要判断是否能够进入决赛
     * 	5.在确保进入决赛的情况下，再判断是进入男子组，还是进入女子组
     */
    static class ExtendEleven{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double score;
            String gender;
            System.out.print("输入成绩：");
            score = scanner.nextInt();
            System.out.print("输入性别");
            scanner.nextLine();
            gender = scanner.nextLine();
            if (score<10){
                System.out.println("进入"+gender+"子组决赛");
            }
        }
    }

    /**
     * 训练描述
     * 某商场购物可以打折，具体办法如下：
     * 		普通顾客购满100元打9折
     * 		会员购物打8折
     * 		会员购物满200元打7.5折
     * 	请根据此优惠计划进行购物结算
     * 操作步骤描述
     *
     * 1.创建键盘录入对象
     * 		2.定义int类型的变量identity（其值为0/1,0表示为非会员，1表示为会员），double类型的变量money表示购物金额
     * 		3.通过键盘录入给变量identity和变量money赋值
     * 		4.使用嵌套if选择结构实现
     * 		5.先判断顾客是否是会员
     * 			(1)非会员，直接打9折
     * 			(2)会员，接着判断顾客购物是否达到相应的打折的数量要求，根据结果做不同的处理
     */
    static class ExtendTwelve{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int identity;
            double money;
            System.out.print("是否是会员（其值为0/1,0表示为非会员，1表示为会员）：");
            identity = scanner.nextInt();
            System.out.print("输入购物金额：");
            money = scanner.nextDouble();
            if (identity == 0) {
                if (money >= 100) {
                    money *= 0.9;
                }
            } else {
                if (money >= 200) {
                    money *= 0.75;
                } else {
                    money *= 0.8;
                }
            }
            System.out.println("购物金额为：" + money);
        }
    }

    /**
     * 训练描述
     * <p>
     * 某人准备去海南旅游，现在要订购机票。机票的价格受季节旺季、淡季的影响，头等舱和经济舱价格也不同。
     * 假设机票原价假设为5000元（键盘录入），4-10月为旺季，旺季头等舱打9折，经济舱打8折，淡季头等舱打5折，经济舱打4折。
     * 编写程序，使用嵌套if选择结构根据出行的月份和选择的仓位输出实际的机票价格
     * 操作步骤描述
     * <p>
     * 1.创建键盘录入对象
     * 2.创建int类型的money表示机票价格，int类型的month表示月份
     * 3.通过键盘录入给变量money和month赋值
     * 4.定义int类型的变量type表示机票的类型和double类型的变量discount表示折扣率
     * 5.通过键盘录入给变量type赋值
     * 6.使用if语句根据type和month的值，计算实际的机票价格
     * 7.打印最后的结果
     */
    static class ExtendThirteen {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int money, month, type;
            System.out.print("输入机票价格：");
            money = scanner.nextInt();
            System.out.print("输入月份：");
            month = scanner.nextInt();
            System.out.print("输入机票类型（0：经济舱，1：头等舱）：");
            type = scanner.nextInt();
            switch (month) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    if (type == 0) {
                        money *= 0.8;
                    } else if (type == 1) {
                        money *= 0.9;
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 11:
                case 12:
                    if (type == 0) {
                        money *= 0.4;
                    } else if (type == 1) {
                        money *= 0.5;
                    }
                    break;
            }
            System.out.println("当前机票价格为：" + money);
        }
    }

    /**
     * 训练描述
     * 某同学参加计算机大赛：
     * 		如果获得第1名，将参加清华大学组织的1个月夏令营；
     * 		如果或得第2名，将奖励联想笔记本电脑一部；
     * 		如果获得第3名，将奖励移动硬盘一个；
     * 否则没有任何奖励；
     * 操作步骤描述
     *
     * 分析：（此题目采用if和switch都可以，在这里采用switch）
     * 		1.创建键盘录入对象
     * 		2.定义int类型的变量rank表示名次，并通过键盘录入赋值
     * 		3.使用switch判断，根据rank不同的值，打印不同的内容
     */
    static class ExtendFourteen{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int rank;
            System.out.print("输入名次：");
            rank = scanner.nextInt();
            switch (rank){
                case 1:
                    System.out.println("参加清华大学组织的1个月夏令营");
                    break;
                case 2:
                    System.out.println("奖励联想笔记本电脑一部");
                    break;
                case 3:
                    System.out.println("奖励移动硬盘一个");
                    break;
                default:
                    System.out.println("无奖励");
                    break;
            }
        }
    }

}

