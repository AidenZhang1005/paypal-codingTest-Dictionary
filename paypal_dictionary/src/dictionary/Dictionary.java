package dictionary;

import exception.WordNotFoundException;

public class Dictionary {
  private Trie trie;
  public Dictionary() {
    this.trie = new Trie();
  }

  /**
   * Get the word in dictionary
   * @param word word to search
   * @return word
   */
  public String get(String word) {
    String res = trie.search(word);
    if (res.equals("")) {
      throw new WordNotFoundException(word + " not found in dictionary.");
    }
    return res;
  }

  /**
   * Put a word in the dictionary
   * @param word the word to put
   */
  public void put(String word) {
    trie.put(word);
  }

  /**
   * Delete a word in the dictionary
   * @param word the word to delete
   * @return true if delete successfully
   */
  public boolean delete(String word) {
    return trie.delete(word);
  }
}
