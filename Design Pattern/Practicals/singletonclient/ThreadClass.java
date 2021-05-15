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
public class ThreadClass 
{
    String name;
    public ThreadClass(String name)
    {
        this.name=name;
    }
    public void run()
    {
        try
        {
           Singleton s=Singleton.getinstance(name);
           s.dispaly();
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
        }
    }
}
