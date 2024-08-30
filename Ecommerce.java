package ecommerce;
public class Ecommerce {
    public static void main(String[] args) {
        Product prod1=new Product("t-shirt",1,499.99);
        Product prod2=new Product("jeans",2,899.99);
        Product prod3=new Product("socks",3,90.00);
        Product prod4=new Product("shoes",4,1299.99);
        Product prod5=new Product("watch",5,799.99);
        
        Customer customer = new Customer(9009,"Abdulrahman Ashraf","Abdulrahman@depi.com","9st,maadi");
        
        Cart cart=new Cart();
        cart.addProduct(prod1);
        cart.addProduct(prod2);
        cart.addProduct(prod3);
        cart.addProduct(prod4);
        cart.addProduct(prod5);
        cart.displayItems();
        
    }
    
}
