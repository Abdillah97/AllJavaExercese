public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private int pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, int pricePerItem){
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity){
        if(quantity >= 0){
            this.quantity = quantity;
        }else{
            this.quantity = 0;
        }
    }

    public void setPricePerItem(int pricePerItem){
        if(pricePerItem >= 0){
            this.pricePerItem = pricePerItem;
        }else{
            this.pricePerItem = 0;
        }
    }

    public String getPartNumber(){
        return partNumber;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getPricePerItem(){
        return pricePerItem;
    }

    public int getInvoiceAmount(){
        return quantity * pricePerItem;
    }

    public static void main(String[] args){
        Invoice inv1 = new Invoice("12", "CAR", 5, 200);

        System.out.println("part number before: " + inv1.getPartNumber());
        System.out.println("part description  before: " + inv1.getPartDescription());
        System.out.println("Invoice Amount before: " + inv1.getInvoiceAmount());
        
        inv1.setPartNumber("13");
        inv1.setPartDescription("moto van");
        inv1.setQuantity(-5);
        inv1.setPricePerItem(-200);

        System.out.println("\npart number after: " + inv1.getPartNumber());
        System.out.println("part description  after: " + inv1.getPartDescription());
        System.out.println("Invoice Amount after: " + inv1.getInvoiceAmount());

    }
}
