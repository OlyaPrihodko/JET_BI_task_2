package getBi.prihodko.task2.controller;

import getBi.prihodko.task2.logic.ICommand;
import getBi.prihodko.task2.logic.ParsedCommand;

import java.util.Scanner;

public class CommandProcessor {
    private CommandHelper commandHelper;
    public CommandProcessor(){
        commandHelper = new CommandHelper();
    }
    public void run(){
        boolean result = true;
        Scanner scanner = new Scanner(System.in,ParamsName.CONSOLE_ENCODING);
        System.out.println(ParamsName.MSG_HELP);
            while(result){
            System.out.print("> ");
            String fullCommand = scanner.nextLine();
            ParsedCommand pc = new ParsedCommand(fullCommand);
            if (pc.getCommand() == null || "".equals(pc.getCommand())) {
                continue;
            }
            ICommand iCommand = commandHelper.defineCommand(CommandName.valueOf(pc.getCommand().toUpperCase()));
            if (iCommand == null) {
                System.out.println(ParamsName.MSG_COMMAND_NOT_FOUND);
                continue;
            }
            result = iCommand.execute();
        }
    }
}
