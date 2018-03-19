============
14 mars 2017
============
Membres du binome
==================

DEROISSART | MEIGNANT


Présentation du TP et de ses objectifs
======================================

– Représentation et Manipulation d'images

- Codage de la classe 

image.color.GrayColor     : Objet GrayColor, qui illustre le niveau de gris
image.Pixel               : Objet Pixel, qui contient une valeur de gris (objet GrayColor)
image.Image               : Contient un tableau à 2 dim d'objets Pixel, représentant une image
ImageExample              : Sert à tester les fonctions précédentes en dessinant des rectangles
ImageMain                 : Main final, qui conclut le TP


Comment générer et consulter la documentation
=============================================

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp6 (la racine)

Lancer la commande suivante :

$ make doc 

Cela génère la documentation complète et l'ouvre sur firefox


Compiler les classes du projet
==============================

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp6 (la racine)

Lancer la commande suivante :

$ make compilation

Cela compilera toutes les classes (dans le dossier classes)


Executer les tests
==================

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp6 (la racine)

Lancer la commande suivante :

$ make test

Cela lancera les tests des classes image.Pixel et image.color.GrayColor


Archivage/Exécutable en jar
===========================

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp6 (la racine)

Lancer la commande suivante :

$ make executable

Cela créera un executable ImageExample.jar et ImageMain.jar


Executer les programmes
=======================

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp6 (la racine)

Lancer la commande suivante :

$java -jar imageExample.jar

$java -jar imageMain.jar /images/nomImage.pgm edge threshold

Pour executer le programme sans le jar executable :

$java -classpath classes image.ImageExample
$java -classpath classes image.ImageMain nomImage.pgm edge threshold

Ne pas oublier de compiler avant...

Options Supplémentaires
=======================

Pour Nettoyer les dossiers classes et Docs:

$make clean

Pour Lancer directement les programmes:

$make ImageExample
$make ImageMain (identique à l'exemple de la lampe du TP)
$make pour compiler/tester/générer/exécuter


Cordialement, 
et bonne nuitée.
