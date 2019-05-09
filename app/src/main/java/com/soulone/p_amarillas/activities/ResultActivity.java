package com.soulone.p_amarillas.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.soulone.p_amarillas.R;
import com.soulone.p_amarillas.adapters.EmpresaAdapter;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends AppCompatActivity {

    private TextView claveTextView;
    private EmpresaAdapter adapter;
    private List<EmpresaItem> empresaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        fillEmpresaList();
        setUpRecyclerView();


        claveTextView = findViewById(R.id.result_clave_busqueda);

        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                String clave = bundle.getString("clave");

                claveTextView.setText(clave);

            }

        }


    }

    private void fillEmpresaList() {
        empresaList = new ArrayList<>();
        empresaList.add(new EmpresaItem("KFC", "Restaurante", "Santa Anita", "015555", "", R.drawable.ic_001_ramen));
        empresaList.add(new EmpresaItem("KFC", "Restaurante", "Santa Anita", "015555", "", R.drawable.ic_001_ramen));
        empresaList.add(new EmpresaItem("KFC", "Restaurante", "Santa Anita", "015555", "", R.drawable.ic_001_ramen));
        empresaList.add(new EmpresaItem("KFC", "Restaurante", "Santa Anita", "015555", "", R.drawable.ic_001_ramen));
        empresaList.add(new EmpresaItem("KFC", "Restaurante", "Santa Anita", "015555", "", R.drawable.ic_001_ramen));
        empresaList.add(new EmpresaItem("KFC", "Restaurante", "Santa Anita", "015555", "", R.drawable.ic_001_ramen));

    }


    private void setUpRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.rv_empresas);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        adapter = new EmpresaAdapter(empresaList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
