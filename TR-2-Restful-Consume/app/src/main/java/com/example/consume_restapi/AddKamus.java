//package com.example.consume_restapi;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import com.example.consume_restapi.api.ApiClient;
//import com.example.consume_restapi.api.ApiInterface;
//import com.example.consume_restapi.entities.Kamus;
//import com.example.consume_restapi.entities.KamusResponse;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class AddKamus extends AppCompatActivity {
//
//    EditText txtIndonesia, txtInggris, txtJawa;
//    Button btnSend;
//    ApiInterface apiInterface;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add_kamus);
//
//        txtIndonesia = findViewById(R.id.inpTxtIndonesia);
//        txtInggris = findViewById(R.id.inpTxtInggris);
//        txtJawa = findViewById(R.id.inpTxtJawa);
//
//    }
//
//    public Kamus createRequest(){
//        Kamus kamus = new Kamus();
//        kamus.setIndonesia(txtIndonesia.getText().toString());
//        kamus.setInggris(txtInggris.getText().toString());
//        kamus.setJawa(txtJawa.getText().toString());
//
//        return kamus;
//    }
//
//    public void sentKamus(View v){
//        saveKamus(createRequest());
//    }
//
//    public void saveKamus(Kamus kamus) {
////        String indonesia = txtIndonesia.getText().toString().trim();
////        String inggris = txtInggris.getText().toString().trim();
////        String jawa = txtJawa.getText().toString().trim();
//
////        Kamus kamus = new Kamus(asd,asd,asd);
//        Call<Kamus> call = ApiClient.getKamusService().addKamus(kamus);
//        call.enqueue(new Callback<Kamus>() {
//            @Override
//            public void onResponse(Call<Kamus> call, Response<Kamus> response) {
//                if(response.isSuccessful()){
//                    Toast.makeText(AddKamus.this, "Save Berhasil",Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(AddKamus.this, "Save Gagal",Toast.LENGTH_LONG).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Kamus> call, Throwable t) {
//                Toast.makeText(AddKamus.this, "Save Gagal"+ t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
//            }
//        });
//
////        call.enqueue(new Callback<Kamus>() {
////            @Override
////            public void onResponse(Call<Kamus> call, Response<Kamus> response) {
////                String s = response.body().toString();
////                Toast.makeText(AddKamus.this, s, Toast.LENGTH_LONG).show();
////            }
////
////            @Override
////            public void onFailure(Call<Kamus> call, Throwable t) {
////                Toast.makeText(AddKamus.this,t.getMessage(),Toast.LENGTH_LONG).show();
////            }
////        });
//    }
//
//}