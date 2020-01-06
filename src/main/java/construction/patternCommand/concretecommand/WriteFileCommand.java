package construction.patternCommand.concretecommand;

import construction.patternCommand.command.Command;
import construction.patternCommand.receiver.FileSystemReceiver;

/**
 * Commande pour ecrire dans un fichier
 * @author soffiane
 *
 */
public class WriteFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public WriteFileCommand(FileSystemReceiver fs){
		this.fileSystem=fs;
	}
	
	public void execute() {
		this.fileSystem.writeFile();
	}

}
