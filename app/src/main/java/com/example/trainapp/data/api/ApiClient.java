package com.example.trainapp.data.api;

//Configuração doconfiguração do Retrofit, base URL,Gson converter, etc.


import retrofit2.Retrofit; //importa a classe da biblioteca Retro., que é a ferramenta usada para fazer chamadas de rede (API)
import retrofit2.converter.gson.GsonConverterFactory; //Importa um conversor de texto em formato JSON (vindo do servidor) em objetos Java, e vice-versa.

public class ApiClient {
    private static final String BASE_URL = "__O URL VEM AQUI OU IP__"; // Todas as chamadas de API vão parar aqui no Sever
    private static Retrofit retrofit;
    public static Retrofit getClient() { // metodo publico que todos os serviços do app podem chamar pra ter o Retrofit

        if (retrofit == null) {
            retrofit = new Retrofit.Builder() //Construção de um novo objeto
                    .baseUrl(BASE_URL) // Usa o endereço que já definimos
                    .addConverterFactory(GsonConverterFactory.create()) // Usa o conversor que criamos ( Aqui usamos o de Json, mas pode ser de outros)
                    .build(); // Finaliza a configuração da chamada
        }
        return retrofit; // retorna a instancia do cliente
    }
}