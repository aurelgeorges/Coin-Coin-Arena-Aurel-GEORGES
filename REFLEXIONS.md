# Coin-Coin-Arena-Aurel-GEORGES

## Réflexions

### Réflexion R1

La solution serait de créer des classes avec les stats qui ne change pas histoire d'avoir à stoker uniquement une
référence qui pointent vers ces classes.

### Réflexion R2

Avec `attaquer(CanardDeCombat cible)`, on perd les spécificités des types de canards comme on passe par CanardDeCombat.
Comment on s'en sort ? → On lit l'étape B

### Réflexion R3
J'ai dû faire 3 méthodes "être attaqué par" par type de CanardDeCombat (sauf pour CanardClassique qui n'as pas de flaiblesses/forces).
Donc 9 méthodes, sachant qu'il faudra en rajouter à chaque classe si je rajoute des types.

### Réflexion R4
Cela va permettre de créer d'autres objets qui seront soignable et combattant, la logique générale ne sera pas dépendante de la classe CanardDeCombat.

### Réflexion R5
Il y aurait une douzaine de classes à créer, et beaucoup de duplication (coucou le S de SOLID). Pourquoi pas faire une interface "Confus" ?

### Réflexion R6
Oui, l'utilisation de `instanceof` révèle souvent une conception fragile, cela enfreint le principe Open/Close, car chaque nouveau malus/bonus impose d'ajouter encore des tests conditionnels.

### Réflexion R7
Avec l'enum, l'ajout se fait en déclarant une simple constante supplémentaire dans l'Enum TypeCanard et en mettant à jour sa table interne.
Et donc, la composition rend cette évolution possible en modifiant simplement la valeur d'un attribut. Avec l'approche par héritage, la classe d'une instance est figée à la création et un CanardFeu ne peut pas se transformer en CanardEau.
Enfin, les vérifications instanceof sur des classes deviennent obsolètes. Il suffit de comparer les valeurs d'attributs (ex. canard.getType() == TypeCanard.PLANTE).

### Réflexion R8
La composition de la partie B semble beaucoup plus maintenable que l'approche par héritage, car elle permet d'avoir la table des types centralisé alors que l'héritage, nécéssite de modifier pleins de sous-classes

### Réflexion R9
Dans la partie A il va donc exister 50 copies des stats des canards. Alors quand dans la partie B il va exister uniquement 50 références qui pointeront sur la même zone mémoire qui contient ces statistiques.

### Réflexion R10
La partie B est manifestement celle qui respecte plus le principe OPEN/CLOSE, car nous n'avons pas à modifier les sous-classes afin de rajouter un type.

### Réflexion R11
(a) Le test `canard.getType() == TypeCanard.PLANTE` de la Partie B survivrait à la suppression d'une classe. À l'inverse, l'instanceof de la Partie A provoquerait une erreur de compilation si la classe CanardPlante n'existait plus (après si on supprime la ligne dans l'énum, le test `getType` n'y survivrait pas non plus).

(b) Personnellement et dans ce cas je trouve les deux compréhensibles mais il est vrai que de voir des instance of est rebutant. Donc la Partie B reste plus lisible.

(c) Pour la partie A, comme pour tout, il faudrait redéfinir une méthode finDeTour dans chaque classe de type de canard. Dans la partie B, on aurait autant de méthode à définir mais centralisé dans l'Enum comme vous le proposez.

### Réflexion R12
Le Pattern Strategy semble être la bonne solution pour avoir le plus d'extensibilité. Open/close est bien respecté, car pour ajouté des des nouvelles manières d'attaquer on aura à ajouter des classes et non à modifier les existantes.





