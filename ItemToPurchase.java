
//domain class
public class ItemToPurchase {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private String itemDescription;
    ShoppingCart aShoppingCart = new ShoppingCart();

    //Parameterized constructor
    public ItemToPurchase(String itemName, double itemPrice, int itemQuantity, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
    }
    //Default constructor
    public ItemToPurchase() {
        this.itemName = "";
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemDescription = "";
    }

    //Getters
    public String getItemName() {
        return itemName;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public int getItemQuantity() {
        return itemQuantity;
    }
    public String getItemDescription() {
        return itemDescription;
    }

    //Setters
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String printItemCost() {
        return (itemName + " " + this.getItemQuantity() + " @ $" + this.getItemPrice() +
                " = $" + (this.getItemPrice() * this.getItemQuantity()));
    }
    public void printItemDescription() {
        System.out.println(this.getItemName() + ": " + this.getItemDescription());
    }

    @Override
    public String toString() {
        return "ItemToPurchase{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemQuantity=" + itemQuantity +
                ", itemDescription='" + itemDescription + '\'' +
                '}';
    }
}
