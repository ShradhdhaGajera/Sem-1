/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyclient;

/**
 *
 * @author dell
 */
public class CPropertyTax 
{
    private ProprtyTaxCalculationStrategy ptax;
    
    public  CPropertyTax(ProprtyTaxCalculationStrategy ptax)
    {
        this.ptax = ptax;
        
    }
    
    public double executeStartagy()
    {
        return ptax.CalculatePropertyTax();
    }
}
