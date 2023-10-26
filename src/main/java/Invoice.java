import java.util.ArrayList;

public class Invoice {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private float result;
    private ArrayList<Item> shoppingCart;
    private float shippingCharge;
   
    public Invoice(String name, String streetAddress, String city, String state, int zipCode, ArrayList<Item> shoppingCart, float result, float shippingCharge) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.shoppingCart = shoppingCart;
        this.result = result;
        this.shippingCharge = shippingCharge;
    }


    public String toString(){
        String shippingState = "Ship to:\n\t" + name + "\n\t"+ streetAddress + "\n\t"+ city + ", " + state + " " + zipCode + "\n";
        String itemTitle = "Items\n-----\n";
        String item = printItems();
        String totalCost = "Total Cost\n----------\n$"+result;
        return shippingState + "\n"+itemTitle + item + totalCost;

    }


    private String printItems() {
        String temp = "";
        float ship = 0;
        for(Item a : shoppingCart){
            temp += a.getName() + "\t$" + a.getPrice() +"\t(" + a.getNumItems()+ ")\t$" + (a.getPrice()*a.getNumItems())+"\n";
            ship += a.getPrice()+a.getNumItems();
        }
        if(ship > 10){
            temp += "\nShipping: Free\n\n";
        }
        else{
            temp += "\nShipping: "+ shippingCharge+"\n\n";
        }
        return temp;

    }
    
}
