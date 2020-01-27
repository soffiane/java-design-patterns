package comportement.command.other.concretecommand;

import comportement.command.other.command.Command;
import comportement.command.other.receiver.FileSystemReceiver;

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
