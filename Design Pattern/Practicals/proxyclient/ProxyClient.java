/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyclient;

/**
 *
 * @author dell
 */
public class ProxyClient
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Internet wp=new WebPagesProxy();
        try
        {  
            wp.doConnect("www.youtube.com");
            wp.doConnect("www.gujaratvidyapith.org");
            wp.doConnect("www.google.com");
            wp.doConnect("www.microsoft.com");
            wp.doConnect("www.w3school.com");
            wp.doConnect("www.icicbank.com");
            wp.doConnect("www.gseb.org");
            wp.doConnect("www.amazon.com");
            wp.doConnect("www.facebook.com");
            wp.doConnect("www.freefire.com");
            wp.doConnect("www.whatsapp.com");
            
             
        }
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
       
    }
    
}
