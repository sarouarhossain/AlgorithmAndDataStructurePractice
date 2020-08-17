package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestS {
  public static void main(String[] args) {
    String[] authorsArray = {"Jack Ma"};
    List<String> authors = Arrays.asList(authorsArray);

    String[] toArray = {"Elon Mask", "Mark Spielbarg"};
    List<String> to = Arrays.asList(toArray);

    Date date = new Date();
    String subject = "Test Email";

    Email email = new Email(authors, date, subject, to);

    System.out.println("Authers: " + email.getAuthors());
    System.out.println("Date: " + email.getDate());
    System.out.println("Subject: " + email.getSubject());
    System.out.println("To: " + email.getTo());

    email.addAuthors("Bill Gates");
    System.out.println("After new auther added: " + email.getAuthors());
  }
}
