package getBi.prihodko.task2.controller;

import getBi.prihodko.task2.logic.ICommand;
import getBi.prihodko.task2.logic.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper {
    private Map<CommandName,ICommand> mapCommand = new HashMap<CommandName,ICommand>();

    public CommandHelper(){
        mapCommand.put(CommandName.LS,new LSCommand());
        mapCommand.put(CommandName.PS,new PSCommand());
        mapCommand.put(CommandName.PWD,new PWDCommand());
        mapCommand.put(CommandName.EXIT,new ExitCommand());
        mapCommand.put(CommandName.HELP,new HelpCommand());
    }

    public ICommand defineCommand(CommandName commandName) {
        ICommand iCommand = null;
        switch (commandName){
            case LS:
                iCommand = mapCommand.get(CommandName.LS);
                break;
            case PS:
                iCommand = mapCommand.get(CommandName.PS);
                break;
            case PWD:
                iCommand = mapCommand.get(CommandName.PWD);
                break;
            case EXIT:
                iCommand = mapCommand.get(CommandName.EXIT);
                break;
            case HELP:
                iCommand = mapCommand.get(CommandName.HELP);
                break;
        }
        return iCommand;
    }
}
