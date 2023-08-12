package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Use setter to set a value
        obj.setName("Aks");

        // Use getter to retrieve and print the value
        String name = obj.getName();
        System.out.println("Name: " + name);
    }
}
