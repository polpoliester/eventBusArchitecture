package eventbus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {

    private final Map<String, List<IEventListener>> listenersByType;

    public EventBus() {
        this.listenersByType = new HashMap<>();
    }

    /**
     * Publish an event to the event bus.
     *
     * @param eventType The Name of the event to publish.
     * @param eventData The event data to publish.
     */
    public void publish(String eventType, Object eventData) {
        List<IEventListener> listeners = listenersByType.get(eventType);
        if (listeners != null) {
            for (IEventListener listener : listeners) {
                listener.onEvent(eventType, eventData);
            }
        }
    }

    /**
     * Subscribes an event listener to the event bus.
     *
     * @param listener The event listener to subscribe to.
     */
    public void subscribe(IEventListener listener) {
        String eventType = listener.getType();
        List<IEventListener> listeners = listenersByType.get(eventType);
        if (listeners == null) {
            listeners = new ArrayList<>();
            listenersByType.put(eventType, listeners);
        }
        listeners.add(listener);
    }

    /**
     * Unsubscribes an event listener from the event bus.
     *
     * @param listener The event listener to unsubscribe.
     */
    public void unsubscribe(IEventListener listener) {
        String eventType = listener.getType();
        List<IEventListener> listeners = listenersByType.get(eventType);
        if (listeners != null) {
            listeners.remove(listener);
        }
    }
}
