/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmappmvc.Model;

/**
 *
 * @author Rizky Wahyudi
 */
public class Account {
   
   private int accountNumber;
   private int pin;
   private double availableBalance;
   private double totalBalance;

   public Account(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance) {
        accountNumber = theAccountNumber;
        pin = thePIN;
        availableBalance = theAvailableBalance;
        totalBalance = theTotalBalance;
   }

   public boolean validatePIN(int userPIN) {
        if (userPIN == pin) {
           return true;
        }
        else {
           return false;
        }
   } 

   public double getAvailableBalance() {
       return availableBalance;
   } 

   public double getTotalBalance() {
       return totalBalance;
   } 
   
   public void credit(double amount) {
       totalBalance += amount;
       availableBalance += amount;
   }
   
   public void debit(double amount) {
       availableBalance -= amount;
       totalBalance -= amount;
   }
   
   public boolean isBalanceAvaiable(double amount){
       if(amount <= availableBalance){
           return true;
       }
       return false;
   }
   
   public void transfer(double amount){
       debit(amount);
   }

   public int getAccountNumber() {
       return accountNumber;  
   }
   
}