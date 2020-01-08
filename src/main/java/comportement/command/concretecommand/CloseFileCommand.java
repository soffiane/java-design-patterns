package comportement.command.concretecommand;

import comportement.command.command.Command;
import comportement.command.receiver.FileSystemReceiver;

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