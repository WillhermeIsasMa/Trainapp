package com.example.trainapp.data.repository;

//faz a ponte entre ApiService e a FeedViewModel (feed e reports).


import androidx.lifecycle.LiveData; // importa LiveData, que contem dados e repassa/notifica se tem alterações
import androidx.lifecycle.MutableLiveData; // importa mutableLiveData que permite alterar o valor

// importa as classes do API e Model
import com.example.trainapp.data.api.ApiClient;
import com.example.trainapp.data.api.ApiService;
import com.example.trainapp.data.model.Report;

import java.util.List; // importa Lista pra travalhar com coleções de dados

import retrofit2.Call; // Objeto Call representa uma única chamada de API que pode ser executada
import retrofit2.Callback; // Lida com a resposta do Call, e de forma assíncrona
import retrofit2.Response; //Encapsula a resposta HTTP do servidor.

public class ReportRepository { //Gere todas as operações de dados relacionados com os reportes
    private final ApiService apiService; // Guarda a instancia que será usada para fazer chaamdas

    public ReportRepository() {  // construtor
        apiService = ApiClient.getClient().create(ApiService.class); // implementa de forma uncional a interçace do APIcliente
    }

    public LiveData<List<Report>> getReports() {        //busca todos os reportes do servidor.
        MutableLiveData<List<Report>> data = new MutableLiveData<>(); //Cria um objeto, que contem a lista dos reportes, já reotrnando

        apiService.getReports().enqueue(new Callback<List<Report>>() {  // Chamada de forma paralela ´ra buscar reportes

            @Override
            public void onResponse(Call<List<Report>> call, Response<List<Report>> response) { // chamada bem sucedida
                if (response.isSuccessful()) data.setValue(response.body()); // atualiza o LiveData com a lista recebida
            }

            @Override
            public void onFailure(Call<List<Report>> call, Throwable t) { //Se falhar
                data.setValue(null); // LiveData como Null
            }
        });

        return data; // retorna data, finalizando que o valor de LiveData foi alterado para a UI
    }

    public void postReport(Report report) { // Metodo pra enviar um novo report

        apiService.postReport(report).enqueue(new Callback<Void>() { //chamada pra enviar esse novo report
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {} // Se der certo será postado ( depois pode ser colocado um tipo de confirmação

            @Override
            public void onFailure(Call<Void> call, Throwable t) {} // Aqui é no caso de erro, podemos elaborar um reenviar aqui
        });
    }
}