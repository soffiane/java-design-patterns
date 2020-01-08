package comportement.command.main;

import comportement.command.concretecommand.CloseFileCommand;
import comportement.command.concretecommand.OpenFileCommand;
import comportement.command.concretecommand.WriteFileCommand;
import comportement.command.invoker.FileInvoker;
import comportement.command.invoker.FileSystemReceiverUtil;
import comportement.command.receiver.FileSystemReceiver;

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
