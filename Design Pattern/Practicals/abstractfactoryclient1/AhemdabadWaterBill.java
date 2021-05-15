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
public class AhemdabadWaterBill implements IWaterBill
{

    @Override
    public double CustomerNo()
    {
       return 11224466;
    }

    @Override
    public String CustomerName() 
    {
        return "jems";
    }

    @Override
    public String CustomerAddress()
    {
      return "Junagadh , Gujarat";
    }

    @Override
    public String Description() 
    {
      return "Ahmedabadn Water Bill with Tax";
    }

    @Override
    public double getBillAmount(double amt, double unit)
    {
       return amt*unit;
    }
    
}
