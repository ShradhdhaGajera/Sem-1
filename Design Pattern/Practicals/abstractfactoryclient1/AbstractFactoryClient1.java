/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryclient1;

/**
 *
 * @author dell
 */
import java.util.Scanner;

public class AbstractFactoryClient1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        AbstractBillFactory abf;
        int choice1,choice2;
        double amt;
        
         Scanner sc=new Scanner(System.in);
        
        System.out.println("1. Water Bill ");
        System.out.println("2. Electricity Bill ");
        System.out.println("3. Property Bill ");
         
        System.out.println("Enter your choice :");
	choice1=sc.nextInt();
        
	System.out.println("1. Rajkot ");
	System.out.println("2. Ahmedabad ");
	System.out.println("3. Surat ");
         
        System.out.println("Select Your City :");
        choice2=sc.nextInt();
        
        abf=AbstractBillFactory.getFactory(choice1);
        if(choice1 == 1)
        {
            IWaterBill wb=abf.getWaterBill(choice2);
            System.out.println("Customer No :"+ wb.CustomerNo());
            System.out.println("Customer Name :" + wb.CustomerName());
            System.out.println("Customer Address :" + wb.CustomerAddress());
            System.out.println("Description :" + wb.Description());
            System.out.println("Total Bill Amount :" +wb.getBillAmount(20000, 100));
        }
        else if(choice1 == 2)
        {
            IElectricityBill eb=abf.getElectricityBill(choice2);
            System.out.println("Customer No :"+ eb.CustomerNo());
            System.out.println("Customer Name :" + eb.CustomerName());
            System.out.println("Customer Address :" + eb.CustomerAddress());
            System.out.println("Description :" + eb.Description());
            System.out.println("Total Bill Amount :"+eb.getBillAmount(35000, 100));
        }
        else if(choice1 == 3)
        {
            IPropertyBill pb=abf.getPropertyBill(choice2);
            System.out.println("Customer No :"+ pb.CustomerNo());
            System.out.println("Customer Name :" + pb.CustomerName());
            System.out.println("Customer Address :" + pb.CustomerAddress());
            System.out.println("Description :" + pb.Description());
            System.out.println("Total Bill Amount :"+ pb.getBillAmount(50000, 120));
        }
    }
    
}
