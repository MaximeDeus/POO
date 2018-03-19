=================
15 février 2017
=================

Membres du binomes
====================

DEROISSART MEIGNANT


Présentation du TP et de ses objectifs
========================================

– Mise en oeuvre des paquetages

– Compilation orienter par package et dossier

– Etablir une documentation visible par une page html grâce à la commande doc

– Se familiariser avec la compilation et l'exécution de programme java par le .jar

– Adopter la rigueur nécessaire aux rendus des TP (Rédaction du fichier readme.md ,

  Dépot sur Gitlab)


Comment generer et consulter la documentation
===============================================

a- Generer la documentation

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp4 (à la source)

Executer la commande suivante:

Pour visionner la docs: (pas pu le tester correctement)

	$ make viewDoc

ou pour juste générer sans visionner:

	$ make docs


Compiler les classes du projet
================================

Lancer le terminal de commandes

Aller dans le dossier tp4 (à la source)

	$ make Robot.class

cela compilera tous les fichiers (Robot.java,ConveyerBelt.java,Box.java) dans le dossier classes


Executer les tests
==================

Lancer le terminal de commandes

Aller dans le dossier tp4 (à la source)

	$ make Test

le premier test est celui du robot et le second celui de box


Archivage en jar
===================

Pour archiver en jar avec executable (je n'ai pas mis la commande sans executable dans le makefile)

	$ make appli.jar

sinon dans le dossier classes la commande pour créer l'archive appli.jar sans mettre l'exécutable est

	$ jar cvf ../appli.jar example



Executer le programme appli.jar ou Robot (même main)
=======================================================

Lancer le terminal de commandes

Aller dans le dossier tp4

	$ make Exec

ou bien cette commande si vous ne voulais pas utiliser le fichier jar

	$ make Robot

Exemples:

$ make Exec

$ cd src ; javac example/Robot.java -d ../classes ; cd ..

$ cd src ; javac example/util/Box.java -d ../classes ; cd ..

$ cd classes;jar cvfm ../appli.jar ../manifest-ex example;cd ..

manifeste ajout▒
ajout : example/(entr▒e = 0) (sortie = 0)(stockage : 0 %)
ajout : example/Robot.class(entr▒e = 1813) (sortie = 1044)(compression : 42 %)
ajout : example/util/(entr▒e = 0) (sortie = 0)(stockage : 0 %)
ajout : example/util/Box.class(entr▒e = 574) (sortie = 363)(compression : 36 %)
ajout : example/util/ConveyerBelt.class(entr▒e = 1848) (sortie = 1029)(compression : 44 %)

$ java -jar appli.jar

beginning of main from robot.Robot
the conveyer belt carries2 box(es)
a box of weight 10
a box of weight 15
end of main from robot.Robot



option supplémentaire
=====================================

Le zippage est faisable avec make zip
il sortira une archive zip:
pierrickMeignant_maximeDeroissart_tp4.zip

Cependant, il faut que avant il y est le dossier docs et l'archive appli.jar pour l'executer.

On a pas trouvé le moyen de contourner les erreurs qui se produisent.

Puis une fonction clear qui efface tout ce que l'on ne veut pas (c'est pourquoi faut créer avant de l'utiliser le dossier docs et appli.jar)

