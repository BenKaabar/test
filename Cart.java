package ex4;
    // creation d'interfeace New > interface ,, add necessairy interface
public interface Cart {
    void addProduct(Product product); // 
    boolean removeProduct(Product product);
    void displayProducts();
    double total();

}