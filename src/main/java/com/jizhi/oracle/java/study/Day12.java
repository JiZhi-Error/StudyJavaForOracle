package com.jizhi.oracle.java.study;

import java.util.*;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/4
 **/
public class Day12 {

    /**
     * 一、	需求说明：自定义一个学生类，给出成员变量name和age，使用Collection集合存储自定义对象并遍历，遍历集合的时候，在控制台输出学生对象的成员变量值。
     * 1.2． 操作步骤描述
     * 1.	创建学生类。
     * 2.	创建集合对象。
     * 3.	创建元素对象。
     * 4.	把元素添加到集合。
     * 5.	遍历集合。
     */
    static class BasicOne {
        public static void main(String[] args) {
            Collection<BaseStudent> students = new ArrayList<>();
            students.add(new BaseStudent("asdf", 1));
            students.add(new BaseStudent("asasdfdf", 2));
            students.add(new BaseStudent("aasdsdf", 3));
            students.add(new BaseStudent("asdasdf", 4));
            students.add(new BaseStudent("asdasdfasdf", 5));

            Iterator<BaseStudent> iterator = students.iterator();
            while (iterator.hasNext()) {
                BaseStudent next = iterator.next();
                System.out.println(next);
            }
        }
    }

    static class BaseStudent {
        private String name;
        private int age;


        public BaseStudent() {
        }

        public BaseStudent(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "BaseStudent{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    /**
     * 2.1． 训练描述：【List接口、迭代器、普通for】
     * 一、	需求说明：自定义一个学生类，给出成员变量name和age，使用List集合存储自定义对象并遍历，遍历集合的时候，在控制台输出学生对象的成员变量值。要求使用两种方式进行遍历(迭代器、普通for)。
     * 2.2． 操作步骤描述
     * 1.	创建学生类。
     * 2.	创建集合对象。
     * 3.	创建元素对象。
     * 4.	把元素添加到集合。
     * 5.	遍历集合。
     */
    static class BasicTwo {
        public static void main(String[] args) {
            List<BaseStudent> students = new ArrayList<>();
            students.add(new BaseStudent("asdf", 1));
            students.add(new BaseStudent("asasdfdf", 2));
            students.add(new BaseStudent("aasdsdf", 3));
            students.add(new BaseStudent("asdasdf", 4));
            students.add(new BaseStudent("asdasdfasdf", 5));

            for (int i = 0; i < students.size(); i++) {
                BaseStudent student = students.get(i);
                System.out.println(student);
            }

            Iterator<BaseStudent> iterator = students.iterator();
            while (iterator.hasNext()) {
                BaseStudent student = iterator.next();
                System.out.println(student);
            }
        }
    }

    /**
     * 3.1． 训练描述：【List接口、增强for】
     * 一、	需求说明：自定义一个学生类，给出成员变量name和age，使用List集合存储自定义对象并使用增强for进行遍历，遍历集合的时候，在控制台输出学生对象的成员变量值。
     * 3.2． 操作步骤描述
     * 1.	创建学生类。
     * 2.	创建集合对象。
     * 3.	创建元素对象。
     * 4.	把元素添加到集合。
     * 5.	遍历集合。
     */
    static class BasicFour {
        public static void main(String[] args) {
            List<BaseStudent> students = new ArrayList<>();
            students.add(new BaseStudent("asdf", 1));
            students.add(new BaseStudent("asasdfdf", 2));
            students.add(new BaseStudent("aasdsdf", 3));
            students.add(new BaseStudent("asdasdf", 4));
            students.add(new BaseStudent("asdasdfasdf", 5));

            for (BaseStudent student : students) {
                System.out.println(student);
            }
        }
    }

    /**
     * 4.1． 训练描述：【ArrayList类】
     * 二、	需求说明：自定义一个学生类，给出成员变量name和age，使用List集合存储自定义对象并行遍历，遍历集合的时候，在控制台输出学生对象的成员变量值。要求使用三种方式进行遍历(迭代器、普通for、增强for)。
     * 4.2． 操作步骤描述
     * 1.	创建学生类。
     * 2.	创建集合对象。
     * 3.	创建元素对象。
     * 4.	把元素添加到集合。
     * 5.	遍历集合。
     */
    static class BasicFive {
        public static void main(String[] args) {
            ArrayList<BaseStudent> students = new ArrayList<>();
            students.add(new BaseStudent("asdf", 1));
            students.add(new BaseStudent("asasdfdf", 2));
            students.add(new BaseStudent("aasdsdf", 3));
            students.add(new BaseStudent("asdasdf", 4));
            students.add(new BaseStudent("asdasdfasdf", 5));

            for (int i = 0; i < students.size(); i++) {
                BaseStudent student = students.get(i);
                System.out.println(student);
            }

            for (BaseStudent student : students) {
                System.out.println(student);
            }

            Iterator<BaseStudent> iterator = students.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

    /**
     * 一、	分析以下需求，并用代码实现：
     * 1.	按照以下描述完成类的定义。
     * 学生类
     * 属性：
     * 姓名name
     * 年龄age
     * 成绩score
     * 行为：
     * 吃饭eat()
     * stuty(String content)(content:表示学习的内容)
     * 2.	定义学生工具StudentsTool,有四个方法,描述如下
     * public void listStudents(Student[] arr):遍历打印学生信息
     * public int getMaxScore(Student[] arr):获取学生成绩的最高分
     * public Student getMaxStudent(Student[] arr):获取成绩最高的学员
     * public int getAverageScore(Student[] arr):获取学生成绩的平均值
     * public int getCount(Student[] arr):获取不及格的学员数量
     * 3.	定义测试类TestStudentTool，在main方法中首先创建长度为5的Student数组并初始化数据,再创建StudentsTool类的对象,并调用以上方法
     */
    static class ExtendOne {
        public static void main(String[] args) {
            Student[] arr = new Student[4];
            arr[0] = new Student("老王", 65, 98);
            arr[1] = new Student("小张", 60, 80);
            arr[2] = new Student("老李", 32, 70);
            arr[3] = new Student("赵四", 20, 50);
            StudentsTool studentsTool = new StudentsTool();
            studentsTool.listStudents(arr);
            System.out.println(studentsTool.getMaxScore(arr));
            System.out.println(studentsTool.getMaxStudent(arr));
            System.out.println(studentsTool.getAverageScore(arr));
            System.out.println(studentsTool.getCount(arr));

        }

    }

    static class StudentsTool {
        public void listStudents(Student[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        public int getMaxScore(Student[] arr) {
            int score = 0;
            for (int i = 0; i < arr.length; i++) {
                Student student = arr[i];
                if (score < student.getScore()) {
                    score = student.getScore();
                }
            }
            return score;
        }

        public Student getMaxStudent(Student[] arr) {
            Student student = new Student();
            for (int i = 0; i < arr.length; i++) {
                if (student.getScore() < arr[i].getScore()) {
                    student = arr[i];
                }
            }
            return student;
        }

        public int getAverageScore(Student[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i].getScore();
            }
            return sum / arr.length;
        }

        public int getCount(Student[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getScore() < 60) {
                    count++;
                }
            }
            return count;

        }
    }

    static class Student extends BaseStudent {
        private int score;

        public Student() {
        }

        public Student(String name, int age, int score) {
            super(name, age);
            this.score = score;
        }

        public void eat() {
            System.out.println("吃饭");
        }

        public void study(String content) {
            System.out.println("学" + content);
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + super.name + '\'' +
                    ", age=" + super.age +
                    ", score=" + score +
                    '}';
        }
    }

    /**
     * 1.	定义ArrayList集合，存入多个字符串"abc" "def"  "efg" "def" "def" "qwe" "def" "def" "swd" "wwe" "def" "def"
     * 2.	使用普通for循环获取集合中索引为3的元素并打印
     * 3.	定义方法public static boolean myContains(ArrayList list,String str)
     * (1)参数
     * a.ArrayList list: 表示存储多个String数据的集合
     * b.String str: 表示一个字符串
     * (2)返回值
     * true: 表示list集合中包含字符串str
     * false: 表示list集合中不包含字符串str
     * 4.	利用上面定义的mycontains方法统计集合中包含字符串"def"的数量
     * 5.	删除集合中的所有字符串"def"(思路:循环判断集合中是否包含"def"字符串,包含就删除)
     * 6.	将集合中每个元素中的小写字母变成大写字母
     */
    static class ExtendTwo {
        public static void main(String[] args) {
            List<String> arr = new ArrayList<>();
            arr.add("abc");
            arr.add("def");
            arr.add("efg");
            arr.add("def");
            arr.add("def");
            arr.add("qwe");
            arr.add("def");
            arr.add("def");
            arr.add("swd");
            arr.add("wwe");
            arr.add("def");
            arr.add("def");

            for (int i = 0; i < arr.size(); i++) {
                if (i == 3) {
                    System.out.println(arr.get(i));
                }
            }

            System.out.println(myContains(arr, "def"));

            for (int i = 0; i < arr.size(); i++) {
                if ("def".equals(arr.get(i))) {
                    arr.remove(i);
                    i--;
                }
            }

            System.out.println(arr);

            for (int i = 0; i < arr.size(); i++) {
                String remove = arr.remove(i);
                arr.add(i, remove.toUpperCase());
            }

            System.out.println(arr);

        }

        public static boolean myContains(List<String> list, String str) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                String o = list.get(i);
                if (str.equals(o)) {
                    sum++;
                }
            }
            return sum > 0;
        }
    }

    /**
     * 一、	分析以下需求，并用代码实现
     * 1.	定义ArrayList集合，存入多个字符串
     * 如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
     * 2.	遍历集合,删除长度大于5的字符串,打印删除后的集合对象
     * 提示:可以将原集合中所有长度大于5的字符串放入到新集合中,遍历新集合,新集合中的元素就是要删除的元素
     * 3.	基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
     * 提示:
     * (1)定义public static boolean myContains(String str)方法
     * 功能:
     * 判断str中是否包含0到9的数字
     * 包含:返回true
     * 不包含:返回false
     * (2)遍历原集合利用myContains方法将所有包含0-9的字符串放入新集合中
     * (3)新集合中的元素就是要删除的元素
     */
    static class ExtendFour {
        public static void main(String[] args) {
            List<String> strings = new ArrayList<>();
            strings.add("ab1");
            strings.add("123ad");
            strings.add("bca");
            strings.add("dadfadf");
            strings.add("dddaaa");
            strings.add("你好啊");
            strings.add("我来啦");
            strings.add("别跑啊");

            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).length() > 5) {
                    strings.remove(i);
                    i--;
                }
            }

            System.out.println(strings);

            for (int i = 0; i < strings.size(); i++) {
                String s = strings.get(i);
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (c >= '0' && c <= '9') {
                        strings.remove(i);
                        i--;
                        break;
                    }
                }
            }
            System.out.println(strings);

        }

    }

    /**
     * 一、	分析以下需求，并用代码实现
     * 定义MyArrays工具类，该工具类中有以下方法，方法描述如下：
     * 1.	public static void reverse(ArrayList<Integer> list);
     * 参数ArrayList<Integer> list:要进行操作的集合对象
     * 要求：对list集合对象中的元素进行反转(第一个和最后一个交换，第二个和倒数第二个交换，第三个和倒数第三个交换...)
     * 2.	public static Integer max(ArrayList<Integer> list);
     * 参数ArrayList<Integer> list:要进行操作的集合对象
     * 要求：求出list集合对象中的最大值并返回
     * 3.	public static Integer min(ArrayList<Integer> list);
     * 参数ArrayList<Integer> list:要进行操作的集合对象
     * 要求：求出list集合对象中的最小值并返回
     * 4.	public static int indexOf(ArrayList<Integer> list,Integer i);
     * 参数ArrayList<Integer> list:要进行操作的集合对象
     * 参数Integer i:需要在集合中查找的元素
     * 要求：求出元素i在list集合中第一次出现的索引，如果没有返回-1
     * 5.	public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue);
     * 参数ArrayList<Integer> list:要进行操作的集合对象
     * 参数Integer oldValue:需要被替换掉的原值
     * 参数Integer newValue：替换后的新值
     * 要求：将list集合中的所有值为oldValue的元素替换为newValue
     */
    static class MyArrays {
        public static void reverse(ArrayList<Integer> list) {
            for (int i = 0; i < list.size() / 2; i++) {
                Integer integer = list.remove(i);
                Integer integer1 = list.remove(list.size() - 1 - i);
                list.add(i, integer1);
                list.add(list.size() - i, integer);
            }
        }

        public static Integer max(ArrayList<Integer> list) {
            if (list.size() > 0) {
                Integer x = list.get(0);
                for (int i = 0; i < list.size(); i++) {
                    if (x < list.get(i)) {
                        x = list.get(i);
                    }
                }
                return x;
            }
            return null;
        }

        public static Integer min(ArrayList<Integer> list) {
            if (list.size() > 0) {
                Integer x = list.get(0);
                for (int i = 0; i < list.size(); i++) {
                    if (x > list.get(i)) {
                        x = list.get(i);
                    }
                }
                return x;
            }
            return null;
        }

        public static int indexOf(ArrayList<Integer> list, Integer i) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(i)) {
                    return j;
                }
            }
            return -1;
        }

        public static void replaceAll(ArrayList<Integer> list, Integer oldValue, Integer newValue) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(oldValue)) {
                    list.remove(i);
                    list.add(i, newValue);
                }
            }
        }
//        public static void main(String[] args) {
//            Random random = new Random();
//            ArrayList<Integer> list = new ArrayList<>();
//            for (int i = 0; i < 12; i++) {
//                list.add(random.nextInt(60));
//            }
//            System.out.println(list);
//            replaceAll(list,9,6);
//            System.out.println(list);
//        }
    }

}
