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
public interface IPropertyBill 
{
    public double CustomerNo();
    public String CustomerName();
    public String CustomerAddress();
    public String Description();
    public double getBillAmount(double amt,double unit);
}
