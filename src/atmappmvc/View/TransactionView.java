/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmappmvc.View;

/**
 *
 * @author Rizky Wahyudi
 */
public class TransactionView {
    
    public void balanceInquiry(double availableBalance, double totalBalance){
      System.out.println("\nBalance Information:");
      System.out.print("- Available balance: "); 
      System.out.println(convertToDollar(availableBalance));
      System.out.print("- Total balance:     ");
      System.out.println(convertToDollar(totalBalance));
    }
    
    public String convertToDollar(double amount){
        return String.format("$%,.2f", amount);
    }
    
    public void displayWithdrawalAmount() {
     // display the withdrawal menu
         System.out.println("\nWithdrawal Menu:");
         System.out.println("1 - $20");
         System.out.println("2 - $40");
         System.out.println("3 - $60");
         System.out.println("4 - $100");
         System.out.println("5 - $200");
         System.out.println("6 - Cancel transaction");
         System.out.print("\nChoose a withdrawal amount: ");
    }
    
    public void displayErrorInput(){
        System.out.print("\nInvalid selection. Try again.");
    }
    
    public void displayInsufficientCashDIspenser(){
        System.out.print("\nInsufficient Cash in Cash Dispenser.");
    }
    
    public void displayInsufficientBalance(){
        System.out.print("\nInsufficient Balance.");
    }
}
