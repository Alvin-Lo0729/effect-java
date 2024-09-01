package idv.alvin.item5;

import java.util.List;

public class SpellChecker2 {

  private final Lexicon dictionary = new Lexicon();

  private SpellChecker2() {
  }

  public static SpellChecker2 INSTANCE = new SpellChecker2();

  public boolean isValid(String word) {
    return dictionary.isValid(word);
  }

  public List<String> suggestions(String typo) {
    return dictionary.suggestions(typo);
  }

}
