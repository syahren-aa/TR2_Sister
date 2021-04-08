package com.example.consume_restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.consume_restapi.api.ApiClient;
import com.example.consume_restapi.api.ApiInterface;
import com.example.consume_restapi.entities.Kamus;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private ListView listView;

    private ApiClient apiClient;

    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        getAll();
    }

    private void getAll() {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Kamus>> call = apiInterface.getAll();

        call.enqueue(new Callback<List<Kamus>>() {
            @Override
            public void onResponse(Call<List<Kamus>> call, Response<List<Kamus>> response) {
                List<Kamus> kms = response.body();

                String[] kmsName = new String[kms.size()];

                for(int i = 0; i < kms.size(); i++){
                    kmsName[i] = kms.get(i).getIndonesia();
                }

                listView.setAdapter(
                        new ArrayAdapter<String>(
                                getApplicationContext(),
                                android.R.layout.simple_list_item_1,
                                kmsName
                        )
                );
            }

            @Override
            public void onFailure(Call<List<Kamus>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}