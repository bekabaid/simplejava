
public class Invoice {

    private int partNumber;
    private String partDescrption;
    private int quantity;
    private double price;

    public Invoice(int partNumber, String partDescrption, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescrption = partDescrption;
        this.quantity = quantity;
        this.price = price;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescrption() {
        return partDescrption;
    }

    public void setPartDescrption(String partDescrption) {
        this.partDescrption = partDescrption;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInvoice() {
        System.out.format("%2d%10s  %2d   %2f", this.getPartNumber(), this.getPartDescrption(),
                this.getQuantity(), this.getPrice());
    }
}
