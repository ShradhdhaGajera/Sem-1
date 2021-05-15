/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author dell
 */
public class Decorator 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Message msg = new MyMessage() ;
        System.out.println(msg.getMessage());
        Message MyMsg = new ReverseMsg( new UpperCaseMsg( new LowerCaseMsg( new MyMessage())));
        System.out.println(MyMsg.getMessage());
    }
    
}
