package getBi.prihodko.task2.logic.impl;

import getBi.prihodko.task2.controller.ParamsName;
import getBi.prihodko.task2.logic.ICommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PSCommand implements ICommand {
    @Override
    public boolean execute(){
        try {
            Scanner scanner = new Scanner(System.in, ParamsName.CONSOLE_ENCODING);
            System.out.println(ParamsName.MSG_PS_PARAM);
            String cmdParam = scanner.nextLine();
            String line;
            Process p;
            try {
                p = Runtime.getRuntime().exec("ps -e");
            }catch (IOException e){
                p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");
            }
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                if(line.contains(cmdParam)) {
                    System.out.println(line);
                }
            }
            input.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
        System.out.println(ParamsName.MSG_DELIM);
        return true;
    }
}
