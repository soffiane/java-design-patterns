package construction.patternCommand.invoker;

import construction.patternCommand.command.Command;

/**
 * Abstraction des commandes
 * @author soffiane
 *
 */
public class FileInvoker {

	public Command command;
	
	public FileInvoker(Command c){
		this.command=c;
	}
	
	public void execute(){
		this.command.execute();
	}
}
