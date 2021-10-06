package com.jizhi.oracle.java.study;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/6
 **/
public class Day14 {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Student {
        private String name;
        private int age;
    }

    static class BasicOne {
        public static void main(String[] args) {
            Map<String, Student> students = new HashMap<>();
            students.put("001", new Student("张三", 18));
            students.put("002", new Student("李四", 19));
            students.put("003", new Student("王五", 1156));
            students.put("004", new Student("赵四", 456));

            Set<String> keySet = students.keySet();
            for (String id : keySet) {
                System.out.println(students.get(id));
            }
            System.out.println("-*---------------------");
            Set<Map.Entry<String, Student>> entries = students.entrySet();
            for (Map.Entry<String, Student> entry : entries) {
                String key = entry.getKey();
                Student value = entry.getValue();
                System.out.print(key + "\t");
                System.out.println(value);
            }
        }
    }

    static class BasicTwo {
        public static void main(String[] args) {
            Map<Student, String> students = new HashMap<>();
            students.put(new Student("张三", 60), "家楼上");
            students.put(new Student("张三", 60), "李四家楼上");
            students.put(new Student("李四", 89), "张三家楼上");
            students.put(new Student("赵四", 456), "王五家楼上");


            Set<Student> students1 = students.keySet();
            for (Student student : students1) {
                System.out.println(student);
            }

            System.out.println("==============================");

            Set<Map.Entry<Student, String>> entries = students.entrySet();
            for (Map.Entry<Student, String> entry : entries) {
                System.out.print(entry.getKey() + "\t");
                System.out.println(entry.getValue());
            }
        }
    }

    static class BasicThree {
        public static void main(String[] args) {
            List<Map<String, String>> students = new ArrayList<>();
            HashMap<String, String> stringStringHashMap = new HashMap<>();
            stringStringHashMap.put("孙策", "大乔");
            stringStringHashMap.put("周瑜", "小乔");
            students.add(stringStringHashMap);

            stringStringHashMap = new HashMap<>();
            stringStringHashMap.put("郭靖", "黄蓉");
            stringStringHashMap.put("杨过", "小龙女");
            students.add(stringStringHashMap);

            stringStringHashMap = new HashMap<>();
            stringStringHashMap.put("令狐冲", "任盈盈");
            stringStringHashMap.put("林平之", "岳灵珊");
            students.add(stringStringHashMap);

            for (Map<String, String> student : students) {
                Set<Map.Entry<String, String>> entries = student.entrySet();
                for (Map.Entry<String, String> entry : entries) {
                    System.out.print("丈夫：" + entry.getKey() + "\t");
                    System.out.println("妻子：" + entry.getValue());
                }
            }
        }
    }

    static class BasicFour {
        public static void main(String[] args) {

            Map<String, List<String>> map = new HashMap<>();
            List<String> list = new ArrayList<>();
            list.add("诸葛亮");
            list.add("赵云");
            map.put("三国演义", list);

            list = new ArrayList<>();
            list.add("唐僧");
            list.add("孙悟空");
            map.put("西游记", list);

            list = new ArrayList<>();
            list.add("武松");
            list.add("鲁智深");
            map.put("水浒传", list);

            Set<Map.Entry<String, List<String>>> entries = map.entrySet();
            for (Map.Entry<String, List<String>> entry : entries) {
                System.out.print("来自：" + entry.getKey() + "\t");
                List<String> value = entry.getValue();
                for (String s : value) {
                    System.out.print(s + "\t");
                }
                System.out.println();
            }
        }
    }

    static class ExtendOne {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] a = new int[40];
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextInt(20);
            }
            System.out.println(Arrays.toString(a));

            List<Integer> integers = new LinkedList<>();
            for (int i : a) {
                if (!integers.contains(i)) {
                    integers.add(i);
                }
            }

            Integer[] integers1 = integers.toArray(new Integer[0]);
            System.out.println(Arrays.asList(integers1));

        }
    }

    static class ExtendTwo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入：");
            String data = scanner.nextLine();
            data = data.trim();

            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < data.length(); i++) {
                char c = data.charAt(i);
                if (map.containsKey(c)) {
                    Integer integer = map.get(c);
                    int value = integer + 1;
                    map.put(c, value);
                } else {
                    map.put(c, 1);
                }
            }
            System.out.println(map);

            List<Character> result = new ArrayList<>();
            for (int i = 0; i < data.length(); i++) {
                char c = data.charAt(i);
                if (map.get(c) > 1) {
                    continue;
                }
                result.add(c);
            }
            System.out.println(result);

        }
    }

    static class ExtendThree {
        public static void main(String[] args) {
            Random rand = new Random();
            ArrayList<Object> objects = new ArrayList<>();
            while (objects.size() < 10) {
                int i = rand.nextInt(20) + 1;
                if (!objects.contains(i)) {
                    objects.add(i);
                }
            }
            System.out.println(objects);
        }
    }

    static class ExtendFour {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入：");
            String data = scanner.nextLine();
            data = data.trim();

            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < data.length(); i++) {
                char c = data.charAt(i);
                if (map.containsKey(c)) {
                    Integer integer = map.get(c);
                    int value = integer + 1;
                    map.put(c, value);
                } else {
                    map.put(c, 1);
                }
            }
            StringBuilder sb = new StringBuilder();
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                sb.append(entry.getKey()).append("(").append(entry.getValue()).append(")");
            }
            System.out.println(sb);
        }
    }

    static class ExtendFive {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入：");
            String data = scanner.nextLine();
            data = data.trim();
            String[] s = data.split(" ");

            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length; i++) {
                String c = s[i];
                if (map.containsKey(c)) {
                    Integer integer = map.get(c);
                    int value = integer + 1;
                    map.put(c, value);
                } else {
                    map.put(c, 1);
                }
            }
            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                System.out.print(entry.getKey());
                System.out.print("=");
                System.out.println(entry.getValue());
            }
        }
    }

}
