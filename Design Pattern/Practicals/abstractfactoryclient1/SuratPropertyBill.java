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
public class SuratPropertyBill implements IPropertyBill
{

    @Override
    public double CustomerNo() 
    {
        return 9873246;
    }

    @Override
    public String CustomerName()
    {
       return "kiyana";
    }

    @Override
    public String CustomerAddress() 
    {
        return "Jetpur , Gujarat";
    }

    @Override
    public String Description() 
    {
        return "Surat Property Bill With Tax";
    }

    @Override
    public double getBillAmount(double amt, double unit)
    {
       return amt*unit;
    }
    
}
