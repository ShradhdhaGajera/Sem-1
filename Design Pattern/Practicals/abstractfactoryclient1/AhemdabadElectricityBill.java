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
public class AhemdabadElectricityBill implements IElectricityBill
{

    @Override
    public double CustomerNo() 
    {
        return 9081952;
    }

    @Override
    public String CustomerName() 
    {
        return "john";
    }

    @Override
    public String CustomerAddress() 
    {
        return "To : Surat, Ta : Surat, Dist : Surat";
    }

    @Override
    public String Description() 
    {
       return "Ahemdabad Electricity bill with  tax";
    }

    @Override
    public double getBillAmount(double amt, double unit)
    {
        return amt*unit;
    }
    
}
