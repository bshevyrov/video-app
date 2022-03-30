package ua.com.home.util;

import java.net.InetSocketAddress;
import java.net.Socket;

public class NetworkUtil {

    public boolean portIsOpen(String ip, int port){
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(ip, port), 200);
            socket.close();
            return true;
        }catch (Exception e) {
            return false;
        }

    }
    public boolean portIsOpen(String ip, int port, int timeout){
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(ip, port), timeout);
            socket.close();
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
