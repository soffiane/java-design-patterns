package comportement.command.other.concretecommand;

import comportement.command.other.command.Command;
import comportement.command.other.receiver.FileSystemReceiver;

/**
 * Commande permettant d'ouvrir un fichier
 * @author soffiane
 *
 */
public class OpenFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public OpenFileCommand(FileSystemReceiver fs){
		this.fileSystem=fs;
	}
	
	public void execute() {
		//open command is forwarding request to openFile method
		this.fileSystem.openFile();
	}

}
