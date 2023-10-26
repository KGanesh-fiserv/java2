public class Item {
    private float price;
    private int numItems;
    public Item(float price, int numItems, String name) {
        this.price = price;
        this.numItems = numItems;
        this.name = name;
    }
    private String name;
    public float getPrice() {
        return price;
    }
    public int getNumItems() {
        return numItems;
    }
    public String getName() {
        return name;
    }    
}
