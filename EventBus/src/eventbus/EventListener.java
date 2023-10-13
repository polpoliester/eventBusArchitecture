package eventbus;

public interface EventListener {
/**
     * Gets the type of event.
     *
     * @return A String representing the event type.
     */
    String getType();

    
    /**
     * Handles an event by specifying the event type and associated data.
     *
     * @param eventType   A String representing the type of the event.
     * @param eventData   An Object containing data related to the event.
     */
    void onEvent(String eventType, Object eventData);//ola
}