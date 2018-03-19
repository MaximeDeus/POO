/**
 * Word class : a class to represent word with several usefull functions
 *
 * @author : DEROISSART Maxime | MEIGNANT Pierrick
 */

public class Word {

    // ATTRIBUTS
    /* contains the string that represents the characters of this word */
    private String value;

    // CONSTRUCTEURS
    /** builds Word defined by its characters
     * @param s the string that contains the characters for this Word object
     */
    public Word(String s) {
	this.value = s;
    }

    // METHODES
    /**
     * returns <code>true</code> if <code>o</code> is equals to this word object, ie if
     * <code>o</code> is a Word and its value is the same as this word's value
     *
     * @param o the object to be compared with this Word
     * @return <code>true</code> iff <code>o</code> is a Word with the same value as this word.
     */
    public boolean equals(Object o) {
	if (o instanceof Word) {
	    Word theOther = (Word) o;
	    return this.value.equals(theOther.value);
	} else {
	    return false;
	}
    }

    /**
     * return the numbers of characters on the word
     * @return an integer who represents the lenght of the word
     */
    public int nbOfChars() {
      return this.value.length();
    }

    /**
     * returns the string of the word
     * @return The string of the word
     */
    public String toString() {
	     return this.value;
    }

    /**
     * returns the number of occurrence of the char passed in parameter
     *@param c The character who'll be counted
     *@return the number of c in the string
     *
     */
    public int nbOccurrencesOfChar(char c) {
      int cpt= 0; // Initialisation du compteur
      int index;
      index = this.toString().indexOf(c);
      while(index > -1){ // Tant que le caractère est trouvé
          cpt++; // On incrémente le compteur d'occurences
          index=this.toString().indexOf(c,index+1); // On poursuit en excluant la partie déjà parcourue
      }
      return cpt;
    } // nbOccurrencesOfChar

    /**
     * returns a new object who've got inversed value attribute
     * @return a new object with attribute's value inversed
     *
     */
    public Word reverse() {
      String s;
      s=""; // Initialisation du résultat
      for (int i=this.nbOfChars()-1;i>=0;i--){ // On part de la fin
        s+=this.toString().charAt(i); // On ajoute un à un les caractères
      }
      return new Word(s);
    }

    /**
     * verify if a word is palindromic
     * @return true if the word is palindromic, false otherwise
     */
    public boolean isPalindrome() {
      int begin = 0; // Premier caractere
      int end = this.nbOfChars()-1; //Dernier caractere
      while (begin <= end){ // Tant que l'intégralité du mot n'a pas été vérifiée
        if (this.toString().charAt(begin) != this.toString().charAt(end)) //Comparateur d'égalité des opposés
          return false; // Si le mot n'est pas un palindrome
        begin ++;
        end --; //On décale d'un intervalle
      }
	return true;
    } // estPalindrome

    /**
     * return a boolean, <br/> True if the parameter is in the value of the word, <br/>
     * False Otherwise
     * @param m word who'll be evaluated
     * @return True if the parameter is in the value of the word, False Otherwise
     */
    public boolean contains(Word m) {
      if (this.toString().indexOf(m.toString()) == -1){
        return false;
      }
      return true;
    }

    /**
     * return true if the two words's values got the same 3 last letters ("rhym")
     * @param m a Word
     * @return true if the two words's values got the same 3 last letters ("rhym")
    */
    public boolean rhymesWith(Word m) {
      int sizew1= this.nbOfChars();
      int sizew2= m.nbOfChars();

      if (sizew1 < 3 || sizew2 < 3){ // Si au moins l'une de deux longueurs est inférieure à trois
        return false;
      }
      String subword2 = m.toString().substring(sizew2-3); // On prend la fin du mot passé en paramètre
      return this.toString().endsWith(subword2); // On le compare avec l'objet qui a invoqué la méthode
    }

    /**
     * return true if it is a proper noun
     * @return true if the word begin with a capital char
     */
    public boolean isProperNoun() {
	     char first_letter = this.toString().charAt(0);
       return Character.isUpperCase(first_letter);
    }

    /**
     * return true if they're anagrams
     * @param m other word who'll be compared
     * @return true if they're anagrams
     */
    public boolean isAnagram(Word m) {
      if (this.nbOfChars() != m.nbOfChars()){ // Si la  longueur des deux mots est différente
        return false;
      }
      for (int i = 0; i<this.nbOfChars()-1; i++){    // Parcourt(s?) dans l'ordre chaque lettre des deux mots
          if (this.nbOccurrencesOfChar(this.toString().charAt(i)) != m.nbOccurrencesOfChar(this.toString().charAt(i))){ //Si les deux lettres ont le même nombre d'occurences
            return false;
          }
    }
	return true;
    }

    /**
     * split a word in two parts <br/>
     * the first contains a new Word before char c, nothing if char c isn't on the word <br/>
     * the other one contains the rest
     * @return an array with two cells.
     */
    public Word[] extractBefore(char c) {
    	int indexOcc = this.toString().indexOf(c); // On récupère la position du caractère
      Word[] tab = new Word[2]; // Initialisation du tableau à deux éléments de type Word

      if (indexOcc == -1){ // Si le caractère n'est pas dans le mot
        tab[0] = new Word("");
        tab[1] = this;
      }else{
        tab[0] = new Word(this.toString().substring(0,indexOcc+1)); // Du début jusqu'au caractère inclus
        tab[1] = new Word(this.toString().substring(indexOcc+1)); // Le reste sans le caractère
      }
      return tab;
    }

}
