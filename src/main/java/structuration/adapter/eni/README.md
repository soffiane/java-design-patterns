# Pattern de structuration
Les patterns de structuration ont pour but de faciliter l'independance d'une interface 
ou d'un ensemble d'objets vis a vis de son implementation. Dans le cas d'un ensemble d'objets,
il s'agit aussir de rendre cette interface indépendante de la hiérarchie des classes et de la composition
des objets.

En fournissant les interfaces, les patterns de structuration encapsulent la composition des objets, augmentant
l'abstraction du systeme à l'image des pattern de creation qui encapsulent la craetion des objets.

Les patterns de structuration met en avant les interfaces.

L'encapsulation de la composition est realisée non pas en structurant l'objet lui meme mais en
transferant cette structuration à un second objet, intimement lié au premier. 

Ce transfert de structuration signifie que le premier objet detient l'interface vis-a-vis des clients et gere
la relation avec le second objet qui lui gère la composotion et n'a aucune interface avec les clients externes.
Cette réalisation offre une autre propriété qui est la souplesse de la composition qui peut
etre modifiée dynamiquement. En effet, il est aisé de substituer un objet par un autre pourvu qu'il soit issu de la meme
classe ou qu'il respecte la meme interface.
 
Les patterns Composite, Decorator et Bridge en sont des examples.