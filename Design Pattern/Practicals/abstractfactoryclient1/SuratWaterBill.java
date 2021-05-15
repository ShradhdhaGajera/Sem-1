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
public class SuratWaterBill  implements IWaterBill
{
    @Override
    public double CustomerNo()
    {
        return 12345678;
    }

    @Override
    public String CustomerName()
    {
       return "Gajera Shradhdha Vinodbhai";
    }

    @Override
    public String CustomerAddress()
    {
       return "To:Baradiya , Ta:Visavadar , Dist:Junagadh";
    }

    @Override
    public String Description() 
    {
       return "Surat Water Bill With Tax";
    }


    @Override
    public double getBillAmount(double amt, double unit)
    {
        return amt*unit;
    }
    
}
