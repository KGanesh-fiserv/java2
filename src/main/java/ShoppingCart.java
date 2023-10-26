import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList <Item> shoppingCart = new ArrayList<Item>();
    private float result;
    private float shippingCharge;

    public ShoppingCart() {
        result = 0;
        shippingCharge = 0;
    }

    public ShoppingCart(float shippingCharge) {
        this.shippingCharge = shippingCharge;
        result = 0;
    }

    public void addItem(Item a){
        shoppingCart.add(a);
    }
    public void calculateTotal(){
        for(Item a : shoppingCart){
            result += a.getPrice()*a.getNumItems();
        }
        if (result < 10){
            result += shippingCharge + (float) (result * 0.1) ;
        }
        else{
            result +=  (float) (result * 0.1) ;
        }

    }
    public String getTotal(){
        return "$"+result;
    }

    public Invoice shipOrder(String name, String streetAddress, String city, String state, int zipCode){
        return new Invoice(name, streetAddress, city, state, zipCode, shoppingCart, result, shippingCharge);
    }
    
}
