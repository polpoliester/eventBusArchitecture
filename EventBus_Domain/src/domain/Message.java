package domain;

import java.util.Objects;

public class Message {

 private final String content;
  private final Person sender;

  public Message(String content, Person sender) {
    this.content = content;
    this.sender = sender;
  }

  public String getContent() {
    return content;
  }

  public Person getSender() {
    return sender;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(content, message.content) &&
        Objects.equals(sender, message.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, sender);
  }

  @Override
  public String toString() {
    return "Message{" +
        "content='" + content + '\'' +
        ", sender=" + sender +
        '}';
  }
}