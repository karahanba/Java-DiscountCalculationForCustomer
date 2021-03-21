import java.util.ArrayList;

public class Calculate {
    /* No percentage discount for "Phone" category */
    /* 5$ Discount for every 200$ */
    /* A user can only get one of the percentage discounts */

    // This method finds percentage discount ratio for customer
    public double findPercentage(String s, boolean a, boolean b){
        //s = customerCard, a = customerIsAffiliated, b = customerOverTwoYears
        double percentageRatio;

        switch (s){
            case "Gold":
                // 30% discount
                percentageRatio=0.30;
                break;
            case "Silver":
                // 20% discount
                percentageRatio=0.20;
                break;
            default:
                // other possibilities
                if(a){
                    // affiliated 10 % disc
                    percentageRatio=0.10;
                }else if(!a && b) {
                    // Customer over 2 years, 5% discount
                    percentageRatio=0.05;
                }else{
                    percentageRatio=0;
                }
                break;
        }
        return percentageRatio;
    }

    public void getSumPrice(ArrayList<ArrayList<String>> c, double pR){ // pR stands for percentageRatio
        System.out.println("shopping list....");
        System.out.println(c);
        System.out.println("******");
        double test = pR;
        double sum= 0;

        for (int i = 0; i< c.size(); i++) {
            double productPrice;
            double newPrice;
            if (pR == 0) {
                pR = test; // To re-setting the percentageRatio
            }
            if (c.get(i).get(2) == "Phone") {
                System.out.println("a phone is detected");
                pR = 0;
            }
            productPrice = Double.parseDouble(c.get(i).get(3));
            newPrice = productPrice - (productPrice * pR);
            sum = newPrice + sum;

        }

        // 5$ discount for every 200$
        int extraDiscount = 5 * (int) (sum / 200);
        sum = sum - extraDiscount;

        System.out.println("sum="+ sum+" $");

    }
    
}
