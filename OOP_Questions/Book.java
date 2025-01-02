public class Book{
    private String name;
    private String ISBN;
    private String author;
    private String publisher;

    public Book(String name, String ISBN, String author, String publisher){
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getName(){
        return name;
    }
    public String getISBN(){
        return ISBN;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }

    public String getBookInfo(){
        return "\nName: " + name + "\nISBN: " + ISBN + "\nAuthor: " + author + "\nPublisher: " + publisher;
    }

    public static void main(String[] args){
        Book book1 = new Book("\nJava 2nd edition", "J-02", "Mr massoud Hamad", "Suza Books publisher");
        Book book2 = new Book("Accounting 3nd edition", "A-03", "Dr Rams ", "SOB-Suza Books publisher");
        
        System.out.println("\nBOOK1:" + book1.getBookInfo());
        System.out.println("\nBOOK2:" + book2.getBookInfo());

        book1.setAuthor("Abdillah");
        book2.setAuthor("Khalid");

        System.out.println("\nBOOK1 correction:" + book1.getBookInfo());
        System.out.println("\nBOOK2 correction:" + book2.getBookInfo()+"\n");

    }
}
