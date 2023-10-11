package eventbus;

public interface Event {
    /**
   * El tipo de evento.
   */
  String getType();


  /**
   * La carga útil del evento.
   */
  Object getPayload();
}
