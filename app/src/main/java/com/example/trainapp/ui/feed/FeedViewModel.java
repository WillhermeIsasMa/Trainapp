package com.example.trainapp.ui.feed;

//busca e atualiza reports.


import androidx.lifecycle.LiveData; // importa LiveData, que contem dados e repassa/notifica se tem alterações
import androidx.lifecycle.ViewModel;// importa ViewModel que permite que esta classe sobreviva a mudanças de configuração
                                    // (como rodar a tela)

//Importa as classes
import com.example.trainapp.data.model.Report;
import com.example.trainapp.data.repository.ReportRepository;

import java.util.List; // importa Lista pra travalhar com coleções de dados

public class FeedViewModel extends ViewModel { // define a classe
    private final ReportRepository repository; //variavel

    public FeedViewModel() { // construtor
        repository = new ReportRepository(); // atribui a varaivel
    }

    public LiveData<List<Report>> getReports() { // metodo pra chamar os reports
        return repository.getReports(); // retornas os dados
    }
}