package com.blogspot.yourfavoritekaisar.luascounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LuasPesergiActivity extends AppCompatActivity {

    // TODO 1 Luas Pesergi mebuat variable global
    EditText edtSisi;
    TextView txtHasil;
    Button btnHitung;
    Integer hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_pesergi);

        // TODO 2 Menginisiasikan Object widget
        edtSisi = findViewById(R.id.edtSisi);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        // TODO 3 Membuat Method OnClick Untuk Mendeteksi Click Dari User
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO 4 Memasukkan input editText dari user
                String isiSisi = edtSisi.getText().toString();

                // TODO 9 Mencetak apakah sisi di EditText ada isinya?
                if (!TextUtils.isEmpty(isiSisi)) {
                    Integer sisi = Integer.valueOf(isiSisi);
                    // TODO 5 Memanggil Func
                    hitungLuasPersegi(sisi);
                } else {
                    // TODO
                    Toast.makeText(LuasPesergiActivity.this, "ISI DOMPALA!", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }


    // TODO 6 Membuat method hitungluaspersegi
    private void hitungLuasPersegi(Integer sisi) {
    // TODO 7 menghitung luas persegi
     hasil = sisi * sisi;

     // TODO 8 Mencetak hasil
        txtHasil.setText(String.valueOf(hasil));
    }
}
