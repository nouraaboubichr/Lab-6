# TP6

# Exercice 1 - Système de dessin de formes (polymorphisme)

* Cet exercice consiste à créer plusieurs formes géométriques à partir d'une classe commune appelée `Forme`.
* La classe `Forme` contient les informations partagées par toutes les formes, notamment la couleur et une méthode permettant de les dessiner.
* Les classes `Cercle`, `Rectangle` et `Triangle` héritent de `Forme` et donnent chacune une implémentation particulière de la méthode `dessiner()`.
* Chaque forme possède ses propres caractéristiques, comme le rayon pour le cercle ou les dimensions pour le rectangle et le triangle.
* Les différents objets sont regroupés dans un tableau de type `Forme`, même s'ils appartiennent à des classes différentes.
* Cet exercice permet de comprendre le polymorphisme : lors de l'appel de `dessiner()`, Java choisit automatiquement la méthode correspondant au type réel de l'objet.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 024310.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 024329.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 024345.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 024410.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 024435.png" />


# Exercice 2 - Gestion d'une bibliothèque multimédia

* Le deuxième exercice porte sur la gestion de différents types de médias dans une même bibliothèque.
* La classe `Media` représente la classe générale et contient le titre ainsi que les méthodes communes permettant de lire un média et d'obtenir sa durée.
* `Audio`, `Video` et `LiveStream` sont des classes dérivées qui ajoutent leurs propres informations et adaptent les méthodes héritées.
* Un `LiveStream` possède une durée indéterminée, représentée par la valeur `-1`.
* La classe `MediaLibrary` stocke les différents médias dans un tableau qui peut être agrandi lorsque sa capacité est atteinte.
* Le tableau étant de type `Media`, il peut contenir des objets appartenant aux trois classes dérivées.
* L'exercice montre ainsi comment l'héritage et le polymorphisme permettent de manipuler plusieurs types d'objets de manière uniforme.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 024935.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 024935.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 024959.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 025010.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 025021.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 025041.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 025117.png" />


# Exercice 3 - Personne, Développeur et Manager

* Cet exercice met en pratique les classes abstraites, l'héritage et la généricité en Java.
* `Personne` est une classe abstraite qui contient les informations communes aux employés, notamment le nom et le salaire de base.
* Elle possède également une méthode abstraite `calculerSalaire()` qui doit être définie par les classes qui en héritent.
* Les classes `Developpeur` et `Manager` fournissent chacune leur propre calcul du salaire en fonction d'un taux de prime différent.
* La méthode `affiche()` est définie directement dans la classe `Personne` et utilise le résultat de `calculerSalaire()`.
* Une méthode générique `listerPersonnes()` permet de parcourir des objets `Developpeur` et `Manager` et d'appeler leur méthode d'affichage.
* Cet exercice permet donc de voir comment les classes abstraites et le polymorphisme peuvent être utilisés ensemble.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 025739.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 025747.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 025758.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 025807.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 025816.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 025834.png" />

