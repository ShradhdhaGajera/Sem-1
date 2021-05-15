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
public class UpperCaseMsg  extends MsgDecorator
{
    public UpperCaseMsg(Message bMsg)
    {
        super(bMsg);
    }
    @Override
    public String getMessage()
    {
       return decoratorMsg.getMessage() + " \n GUJARAT VIDYAPITH IS 100 YEARS OLD UNIVERCITY";
    }
    
}
