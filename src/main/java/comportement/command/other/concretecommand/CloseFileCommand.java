package comportement.command.other.concretecommand;

import comportement.command.other.command.Command;
import comportement.command.other.receiver.FileSystemReceiver;

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