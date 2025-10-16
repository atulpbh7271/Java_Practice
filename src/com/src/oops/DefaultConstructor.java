package com.src.oops;

public class DefaultConstructor {
    public static class Cat {
        private String name;
        private int age;

        Cat(){
            this.name="unknow";
            this.age=0;
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args){
        Cat cat=  new Cat();
        System.out.println("Cat's Name: " + cat.getName());
        System.out.println("Cat's Age: " + cat.getAge());
    }
}
