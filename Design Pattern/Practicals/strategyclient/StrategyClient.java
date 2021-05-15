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
public class StrategyClient 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        CPropertyTax ctax = new CPropertyTax (new ResidentialProperty());
        System.out.println("Residential Property Tax :" +ctax.executeStartagy());
        
        CPropertyTax ctax1 = new CPropertyTax (new CommercialProperty());
        System.out.println("Commercial Property Tax :" +ctax1.executeStartagy());
        
        CPropertyTax ctax2 = new CPropertyTax (new EductionInstitute());
        System.out.println("Education Institute Property Tax :" +ctax2.executeStartagy());
        
        CPropertyTax ctax3 = new CPropertyTax (new HealthCareInstitute());
        System.out.println("Health Care Institute Property Tax :" +ctax3.executeStartagy());
        
    }
    
}
