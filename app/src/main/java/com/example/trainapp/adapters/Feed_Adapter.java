package com.example.trainapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trainapp.R;
import com.example.trainapp.models.Report;
import java.util.List;

// Adapter para a lista (RecyclerView) de reportes no feed.
public class Feed_Adapter extends RecyclerView.Adapter<Feed_Adapter.ReportViewHolder> {

    private final List<Report> reportList;

    public Feed_Adapter(List<Report> reportList) {
        this.reportList = reportList;
    }

    @NonNull
    @Override
    public ReportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Infla o layout do item da lista
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_report, parent, false);
        return new ReportViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ReportViewHolder holder, int position) {
        // Preenche os dados de cada item da lista
        Report currentReport = reportList.get(position);
        holder.descriptionTextView.setText(currentReport.getDescription());
    }

    @Override
    public int getItemCount() {
        return reportList != null ? reportList.size() : 0;
    }

    // ViewHolder que representa um item individual na lista
    public static class ReportViewHolder extends RecyclerView.ViewHolder {
        public TextView descriptionTextView;

        public ReportViewHolder(@NonNull View itemView) {
            super(itemView);
            // Associa os componentes do layout
            descriptionTextView = itemView.findViewById(R.id.text_view_description);
        }
    }
}

