
package domain;

import java.util.ArrayList;
import java.util.List;

public class MessageSystem {
private final List<Person> persons;
  private final Chat chat;

  public MessageSystem() {
    this.persons = new ArrayList<>();
    this.chat = new Chat();
  }

  public void addPerson(Person person) {
    persons.add(person);
  }

  public void removePerson(Person person) {
    persons.remove(person);
  }

  public void sendMessage(Message message) {
    chat.addMessage(message);
    message.getSender().receiveMessage(message);
  }

  public List<Person> getPersons() {
    return persons;
  }

  public Chat getChat() {
    return chat;
  }

  @Override
  public String toString() {
    return "MessageSystem{" +
        "persons=" + persons +
        ", chat=" + chat +
        '}';
  }
}