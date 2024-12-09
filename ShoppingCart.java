import java.util.ArrayList;

//domain class
public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    //Default constructor
    public ShoppingCart() {
        this.customerName = "none";
        this.currentDate = "January 1, 2022";
        this.cartItems = new ArrayList<ItemToPurchase>();
    }
    //Parameterized constructor
    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        this.cartItems = new ArrayList<ItemToPurchase>();
    }

    //Getters
    public String getCustomerName() {
        return customerName;
    }
    public String getCurrentDate() {
        return currentDate;
    }

    //Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

     public double getCostOfCart() {
     //determines total cost of items in cart
     double totalPrice = 0;
     for (ItemToPurchase item : cartItems) {
     totalPrice += (item.getItemPrice() * item.getItemQuantity());
     }
     return totalPrice;
     }

    public void printTotal() {
        if (cartItems.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY");
        } else {
            System.out.println(this.customerName + "'s Shopping Cart - " + this.currentDate + "\nNumber of Items: " + this.getNumItemsInCart());
            for (int i = 0; i < cartItems.size(); i++) {
                System.out.println(cartItems.get(i).getItemName() + cartItems.get(i).getItemQuantity() + " @ $" +
                        cartItems.get(i).getItemPrice() + " = $" + (cartItems.get(i).getItemPrice() * cartItems.get(i).getItemQuantity()));
            }
        }
    }
    public void printDescriptions() {
        System.out.println(this.customerName + "'s Shopping Cart - " + this.currentDate);
        System.out.println("Item Descriptions");

        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(cartItems.get(i).getItemName() + ": " + cartItems.get(i).getItemDescription());
        }
    }

    public void addItem(ItemToPurchase anItem) {
        cartItems.add(anItem);
    }
    public void removeItem(String itemName) {
        for (ItemToPurchase item : cartItems) {
            if (itemName.equalsIgnoreCase(item.getItemName())) {
                cartItems.remove(item);
                return;
            }
        }
        System.out.println("Item not found in the cart.");
        return;
    }
    public void modifyItem(ItemToPurchase anItem) {
        for (ItemToPurchase item : cartItems) {
            if (anItem.getItemName().equalsIgnoreCase(item.getItemName())) {
                item.setItemQuantity(anItem.getItemQuantity());
                return;
            }
        }
        System.out.println("Item not found in cart.");
        return;
    }
    public int getNumItemsInCart() {
        return this.cartItems.size();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "customerName='" + customerName + '\'' +
                ", currentDate='" + currentDate + '\'' +
                ", cartItems=" + cartItems +
                '}';
    }
}
