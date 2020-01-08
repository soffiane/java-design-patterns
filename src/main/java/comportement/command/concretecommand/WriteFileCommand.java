package comportement.command.concretecommand;

import comportement.command.command.Command;
import comportement.command.receiver.FileSystemReceiver;

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
