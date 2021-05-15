/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandclient;

/**
 *
 * @author dell
 */
public class CommandClient 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Cook cook=new Cook();
        
        System.out.println(cook.PrepareMatterpanner());
        
        System.out.println(cook.PrepareNaan());
    }
    
}
