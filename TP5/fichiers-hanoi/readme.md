=======================================
23 février 2017, 03h25 pour être précis
=======================================
==================
Membres du binomes
==================

DEROISSART | MEIGNANT


Présentation du TP et de ses objectifs
======================================

– Implementer le probleme des tours de Hanoi etudié en TD (Création des classes Disc/Tower/Hanoi)

– Résoudre de façon récursive le problème des tours de Hanoi

– Créer une interface graphique sur le terminal afin de représenter les tours de Hanoi (display)

– Créer une interaction qui permet à l'utilisateur de communiquer avec le programme (play)

– Gestion des paquetages (Hanoi/Hanoi.util)

– Générer la documentation d'un paquetage (utilisation de la commande -subpackages)

- Création d'un jar contenant les principaux fichiers, et exécutable (exécute HanoiMain)


Comment générer et consulter la documentation
=============================================

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp5 (la racine)

Lancer la commande suivante :

$ make doc 

Cela génère la documentation complète et l'ouvre sur firefox


Compiler les classes du projet
==============================

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp5 (la racine)

Lancer la commande suivante :

$ make compilation

Cela compilera toutes les classes (dans le dossier classes)


Executer les tests
==================

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp5 (la racine)

Lancer la commande suivante :

$ make test

Cela lancera les tests des classes Disc/Tower/Hanoi


Archivage/Exécutable en jar
===========================

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp5 (la racine)

Lancer la commande suivante :

$ make executable

Cela créera un executable votrehanoi.jar


Executer le programme votrehanoi.jar
====================================

Lancer le terminal de commandes

Aller dans le dossier contenant tous les fichier du tp5 (la racine)

Lancer la commande suivante :

$java -jar votrehanoi.jar (play ou solve) (nombre de disque)

Pour executer le programme sans le jar executable :

$java -classpath classes hanoi/HanoiMain (play ou solve) (nombre de disque)

Ne pas oublier de compiler avant...



Options supplémentaires
=======================

Possibilité de programmes par défaut
 
$ make play

Lance le programme interactif avec 3 disques

$ make solve

Résout le problème de Hanoi avec 3 disques




Cordialement, 
et bonne nuitée.
