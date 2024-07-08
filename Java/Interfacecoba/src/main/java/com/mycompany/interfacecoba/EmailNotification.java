package com.mycompany.interfacecoba;

public class EmailNotification implements Interfacetest {

    @Override
    public void sendMessage(String message, String content) {
        System.out.println("Mengirim Email Ke : " + message + "Dengan Isi");
        System.out.println(content);
    }
}