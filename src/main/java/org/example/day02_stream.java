package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Fickler
 * @date 2024/4/16 13:07
 */
public class day02_stream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c");
        // 创建一个串行流
        Stream<String> stream = list.stream();
        // 创建一个并行流
        Stream<String> stringStream = list.parallelStream();

        int[] array = {1, 3, 5, 4, 3};
        IntStream stream1 = Arrays.stream(array);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        Stream<Integer> limit = Stream.iterate(0, (x) -> x + 3).limit(4);
        limit.forEach(System.out::println);

        Stream<Double> limit1 = Stream.generate(Math::random).limit(3);
        limit1.forEach(System.out::println);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> first = integers.stream().parallel().filter(x -> x > 3).findFirst();

        // 遍历、匹配（foreach、find、match）
        List<Integer> integers1 = Arrays.asList(7, 6, 9, 3, 8, 2, 1);
        // 遍历输出符合条件的元素
        integers1.stream().filter(x -> x > 4).forEach(System.out::println);
        // 匹配第一个满足条件的元素
        Optional<Integer> first1 = integers1.stream().filter(x -> x > 6).findFirst();
        System.out.println("匹配的第一个元素：" + first1.get());
        // 匹配任意一个满足条件的元素（适用于并行流）
        Optional<Integer> any = integers1.parallelStream().filter(x -> x > 6).findAny();
        System.out.println("匹配的任意一个元素：" + any.get());
        boolean b = integers1.stream().anyMatch(x -> x > 6);
        System.out.println("是否有满足条件的元素：" + b);

        // 筛选（filter）
        integers1.stream().filter(x -> x > 6).forEach(System.out::print);
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, "male", "New York"));
        personList.add(new Person("Jack", 7000, "male", "Washington"));
        personList.add(new Person("Lily", 7800, "female", "Washington"));
        personList.add(new Person("Anni", 8200, "female", "New York"));
        personList.add(new Person("Owen", 9500, "male", "New York"));
        personList.add(new Person("Alisa", 7900, "female", "New York"));
        // 筛选工资大于 8k 的人
        List<String> collect = personList.stream().filter(x -> x.getSalary() > 8000).map(Person::getName).collect(Collectors.toList());
        System.out.println("工资大于 8000 的人：" + collect);

        // 聚合（max、min、count）
        List<String> strings = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
        // 求 strings 中最长的元素
        Optional<String> max = strings.stream().max(Comparator.comparing(String::length));
        System.out.println("最长的元素：" + max.get());
        List<Integer> integerList = Arrays.asList(7, 6, 9, 4, 11, 6);
        // 自然排序
        Optional<Integer> max1 = integerList.stream().max(Integer::compareTo);
        System.out.println("自然排序最大值：" + max1.get());
        // 自定义排序（从大到小）
        Optional<Integer> max2 = integerList.stream().max((o1, o2) -> o2 - o1);
        System.out.println("自定义排序最大值：" + max2.get());
        // 获取薪资最高的员工
        Optional<Person> personSalary = personList.stream().max(Comparator.comparingInt(Person::getSalary));
        System.out.println("薪资最高的员工：" + personSalary.get().getName() + " " + personSalary.get().getSalary());
        // 计算集合中大于 6 的元素的个数
        long count = integerList.stream().filter(x -> x > 6).count();
        System.out.println("大于6的元素的个数：" + count);

        // 映射（map、flatMap）
        String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
        // 全部改为大写
        List<String> stringList = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("每个元素大写：" + stringList);
        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
        // 每个元素 +3
        List<Integer> integerList1 = intList.stream().map(x -> x + 3).collect(Collectors.toList());
        System.out.println("每个元素+3：" + integerList1);
        // 将员工的薪资+1000
        // 不改变原来员工集合的方式
        List<Person> personListNew = personList.stream().map(person -> {
            Person personNew = new Person(person.getName(), 0);
            personNew.setSalary(person.getSalary() + 1000);
            return personNew;
        }).collect(Collectors.toList());
        System.out.println("不改变原来集合：");
        for (Person person : personListNew) {
            System.out.println(person.getName() + " " + person.getSalary());
        }
        // 改变原来员工集合的方式
        List<Person> personListNew2 = personList.stream().map(person -> {
            person.setSalary(person.getSalary() + 1000);
            return person;
        }).collect(Collectors.toList());
        System.out.println("改变原来集合：");
        for (Person person : personListNew2) {
            System.out.println(person.getName() + " " + person.getSalary());
        }
        // 将两个字符数组合并成一个新的字符数组
        List<String> asList = Arrays.asList("m,k,l,a", "1,3,5,7");
        List<String> asListNew = asList.stream().flatMap(s -> {
            String[] split = s.split(",");
            Stream<String> stream2 = Arrays.stream(split);
            return stream2;
        }).collect(Collectors.toList());
        System.out.println("处理前：" + asList);
        System.out.println("处理后：" + asListNew);

        // 规约（reduce）
        List<Integer> integers2 = Arrays.asList(1, 3, 2, 8, 11, 4);
        integers2.stream().reduce((x, y) -> x + y);
        integers2.stream().reduce(Integer::sum);
        integers2.stream().reduce(0, Integer::sum);
        integers2.stream().reduce((x, y) -> x * y);
        integers2.stream().reduce((x, y) -> x > y ? x : y);
        integers2.stream().reduce(1, Integer::max);
        // 求工资之和
        Optional<Integer> reduce = personList.stream().map(Person::getSalary).reduce(Integer::sum);
        System.out.println("工资之和：" + reduce.get());
        // 求最高工资
        Optional<Integer> reduce1 = personList.stream().map(Person::getSalary).reduce(Integer::max);
        System.out.println("最高工资：" + reduce1.get());

        // 收集（collect）
        Long collect1 = personList.stream().collect(Collectors.counting());
        Double collect2 = personList.stream().collect(Collectors.averagingDouble(Person::getSalary));
        Optional<Integer> collect3 = personList.stream().map(Person::getSalary).collect(Collectors.maxBy(Integer::compare));
        IntSummaryStatistics collect4 = personList.stream().collect(Collectors.summarizingInt(Person::getSalary));
        // 一次性统计所有信息
        DoubleSummaryStatistics collect5 = personList.stream().collect(Collectors.summarizingDouble(Person::getSalary));
        Map<Boolean, List<Person>> collect6 = personList.stream().collect(Collectors.partitioningBy(x -> x.getSalary() > 8000));
        Map<String, List<Person>> collect7 = personList.stream().collect(Collectors.groupingBy(Person::getSex));
        Map<String, Map<String, List<Person>>> collect8 = personList.stream().collect(Collectors.groupingBy(Person::getSex, Collectors.groupingBy(Person::getArea)));
        System.out.println("性别+地区：" + collect8);

        String collect9 = personList.stream().map(p -> p.getName()).collect(Collectors.joining("-"));
        System.out.println("连接后的字符串：" + collect9);

        // 排序（sorted）
        List<String> collect10 = personList.stream().sorted(Comparator.comparing(Person::getSalary)).map(Person::getName).collect(Collectors.toList());
        List<String> collect11 = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed()).map(Person::getName).collect(Collectors.toList());
        List<String> collect12 = personList.stream().sorted(Comparator.comparing(Person::getSalary).thenComparing(Person::getAge)).map(Person::getName).collect(Collectors.toList());
        System.out.println("工资升序：" + collect10);
        System.out.println("工资降序：" + collect11);
        System.out.println("工资年龄：" + collect12);


    }
}

class Person {
    private String name;  // 姓名
    private int salary; // 薪资
    private int age; // 年龄
    private String sex; //性别
    private String area;  // 地区

    // 构造方法
    public Person(String name, int salary, String sex, String area) {
        this.name = name;
        this.salary = salary;
        this.sex = sex;
        this.area = area;
    }

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // 省略了get和set，请自行添加


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

