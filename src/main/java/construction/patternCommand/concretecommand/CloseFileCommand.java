package construction.patternCommand.concretecommand;

import construction.patternCommand.command.Command;
import construction.patternCommand.receiver.FileSystemReceiver;

/**
 * Commande pour fermer un fichier
 * @author soffiane
 *
 */
public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public CloseFileCommand(FileSystemReceiver fs){
		this.fileSystem=fs;
	}
	
	public void execute() {
		this.fileSystem.closeFile();
	}

}