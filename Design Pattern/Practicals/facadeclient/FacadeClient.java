/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadeclient;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class FacadeClient 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int choice;
        int AccountNo;
        String AccountHolderName;
        String AccountType;
        float amount;
        float bal=0;
        
        Scanner sc1 = new Scanner(System.in);
        
        //Scanner sc = new Scanner(System.in);
        System.out.println("1. BOB Bank");
        System.out.println("2. SBI Bank");
        System.out.println("3. ICIC Bank");
        
        System.out.println("Choose Any Bank For Create An Account :");
        choice=sc1.nextInt();

        System.out.println("Enter Account Number :");
        AccountNo = sc1.nextInt();
        
        System.out.println("Enter Account Holder Name:");
        AccountHolderName = sc1.next();
        
        System.out.println("Enter Account Type:");
        AccountType = sc1.next();
        
        System.out.println("Enter Initial Balance:");
        bal = sc1.nextFloat();         
       
        
        System.out.println("Enter Amount to be Deposited:");
        amount = sc1.nextFloat();
        float totalbal = bal+amount;
        System.out.println("Deposited! Account Balance is "+totalbal);
        
        FacadeBank facadebank = new FacadeBank();
        
        if(choice == 1)
        {
            System.out.println(facadebank.BOBAccount());
            System.out.println("  Account No. : " +AccountNo);
            System.out.println("  Account Holder Name : " +AccountHolderName);
            System.out.println("  Account Type : " +AccountType);
            System.out.println("  Initial Balance : " +bal);
            System.out.println("  Deposited Ammount : " +amount);
            System.out.println("  Total Ammount : " +totalbal);
        }
        else if(choice == 2)
        {
            System.out.println(facadebank.SBIAcoount());
            System.out.println("  Account No. : " +AccountNo);
            System.out.println("  Account Holder Name : " +AccountHolderName);
            System.out.println("  Account Type : " +AccountType);
            System.out.println("  Initial Balance : " +bal);
            System.out.println("  Deposited Ammount : " +amount);
            System.out.println("  Total Ammount : " +totalbal);
        }
        else if(choice == 3)
        {
            System.out.println(facadebank.ICICAccount());
            System.out.println("  Account No. : " +AccountNo);
            System.out.println("  Account Holder Name : " +AccountHolderName);
            System.out.println("  Account Type : " +AccountType);
            System.out.println("  Initial Balance : " +bal);
            System.out.println("  Deposited Ammount : " +amount);
            System.out.println("  Total Ammount : " +totalbal);
        }
        else
        {
            System.out.println(" This Bank Not Found");
        }
           
    }
    
}
