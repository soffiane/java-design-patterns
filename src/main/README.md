# Etude de cas : la vente de vehicules en ligne
## Nous allons mettre en pratique les design pattern pour cette application qui doit permettre de :
- vendre des vehicules tels que des automobiles ou des scooters
- afficher le catalogue
- faire des recherches dans le catalogue via mot clés et operateurs logiques (et, ou etc....)
- passer des commandes via un caddie virtuel
- possible de restaurer un caddie dans un etat precedent
- choisir des options et verifier leur compatibilités
- calcul de la TVA en fonction du pays de la commande 
- gerer le paiment comptant ou a credit
- gerer et suivre les clients
- gerer l'etat de la commande : en cours, validée et livrée
- construire la liasse de documents PDF ou HTML lors de la commande comme immatriculation, certificat de cession et bon de commande
- solder les vehicules difficiles a vendre en fonction de leur presence dans le stock
- accessible depuis une IHM classique ou un appel de web services

## Application des patterns dans le projet
Construire les objets du domaine(automobile, scooter, etc...) ==> __Abstract Factory__<br>
Construire les liasses de documents necessaires pour l'achat d'un vehicule ==> __Builder, Prototype__
<br>
Creer les commandes ==> __Factory Method__ <br>
Creer la liasse vierge de documents ==> __Singleton__<br>
Gerer les documents PDF ==> __Adapter__<br>
Implanter des formulaires HTML ou a l'aide d'une applet ==> __Bridge__<br>
Representer les societes clients ==> __Composite__<br>
Afficher les vehicules du catalogue ==> __Decorator, Observer, Strategy__<br>
Fournir l'interface en service web du site ==> __Facade__ <br>
Gerer les options d'un vehicules commandé ==> __Flyweight, Memento__ <br>
Gerer l'affichage d'animations pour chaque vehicule du catalogue ==> __Proxy__<br>
Gerer la description d'un vehicule ==> __Chain of responsibility__<br>
Solder les vehicules rester en stock pendant une longue durée ==> __Command__
Rechercher dans la base de vehicules à l'aide d'une requete ecrite sous la forme d'une expression logique ==> __Interpreter__<br>
Retrouver sequentiellement les vehicules du catalogue ==> __Iterator__<br>
Gerer le formulaire d'une demande de credit ==> __Mediator__<br>
Gerer les etats d'une commande ==> __State__<br>
Calculer le montant d'une commande ==> __Template Method__<br>
Envoyer des propositiions commerciales par mail à certaines societes clients ==> __Visitor__<br>