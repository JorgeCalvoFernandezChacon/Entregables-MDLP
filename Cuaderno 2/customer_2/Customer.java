package es.uah.matcomp.mp.e1.ejerciciosComposicion.customer_2;

public class Customer {
    private int id;
    private String name;
    private char gender; // 'm' o 'f'

    public Customer(int id, String name, int discount, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + id + ")";
    }
}
