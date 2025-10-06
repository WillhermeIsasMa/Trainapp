package com.example.trainapp.ui.map;


//Obtém dados das estações, localização e atualizações via API.


import androidx.lifecycle.LiveData;  // importa LiveData, que contem dados e repassa/notifica se tem alterações
import androidx.lifecycle.ViewModel; // importa ViewModel que permite que esta classe sobreviva a mudanças de configuração
                                     // (como rodar a tela)


// Importa as classes
import com.example.trainapp.data.model.Station;
import com.example.trainapp.data.repository.TrainRepository;

import java.util.List; // importa Lista pra travalhar com coleções de dados

public class MapViewModel extends ViewModel { // define a classe
    private final TrainRepository repository; // varivel

    public MapViewModel() { // construtor
        repository = new TrainRepository();  // atribui variavel
    }

    public LiveData<List<Station>> getStations() { // metodo pra chamar as estações
        return repository.getStations(); //  retornas os dados
    }
}