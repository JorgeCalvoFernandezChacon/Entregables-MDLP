package org.example;

public class Main_animal {
    public static void main(String[] args) {
        Cat miGato = new Cat("Misi");
        miGato.greets();
        Dog perro1 = new Dog("Toby");
        Dog perro2 = new Dog("Rex");
        perro1.greets();
        perro1.greets(perro2);
        BigDog perroGrande1 = new BigDog("Beethoven");
        BigDog perroGrande2 = new BigDog("Hulk");
        perroGrande1.greets();
        perroGrande1.greets(perro1);
        perroGrande1.greets(perroGrande2);
    }
}
