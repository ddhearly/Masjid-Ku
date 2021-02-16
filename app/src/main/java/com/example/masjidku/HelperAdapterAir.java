package com.example.masjidku;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HelperAdapterAir extends FirebaseRecyclerAdapter <ListDataAir, HelperAdapterAir.MyViewHolder> {

    public HelperAdapterAir(@NonNull FirebaseRecyclerOptions<ListDataAir> options) {
        super(options);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_air, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull ListDataAir model) {
        holder.setData(model);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewdebit;
        TextView textViewvolume;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewdebit = itemView.findViewById(R.id.debit);
            textViewvolume = itemView.findViewById(R.id.volume);
        }

        public void setData(ListDataAir data) {
            textViewdebit.setText(data.getDebit());
            textViewvolume.setText(data.getVolume());
        }
    }


}



