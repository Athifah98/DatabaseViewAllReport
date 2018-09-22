package com.example.user.databaseviewallreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private Button btnStore, btnGetall;
    private EditText etjenisaduan, etnama, etalamat, ettelefon, etemel, ettarikh, etaduan;
    private DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseHelper = new DatabaseHelper(this);

        btnStore = (Button) findViewById(R.id.btnHantar);
        btnGetall = (Button) findViewById(R.id.btnKamera);
        etjenisaduan = (EditText) findViewById(R.id.etJenisAduan);
        etnama = (EditText) findViewById(R.id.etNama);
        etalamat = (EditText) findViewById(R.id.etAlamat);
        ettelefon = (EditText) findViewById(R.id.etTelefon);
        etemel = (EditText) findViewById(R.id.etEmel);
        ettarikh = (EditText) findViewById(R.id.etTarikh);
        etaduan = (EditText) findViewById(R.id.etAduan);


        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { databaseHelper.addUserDetail(etjenisaduan.getText().toString(), etnama.getText().toString(), etalamat.getText().toString(), ettelefon.getText().toString(), etemel.getText().toString(), ettarikh.getText().toString(), etaduan.getText().toString());
                etjenisaduan.setText("");
                etnama.setText("");
                etalamat.setText("");
                ettelefon.setText("");
                etemel.setText("");
                ettarikh.setText("");
                etaduan.setText("");

                Toast.makeText(MainActivity.this, "Stored Successfully!", Toast.LENGTH_SHORT).show();
            }
        });
        btnGetall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CameraActivity.class);
                startActivity(intent);
            }
        });
    }}
