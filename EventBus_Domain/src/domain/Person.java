package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private final String name;
    private List<Chat> chats = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public void addChat(Chat chat) {
        chats.add(chat);
    }

    public void removeChat(Chat chat) {
        chats.remove(chat);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", chats=" + chats
                + '}';
    }

    public void receiveMessage(Message message) {
        System.out.println("El usuario " + name + " ha recibido un mensaje de " + message.getSender().getName());
    }
}
