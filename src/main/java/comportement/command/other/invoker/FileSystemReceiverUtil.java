package comportement.command.other.invoker;

import comportement.command.other.receiver.FileSystemReceiver;
import comportement.command.other.receiver.UnixFileSystemReceiver;
import comportement.command.other.receiver.WindowsFileSystemReceiver;

/**
 * Nous allons cr�er un FileSystemReceiverUtil pour fournir un
 * FileSystemReceiver appropri�
 * 
 * @author soffiane
 *
 */
public class FileSystemReceiverUtil {

	public static FileSystemReceiver getUnderlyingFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is:" + osName);
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new UnixFileSystemReceiver();
		}
	}
}
