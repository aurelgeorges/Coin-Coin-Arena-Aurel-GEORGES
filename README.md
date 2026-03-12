# Coin-Coin-Arena-Aurel-GEORGES

## Reflexions

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