package domain;

import java.util.ArrayList;
import java.util.List;

public class Chat {

  private final List<Person> persons;
  private final List<Message> messages;

  public Chat() {
    this.persons = new ArrayList<>();
    this.messages = new ArrayList<>();
  }

 public void addPerson(Person person) {
    persons.add(person);
    if (person.getChats() != null) {
      person.getChats().add(this);
    }
  }

  public void removePerson(Person person) {
    persons.remove(person);
    if (person.getChats() != null) {
      person.getChats().remove(this);
    }
  }

  public void addMessage(Message message) {
    messages.add(message);
    for (Person person : persons) {
      person.receiveMessage(message);
    }
  }

  public List<Person> getPersons() {
    return persons;
  }

  public List<Message> getMessages() {
    return messages;
  }

  @Override
  public String toString() {
    return "Chat{" +
        "persons=" + persons +
        ", messages=" + messages +
        '}';
  }
}