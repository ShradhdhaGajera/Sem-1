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
public class HealthCareInstitute implements ProprtyTaxCalculationStrategy
{   
    double tax = 5;
    int amount = 90000;
    @Override
    public double CalculatePropertyTax() 
    {
        return (amount * tax)/100;
    }
    
}
