package org.example;

public class Main_Animal {
    public static void main(String[] args) {
        Cat miGato = new Cat("Loki");
        System.out.println(miGato);
        miGato.greets();
        Dog perro1 = new Dog("Thor");
        Dog perro2 = new Dog("Luna");
        System.out.println(perro1);
        perro1.greets();
        perro1.greets(perro2);
    }
}
