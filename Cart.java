package ecommerce;
import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<Product>pt;
    public Cart(){
        this.pt=new ArrayList<>();
    }
    
    public  void addProduct(Product product){
        pt.add(product);
    }
    
    public double totalProduct(){
        double total=0.0;
        for(Product product : pt){
            total += product.getPrice();
        }
        return total;
    }
    public void displayItems(){
        System.out.println("Cart: ");
        for(Product product : pt){
            System.out.println(product.getName()+" - $"+product.getPrice());
        }
        
        System.out.println("Total: $"+totalProduct());
        
    }
    
}
