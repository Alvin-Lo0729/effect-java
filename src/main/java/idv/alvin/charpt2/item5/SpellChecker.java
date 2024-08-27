package idv.alvin.charpt2.item5;

import java.util.List;

public class SpellChecker {

  private static final Lexicon dictionary = new Lexicon();

  private SpellChecker() {
  }

  public static boolean isValid(String word) {
    return dictionary.isValid(word);
  }

  public static List<String> suggestions(String typo) {
    return dictionary.suggestions(typo);
  }

}
