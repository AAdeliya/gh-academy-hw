package CS_homework.DesignPatterns.Behavioral.Command;

public class CloseFileSystem  implements Command{
    private FileSystemReceiver fileSystem;
    public CloseFileSystem(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }
        @Override
        public void execute() {
            this.fileSystem.closeFile();
        }
    }
    
