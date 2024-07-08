package com.mycompany.interfacecoba;

public class SMSNotification implements Interfacetest {
    
    @Override
    public void sendMessage(String message, String content) {
        System.out.println("Mengirim SMS Ke : " + message + "Dengan Isi");
        System.out.println(content);
    }
}
