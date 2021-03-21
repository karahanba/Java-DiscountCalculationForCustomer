import java.util.Scanner;

public class Customer {
    /*
        If the user has gold card of the store, he gets a 30% discount
        If the user has silver card of the store, he gets a 20% discount
        If the user is an affiliate of the store, he gets a 10% discount
        If the user has been a customer for over 2 years, he gets a 5% discount.
        *** For every $200 on the bill, there would be a $ 5 discount (e.g. for $ 950, you get $ 20 as a discount). ***
        The percentage based discounts do not apply on phones.
        A user can get only one of the percentage based discounts on a bill.

         */
    String customerCard="Undefined"; /* Gold - Silver - Regular */
    boolean customerIsAffiliate=false;
    boolean customerOverTwoYears=false;
    Scanner scan = new Scanner(System.in);

    public String getCustomerCardInfo(){

        System.out.println("select card status for Gold '1', Silver '2' or Regular '3' ?");
        switch(scan.next().toLowerCase()){
            case "1":
                customerCard="Gold";
                break;
            case "2":
                customerCard="Silver";
                break;
            case "3":
                customerCard="Regular";
                break;
            default:
                customerCard="Undefined";
                break;
        }
        return customerCard;
    }

    public boolean getCustomerAffiliation(){

        System.out.println("Is customer an affiliate? : Type 'Yes' or 'No'");
        customerIsAffiliate = scan.next().toLowerCase().equals("yes");
        /*customerIsAffiliate = scan.nextBoolean(); SİLİNECEK*/
        return customerIsAffiliate;
    }

    public boolean getCustomerTimeSpan(){

        System.out.println("Has user been a customer over 2 years? : Type 'Yes' or 'No'");
        if(scan.next().toLowerCase().equals("yes")){
            customerOverTwoYears = true;
        }else{
            customerOverTwoYears = false;
        }
        return customerOverTwoYears;
    }


    public void editAll_CustomerInfo(){
        System.out.println(getCustomerAffiliation()+"\n"+getCustomerCardInfo()+"\n"+getCustomerTimeSpan());
    }

    public  void showAll_CustomerInfo(){
        System.out.println("Showing customer details...");
        System.out.println("CustomerCard: "+customerCard+"\nCustomerIsAffiliate: "+customerIsAffiliate+
                "\nCustomerOverTwoYears: "+customerOverTwoYears);

    }


}
