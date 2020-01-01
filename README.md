#Patrons de conceptions du GOF
Les patrons de conceptions sont des implementations permettant de repondre a des problemes
recurrents dans la programmation objets.
Les patrons sont divisés en trois types:
- pattern de construction : abstraire les mecanismes de creation d'objets
- pattern de structuration
- pattern de comportement
##Il y en a 23 (mais en fait beaucoup plus)
###Abstract factory
a pour but la creation d'objets regroupés en famikkes sans devoir connaitre les classes concrètes 
destinées à la creation de ces objets
###Builder
permet de separer la construction d'objets complexes de leurs implementations de sorte qu'un client
puisse créer des objets complexes avec des implementations differentes
###Factory Method
a pour but d'introduire une methode abstraite de creation d'un objet en reportant aux sous-classes
concretes la creation effective de l'objet
###Prototype
permet la creation de nouveaux objets par duplication d'objets existants appelés prototypes
qui disposent de la capacité de clonage
###Singleton
permet de s'assusrer qu'une classe ne possède qu'une seule instance et de fournir une methode
unique retournant cette instance
###Adapter
a pour but de convertir l'interface d'une classe existante en l'interface attendue par des clients
egalement existants afin qu'ils puissent travailler ensemble
###Bridge
a pour but de separer les aspects conceptuels d'une hierarchie de classe de leur implementation
###Composite
offre un cadre de conception d'une composition d'objets dont la profondeur de composition est
variable, la conception etant basée sur un arbre
###Decorator
permet d'ajouter dynamiquement des fonctionnalités supplementaires à un objet
###Facade
a pour but de regrouper les interfaces d'un ensemble d'objets en une interface unifiée rendant
cet ensemble plus simple a utiliser
###Flyweight
facilite le partage d'un ensemble important d'objet dont le grain est fin
###Proxy
construit un objet qui se substitute à un autre objet et qui en controle l'accès
###Chain of responsibility
crée une chaine d'objets telle que si un objet de la chaine ne peut pas repondre a une requete
il puisse transmettre à ses successeurs jusqu'a ce que l'un d'entre eux reponde
###Command
a pour objectif de transformer une requete en un objet, facilitant des operations comme
l'annulation, la mise en file des requetes et leur suivi
###Interpreter
fournit un cadre pour donner une representation par objet de la grammaire d'un langage afin
d'evaluer, en les interpretant, des expressiosn ecrites dans ce langage
###Iterator
fournit un acces sequentiel a une collection d'objet sans que les clients ne se preoccupent
de l'implementation de cette collection
###Mediator
construit un objet dont la vocation est la gestion et le controle des interactions au sein
d'un ensemble d'objets sans que les elements ne se connaissent mutuellement
###Memento
sauvegarde et restaure l'etat d'un objet
###Observer
construit une dependance entre un sujet et des observateurs de facon a ce que chaque modification
du sujet soit notifiée aux observateurs afin qu'ils puissent mettre a jour leur etat
###State
permet à un objet d'adapter son comportement en fonction de son état interne
###Strategy
adapte le comportement et les algorithme d'un objet en fonction d'un objet en fonction d'un
besoin sans changer les interactions avec les clients de cet objet
###Template method
permet de reporter dans des sous-classes certaines etapes de l'une des operations d'un objet,
ces etapes etant alors decrites dans les sous-classes.
###Visitor
construit une opération à réaliser sur les éléments d'un ensemble d'objets. De nouvelles
opérations peuvent ainsi être ajoutées sans modifier les classes de ces objets.