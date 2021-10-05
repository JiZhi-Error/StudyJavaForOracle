package com.jizhi.oracle.java.study;

import java.util.*;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/5
 **/
public class Day13 {
    static class BasicThree {
        public static void main(String[] args) {
            int[] a = {11, 22, 33, 44, 55};
            System.out.println(a[2]);

            System.out.println(Arrays.toString(a));

            int index = 3;
            int[] ints = new int[a.length + 1];
            for (int i = 0; i < ints.length; i++) {
                if (i < index) {
                    ints[i] = a[i];
                } else if (i == index) {
                    ints[i] = 99;
                } else {
                    ints[i] = a[i - 1];
                }
            }
            System.out.println(Arrays.toString(ints));


            int[] ints1 = new int[ints.length - 1];
            boolean find = false;
            for (int i = 0; i < ints.length; i++) {
                if (find) {
                    ints1[i - 1] = ints[i];
                } else {
                    if (ints[i] == 33) {
                        find = true;
                        continue;
                    }
                    ints1[i] = ints[i];
                }
            }
            System.out.println(Arrays.toString(ints1));
        }
    }

    static class BasicFour {

        public static void main(String[] args) {
            List<Student> students = new LinkedList<>();
            students.add(new Student("张三", 56));
            students.add(new Student("李四", 56654));
            students.add(new Student("王五", 89));
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge());
            }
            System.out.println();
            for (Student student : students) {
                System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge());
            }
            System.out.println();
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge());
            }
        }

    }

    static class Student {
        private String name;
        private int age;

        public Student() {
        }

        public Student(String name, int age) {
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
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class BasicFive {
        public static void main(String[] args) {
            Set<Student> students = new HashSet<>();
            students.add(new Student("张三", 56));
            students.add(new Student("张三", 56));
            students.add(new Student("王五", 89));
            for (Student student : students) {
                System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge());
            }
            System.out.println();

            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge());
            }
        }

    }


    static class StudentFive {
        private String name;
        private int age;

        public StudentFive() {
        }

        public StudentFive(String name, int age) {
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
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof StudentFive)) return false;
            StudentFive that = (StudentFive) o;
            return getAge() == that.getAge() && getName().equals(that.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAge());
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class BasicSix{
        public static void main(String[] args) {
            Set<StudentFive> students = new HashSet<>();
            students.add(new StudentFive("张三", 56));
            students.add(new StudentFive("张三", 56));
            students.add(new StudentFive("王五", 89));
            for (StudentFive student : students) {
                System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge());
            }
            System.out.println();

            Iterator<StudentFive> iterator = students.iterator();
            while (iterator.hasNext()) {
                StudentFive student = iterator.next();
                System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge());
            }
        }
    }
}
