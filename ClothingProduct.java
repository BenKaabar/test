package ex4;
public class ClothingProduct extends Product{
    String size;

    public ClothingProduct(String name, String reference, double price, String size) {
        super(name, reference, price);
        this.size = size;
    }// Create a class constructor for the ClothingProduct class

    @Override
    public String getDescription() {
        return "name= "+ getname() + " reference= "+ getreference() +" price= "+ getprice() +" size= "+size;
    }// chaîne de caractères décrivant le produit Clothing

    public String getSize() {
        return size;
    }// Get attribute Size

    public void setSize(String size) {
        this.size = size;
    }// Set attribute Size
    

    

}