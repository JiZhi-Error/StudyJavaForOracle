package com.jizhi.oracle.java.study;

import java.io.*;
import java.util.*;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/11 13:47
 **/
public class Day16 {

    static class BasicOne {
        public static void main(String[] args) throws IOException {
            byte[] data = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream("pom.xml");
            FileOutputStream fileOutputStream = new FileOutputStream("pom_copy.xml");
            int len = 0;
            while ((len = fileInputStream.read(data)) != -1) {
                fileOutputStream.write(data, 0, len);
                fileOutputStream.flush();
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
    }


    static class ExtendOne {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("info1.txt")));
            StringBuilder s = new StringBuilder(reader.readLine());
            while (true) {
                String ss = reader.readLine();
                if (ss == null) {
                    break;
                } else {
                    s.append(ss);
                }
            }
            Set<String> set = new HashSet<String>();
            for (int i = 0; i < s.length(); i++) {
                set.add(String.valueOf(s.charAt(i)));
            }
            StringBuilder result = new StringBuilder();
            for (String s1 : set) {
                result.append(s1);
            }
            System.out.println(result);
        }
    }

    static class ExtendTwo {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("info2.txt")));
            StringBuilder s = new StringBuilder(reader.readLine());
            while (true) {
                String ss = reader.readLine();
                if (ss == null) {
                    break;
                } else {
                    s.append(ss);
                }
            }

            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
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

    static class BasicThree{
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("info3.txt")));
            StringBuilder s = new StringBuilder(reader.readLine());
            while (true) {
                String ss = reader.readLine();
                if (ss == null) {
                    break;
                } else {
                    s.append(ss);
                }
            }

            System.out.print("输入个字符：");
            String s1 = scanner.nextLine();
            int i = s.indexOf(s1);
            int sum = 0;
            if (i>-1){
                for (int j = 0; j < s.length(); j++) {
                    if (s1.charAt(0)==(s.charAt(j))){
                        sum++;
                    }
                }
                System.out.println(sum);
            }else{
                System.out.println("不存在");
            }


        }
    }

}
