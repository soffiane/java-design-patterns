package comportement.command.other.main;

import comportement.command.other.concretecommand.CloseFileCommand;
import comportement.command.other.concretecommand.OpenFileCommand;
import comportement.command.other.concretecommand.WriteFileCommand;
import comportement.command.other.invoker.FileInvoker;
import comportement.command.other.invoker.FileSystemReceiverUtil;
import comportement.command.other.receiver.FileSystemReceiver;

public class Main {

	public static void main(String[] args) {
		//Creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
		
		//creating command and associating with receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		
		//Creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);
		
		//perform action on invoker object
		file.execute();
		
		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();
		
		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();
	}

}
