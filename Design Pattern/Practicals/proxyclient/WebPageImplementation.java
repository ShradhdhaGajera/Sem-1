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
public class WebPageImplementation implements Internet
{

    @Override
    public void doConnect(String URL) throws Exception
    {
        System.out.println(URL + " Connect to The Internet ");
    }
    
}
