package eventbus;

public interface EventListener {

    /**
     * El tipo de evento al que está suscrito el oyente.
     */
    String getType();

    /**
     * El método que se llama cuando se produce un evento del tipo al que está
     * suscrito el oyente.
     */
    void onEvent(Event event);
}
