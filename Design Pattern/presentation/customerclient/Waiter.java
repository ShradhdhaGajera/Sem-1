/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerclient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class Waiter 
{
    List<Command> commands = new ArrayList<Command>();
    
    public void takeOrder(Command command)
    {
        commands.add(command);
    }
    
    public void executeOrder(Command command)
    {
            command.execute();
    }
}
