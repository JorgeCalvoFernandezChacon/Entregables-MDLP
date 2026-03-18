package es.uah.matcomp.mp.e1.ejerciciosComposicion.customer_2;


public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    // Constructor con todos los parámetros
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // Constructor con balance por defecto
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        // balance ya está inicializado a 0.0 arriba
    }

    // Getters y Setters
    public int getId() { return id; }
    public Customer getCustomer() { return customer; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getCustomerName() {
        return customer.getName();
    }

    // Método deposit: suma y devuelve la propia instancia
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    // Método withdraw: resta si hay saldo suficiente y devuelve la instancia
    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    public String toString() {
        // Formateo a 2 decimales para el balance
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }
}
