package ex4;
  
public abstract class Product {
  String name,reference;
  double price;

  // Create a class constructor for the Product class
    public Product(String name, String reference, double price) {
      this.name = name; // Set the initial value for the class attribute name
      this.reference = reference; // Set the initial value for the class attribute reference 
      this.price = price; // Set the initial value for the class attribute price
    }
  
    public void setname(String name) {
      this.name = name;
    }// Set attribute name
    public void setreference(String reference) {
      this.reference = reference;
    }// Set attribute reference
    public void setprice(double price) {
      this.price = price;
    }// Set attribute price

    public String getname() {
      return name;
    }// Get attribute name
    public String getreference() {
      return reference;
    }// Get attribute reference
    public double getprice() {
      return price;
    }// Get attribute price

    public abstract String getDescription(); //chaîne de caractères décrivant le produit
    }

   


