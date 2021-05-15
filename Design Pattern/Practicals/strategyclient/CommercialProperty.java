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
public class CommercialProperty implements ProprtyTaxCalculationStrategy
{
    double tax = 20;
    int amount = 75000;
    @Override
    public double CalculatePropertyTax()
    {
        return (amount * tax)/100;
    }
    
}
