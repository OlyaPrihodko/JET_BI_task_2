package getBi.prihodko.task2.logic.impl;

import getBi.prihodko.task2.controller.CommandName;
import getBi.prihodko.task2.controller.ParamsName;
import getBi.prihodko.task2.logic.ICommand;

public class HelpCommand implements ICommand{
    @Override
    public boolean execute(){
        System.out.println("Available commands:\n"+CommandName.HELP+" - give more information about commands;\n"
                                                  +CommandName.LS+" - show a list of all files and folders in the current directory;\n"
                                                  +CommandName.PS+" - show current open windows or processes with a given name;\n"
                                                  +CommandName.PWD+" - show the full path of the current directory;\n"
                                                  +CommandName.EXIT+" - finish the application;");
        System.out.println(ParamsName.MSG_DELIM);
        return true;
    }
}
