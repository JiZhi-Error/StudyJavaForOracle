package com.jizhi.oracle.java.study;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/14 8:10
 **/
public class Day18 {

    @Test
    public void basicOne() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Day18.java"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Day18_copy.java"));
        String data;
        while ((data = reader.readLine()) != null) {
            writer.write(data);
            writer.write("\n");
        }
        writer.close();
        reader.close();
    }

    @Test
    public void basicTwo() throws IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("it001", "张曼玉", 35, "北京"));
        studentList.add(new Student("it002", "张玉", 3, "京"));
        studentList.add(new Student("it003", "张d玉", 5, "北"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Day18_Student.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("Day18_Student.txt"));
        StringBuilder data;
        for (Student student : studentList) {
            data = new StringBuilder();
            data.append(student.getId()).append("\t").append(student.getName()).append("\t").append(student.getAge()).append("\t").append(student.getLocation());
            writer.write(data.toString());
            writer.write("\n");
        }
        writer.close();
        studentList.clear();
        String readData;
        while ((readData = reader.readLine()) != null) {
            String[] split = readData.split("\t");
            studentList.add(new Student(split[0], split[1], Integer.parseInt(split[2]), split[3]));

        }
        reader.close();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    static class ExtendOne {
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter("data"));
            for (int i = 0; i < 3; i++) {
                System.out.print("输入第" + (i + 1) + "个：");
                writer.write(scanner.nextLine());
                writer.write("\n");
            }
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader("data"));
            System.out.print("输入被验证：");
            String data = scanner.nextLine();
            String s;
            while ((s = reader.readLine()) != null) {
                if (s.equals(data)) {
                    System.out.println("验证成功");
                    System.exit(0);
                }
            }
            System.out.println("验证失败");
        }
    }

    static class ExtendTwo {
        public static void main(String[] args) throws IOException {
            Map<String, String> map = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader("user.txt"));
            String data;
            while ((data = reader.readLine()) != null){
                String[] split = data.split(",");
                map.put(split[0], split[1]);
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt"));
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入注册用户名：");
            String username = scanner.nextLine();
            if (!map.containsKey(username)){
                System.out.print("输入密码：");
                String password = scanner.nextLine();
                map.put(username, password);
            }else{
                System.out.println("用户名已存在");
                return;
            }
            Set<Map.Entry<String, String>> entries = map.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                writer.write(entry.getKey());
                writer.write(",");
                writer.write(entry.getValue());
                writer.write("\n");
            }
            writer.close();
            System.out.println("注册成功");
        }
    }

    static class ExtendThree{
        public static void main(String[] args) throws IOException {
            List<String> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            String data;
            while ((data = reader.readLine()) != null) {
                StringBuffer stringBuffer = new StringBuffer(data);
                list.add(stringBuffer.reverse().toString());
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"));
            for (String s : list) {
                writer.write(s);
                writer.write("\n");
            }
            writer.close();

        }
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Student {
        private String id;
        private String name;
        private int age;
        private String location;
    }

}
