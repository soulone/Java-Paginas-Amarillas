package com.soulone.p_amarillas.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.soulone.p_amarillas.R;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private Button button_buscar;
    private EditText editText_busqueda;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.search:
                    mTextMessage.setText(R.string.title_buscar);
                    return true;
                case R.id.location:
                    mTextMessage.setText(R.string.title_cerca_de_mi);
                    return true;
                case R.id.settings:
                    mTextMessage.setText(R.string.title_ajustes);
                    return true;
                case R.id.RA:
                    mTextMessage.setText(R.string.title_ra);
                    return  true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        editText_busqueda = findViewById(R.id.main_input_busqueda);

    }
    public void busquedaEmpresa(View view){

        String clave = editText_busqueda.getText().toString();


        if (clave.isEmpty()){
            Toast.makeText(this,"Debe escribir un texto en la caja de busqueda",Toast.LENGTH_SHORT);
            return;
        }

        Intent intent =  new Intent(this, ResultActivity.class);
        intent.putExtra("clave",clave);
        startActivity(intent);
    }
}
