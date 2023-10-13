package sockets;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) throws IOException {

        do {
            Socket socket = new Socket("localhost", 8080);
            Scanner sc = new Scanner(System.in);
            // Enviar un mensaje de texto
            String messageText = sc.nextLine();
            SocketClient client = new SocketClient(socket);
            client.sendMessage(messageText);

            // Recibir un mensaje de texto
            String receivedMessage = client.receiveMessage();

            if (receivedMessage != null) {
                System.out.println("Mensaje recibido: " + receivedMessage);
            } else {
                System.out.println("No se pudo recibir un mensaje válido.");
            }

        } while (true);

    }
}
