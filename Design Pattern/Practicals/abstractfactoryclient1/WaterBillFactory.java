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
public class WaterBillFactory extends AbstractBillFactory
{

    @Override
    public IWaterBill getWaterBill(int i) 
    {
       if(i == 1)
       {
           return new RajkotWaterBill();
       }
       else if(i == 2)
       {
           return new AhemdabadWaterBill();
       }
       else if(i == 3)
       {
           return new SuratWaterBill();
       }
       else
       {
           return null;
       }
    }

    @Override
    public IElectricityBill getElectricityBill(int i) 
    {
        return null;
    }

    @Override
    public IPropertyBill getPropertyBill(int i) 
    {
        return null;
    }
    
}
