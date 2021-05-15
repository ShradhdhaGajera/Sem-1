/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandclient;

/**
 *
 * @author dell
 */
public class NaanCommand implements Command
{
    private Cook cook;
   
    @Override
    public void execute() 
    {
        cook.PrepareNaan();
    }
    
}
