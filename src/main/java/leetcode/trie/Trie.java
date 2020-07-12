package leetcode.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

  private class TrieNode {
    Map<Character, TrieNode> children;
    boolean isWord;

    public TrieNode() {
      children = new HashMap<>();
      isWord = false;
    }
  }

  private final TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

  /**
   * iterative way to insert a word in the trie
   *
   * @param word
   */
  public void insert(String word) {
    TrieNode current = root;
    for (int i = 0; i < word.length(); i++) {
      Character ch = word.charAt(i);
      TrieNode node = current.children.get(ch);
      if (node == null) {
        node = new TrieNode();
        current.children.put(ch, node);
      }
      current = node;
    }
    current.isWord = true;
  }

  /**
   * insert recursive way
   *
   * @param word word to be inserted
   */
  public void insertRecursive(String word) {
    insertRecursive(root, word, 0);
  }

  /**
   * recursive function to insert a word alphabets in a trie
   *
   * @param current current trie node
   * @param word word to be inserted
   * @param index index of the word to be inserted
   */
  private void insertRecursive(TrieNode current, String word, int index) {
    if (index == word.length()) {
      current.isWord = true;
      return;
    }

    Character ch = word.charAt(index);
    TrieNode node = current.children.get(ch);

    if (node == null) {
      node = new TrieNode();
      current.children.put(ch, node);
    }

    current = node;

    insertRecursive(current, word, index + 1);
  }

  /**
   * search iterative way
   *
   * @param word to be searched
   * @return true if found , else false
   */
  public boolean search(String word) {
    TrieNode current = root;
    for (int i = 0; i < word.length(); i++) {
      Character ch = word.charAt(i);
      TrieNode node = current.children.get(ch);
      if (node == null) return false;
      current = node;
    }

    return current.isWord;
  }

  /**
   * search a word recursive way
   *
   * @param word word to be searched
   * @return true if found , else false
   */
  public boolean searchRecursive(String word) {
    return searchRecursive(root, word, 0);
  }

  /**
   * recursive search implementation
   *
   * @param current current trie node
   * @param word word to be searched
   * @param index index in the word looking for
   * @return true if found, else false
   */
  public boolean searchRecursive(TrieNode current, String word, int index) {
    if (index == word.length()) {
      return current.isWord;
    }

    Character ch = word.charAt(index);
    TrieNode node = current.children.get(ch);
    if (node == null) return false;
    return searchRecursive(current, word, index + 1);
  }

  /**
   * implementation of starts with method
   *
   * @param prefix prefix word
   * @return true if found
   */
  public boolean startsWith(String prefix) {
    TrieNode current = root;
    for (int i = 0; i < prefix.length(); i++) {
      Character ch = prefix.charAt(i);
      TrieNode node = current.children.get(ch);
      if (node == null) {
        return false;
      }
      current = node;
    }
    return true;
  }
}
