package ex4;
public class ElectronicProduct extends Product{
    double power;

    // Create a class constructor for the ElectronicProduct class
public ElectronicProduct (String name, double price, String reference, double power){
    super(name, reference, price);
    this.power = power;
}
    @Override
    public String getDescription() {
       return "name= "+ getname() + " reference= "+getreference() +" price= "+getprice() +" power= "+power;
    }// chaîne de caractères décrivant le produit électronique
    
    public void setpower(double power) {
        this.power = power;
    }// Set attribute power
  
    public double getpower() {
        return power;
    }// Get attribute power



    
}