package com.blogspot.yourfavoritekaisar.luascounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegiPanjangActivity extends AppCompatActivity {

    EditText editPanjang;
    EditText editLebar;
    TextView txtHasil;
    Button btnHitung;
    Integer hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        editPanjang = findViewById(R.id.edtPanjang);
        editLebar = findViewById(R.id.edtLebar);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer panjang = Integer.valueOf(editPanjang.getText().toString());

                Integer lebar = Integer.valueOf(editLebar.getText().toString());

                hitungLuasPersegiPanjang(panjang, lebar);


            }



        });
    }

    private void hitungLuasPersegiPanjang(Integer lebar, Integer panjang) {
        hasil = panjang * lebar;

        txtHasil.setText(String.valueOf(hasil));

    }
}
