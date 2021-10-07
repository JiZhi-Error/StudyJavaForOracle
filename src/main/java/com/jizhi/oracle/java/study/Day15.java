package com.jizhi.oracle.java.study;

import java.util.*;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/7 15:50
 **/
public class Day15 {
    static class BasicOne {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("张三,北京");
            list.add("李四,北京");
            list.add("王五,上海");
            list.add("赵六,河北");
            list.add("张无忌,北京");
            list.add("小龙女,上海");

            Map<String, List<String>> map = new HashMap<>();
            for (String s : list) {
                String[] split = s.split(",");
                List<String> list2;
                if (map.get(split[1]) == null) {
                    list2 = new ArrayList<>();
                } else {
                    list2 = map.get(split[1]);
                }
                list2.add(split[0]);
                map.put(split[1], list2);
            }

            Set<Map.Entry<String, List<String>>> entries = map.entrySet();
            for (Map.Entry<String, List<String>> entry : entries) {
                List<String> value = entry.getValue();
                System.out.print(entry.getKey() + value.size() + "人");
                for (String s : value) {
                    System.out.print("\t" + s);
                }
                System.out.println();
            }
        }
    }

    static class BasicTwo {
        public static void main(String[] args) {
            Map<Integer,Character> map = new HashMap<>();
            map.put(1,'d');
            Integer value = getValue(map, 'd');
            System.out.println(value);
        }

        public static <K,V> K getValue(Map<K, V> map, V value) {
            K key = null;
            Set<Map.Entry<K, V>> entries = map.entrySet();
            for (Map.Entry<K, V> entry : entries) {
                if (entry.getValue().equals(value)) {
                    key = entry.getKey();
                    break;
                }
            }
            return key;
        }

    }

    static class BasicThree {
        public static void main(String[] args) {

        }
    }

}
