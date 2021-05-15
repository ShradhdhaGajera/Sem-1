/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryclient1;

/**
 *
 * @author dell
 */
public class AhemdabadPropertyBill implements IPropertyBill
{

    @Override
    public double CustomerNo()
    {
        return 18756432;
    }

    @Override
    public String CustomerName() 
    {
        return "neil";
    }

    @Override
    public String CustomerAddress()
    {
       return "To : Jetpur ,Ta : Jetpur ,Dist : Junagadh ";
    }

    @Override
    public String Description() 
    {
       return "Ahemdabad Property Bill With Tax";
    }

    @Override
    public double getBillAmount(double amt, double unit)
    {
        return amt*unit;
    }
    
}
