package com.example.trainapp.data.api;
//Interface com endpoints


//import das classes (Report e Station)
import com.example.trainapp.data.model.Report;
import com.example.trainapp.data.model.Station;

// Importa a classe 'List' de java que é usada para representar coleções de objetos, como uma lista de estações ou de reportes.
import java.util.List;

// Imports de chamadas com a API do Sever
import retrofit2.Call; // Objeto Call representa uma única chamada de API que pode ser executada
import retrofit2.http.GET; // Import  GET, que faz requisição  para buscar dados do servidor
import  retrofit2.http.POST; // Import POST, para enviar dados para o servidor.
import  retrofit2.http.Body; // Body pra indicar que um objeto deve ser serializado e enviado no corpo de uma requisição POST

public interface ApiService {

    // Endpoint para buscar todas as estações
    @GET("stations")
    Call<List<Station>> getStations();

    // Endpoint para buscar todos os reports
    @GET("reports")
    Call<List<Report>> getReports();

    // Endpoint para enviar um novo report
    @POST("reports")
    Call<Void> postReport(@Body Report report);
}
