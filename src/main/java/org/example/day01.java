package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collection 练习内容
 * 1. HashMap、LinkedHashMap、HashSet、LinkedList、ArrayList 增删改查
 * 2. 生成一组不重复的随机数（HashSet）
 * 3. 对一组随机数排序（冒泡排序（ArrayList）、stream流自带排序）
 * 4. 判断一个字符串中的括号是否成对（LinkedList 实现栈进行判断）
 * 5. 统计字符串中每个字符出现的次数（HashMap）（同时按照最先出现的顺序输出LinkedHashMap）
 * @author Fickler
 * @date ${DATE} ${TIME}
 */
public class day01 {
    public static void main(String[] args) {

        /*
        Collection 练习内容
        1. HashMap、LinkedHashMap、HashSet、LinkedList、ArrayList 增删改查
        2. 生成一组不重复的随机数（HashSet）
        3. 对一组随机数排序（冒泡排序（ArrayList）、stream流自带排序）
        4. 判断一个字符串中的括号是否成对（LinkedList 实现栈进行判断）
        5. 统计字符串中每个字符出现的次数（HashMap）（同时按照最先出现的顺序输出LinkedHashMap）
         */

        // 1. HashMap、LinkedHashMap、HashSet、LinkedList、ArrayList 增删改查
        // HashMap: Map 主要实现类
        HashMap hashMap = new HashMap();
        hashMap.put("AAA", 1111);
        hashMap.put("BBB", 2222);
        hashMap.put(3333, "CCC");
        hashMap.remove(333);
        hashMap.remove(3333);
        hashMap.remove("BBB", 1234);
        hashMap.remove("BBB", 2222);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("qqq", 111);
        map.put("www", 2222);
        hashMap.putAll(map);
        hashMap.put("CCC", 3333);
//        hashMap.clear();
        Object qqq = hashMap.get("qqq");
        System.out.println(qqq);
        boolean b = hashMap.containsKey("CCC");
        System.out.println(b);
        boolean b1 = hashMap.containsValue("AAA");
        System.out.println(b1);
        boolean empty = hashMap.isEmpty();
        System.out.println(empty);
        hashMap.put("AAA", 5555);
        Object aaa = hashMap.replace("AAA", 6666);
        System.out.println("aaa: " + aaa);
        System.out.println(hashMap.size());
        System.out.println(hashMap);
        Set set = hashMap.keySet();
        for (Object o : set) {
            System.out.println(o);
        }
        Collection values = hashMap.values();
        for (Object value : values) {
            System.out.println(value);
        }
        Set entrySet = hashMap.entrySet();
        for (Object o : entrySet) {
            System.out.println(o);
            Map.Entry obj = (Map.Entry) o;
            System.out.println(obj.getKey() + " --> " + obj.getValue());
        }
        System.out.println("---------------------------------------");

        // LinkedHashMap: 使用链表维护添加进map中的顺序，故遍历map时，是按添加顺序遍历的。
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("CCC", 3333);
        linkedHashMap.put("AAA", 111);
        linkedHashMap.put("BBB", 2222);
        linkedHashMap.putAll(map);
//        linkedHashMap.remove("AAA");
        linkedHashMap.remove("qqq", 1111);
        linkedHashMap.replace("BBB", 333);
        linkedHashMap.replace("BBB", 33, 1111);
        Object bbb = linkedHashMap.get("BBB");
        System.out.println(bbb);
        linkedHashMap.containsKey("BBB");
        boolean b2 = linkedHashMap.containsValue(111);
        System.out.println(b2);
        Set set1 = linkedHashMap.keySet();
        for (Object o : set1) {
            System.out.println(o);
        }
        Collection values1 = linkedHashMap.values();
        for (Object o : values1) {
            System.out.println(o);
        }
        Set set2 = linkedHashMap.entrySet();
        for (Object o : set2) {
            System.out.println(o);
        }
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap);
        System.out.println("---------------------------------------");

        // HashSet
        System.out.println("HashSet---------------------------------------");
        HashSet hashSet = new HashSet();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.remove("C");
//        hashSet.clear();
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        boolean a = hashSet.contains("A");
        System.out.println(a);
        System.out.println(hashSet.size());
        System.out.println(hashSet);
        System.out.println("---------------------------------------");

        // LinkedList
        LinkedList linkedList = new LinkedList();
        linkedList.add("a");    // 默认链表后插入一个元素
        linkedList.addFirst("b");  // 头部
        linkedList.addLast("c");    // 尾部
        linkedList.push("d");   // 与addFirst方法一样，头部
        linkedList.offer("p");  // 尾部
        linkedList.offerFirst("l"); // 头部
        linkedList.offerLast("u");  // 尾部
        linkedList.add(3, "rr");  // 指定位置插入元素
        Object o = linkedList.get(1);   // 指定位置元素 下标从0开始
        System.out.println("1: " + o);
//        Object first = linkedList.getFirst();// 头元素
//        System.out.println(first);
//        Object last = linkedList.getLast();//  尾元素
//        System.out.println(last);
//        Object peek = linkedList.peek();    // 获取第一个元素但不移除
//        System.out.println(peek);
//        Object o1 = linkedList.peekFirst();
//        Object o2 = linkedList.peekLast();
//        Object poll = linkedList.poll();
//        Object o3 = linkedList.pollFirst();
//        Object o4 = linkedList.pollLast();
//        System.out.println("o4: " + o4);
        System.out.println(linkedList.size());
        linkedList.set(1, "ww");  // 将指定位置的元素改为新元素
//        linkedList.set(8, "tt");    // 不能越界
        Iterator iterator2 = linkedList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println(linkedList);
        System.out.println("---------------------------------------");

        //ArrayList
        ArrayList arrayList = new ArrayList();
        arrayList.add("qq");
        arrayList.add("qq");
        arrayList.add("www");
        Object o5 = arrayList.get(1);   // 下标从0开始
        System.out.println(o5);
        arrayList.add(1, "rrr");
        arrayList.set(1, "ooo");
        Iterator iterator1 = arrayList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        boolean qq = arrayList.contains("qq");
        System.out.println("qq: " + qq);
//        arrayList.remove("qq"); // 只会移除一个（第一个）
//        arrayList.remove(1);

        System.out.println(arrayList.size());
        System.out.println(arrayList);
        List list = arrayList.subList(1, 4);
        System.out.println("一段元素：" + list);
        System.out.println("---------------------------------------");


        // 2. 生成一组不重复的随机数（HashSet）
        HashSet<Integer> integers = new HashSet<>();
        Random random = new Random();
        while (integers.size() < 10) {
            integers.add(random.nextInt(50));
        }
        System.out.println("随机数：" + integers);

        // 3. 对一组随机数排序（冒泡排序（ArrayList）、stream流自带排序）
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        while (integerArrayList.size() < 10) {
            integerArrayList.add(random.nextInt(50));
        }
        System.out.println("冒泡排序（ArrayList）");
        System.out.println("未排序的随机数：" + integerArrayList);
        int len = integerArrayList.size();
        for (int i = 0; i < len - 1; i ++ ) {
            for (int j = 0; j < len - 1; j ++ ) {
                int x = integerArrayList.get(j);
                int y = integerArrayList.get(j + 1);
                if (x > y) {
                    integerArrayList.set(j, y);
                    integerArrayList.set(j + 1, x);
                }
            }
        }
        System.out.println("升序排序的随机数：" + integerArrayList);
        Stream<Integer> stream = integerArrayList.stream();
        Stream<Integer> sorted = stream.sorted();
        System.out.println("stream流自带排序：" + sorted.collect(Collectors.toList()));
        System.out.println("-----------------------------------------");


        // 4. 判断一个字符串中的括号是否成对（LinkedList 实现栈进行判断）
//        ArrayList<String> leftArrayList = new ArrayList<>();
//        ArrayList<String> rightArrayList = new ArrayList<>();
        HashMap<Character, Character> strHashMap = new HashMap<>();
        LinkedList<Character> strLinkedList = new LinkedList<>();
//        leftArrayList.add("(");
//        leftArrayList.add("[");
//        leftArrayList.add("{");
//        rightArrayList.add(")");
//        rightArrayList.add("]");
//        rightArrayList.add("}");
        strHashMap.put(')', '(');
        strHashMap.put(']', '[');
        strHashMap.put('}', '{');
        String str = "(){[]}(())";
        int strLen = str.length();
        Boolean flag = true;
        for (int i = 0; i < strLen; i++) {
            System.out.println("当前位置：" + str.charAt(i));
            if (strHashMap.containsValue(str.charAt(i))) {
                strLinkedList.add(str.charAt(i));
            } else {
                if (!strLinkedList.isEmpty()) {
                    Character last = strLinkedList.getLast();
                    System.out.println(last + " " + str.charAt(i) + " " +  strHashMap.get(str.charAt(i)));
                    if (last.equals(strHashMap.get(str.charAt(i)))) {
                        strLinkedList.pollLast();
                    } else {
                        flag = false;
                        System.out.println("括号不匹配1");
                        break;
                    }
                } else {
                    flag = false;
                    System.out.println("括号不匹配2");
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("括号匹配成功");
        }
        System.out.println("-----------------------------------------");

        // 5. 统计字符串中每个字符出现的次数（HashMap）（同时按照最先出现的顺序输出LinkedHashMap）
        String line = "dasdassdasdasfcssdwdf";
        HashMap<Character, Integer> countHashMap = new HashMap<>();
        LinkedHashMap<Character, Integer> countLinkedHashMap = new LinkedHashMap<>();
        int stringLen = line.length();
        for (int i = 0; i < stringLen; i ++ ) {
            char c = line.charAt(i);
            if (!countHashMap.containsKey(c)) {
                countHashMap.put(c, 1);
                countLinkedHashMap.put(c, 1);
            } else {
                Integer integer = countHashMap.get(c);
                countHashMap.put(c, integer + 1);
                countLinkedHashMap.put(c, integer + 1);
            }
        }
        System.out.println("字符串中每个字符出现的次数：" + countHashMap);
        System.out.println("LinkedHashMap：" + countLinkedHashMap);


    }
}