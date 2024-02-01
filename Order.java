package ex4;
 // class order implements de cart pour liée tous les class
public class Order implements Cart {
    int size;
    Product[] products;

      // Create a class constructor for the products class
      public Order(int capacity) {
        products = new Product[capacity];
        size = 0;
	}

    @Override
    public void addProduct(Product product) {
        if (size<products.length){
            products[size++] = product;
        }else{
            System.err.println("the order is full");
        }
    }

    @Override
    public boolean removeProduct(Product product) {
        for(int i=0;i<size;i++){
            if (products[i].equals(product)){
                for(int j=i;j<size-1;j++){
                    products[j] = products[j+1];
                }
                products[size-1]=null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayProducts() {
        System.out.println("products in the order: ");
        for(int i=0;i<size;i++){
            System.out.println(products[i].getDescription());
        }
    }

    @Override
    public double total() {
        double totalprice=0;
        for(int i=0;i<size;i++){
            totalprice+=products[i].getprice();
        }
        return totalprice;
    }
    public class Main {
        public static void main(String[] args) {
            // Creating products
            ElectronicProduct electronicProduct = new ElectronicProduct("Laptop", 1500.0, "E123", 65.0);
            ClothingProduct clothingProduct = new ClothingProduct("T-shirt", "25", 99.0, "Medium");
            BookProduct bookProduct = new BookProduct("Java Programming", "35", 49.99, "John Doe");
    
            // Creating order
            Order order = new Order(5);
    
            // Adding products to the order
            order.addProduct(electronicProduct);
            order.addProduct(clothingProduct);
            order.addProduct(bookProduct);
    
            // Displaying products in the order
            order.displayProducts();
    
            // Calculating total price
            System.out.println("Total price: $" + order.total());
    
            // Removing a product from the order
            order.removeProduct(clothingProduct);
    
            // Displaying products in the order after removal
            order.displayProducts();
        }
    }
}
