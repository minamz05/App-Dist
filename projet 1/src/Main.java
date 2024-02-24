import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServerSocket socketserver;
        Socket socketserveur;

        try{
            socketserver = new ServerSocket(5200);
            socketserveur = socketserver.accept();

            System.out.println("connected");
           socketserver.close();
           socketserveur.close();

        } catch (IOException e) {
            e.printStackTrace();
        }




        }
    }
