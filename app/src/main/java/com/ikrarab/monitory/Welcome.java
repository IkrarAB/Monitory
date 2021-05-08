/**
 * Tanggal Pengerjaan   : 08 Mei 2021
 * Deskripsi Pengerjaan : Tampilan Welcome
 * NIM                  : 10118033
 * Nama                 : Ikrar Anugrah Bastary
 * Kelas                : IF-01/S1/VI
 */

package com.ikrarab.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahKeLogin(View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
        finish();
    }

}