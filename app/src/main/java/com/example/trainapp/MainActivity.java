package com.example.trainapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trainapp.ui.feed.Report_Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout para esta atividade
        setContentView(R.layout.activity_main);

        // Encontra o botão no layout pelo seu ID
        Button goToReportButton = findViewById(R.id.button_go_to_report);

        // Configura um listener de clique para o botão
        goToReportButton.setOnClickListener(v -> {
            // Cria uma Intent para iniciar a Report_Activity
            Intent intent = new Intent(MainActivity.this, Report_Activity.class);
            startActivity(intent);
        });
    }
}
