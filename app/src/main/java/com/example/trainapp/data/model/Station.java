package com.example.trainapp.data.model;


public class Station { // definição da classe
    private String name; //variavel pra guardar o nome
    private double latitude; // variavel pra guardar a coordenada
    private double longitude; // variavel pra guardar a coordenada
    private String line; // variavel pra guardar linha do trem

    public String getName() { return name; } // metodo publico pra outras classes verem o nome
    public double getLatitude() { return latitude; } // metodo publico pra outras classes verem coordenada
    public double getLongitude() { return longitude; } // metodo publico pra outras classes verem coordenada
    public String getLine() { return line; } // metodo publico pra outras classes verem a linha
}