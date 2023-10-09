package domain.messages;

import domain.users.User;

/**
 * La clase "Message" representa un mensaje enviado entre usuarios en un sistema de mensajería.
 * Cada mensaje contiene contenido, información sobre el remitente y el destinatario.
 */
public class Message {

    private String content;
    private User sender;
    private User receiver;

    /**
     * Constructor de la clase Message que crea una instancia de mensaje con contenido, remitente y destinatario especificados.
     *
     * @param content  El contenido del mensaje.
     * @param sender   El usuario que envía el mensaje.
     * @param receiver El usuario que recibe el mensaje.
     */
    public Message(String content, User sender, User receiver) {
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }

    /**
     * Obtiene el contenido del mensaje.
     *
     * @return El contenido del mensaje.
     */
    public String getContent() {
        return content;
    }

    /**
     * Establece el contenido del mensaje.
     *
     * @param content El nuevo contenido del mensaje.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Obtiene el remitente del mensaje.
     *
     * @return El usuario que envió el mensaje.
     */
    public User getSender() {
        return sender;
    }

    /**
     * Establece el remitente del mensaje.
     *
     * @param sender El nuevo remitente del mensaje.
     */
    public void setSender(User sender) {
        this.sender = sender;
    }

    /**
     * Obtiene el destinatario del mensaje.
     *
     * @return El usuario que recibe el mensaje.
     */
    public User getReceiver() {
        return receiver;
    }

    /**
     * Establece el destinatario del mensaje.
     *
     * @param receiver El nuevo destinatario del mensaje.
     */
    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}