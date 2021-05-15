/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author dell
 */
public abstract class MsgDecorator implements Message
{
    protected Message decoratorMsg;
        
    public MsgDecorator(Message decoratorMsg)
    {
        this.decoratorMsg=decoratorMsg;
    }
  
   /* @Override
    public String getMessage() 
    {
        return "";
    }*/
    
}
