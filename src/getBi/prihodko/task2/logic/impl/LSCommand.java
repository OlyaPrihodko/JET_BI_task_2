package getBi.prihodko.task2.logic.impl;

import getBi.prihodko.task2.controller.ParamsName;
import getBi.prihodko.task2.logic.ICommand;

import java.io.File;

public class LSCommand implements ICommand {
    @Override
    public boolean execute(){
        String list[] = new File(".").list();
        for(int i = 0; i < list.length; i++)
            System.out.println(list[i]);
        System.out.println(ParamsName.MSG_DELIM);
        return true;
    }
}
