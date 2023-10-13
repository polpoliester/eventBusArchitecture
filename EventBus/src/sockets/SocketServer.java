package sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    private static final int PORT = 8080;

    public static void main(String[] args) {
        try {
            // Crear un servidor de sockets
            ServerSocket serverSocket = new ServerSocket(PORT);

            System.out.println("Servidor en ejecución. Esperando conexiones...");

            // Escuchar conexiones entrantes
            while (true) {
                // Aceptar una nueva conexión
                Socket socket = serverSocket.accept();

                // Crear un nuevo cliente de sockets
                SocketClient client = new SocketClient(socket);

                // Iniciar un nuevo hilo para manejar la conexión
                new Thread(client).start();
            }
            
            
            //Test
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
