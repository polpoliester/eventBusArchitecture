package domain.messages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * La clase "EventBus" implementa un bus de eventos que permite la suscripción a
 * eventos y la publicación de eventos a los suscriptores registrados.
 */
public class EventBus {

    private Map<Event, List<Suscriber>> suscribers = new HashMap<>();

    /**
     * Registra un suscriptor para un evento específico.
     *
     * @param event El evento al que se desea suscribir.
     * @param suscriber El suscriptor que se registra para el evento.
     */
    public void suscribe(Event event, Suscriber suscriber) {
        suscribers.computeIfAbsent(event, k -> new ArrayList<>()).add(suscriber);
    }

    /**
     * Publica un evento, notificando a todos los suscriptores registrados para
     * ese evento.
     *
     * @param event El evento que se va a publicar.
     */
    public void publish(Event event) {
        List<Suscriber> eventSuscribers = suscribers.getOrDefault(event, new ArrayList<>());
        for (Suscriber suscriber : eventSuscribers) {
            suscriber.handleEvent(event);
        }
    }
}
