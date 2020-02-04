##Explications du pattern Command
Encapsuler une requete entre client et serveur.  
On peut mettre une liste de commandes dans l'objet encapsulé  
On peut executer une Queue de commandes, en les executant une par une
Chaque commande peut etre executée ou annulée en ajoutant la commande ou en la retirant simplement  
Les commandes sont annulées dans le sens inverse de la Queue

Exemple : la telecommande que l'on veut reprogrammer
on ne peut pas ecrire en dur le code permettant de representer la telecommande
(penser à l'injection de depandance)  
La telecommande correspond à l'Invoker qui invoque des commandes
Appuyer sur un bouton pour envoyer une commande a un device qui fait un truc particulier
peu importe l'implementation du device, ca ne concerne pas la telecommande
1) On construit une commande
2) On injecte cette commande dans l'Invoker(telecommande)
3) Et quand l'Invoker est appelé, il execute la commande
4) La commande est recu par le Receiver(la lampe connectée) et est executée

On peut appeler plusieurs commandes en lancant un execute, un genre de super commande  
On peut gerer des listes de commandes, on fait des actions qu'on peut annuler dans le sens inverse de la liste de commandes puis refaire la derniere commande...  
Telecommande 4 bouton
   
    class Invoker {
        ICommand on;
        ICommand off;
        ICommand up;
        ICommand down;
    Invoker(ICommand on,ICommand off,ICommand up,ICommand down){
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
     }
     
     public void clickOn() {
        this.on.execute();
     }
     public void clickOff(){
        this.off.execute();
     }
    }
     
     interface ICommand{
        void execute();
        void unexecute();
      }
      
      class LightOnCommand extends ICommand {
            Light l;
            LightOnCommand(Light l){
                this.light = l;
            }
            public void execute(){
                this.light.on();
            }
            public void unexecute(){
                this.light.on();
            }
      }
      
      class Main(){
            public static void main(String[] args){
                new Invoker(new LightOnCommand(light),....
            }
      }