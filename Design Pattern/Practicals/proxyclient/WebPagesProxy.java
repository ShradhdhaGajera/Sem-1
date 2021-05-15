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
import java.util.ArrayList;
import java.util.List;

public class WebPagesProxy implements Internet
{
    private Internet internent= new WebPageImplementation();
    private static List<String> bannedSites; 
      
    static
    { 
        bannedSites = new ArrayList<String>(); 
        bannedSites.add("www.freefire.com");
        bannedSites.add("www.facebook.com"); 
        bannedSites.add("www.whatsapp.com"); 

    } 
        
    @Override
    public void doConnect(String URL) throws Exception
    {   
        if(bannedSites.contains(URL.toLowerCase())) 
        { 
            throw new Exception(URL + " This Website Is Banned"); 
        } 
          
        internent.doConnect(URL); 
    }
    
}
