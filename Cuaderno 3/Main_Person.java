package org.example;

public class Main_Person {
    public static void main(String[] args) {
        Student s = new Student("Juan", "Calle A", "Ingenieria", 1, 1500.0);
        Staff st = new Staff("Maria", "Calle B", "Colegio X", 2000.0);
        System.out.println(s);
        System.out.println(st);
    }
}
