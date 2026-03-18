package es.uah.matcomp.mp.e1.ejerciciosComposicion.book_3;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    /// Constructor 1
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /// Constructor 2
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    /// Getters y Setters
    public String getIsbn() { return isbn; }
    public String getName() { return name; }
    public Author getAuthor() { return author; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }

    /// Retorna el nombre del autor asociado
    public String getAuthorName() {
        return author.getName();
    }

    public String toString() {
        // Reutilizamos author.toString() como pide el diagrama
        return "Book[isbn= " + isbn + ", name= " + name + ", " + author.toString() + ", price=" + price + ", qty= " + qty + "]";
    }
}
