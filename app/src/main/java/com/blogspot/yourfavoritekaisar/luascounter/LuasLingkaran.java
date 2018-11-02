package com.blogspot.yourfavoritekaisar.luascounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasLingkaran extends AppCompatActivity {

    EditText edtJari;
    TextView txtHasil;
    Button btnHitung;
    Integer hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);


    }
}
