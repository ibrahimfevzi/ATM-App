package a_us_bank;

import java.awt.TextArea;
import javax.swing.JOptionPane;


public class Account {
   

    private String password;
    private int balance;
    private int amount;

    public Account(String password, int balance) {
        this.password = password;
        this.balance = balance;
    }

    Account() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Account(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
     public void deposit(int amount) {
        
         balance += amount;
              

   
     }
     public void withdraw(int amount) {
         
         if ((balance-amount)<0) {
             
         
             
         }
         else{
             balance -= amount;
             
         }
        
        
     }

    void deposit(String amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
         
}
