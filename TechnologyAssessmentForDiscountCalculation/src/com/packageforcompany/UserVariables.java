package com.packageforcompany;

public class UserVariables {

    private boolean productPhone;

    private int userStatus;
    private String customerOvertwo;

    private double billValue;
    private int extraDiscount;
    private double percentageDiscount;


    /*public UserVariables() {
        this.productPhone = true;
        this.userStatus = 4;
        this.customerOvertwo = "Yes";
        this.billValue = 450;
        this.extraDiscount = 10;
        this.percentageDiscount = 22.5;
    }

     */

    public UserVariables(boolean productPhone, int userStatus, String customerOvertwo, double billValue) {
        this.productPhone = productPhone;
        this.userStatus = userStatus;
        this.customerOvertwo = customerOvertwo;
        this.billValue = billValue;
        this.extraDiscount = 0; // Initially zero
        this.percentageDiscount = 0; // Initially zero
    }

    public double calculatePercentageDiscount() {
        
        if (userStatus == 1 && !productPhone) { // if userStatus is Gold and product is not a phone
            percentageDiscount = billValue * 30 / 100;

        }

        else if (userStatus == 2 && !productPhone) { // if userStatus is Silver and product is not a phone
            percentageDiscount = billValue * 20 / 100;
        }

        else if (userStatus == 3 && !productPhone) { // if userStatus is Affiliate and product is not a phone
            percentageDiscount = billValue * 10 / 100;
        }

        else if (userStatus == 4 && !productPhone) { // if userStatus is Not Defined and product is not a phone
            if (customerOvertwo.equals("Y")) { // if user is a Customer for over 2 years
                percentageDiscount = billValue * 5 / 100;
            }
            else if (customerOvertwo.equals("N")) {
            }
        }

        else if (userStatus > 4 | userStatus == 0) {
                System.out.println("Entry is not valid!!! userStatus values must be between 1 and 4. ");
                System.exit(0);
        }

        else {
            System.out.println("There can be no Percentage Discount on phones... ");
        }

        return percentageDiscount;
    }

    public int calculateExtraDiscount() {
        extraDiscount = 5 * (int) (billValue / 200); // 5$ discount for every 200$
        return extraDiscount;
    }

    public double calculateBill() {
        billValue = billValue - percentageDiscount - extraDiscount;
        return billValue;
    }



    public void showVariables() {
        System.out.println("Product is a phone : " + this.productPhone);
        System.out.println("User Status ('1' Gold, '2' Silver, '3' Affiliate, '4' Not Defined) is : " + this.userStatus);
        System.out.println("User has been a customer for over 2 years : " + this.customerOvertwo);
        System.out.println("Bill value : " + this.billValue + " $");
        System.out.println("Extra discount per 200$ is : " + this.extraDiscount + " $");
        System.out.println("Percentage Discount is : " + this.percentageDiscount + " $");
    }


    public boolean isProductPhone() {
        return productPhone;
    }

    public void setProductPhone(boolean productPhone) {
        this.productPhone = productPhone;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getCustomerOvertwo() {
        return customerOvertwo;
    }

    public void setCustomerOvertwo(String customerOvertwo) {
        this.customerOvertwo = customerOvertwo;
    }

    public double getBillValue() {
        return billValue;
    }

    public void setBillValue(double billValue) {
        this.billValue = billValue;
    }

    public int getExtraDiscount() {
        return extraDiscount;
    }

    public void setExtraDiscount(int extraDiscount) {
        this.extraDiscount = extraDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
}
