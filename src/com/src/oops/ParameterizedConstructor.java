package com.src.oops;

public class ParameterizedConstructor {
    public static class Dog {
        private String name;
        private String color;

        Dog(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Color: " + color);
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Bailey", "Black");
        dog.displayInfo();
    }
}
