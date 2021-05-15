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
public class PdfFile implements documents
{

    @Override
    public String save() 
    {
        return "Pdf File saved";
    }

    @Override
    public String open()
    {
        return "Pdf File opened";
    }

    @Override
    public String close() 
    {
        return "Pdf File Closed";
    }
    
}
