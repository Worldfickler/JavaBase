package org.example.day03.lambda_;

/**
 * @author Fickler
 * @date 2024/4/17 13:16
 */
public class Employee {

    private String name;

    private int age;

    private Double salary;

    private String district;

    public Employee() {
    }

    public Employee(String name, int age, Double salary, String district) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.district = district;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", district='" + district + '\'' +
                '}';
    }
}
