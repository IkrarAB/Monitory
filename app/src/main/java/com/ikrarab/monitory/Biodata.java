/**
 * Tanggal Pengerjaan   : 08 Mei 2021
 * Deskripsi Pengerjaan : Tampilan Biodata
 * NIM                  : 10118033
 * Nama                 : Ikrar Anugrah Bastary
 * Kelas                : IF-01/S1/VI
 */

package com.ikrarab.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Biodata extends AppCompatActivity {

    public static final String MSG = "com.ikrarab.monitory.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void kirimNama(View view){
        EditText edtNama = (EditText) findViewById(R.id.editnama);
        String nama = edtNama.getText().toString();
        Intent intent = new Intent(this, Sayhai.class);
        intent.putExtra(MSG,nama);
        startActivity(intent);
    }

}