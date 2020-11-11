package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApplication {

    public static void main (String [] args) throws IOException {

        int portNumber = 34001;
        ServerSocket s = new ServerSocket(portNumber);

        System.out.println("Server started on port " + portNumber);

        Socket client;
        BufferedReader in;


        while(true) {
            client = s.accept();
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println(in.readLine());
            client.close();
        }
    }



}
