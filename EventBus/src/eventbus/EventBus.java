package eventbus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {

    private final Map<String, List<EventListener>> listenersByType;

    public EventBus() {
        this.listenersByType = new HashMap<>();
    }

    /**
     * Publica un evento en el bus de eventos.
     *
     * @param event El evento a publicar.
     */
    public void publish(Event event) {
        List<EventListener> listeners = listenersByType.get(event.getType());
        if (listeners != null) {
            for (EventListener listener : listeners) {
                listener.onEvent(event);
            }
        }
    }

    /**
     * Susscribe un oyente de eventos al bus de eventos.
     *
     * @param listener El oyente de eventos a suscribir.
     */
    public void subscribe(EventListener listener) {
        List<EventListener> listeners = listenersByType.get(listener.getType());
        if (listeners == null) {
            listeners = new ArrayList<>();
            listenersByType.put(listener.getType(), listeners);
        }
        listeners.add(listener);
    }

    /**
     * Desuscribe un oyente de eventos del bus de eventos.
     *
     * @param listener El oyente de eventos a desuscribir.
     */
    public void unsubscribe(EventListener listener) {
        List<EventListener> listeners = listenersByType.get(listener.getType());
        if (listeners != null) {
            listeners.remove(listener);
        }
    }
}
