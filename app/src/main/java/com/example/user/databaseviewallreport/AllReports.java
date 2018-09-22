package com.example.user.databaseviewallreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AllReports extends AppCompatActivity {
    private UserModel2 userModel2;
    private EditText  etjenisaduan, etnama, etalamat, ettelefon, etemel, ettarikh , etaduan;
    private Button btnupdate, btndelete;
    private DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_reports);
        Intent intent = getIntent();

        userModel2 = (UserModel2) intent.getSerializableExtra("user");
        databaseHelper = new DatabaseHelper(this);

        etjenisaduan = (EditText) findViewById(R.id.etJenisAduan);
        etnama = (EditText) findViewById(R.id.etNama);
        etalamat = (EditText) findViewById(R.id.etAlamat);
        ettelefon = (EditText) findViewById(R.id.etTelefon);
        etemel = (EditText) findViewById(R.id.etEmel);
        ettarikh = (EditText) findViewById(R.id.etTarikh);
        etaduan = (EditText) findViewById(R.id.etAduan);
        btndelete = (Button) findViewById(R.id.btndelete);
        btnupdate = (Button) findViewById(R.id.btnupdate);


    }
}
