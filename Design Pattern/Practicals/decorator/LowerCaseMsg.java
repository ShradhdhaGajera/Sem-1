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
public class LowerCaseMsg extends MsgDecorator
{
    public LowerCaseMsg(Message bMsg)
    {
        super(bMsg);
    }
    @Override
    public String getMessage() 
    {
       return decoratorMsg.getMessage() + "\n gujarat vidyapith is 100 years old univercity";
    }
    
}
