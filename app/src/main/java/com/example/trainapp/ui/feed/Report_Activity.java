package com.example.trainapp.ui.feed;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.trainapp.R;

public class Report_Activity extends AppCompatActivity {

    private ReportViewModel reportViewModel;
    private EditText descriptionEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        // Inicializa o ViewModel
        reportViewModel = new ViewModelProvider(this).get(ReportViewModel.class);

        // Referencia os componentes da UI
        descriptionEditText = findViewById(R.id.editText_description);
        submitButton = findViewById(R.id.button_submit);

        // Configura o clique do botão para chamar o ViewModel
        submitButton.setOnClickListener(v -> {
            String description = descriptionEditText.getText().toString();
            reportViewModel.createReport(description);
        });

        // Observa o status do envio para dar feedback ao utilizador
        reportViewModel.getReportStatus().observe(this, success -> {
            if (success) {
                Toast.makeText(this, "Reporte enviado com sucesso!", Toast.LENGTH_SHORT).show();
                finish(); // Fecha a atividade após o sucesso
            } else {
                Toast.makeText(this, "Erro: A descrição não pode estar vazia.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
