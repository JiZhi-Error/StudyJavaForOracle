package com.jizhi.oracle.java.study;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
            int number = 0;
            List<Player> players = new ArrayList<>(3);
            String[] holeCards = new String[3];
            char[] color = {'♣', '♦', '♥', '♠'};
            String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2",};
            Map<Integer, String> map = new HashMap<>(54);

//            for (char c : color) {
//                for (String c1 : num) {
//                    map.put(number++, String.format("%c%s", c, c1));
//                }
//            }
            for (String s : num) {
                for (char c : color) {
                    map.put(number++, String.format("%c%s", c, s));
                }
            }
            map.put(number++, "🃏");
            map.put(number, "🎴");
            Map<Integer, String> masp = new HashMap<>(map);
            Set<Integer> keySet = masp.keySet();
            Integer[] integers = keySet.toArray(new Integer[0]);
            ArrayList<Integer> integers1 = new ArrayList<>(Arrays.asList(integers));
            Collections.shuffle(integers1);

            for (int i = 0; i < holeCards.length; i++) {
                Integer remove = integers1.remove(0);
                holeCards[i] = masp.remove(remove);
            }


            sort(holeCards, map);
            System.out.println("底牌" + Arrays.toString(holeCards));

            for (int i = 0; i < 3; i++) {
                List<String> s = new ArrayList<>();
                for (int j = 0; j < 51 / 3; j++) {
                    s.add(masp.remove(integers1.remove(0)));
                }
                s.sort((o1, o2) -> {
                    Integer value = BasicTwo.getValue(map, o1);
                    Integer value1 = BasicTwo.getValue(map, o2);
                    return value>value1?-1:0;
                });
                Player player = new Player("00" + (i + 1), s);
                players.add(player);
            }
            for (Player player : players) {
                System.out.println(player);
            }

        }

        private static void sort(String[] strings, Map<Integer, String> map) {
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings.length; j++) {
                    String string = strings[i];
                    String string1 = strings[j];
                    Integer one = BasicTwo.getValue(map, string);
                    Integer two = BasicTwo.getValue(map, string1);
                    if (one > two) {
                        String string2 = strings[i];
                        strings[i] = strings[j];
                        strings[j] = string2;
                    }
                }
            }
        }



    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Player {
        private String name;
        private List<String> cards;
    }

}
