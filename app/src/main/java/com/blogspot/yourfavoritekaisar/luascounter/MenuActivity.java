package com.blogspot.yourfavoritekaisar.luascounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    //TODO 1 luas pesegi membuat method luasPesergi
    public void luasPersegi(View view){
        //TODO 2 Luas pesergi membuat object Intent
        Intent pindah = new Intent(MenuActivity.this, LuasPesergiActivity.class);

        // TODO 3 Menjalankan startactivity
        startActivity(pindah);

    }

    public void luasPersegiPanjang(View view) {
        Intent pindah = new Intent(MenuActivity.this, LuasPersegiPanjangActivity.class);

        // TODO 3 Menjalankan startactivity
        startActivity(pindah);
    }
}
