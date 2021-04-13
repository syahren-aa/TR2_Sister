package com.example.consume_restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.consume_restapi.api.ApiClient;
import com.example.consume_restapi.entities.Kamus;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Translate extends AppCompatActivity {

    EditText txtInpKata;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        txtInpKata = findViewById(R.id.txtInpKata);
        txtHasil = findViewById(R.id.txtHasil);

    }


    public void terjemahan(View view) {
        Call<Kamus> call = ApiClient.getKamusService().getKatabyKata(txtInpKata.getText().toString());

        call.enqueue(new Callback<Kamus>() {
            @Override
            public void onResponse(Call<Kamus> call, Response<Kamus> response) {
                Kamus kamus = response.body();
                txtHasil.setText(kamus.getInggris());
            }

            @Override
            public void onFailure(Call<Kamus> call, Throwable t) {

            }
        });


    }
}