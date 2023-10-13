package sockets;

import java.nio.charset.StandardCharsets;

public class Message {

    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public byte[] getBytes() {
        return text.getBytes(StandardCharsets.UTF_8);
    }

    public static Message fromBytes(byte[] bytes) {
        String text = new String(bytes, StandardCharsets.UTF_8);
        return new Message(text);
    }
}
