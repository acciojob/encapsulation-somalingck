// Main.java
package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwObj = new RWOnly("Initial Name");

        // Use setter to set a value
        rwObj.setName("New Name");

        // Use getter to print the value
        System.out.println(rwObj.getName()); // Output: New Name
    }
}
