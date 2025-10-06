package com.example.trainapp.data.model;

public class Report {
    private String user; // variavel pra guardar o User
    private String message; //variavel pra guardar mensagem
    private String line; //variavel pra guardar a linha de que ele tá falando
    private String timestamp; //variavel pra guarda D/H que o report foi feito


    // Metodos para que as classes possam ver os dados das variaveis
    public String getUser() { return user; }
    public String getMessage() { return message; }
    public String getLine() { return line; }
    public String getTimestamp() { return timestamp; }
}
