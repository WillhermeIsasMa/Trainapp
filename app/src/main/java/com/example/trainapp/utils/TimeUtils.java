package com.example.trainapp.utils;


//formatação de horários.
import java.text.SimpleDateFormat; // Importa ferramenta de datas
import java.util.Date; //importa a classe Date
import java.util.Locale; // Importa a classe Locale

public class TimeUtils { // define a classe
    public static String getCurrentTimestamp() {
        //linha principal, que faz tudo de uma vez:
            //new Date(): Cria um objeto Date que captura o momento exato em que esta linha é executada.
            // SimpleDateFormat():  Cria um formatador com um padrão específico:
                //    "yyyy-MM-dd HH:mm:ss": Define o formato do texto de saída como "ano-mês-dia hora:minuto:segundo".
                //    Locale.getDefault(): Usa as configurações de local do telemóvel do utilizador, o que é uma boa prática.
            //.format(...): O formatador pega no objeto Date e converte-o na String formatada.
            //return: O metodo retorna a String final (ex: "2025-10-20 16:07:30").

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
    }
}