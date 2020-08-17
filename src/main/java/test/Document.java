package test;

import java.util.Date;
import java.util.List;

public class Document {
  private List<String> authors;
  private Date date;

  Document(List<String> authors, Date date) {
    this.authors = authors;
    this.date = date;
  }

  public List<String> getAuthors() {
    return this.authors;
  }

  public void addAuthors(String author) {
    this.authors.add(author);
  }

  public Date getDate() {
    return this.date;
  }
}
