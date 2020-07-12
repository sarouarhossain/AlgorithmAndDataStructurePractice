package leetcode.trie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSearch_212 {
  public static void main(String[] args) {
    //
    char[][] board = {
      {'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}
    };
    String[] words = {"oath", "pea", "eat", "rain"};

    WordSearch_212 ob = new WordSearch_212();
    ob.findWords(board, words);
  }

  public List<String> findWords(char[][] board, String[] words) {
    int row = board.length;
    int column = board[0].length;
    Trie trie = new Trie();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        String ch1 = null, ch2 = null, ch3 = null, ch4 = null;

        ch1 = getStringFromRangeColumn(i, j, i, column - 1, board);
        ch2 = getStringFromRangeColumn(i, j, i, 0, board);
        ch3 = getStringFromRangeRow(i, j, row - 1, j, board);
        ch4 = getStringFromRangeRow(i, j, 0, j, board);

        if (ch1 != null) trie.insert(ch1);
        if (ch2 != null) trie.insert(ch2);
        if (ch3 != null) trie.insert(ch3);
        if (ch4 != null) trie.insert(ch4);
      }
    }

    for (String word : words) {
      System.out.println(trie.startsWith(word));
    }
    return null;
  }

  private String getStringFromRangeColumn(int i1, int j1, int i2, int j2, char[][] board) {
    StringBuilder sb = new StringBuilder();
    if (i1 == i2) {
      if (j1 == j2) return null;
      if (j1 > j2) {
        for (int k = j1; k >= j2; k--) {
          sb.append(board[i1][k]);
        }
      } else {
        for (int k = j1; k <= j2; k++) {
          sb.append(board[i1][k]);
        }
      }
    }

    return sb.toString();
  }

  private String getStringFromRangeRow(int i1, int j1, int i2, int j2, char[][] board) {
    StringBuilder sb = new StringBuilder();

    if (j1 == j2) {
      if (i1 == i2) return null;
      if (i1 > i2) {
        for (int k = i1; k >= i2; k--) {
          sb.append(board[k][j1]);
        }
      } else {
        for (int k = i1; k <= i2; k++) {
          sb.append(board[k][j1]);
        }
      }
    }
    return sb.toString();
  }

  private class Trie {
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
}
