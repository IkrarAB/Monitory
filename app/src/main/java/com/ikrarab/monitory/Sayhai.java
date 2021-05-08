/**
 * Tanggal Pengerjaan   : 08 Mei 2021
 * Deskripsi Pengerjaan : Tampilan Sayhai
 * NIM                  : 10118033
 * Nama                 : Ikrar Anugrah Bastary
 * Kelas                : IF-01/S1/VI
 */

package com.ikrarab.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sayhai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayhai);

        TextView txtNama = (TextView) findViewById(R.id.valnama1);
        TextView txtNama2 = (TextView) findViewById(R.id.valnama2);
        Intent intent = getIntent();

        String nama = intent.getStringExtra(Biodata.MSG);

        txtNama.setText(nama);
        txtNama2.setText(nama);
    }
}