/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryclient;

/**
 *
 * @author dell
 */
public class ExcelFile implements documents
{
        @Override
    public String save() 
    {
        return "Excel File saved";
    }

    @Override
    public String open()
    {
        return "Excel File opened";
    }

    @Override
    public String close() 
    {
        return "Excel File Closed";
    }
    

}
