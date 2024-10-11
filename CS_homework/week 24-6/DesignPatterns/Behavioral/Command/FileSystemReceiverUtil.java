package CS_homework.DesignPatterns.Behavioral.Command;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is: " + osName);
        if (osName.contains("Windows")) {
            return WindowsFileSystemReceiver();

        } else {
            return new UnixFileSystemReceiver();
        }
    }
    
}
