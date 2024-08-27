package idv.alvin.charpt2.item5;

import java.util.List;

public class SpellChecker3 {

  private final Lexicon dictionary;

  private SpellChecker3(Lexicon dictionary) {
    this.dictionary = dictionary;
  }

  public boolean isValid(String word) {
    return dictionary.isValid(word);
  }

  public List<String> suggestions(String typo) {
    return dictionary.suggestions(typo);
  }
}
