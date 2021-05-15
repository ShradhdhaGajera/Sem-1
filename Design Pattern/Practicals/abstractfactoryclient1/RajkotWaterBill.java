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
public class RajkotWaterBill implements IWaterBill
{

    @Override
    public double CustomerNo() 
    {
       return 278695;
    }

    @Override
    public String CustomerName() 
    {
        return "jackie";
    }

    @Override
    public String CustomerAddress() 
    {
       return "Rajkot , Gujarat";
    }

    @Override
    public String Description() 
    {
        return "Rajkot Water Bill With Tax";
    }

    @Override
    public double getBillAmount(double amt, double unit) 
    {
        return amt*unit;
    }
    
}
