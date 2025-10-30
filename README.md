# Lecteur

Ce projet construit une architecture pour lire des fichiers de plusieurs extentions possibles

## Classes

### `Readable`
Readable est une interface définissant un fichier pouvant être lu.
Il demande aux classes qui l'implémentent trois méthodes:
- `lireEndroit` qui lit le fichier à l'endroit,
- `lireEnvers` qui lit le fichier à l'envers en terme de lignes,
- `lirePalindrome` qui lit le fichier à l'endroit en terme de ligne mais les les caractères de chaque ligne sont inversés.

### `CustomFile`
`CustomFile` est une classe abstraite qui implémente `Readable`.
Elle contient donc toutes les méthodes demandées par l'interface, qui sont communes pour chaque type de fichier.

### `TextFile`, `CsvFile` et `JsonFile`
Ces classes sont les classes qui héritent de la classe abstraite `CustomFile`.
Elle définissent les méthodes qui changent en fonction de chaque fichier, ici c'est uniquement la fonction de décodage et de formattage.
Cette fonction est appelée au constructeur de la classe.

## Compilation et lancement
Après clonage: 
```
cd Java-Lecteur
javac -d bin src/**/*.java
java -cp bin main.java.com.lecteur.FileReader
```
