/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadeclient;

/**
 *
 * @author dell
 */
public class FacadeBank 
{
    private SBIBank sbank;
    private BOBBank bbank;
    private ICICBank ibank;
    
    public FacadeBank()
    {
        sbank = new SBIBank();
        bbank = new BOBBank();
        ibank = new ICICBank();
    }
    
    public String SBIAcoount()
    {
        return sbank.CreateAccount();
    }
    
    public String BOBAccount()
    {
        return bbank.CreateAccount();
    }
    
    public String  ICICAccount()
    {
        return ibank.CreateAccount();
    }
}
