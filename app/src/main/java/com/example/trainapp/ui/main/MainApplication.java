package com.example.trainapp.ui.main;

import android.app.Application; // Estado Global da aplicação

public class MainApplication extends Application { // define a classe
    @Override
    public void onCreate() { // subistitui da classe pai
        super.onCreate(); // garante a inicialização

        // Inicializações globais (Retrofit, Map SDK, etc.)
    }
}