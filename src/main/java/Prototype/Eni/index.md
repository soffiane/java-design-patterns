---
Pattern Prototype  
categories: Pattern de creation  

tags: 
 - Java
 - Gang Of Four
 - Difficulty-Beginner
---
## Participants
- Client (Liasse, LiasseClient et LiasseVierge) est une classe composée d'un ensemble 
d'objets appelés prototypes, instances de la classe abstraite Prototype. La classe Client 
a besoin de dupliquer ces prototypes sans avoir à connaitre ni la structure interne de 
Prototype ni sa hierarchie de sous-classes
- Prototype (Document) est une classe abstraite d'objets capables de se dupliquer eux-meme
Elle introduit la signature de la methode duplique() (ou clone())
- PrototypeConcret1 et 2 (BonDeCommande, DemandeImmatriculation, CertificatSession) sont les
sous-classes concretes de Prototype qui définissent complètement un prototype et implemente
la méthode duplique() (ou clone())
---
## Applications
- Un systeme d'objets doit creer des instances sans connaitre la hierarchie des classes le decrivant
- Un système d'objets doit creer des instances de classes chargées dynamiquement
- Un sytseme d'objets doit rester simple et ne pas inclure une hierarchie parallèle de classes de fabrique
