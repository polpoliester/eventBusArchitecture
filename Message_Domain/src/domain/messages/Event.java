package domain.messages;

/**
 * La clase "Event" representa un evento genérico en un sistema de manejo de
 * eventos. Los eventos se utilizan para notificar y comunicar cambios o
 * acciones dentro de una aplicación.
 */
public class Event {

    private String name;

    /**
     * Constructor de la clase Event.
     *
     * @param name El nombre del evento.
     */
    public Event(String name) {
        this.name = name;
    }

    /**
     * Obtiene el nombre del evento.
     *
     * @return El nombre del evento.
     */
    public String getName() {
        return name;
    }
}
