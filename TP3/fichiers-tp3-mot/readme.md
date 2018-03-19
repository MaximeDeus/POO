===============
07 Février 2017
===============
==================
Membres du binomes
==================

DEROISSART MEIGNANT

======================================
Présentation du TP et de ses objectifs
======================================

– Apprendre à écrire une classe (ici les classes Word et WordMain)

– Effectuer des tests unitaires (test non rédigés mais résolus)

– Exploiter la documentation d'une classe (Ici String et Char)

– Se familiariser avec la compilation et l'exécution de programmes java et de

  la génération de la documentation

– Adopter la rigueur nécessaire aux rendus des TP (Rédaction du fichier readme.md ,

  Dépot sur Gitlab)

=============================================
Comment generer et consulter la documentation
=============================================

a- Generer la documentation

Lancer le terminal de commandes

Aller dans le dossier contenant Word.java

Executer la commande suivante:

$ javadoc Word.java -d docs (signifiant que cela sera créé dans un dossier docs)


b- Consulter la documentation

Aller dans le dossier docs créé précédemment

Lancer sur votre navigateur (par exemple Firefox) le fichier index.html

==============================
Compiler les classes du projet
==============================

Lancer le terminal de commandes

Aller dans le dossier contenant les différentes classes (NomClasse.java)

Executer la commande suivante:

$ javac NomClasse.java

Exemples:

$ javac Word.java
$ javac WordMain.java
$ javac WordTest.java

==================
Executer les tests
==================

Lancer le terminal de commandes

Aller dans le dossier contenant Word.java et WordTest.java

Compiler les deux fichiers

$ javac Word.java
$ javac WordTest.java

Executer la commande suivante:

$ java -jar test-1.7.jar WordTest (Lance le test à partir de la classe WordTest)

==============================
Executer le programme WordMain
==============================

Lancer le terminal de commandes

Aller dans le dossier contenant Word.java et WordTest.java

Compiler les deux fichiers

$ javac Word.java
$ javac WordMain.java

Executer WordMain en passant deux arguments représentants deux chaines de caractères

$ java WordMain mot1 mot2

Exemples:

$ java WordMain chocolat lat

Fonction nbOfChars : 8         #Correspond au nb de caractères du mot 1
Fonction toString : chocolat         #renvoie le mot 1
Fonction nbOccurrencesOfChar ('a') : 1        #Compte le nombre de fois la lettre 'a' présente dans le mot 1
Fonction contains(arg0 dans arg0) : true       #Teste si le mot se contient lui-même (donc renvoie toujours true)
Fonction contains(arg1 dans arg0) : true        #Teste si le mot 2 est inclus dans le mot 1
Fonction rhymesWith : true           #Teste si les deux mots ont les 3 dernières lettres identiques
Fonction extractBefore ('a') : Premier mot chocola , Deuxieme mot t            #scinde le mot 1 en deux parties, l'une jusqu'à l'occurence de la premiere lettre a, l'autre le reste
Fonction extractBefore ('z') : Premier mot  , Deuxieme mot chocolat            #si pas de lettre z, premier mot vide, second = mot 1
Fonction isPalindrome : false            #Teste si mot 1 est palindromique
Fonction isAnagram : false            #Teste si les mots 1 et 2 sont des anagrammes
Fonction isProperNoun : false        #Teste si la première lettre du mot 1 est une majuscule

