package domain.messages;
/**
 * La interfaz "Suscriber" define un contrato para los objetos que desean suscribirse a eventos.
 * Los suscriptores implementan este contrato para manejar eventos específicos.
 */
public interface Suscriber {

    /**
     * Maneja un evento específico cuando se publica.
     *
     * @param event El evento que se ha publicado y debe ser manejado por el suscriptor.
     */
    public void handleEvent(Event event);
}