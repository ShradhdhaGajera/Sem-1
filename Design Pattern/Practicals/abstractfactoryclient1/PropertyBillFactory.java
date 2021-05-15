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
public class PropertyBillFactory extends AbstractBillFactory
{

    @Override
    public IWaterBill getWaterBill(int i)
    {
        return null;
    }

    @Override
    public IElectricityBill getElectricityBill(int i) 
    {
        return null;
    }

    @Override
    public IPropertyBill getPropertyBill(int i) 
    {
        if(i == 1)
       {
           return new RajkotPropertyBill();
       }
       else if(i == 2)
       {
           return new AhemdabadPropertyBill();
       }
       else if(i == 3)
       {
           return new SuratPropertyBill();
       }
       else
       {
           return null;
       }
    }
    
}
