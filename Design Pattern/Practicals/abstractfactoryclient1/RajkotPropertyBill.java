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
public class RajkotPropertyBill implements IPropertyBill
{

    @Override
    public double CustomerNo() 
    {
       return 2834737;
    }

    @Override
    public String CustomerName()
    {
        return "Andy";
    }

    @Override
    public String CustomerAddress() 
    {
       return "Rajkot , Gujarat";
    }

    @Override
    public String Description() 
    {
       return "Rajkot Property Bill with tax";
    }

    @Override
    public double getBillAmount(double amt, double unit) 
    {
        return amt*unit;
    }
    
}
