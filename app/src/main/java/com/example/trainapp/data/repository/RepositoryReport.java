package com.example.trainapp.data.repository;

import android.util.Log;


import com.example.trainapp.models.Report;


public class RepositoryReport {

    public void submitReport(Report report) {
        Log.d("RepositoryReport", "A submeter o reporte...");
        Log.d("RepositoryReport", "Descrição: " + report.getDescription());
        Log.d("RepositoryReport", "Timestamp: " + report.getTimestamp());

        // Simulação de uma chamada de API bem-sucedida.
        Log.d("RepositoryReport", "Reporte enviado para a API com sucesso (simulado).");
    }
}