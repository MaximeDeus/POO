public class WordMain {

  public static void main(String[] args){
    Word word1;
    word1=new Word (args[0]);
    Word word2= word1.reverse();
    word2= new Word (args[1]);

    System.out.println("Fonction nbOfChars : " + word1.nbOfChars()); // Renvoie le nombre de caractères du premier argument passé en paramètre
    System.out.println("Fonction toString : "  + word1.toString()); // Renvoie la chaine de caractères du premier argument passé en paramètre
    System.out.println("Fonction nbOccurrencesOfChar ('a') : " + word1.nbOccurrencesOfChar('a')); // Renvoie le nombre d'occurences (ici 'a') du premier argument passé en paramètre
    System.out.println("Fonction contains(arg0 dans arg0) : " + word1.contains(word1)); // Vérifie si le mot se contient lui-même
    System.out.println("Fonction contains(arg1 dans arg0) : " + word1.contains(word2)); // Vérifie si le premier argument contient le deuxième
    System.out.println("Fonction rhymesWith : " + word1.rhymesWith(word2));
    System.out.println("Fonction extractBefore ('a') : Premier mot " + word1.extractBefore('a')[0] + " , Deuxieme mot " + word1.extractBefore('a')[1]);
    System.out.println("Fonction extractBefore ('z') : Premier mot " + word1.extractBefore('z')[0] + " , Deuxieme mot " + word1.extractBefore('z')[1]);
    System.out.println("Fonction isPalindrome : " + word1.isPalindrome());
    System.out.println("Fonction isAnagram : " + word1.isAnagram(word2));
    System.out.println("Fonction isProperNoun : " + word1.isProperNoun());



  }
}
/*
System.out.println(word.contains());
System.out.println(word.rhymesWith());
System.out.println(word.extractBefore());
System.out.println(word.isPalindrome());
System.out.println(word.isAnagram());
*/
