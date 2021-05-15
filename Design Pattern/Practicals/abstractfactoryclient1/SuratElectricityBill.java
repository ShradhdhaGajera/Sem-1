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
public class SuratElectricityBill implements IElectricityBill
{

    @Override
    public double CustomerNo() 
    {
       return 1234567;
    }

    @Override
    public String CustomerName() 
    {
        return "Kyara";
    }

    @Override
    public String CustomerAddress() 
    {
        return "Surat , Gujarat";
    }

    @Override
    public String Description()
    {
        return "Surat Electricity Bill With Tax";
    }

    @Override
    public double getBillAmount(double amt, double unit)
    {
       return amt*unit;
    }
    
}
