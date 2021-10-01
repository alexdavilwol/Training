package Training;

public class Invoice {

    String partNumber;
    String partDescription;
    int quantity;
    double pricePer;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if(quantity < 0)
            this.quantity = 0;
        else
            this.quantity = quantity;
    }

    public double getPricePer() {
        return pricePer;
    }

    public void setPricePer(double pricePer) {

        if(pricePer < 0.0)
            this.pricePer = 0.0;
        else
            this.pricePer = pricePer;
    }

    public Invoice(String partNumber, String partDescription, int quantity, double pricePer) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

//        if(quantity < 0)
//            quantity = 0;
//        this.quantity = quantity;

        setQuantity(quantity);

//        if(pricePer < 0.0)
//            pricePer = 0.0;
//        this.pricePer = pricePer;

        setPricePer(pricePer);
    }

    public double getInvoiceAmount() {

//        if (quantity < 0) {
//            quantity = 0;
//        }
//
//        if (pricePer < 0)
//            pricePer = 0.0;

        return quantity * pricePer;

    }

}

class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("42", "Training Book", 2, 2);

        System.out.println("Your total invoice amount is: " + invoice.getInvoiceAmount());
        System.out.println(invoice.getQuantity());

    }

}
