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

public class RajkotElectricityBill implements IElectricityBill
{

    @Override
    public double CustomerNo()
    {
        return 06763451;
    }

    @Override
    public String CustomerName() 
    {
       return "niya";
    }

    @Override
    public String CustomerAddress() 
    {
       return "Junagadh ,Gujarat";
    }

    @Override
    public String Description() 
    {
        return "Rajkot Electricity Bill With Tax";
    }

    @Override
    public double getBillAmount(double amt, double unit)
    {
       return amt*unit;
    }
    
}
