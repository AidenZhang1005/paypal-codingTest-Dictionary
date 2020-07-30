package dictionary;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
  private boolean isWord;
  private String word;
  private Map<Character, TrieNode> children;

  public TrieNode() {
    this.children = new HashMap<>();
  }

  public boolean isWord() {
    return isWord;
  }

  public void setIsWord(boolean isWord) {
    this.isWord = isWord;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public Map<Character, TrieNode> getChildren() {
    return children;
  }

  public void setChildren(Map<Character, TrieNode> children) {
    this.children = children;
  }
}
