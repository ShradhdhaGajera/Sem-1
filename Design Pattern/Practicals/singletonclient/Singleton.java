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
public class Singleton 
{
    private static Singleton s;
    public static String name1;
    private Singleton()
    {
        
    }
    public static Singleton getinstance(String name)
    {
        if(s==null)
        {
            name1=name;
            s=new Singleton();
        }
        return s;
    }
    public void dispaly()
    {
        System.out.println(name1+" Only One Instance Create");
    }
}
