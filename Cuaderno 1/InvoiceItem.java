public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor de clase
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int newQty) {
        qty = newQty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double newUnitPrice) {
        unitPrice = newUnitPrice;
    }
    public double getTotal() {
        return unitPrice * qty;
    }
    
    public String toString() {
        return "InvoiceItem[id= " + id + ",desc= " + desc + ",qty= " + qty + ",unitPrice= " + unitPrice + "]";
    }
}
