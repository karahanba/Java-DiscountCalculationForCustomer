import java.util.ArrayList;
import java.util.Scanner;

public class Products {

    ArrayList<ArrayList<String>> shoppingCart = new ArrayList<ArrayList<String>>();
    Scanner scanner = new Scanner(System.in);
    int Id;

    public void showProductDetails(int id){

        System.out.println("Showing product details...");
        System.out.println("seçilen ürün:"+ storeInventory().get(id));
        System.out.println("seçilen ürünün normal fiyatı:"+ storeInventory().get(id).get(3));
    }

    public ArrayList<ArrayList<String>> addToCart()
    {
        ArrayList<String> selection = new ArrayList<String>(); // Causes a mistake in cart if created generic.
        showProductList(storeInventory());
        System.out.println("Select a product by Id number to add to the cart:");
        Id = scanner.nextInt(); // new
        System.out.println("Adding "+ storeInventory().get(Id).get(1)+" to your list...");
        //System.out.println("Price of item without discount:"+ storeInventory().get(Id).get(3));

        for (int i = 0; i< storeInventory().get(Id).size(); i++){
            selection.add(storeInventory().get(Id).get(i));
        }

        shoppingCart.add(selection);
        System.out.println(selection.get(1)+" is added into cart.");
        return shoppingCart;
    }

    public ArrayList<ArrayList<String>> removeFromCart(){

        ArrayList<String> selection = new ArrayList<String>();
        showProductList(shoppingCart);
        System.out.println("Select a product by Id number to remove from the cart:");
        Id = scanner.nextInt(); // new
        System.out.println("Removing "+ storeInventory().get(Id).get(1)+" from your list...");
        //System.out.println("Regular price for selected item: "+ storeInventory().get(Id).get(3)+"$");

        for (int i = 0; i< storeInventory().get(Id).size(); i++){
            selection.add(storeInventory().get(Id).get(i));

        }
        shoppingCart.remove(selection);
        System.out.println(selection.get(1)+" is removed from cart.");
        return shoppingCart;
    }

    public void emptyCart(){
        shoppingCart.clear();
        System.out.println("All items are removed from cart.");
    }

    public void showProductList(ArrayList<ArrayList<String>> p){
        for (int i = 0; i < p.size(); i++) {
            for (int j = 0; j < p.get(i).size(); j++) {
                System.out.print(p.get(i).get(j) + " // ");

            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");

    }

    public ArrayList<ArrayList<String>> storeInventory(){
        ArrayList<ArrayList<String>> productList = new ArrayList<ArrayList<String>>();

        ArrayList<String> listLabel = new ArrayList<String>();
        listLabel.add("ProductID");
        listLabel.add("ProductName");
        listLabel.add("Category");
        listLabel.add("Price");
        productList.add(listLabel);

        ArrayList<String> product1 = new ArrayList<String>();
        product1.add("1");
        product1.add("Hp Laptop");
        product1.add("Computer");
        product1.add("3000");
        productList.add(product1);

        ArrayList<String> product2 = new ArrayList<String>();
        product2.add("2");
        product2.add("Iphone 12");
        product2.add("Phone");
        product2.add("2000");
        productList.add(product2);

        ArrayList<String> product3 = new ArrayList<String>();
        product3.add("3");
        product3.add("XBOX One");
        product3.add("Game Console");
        product3.add("2500");
        productList.add(product3);

        return productList;
    }


}
