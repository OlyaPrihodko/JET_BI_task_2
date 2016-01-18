package getBi.prihodko.task2.logic.impl;

import getBi.prihodko.task2.controller.ParamsName;
import getBi.prihodko.task2.logic.ICommand;

import java.io.File;

public class PWDCommand implements ICommand {
    @Override
    public boolean execute(){
        File file = new File(".");
        System.out.println(file.getAbsolutePath());
        System.out.println(ParamsName.MSG_DELIM);
        return true;
    }
}
