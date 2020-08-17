package test;

import java.util.Date;
import java.util.List;

public class Email extends Document {
  private String subject;
  private List<String> to;

  Email(List<String> authors, Date date, String subject, List<String> to) {
    super(authors, date);
    this.subject = subject;
    this.to = to;
  }

  public String getSubject() {
    return this.subject;
  }

  public List<String> getTo() {
    return this.to;
  }
}
