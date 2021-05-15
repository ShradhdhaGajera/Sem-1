/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryclient;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class FactoryClient
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int choice;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("1. PDF File");
        System.out.println("2. Word File");
        System.out.println("3. Excel File");
        System.out.println("4. Text File");
        choice=sc.nextInt();
        
        documents doc=FactoryMethod.getdocuments(choice);
        
        if(choice == 1)
        {
            System.out.println(doc.open());
            System.out.println(doc.save());
            System.out.println(doc.close());
        }
        else if(choice == 2)
        {
            System.out.println(doc.open());
            System.out.println(doc.save());
            System.out.println(doc.close());
        }
        else if(choice == 3)
        {
            System.out.println(doc.open());
            System.out.println(doc.save());
            System.out.println(doc.close());
        }
        else if(choice == 4)
        {
            System.out.println(doc.open());
            System.out.println(doc.save());
            System.out.println(doc.close());
        }
        else
        {
            System.out.println("This type of file not exiest");
        }



    }
    
}
