package dictionary;

public class Trie {
  private TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

  /**
   * Put a word into the Trie
   * @param word word to insert
   */
  public void put(String word) {
    if (word == null || word.length() == 0) {
      return;
    }

    TrieNode parent = root;
    for (char cur : word.toCharArray()) {
      TrieNode child = parent.getChildren().get(cur);
      if (child == null) {
        child = new TrieNode();
        parent.getChildren().put(cur, child);
      }
      parent = child;
    }

    parent.setIsWord(true);
    parent.setWord(word);
  }

  /**
   * Search the word in the trie
   * @param word word to search
   * @return the word in the trie
   */
  public String search(String word) {
    if (word == null || word.length() == 0) {
      return "";
    }

    TrieNode parent = root;
    for (char cur : word.toCharArray()) {
      TrieNode child = parent.getChildren().get(cur);
      if (child == null) {
        return "";
      }

      parent = child;
    }

    return parent.isWord() ? parent.getWord() : "";
  }

  /**
   * Deletes a word from the trie if present
   * @param word word to deletedd
   * @return true if the word is deleted successfully
   */
  public boolean delete(String word) {
    if (word == null || word.length() == 0) {
      return false;
    }

    if (!search(word).equals(word)) {
      return false;
    }

    TrieNode deleteBelow = null;
    char deleteChar = '\0';

    TrieNode parent = root;
    for (char cur : word.toCharArray()) {
      TrieNode child = parent.getChildren().get(cur);
      if (child == null) {
        return false;
      }

      if (parent.getChildren().size() > 1 || parent.isWord()) {
        deleteBelow = parent;
        deleteChar = cur;
      }

      parent = child;
    }

    if (!parent.isWord()) {
      return false;
    }

    if (parent.getChildren().isEmpty() && deleteBelow != null) {
      deleteBelow.getChildren().remove(deleteChar);
    } else {
      parent.setIsWord(false);
    }

    return true;
  }
}
