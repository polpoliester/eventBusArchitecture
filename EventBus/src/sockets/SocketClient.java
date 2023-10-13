package sockets;

import java.io.*;
import java.net.Socket;

public class SocketClient implements Runnable {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public SocketClient(Socket socket) throws IOException {
        this.socket = socket;
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public void sendMessage(String messageText) {
        out.println(messageText);
    }

    public String receiveMessage() throws IOException {
        return in.readLine();
    }

    @Override
    public void run() {
        try {
            // Implementa el comportamiento de manejo de la conexión aquí
            String receivedMessage = receiveMessage();
            System.out.println("Mensaje recibido: " + receivedMessage);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
