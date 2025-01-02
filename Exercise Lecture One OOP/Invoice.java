public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private int pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, int pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if(quantity >= 0){
            this.quantity = quantity;
        }else{
            this.quantity = 0;
        }
        if(pricePerItem >= 0){
            this.pricePerItem = pricePerItem;
        }else{
            this.pricePerItem = 0;
        }
    }

    public int getInvoiceAmount(){
        return quantity * pricePerItem;
    }

    public static void main(String[] args){
        Invoice inv1 = new Invoice("12", "ABDI", 5, 500);
        Invoice inv2 = new Invoice("13", "SAID", 3, 300);

        System.out.println("\nobject1_Invoice Amount: " + inv1.getInvoiceAmount());
        System.out.println("object2_Invoice Amount: " + inv2.getInvoiceAmount()+"\n");
    }
}
