package eventbus;

public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creates an event bus.
        EventBus eventBus = new EventBus();

        // Creates an event listener.
        EventListener listener = new IEventListener();

        // Subscribes the event listener to the event bus.
        eventBus.subscribe((IEventListener) listener);

        // Publish an event.
        eventBus.publish("my-event", "Hola mundo!");
    }

}
