package com.example.masjidku;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.ArrayList;

public class HelperAdapterListrik extends FirebaseRecyclerAdapter<ListDataListrik, HelperAdapterListrik.MyViewHolder> {


    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public HelperAdapterListrik(@NonNull FirebaseRecyclerOptions<ListDataListrik> options) {
        super(options);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_listrik, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull ListDataListrik model) {
        holder.setData(model);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewArus;
        TextView textViewTegangan;
        TextView textViewDaya;
        TextView textViewEnergi;
        TextView textViewSaklar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewArus = itemView.findViewById(R.id.arus);
            textViewTegangan = itemView.findViewById(R.id.tegangan);
            textViewDaya = itemView.findViewById(R.id.daya);
            textViewEnergi = itemView.findViewById(R.id.energi);
            textViewSaklar = itemView.findViewById(R.id.textView);
        }

        public void setData(ListDataListrik data) {
            textViewArus.setText(data.getArus());
            textViewTegangan.setText(data.getTegangan());
            textViewDaya.setText(data.getDaya());
            textViewEnergi.setText(data.getEnergi());
            textViewSaklar.setText(data.getNama());
        }
    }
}

