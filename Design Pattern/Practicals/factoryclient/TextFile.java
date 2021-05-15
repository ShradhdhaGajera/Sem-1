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
public class TextFile implements documents
{
        @Override
    public String save() 
    {
        return "Text File saved";
    }

    @Override
    public String open()
    {
        return "Text File opened";
    }

    @Override
    public String close() 
    {
        return "Text File Closed";
    }
    

}
