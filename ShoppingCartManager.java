/**
 * @author 6352303
 * Title: Challenge 9
 * Semester: Spring 2023 - COP 2210
 * Prof. Charters & UTA Emily Salgueiros
 * Description:
 * This program 
 */

import java.util.Scanner;

//Driver class
public class ShoppingCartManager {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        String customerName;
        String date;
        char menuChoice = ' ';

        System.out.println("Please enter customer name: ");
        customerName = keyboard.nextLine();

        System.out.println("Please enter today's date: ");
        date = keyboard.nextLine();

        System.out.println("\nCustomer name: " + customerName);
        System.out.println("Today's date: " + date);
        System.out.println();

        ShoppingCart myCart = new ShoppingCart(customerName,date);

        printMenu();

        while (menuChoice != 'q') {
            System.out.println("Choose an option: ");
            menuChoice = keyboard.next().charAt(0);
            executeMenu(menuChoice, myCart);
            printMenu();
        }
        System.out.println("Thank you for shopping with us. Please come again.");
    }
    public static void printMenu() {
        System.out.println("***MENU***");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println();
    }

    public static void executeMenu(char option, ShoppingCart theCart) {
        String productName;
        String productDescription;
        double productPrice = 0;
        int productQuantity = 0;

        switch (option) {
            case 'a':
                keyboard.nextLine();
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name: ");
                productName = keyboard.nextLine();

                System.out.println("Enter the item description: ");
                productDescription = keyboard.nextLine();

                System.out.println("Enter the item price: ");
                productPrice = keyboard.nextDouble();

                System.out.println("Enter the item quantity: ");
                productQuantity = keyboard.nextInt();

                ItemToPurchase newItem = new ItemToPurchase(productName, productPrice, productQuantity, productDescription);
                theCart.addItem(newItem);

                System.out.println();
                break;

            case 'd':
                keyboard.nextLine();
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter the name of the item to remove: ");
                productName = keyboard.nextLine();

                theCart.removeItem(productName);
                System.out.println();
                break;

            case 'c':
                keyboard.nextLine();
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name: ");
                productName = keyboard.nextLine();

                System.out.println("Enter the new quantity: ");
                productQuantity = keyboard.nextInt();

                ItemToPurchase modItem = new ItemToPurchase();
                modItem.setItemName(productName);
                modItem.setItemQuantity(productQuantity);

                theCart.modifyItem(modItem);
                System.out.println();
                break;

            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                theCart.printDescriptions();
                System.out.println();
                break;

            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                theCart.printTotal();
                System.out.println();
                break;
        }
    }
}
