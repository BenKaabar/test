package ex4;

public class BookProduct extends Product{
    String author;

    public BookProduct(String name, String reference, double price, String author) {
        super(name, reference, price);
        this.author = author;
    }// Create a class constructor for the BookProduct class

    @Override
    public String getDescription() {
        return "name= "+ getname() + " reference= "+ getreference() +" price= "+getprice() +" author= "+author;
    }// chaîne de caractères décrivant le Book Clothing

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    
}