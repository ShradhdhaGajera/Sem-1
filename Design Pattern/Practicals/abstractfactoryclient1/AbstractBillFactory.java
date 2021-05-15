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
public abstract class AbstractBillFactory 
{
    public abstract IWaterBill getWaterBill(int i);
    public abstract IElectricityBill getElectricityBill(int i);
    public abstract IPropertyBill getPropertyBill(int i);
    
    public static AbstractBillFactory getFactory(int i)
    {
        if(i == 1)
        {
            return new WaterBillFactory();
        }
        else if(i == 2)
        {
            return new ElectricityBillFactory();
        }
        else if(i == 3)
        {
            return new PropertyBillFactory();
        }
        
        else
        {
            return null;
        }
    }
}
