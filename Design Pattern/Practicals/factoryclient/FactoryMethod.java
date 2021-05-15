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
public class FactoryMethod 
{
    public static documents getdocuments(int type)
    {
        if(type == 1)
        {
            return new PdfFile();
        }
        else if(type == 2)
        {
            return new WordFile();
        }
        else if(type == 3)
        {
            return new ExcelFile();
        }
        else if(type == 4)
        {
            return new TextFile();
        }
        else
        {
            return null;
        }
    }
}
