package com.ruaffu.loginregistrationbackend.email;

public interface EmailSender {
    void send(String to, String email);
}
