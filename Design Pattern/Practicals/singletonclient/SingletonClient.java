/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonclient;

/**
 *
 * @author dell
 */
public class SingletonClient 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        ThreadClass t=new ThreadClass("Shradhdha");
        ThreadClass t1=new ThreadClass("Jerry");
        t.run();
        t1.run();
    }

}
