package Model;

import java.util.HashMap;

public class Customer {

    private String name;
    private int age;
    private HashMap<Integer, Order> hashmap;

    public Customer(String name, int age, HashMap<Integer, Order> orders) {
        this.name = name;
        this.age = age;
        this.hashmap = orders;
    }

    public String getNavn() {
        return name;
    }

    public void setNavn(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
