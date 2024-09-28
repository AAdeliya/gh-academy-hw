package CS_homework.DesignPatterns.Behavioral.Command;

import java.io.File;

public class FileInvoker {
    public Command command;
    public FileInvoker(Command c) {
        this.command = c;

    }

    public void execute() {
        this.command.execute();
    }
    
}
