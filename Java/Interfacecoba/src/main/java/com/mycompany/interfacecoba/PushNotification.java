package com.mycompany.interfacecoba;

public class PushNotification implements InterfaceNotification {
    
    @Override
    public void sendMessage(String message, String content) {
        System.out.println("Mengirim Push Notif Ke " + message);
        System.out.println(message);
    }
}
