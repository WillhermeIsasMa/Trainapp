package com.example.trainapp.data.repository;

//faz a ponte entre ApiService e a MapViewModel (dados do mapa e estações).


import androidx.lifecycle.LiveData; // importa LiveData, que contem dados e repassa/notifica se tem alterações
import androidx.lifecycle.MutableLiveData; // importa mutableLiveData que permite alterar o valor

// importa as classes do API e Model
import com.example.trainapp.data.api.ApiClient;
import com.example.trainapp.data.api.ApiService;
import com.example.trainapp.data.model.Station;

import java.util.List; // importa Lista pra travalhar com coleções de dados

import retrofit2.Call; // Objeto Call representa uma única chamada de API que pode ser executada
import retrofit2.Callback; // Lida com a resposta do Call, e de forma assíncrona
import retrofit2.Response; //Encapsula a resposta HTTP do servidor.

public class TrainRepository {
    private final ApiService apiService; // instancia final para guarda a API do serviço

    public TrainRepository() { //Construtor da classe
        apiService = ApiClient.getClient().create(ApiService.class); // Obtem o cliente conf. no ApiClient e usa o metodo creat pra gerar uma implementação
    }

    public LiveData<List<Station>> getStations() { // metodo pub. que o MVV podechamar pra ter a lista de estações.
        MutableLiveData<List<Station>> data = new MutableLiveData<>(); // retorna libe dada, -"UI pode "observar" este dado e reagir a alterações."

        apiService.getStations().enqueue(new Callback<List<Station>>() {  //CORE  --> APISERVICE chamar o metodo GETSTATION ( que definimos -"chamada de rede").
            // ENQUEUE executa a chamada numa "thread de fundo" ( para n bloquear UI) e CALLBACK define o que fazer quando a resposta chega.

            @Override
            //Metodos dentro do call back
            public void onResponse(Call<List<Station>> call, Response<List<Station>> response) { // Verifica se a respota do SV tá OK
                if (response.isSuccessful()) data.setValue(response.body()); // Se sim ele atualiza a lista de dados
            }

            @Override
            public void onFailure(Call<List<Station>> call, Throwable t) { // Executa se a chamada falar, no caso de falta de comunicação
                data.setValue(null); // sinaliza que deu Erro
            }
        });

        return data; // retorna data, finalizando que o valor de LiveData foi alterado para a UI
    }
}