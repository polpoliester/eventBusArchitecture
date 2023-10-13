package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private final String name;
    private Chat chat;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
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
                + ", chats=" + chat
                + '}';
    }

    public void receiveMessage(Message message) {
        System.out.println("El usuario " + name + " ha recibido un mensaje de " + message.getSender().getName());
    }
}
