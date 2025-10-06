package com.example.trainapp.ui.main;

//ponto de entrada do app, contendo o Navigation Drawer
// e controlando os fragmentos/telas principais (Mapa e Feed).


import android.os.Bundle; //importa Bundle, usada para guardar e passar informações de estado ( rotação de tela)
import androidx.appcompat.app.AppCompatActivity; // Importa AppCompatActivity, garante compatibilidade com versões mais antigas do Android.
import com.example.trainapp.R; // Importa a classe R, que contém os IDs de todos os seus recursos

public class MainActivity extends AppCompatActivity { // define a classe

    @Override
    protected void onCreate(Bundle savedInstanceState) { //metodo onde toda a configuração inicial é feita
        super.onCreate(savedInstanceState); //classe pai
        //setContentView(R.layout.activity_main); //Conecta o cod, Ela "infla" o ficheiro de layout activity_main.xml
        // (localizado em res/layout) e o exibe no ecrã

    }
}

