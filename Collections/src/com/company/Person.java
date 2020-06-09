package com.company;

public class Person {

    String name;
    Integer age;
    Double desiredMoney;

    public Person(String name, Integer age, Double desiredMoney) {
        this.name = name;
        this.age = age;
        this.desiredMoney = desiredMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getDesiredMoney() {
        return desiredMoney;
    }

    public void setDesiredMoney(Double desiredMoney) {
        this.desiredMoney = desiredMoney;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desiredMoney=" + desiredMoney +
                '}';
    }
}
