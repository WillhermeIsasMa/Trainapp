package com.example.trainapp.utils;


//cálculos de distância, GPS, etc.
public class LocationUtils { // define a classe
    public static double distance(double lat1, double lon1, double lat2, double lon2) { // metodo estático da distancia

        // retorna os numeros decimais para o calculo da distancia
        double R = 6371; // Raio da terra em Kms
        double dLat = Math.toRadians(lat2 - lat1);  // diferença da latitude
        double dLon = Math.toRadians(lon2 - lon1);  // diferença da longitude

        double a = Math.sin(dLat/2) * Math.sin(dLat/2)  //fórmula de Haversine pra calcular distancia
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon/2) * Math.sin(dLon/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); // completa o calcula
        return R * c;  // Multiplica a distância angular C, pelo raio da terra pra obter a distancia final, em Km e retorna esse valor
    }
}