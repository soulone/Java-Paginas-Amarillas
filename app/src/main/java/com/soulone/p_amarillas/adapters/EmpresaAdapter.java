package com.soulone.p_amarillas.adapters;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.chip.Chip;
import com.soulone.p_amarillas.R;
import com.soulone.p_amarillas.activities.DetailEmpresaActivity;
import com.soulone.p_amarillas.activities.EmpresaItem;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmpresaAdapter extends RecyclerView.Adapter<EmpresaAdapter.ExampleViewHolder> {

    private static final String TAG = EmpresaAdapter.class.getSimpleName();
    private List<EmpresaItem> empresaList;
    private List<EmpresaItem> empresaListFull;




    class ExampleViewHolder extends RecyclerView.ViewHolder {
        ImageView ItemImageView;
        TextView ItemtextviewNombre;
        TextView ItemtextviewAdress;
        TextView ItemtextviewStreet;
        TextView ItemtextviewNumber;
        Chip ItemchipCategory;

        ExampleViewHolder(View itemView) {
            super(itemView);
            ItemImageView = itemView.findViewById(R.id.company_brand);
            ItemtextviewNombre = itemView.findViewById(R.id.company_name);
            ItemtextviewAdress = itemView.findViewById(R.id.company_adress);
            ItemtextviewStreet = itemView.findViewById(R.id.company_street);
            ItemtextviewNumber = itemView.findViewById(R.id.company_number);
            ItemchipCategory = itemView.findViewById(R.id.company_category);
        }
    }

    public EmpresaAdapter(List<EmpresaItem> empresaList) {

        this.empresaList = empresaList;
        empresaListFull = new ArrayList<>(empresaList);
    }


    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.empresa_item,
                parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
      final   EmpresaItem currentItem = empresaList.get(position);
        holder.ItemtextviewNombre.setText(currentItem.getName());
        holder.ItemtextviewAdress.setText(currentItem.getDirection());
        holder.ItemtextviewStreet.setText(currentItem.getStreet());
        holder.ItemtextviewNumber.setText(currentItem.getNumber());
        holder.ItemchipCategory.setText(currentItem.getCategoria());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"Onclick:"+currentItem);
            }
        });

    }

    @Override
    public int getItemCount() {
        return empresaList.size();
    }

}


