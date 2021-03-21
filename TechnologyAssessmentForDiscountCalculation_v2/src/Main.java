import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        Products products = new Products();
        Main main = new Main();//**************************ilgilenilecek

        boolean a = true;
        System.out.println("Welcome, type and press enter to navigate.");
        main.mainMenu();// *****************************ilgilenilecek

        while(a){
            main.secondaryMenu();

            Scanner scanner = new Scanner(System.in);
            String action = scanner.next().toUpperCase();
            switch(action){
                case "1": // SHOW LIST OF PRODUCTS
                    products.showProductList(products.storeInventory());
                    /* ************************************* */
                    break;
                case "2": // SHOW DETAILS OF ONE PRODUCT
                    products.showProductDetails(scanner.nextInt());
                    break;
                case "3": // ADD ITEM
                    if (customer.customerCard=="Undefined"){
                        customer.editAll_CustomerInfo();
                    }
                    products.addToCart(); //This method can be called without a parameter due to integer scan in the method.
                    break;
                case "4": // REMOVE ITEM
                    products.removeFromCart(); // Same logic with addToCart() method
                    //System.out.println("Item removed from cart.");
                    break;
                case "5": // SHOW ITEMS IN CART
                    System.out.println("Shopping Cart");
                    products.showProductList(products.shoppingCart);
                    //products.showShoppingCart(products.shoppingCart); // extra method, if change is needed.
                    break;
                case "M": // MAIN MENU
                    main.mainMenu();
                    break;
                case "6": // EDIT CUSTOMER
                    System.out.println("editing customer, ! All previous items in the cart are discarded !");
                    products.emptyCart();
                    customer.editAll_CustomerInfo();
                    break;
                case "7": // SHOW CUSTOMER INFO
                    customer.showAll_CustomerInfo();
                    break;
                case "8": // CALCULATE DISCOUNT
                    Calculate calculate = new Calculate();
                    calculate.getSumPrice(products.shoppingCart,calculate.findPercentage(customer.customerCard, customer.customerIsAffiliate, customer.customerOverTwoYears));
                    break;
                case "E": // CLEAR ALL ITEMS FROM CART
                    products.emptyCart();
                    break;
                case "Q": // EXIT PROGRAM
                    a = false;
                    break;
                default:
                    System.out.println("Undefined command detected, please try again.");
                    break;

            }
        }
    }

    public void mainMenu(){
        System.out.println("******************** MENU *********************");
        System.out.println("1 - List all products.");
        System.out.println("2 - Show product information of given id number.");
        System.out.println("3 - Select product to add into cart");
        System.out.println("4 - Select product to remove from cart");
        System.out.println("5 - List of selected products in cart");
        System.out.println("6 - Edit customer info");
        System.out.println("7 - Show customer info");
        System.out.println("8 - Get total price with discount");
        System.out.println("E - Clear all items from cart");
    }

    public void secondaryMenu(){
        System.out.println("M - Return to Menu \nQ - Exit");
        System.out.println("***********************************************");
    }


}
