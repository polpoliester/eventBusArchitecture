package eventbus;

public class IEventListener implements EventListener {

    @Override
    public String getType() {
        return "my-event";
    }

    @Override
    public void onEvent(String eventType, Object eventData) {
        System.out.println("El oyente ha recibido un evento de tipo " + eventType);//ola
    }
}
