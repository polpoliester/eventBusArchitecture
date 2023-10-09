package domain.application;

import domain.messages.*;
import domain.users.*;

/**
 * La clase "Messaging" representa una aplicación de demostración para el sistema de mensajería.
 * En esta aplicación, se crean usuarios, mensajes, eventos y se utilizan el bus de eventos para
 * simular la recepción de mensajes por parte de los usuarios.
 */
public class Messaging {

    public static void main(String[] args) {
        // Crear una instancia del EventBus para gestionar eventos.
        EventBus eventBus = new EventBus();

        // Crear dos usuarios.
        User usuario1 = new User("Usuario1");
        User usuario2 = new User("Usuario2");

        // Suscribir Usuario1 y Usuario2 a eventos de "NuevoMensaje".
        eventBus.suscribe(new Event("NuevoMensaje"), new Suscriber() {
            @Override
            public void handleEvent(Event event) {
                System.out.println("Evento recibido por Usuario1: " + event.getName());
            }
        });

        eventBus.suscribe(new Event("NuevoMensaje"), new Suscriber() {
            @Override
            public void handleEvent(Event event) {
                System.out.println("Evento recibido por Usuario2: " + event.getName());
            }
        });

        // Crear un mensaje y un evento de "NuevoMensaje".
        Message message = new Message("Hola, ¿cómo estás?", usuario1, usuario2);
        Event newMessage = new Event("NuevoMensaje");

        // Publicar el evento para simular la recepción del mensaje por los usuarios.
        eventBus.publish(newMessage);
    }
}