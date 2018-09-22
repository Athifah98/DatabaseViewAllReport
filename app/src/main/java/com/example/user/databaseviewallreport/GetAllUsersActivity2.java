package com.example.user.databaseviewallreport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class GetAllUsersActivity2 extends AppCompatActivity {
    private ListView listView;
    private ArrayList<UserModel2> userModelArrayList2;
    private CustomAdapter2 customAdapter2;
    private DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_all_users2);
        listView = (ListView) findViewById(R.id.lv2);
        databaseHelper = new DatabaseHelper(this);
        userModelArrayList2 = databaseHelper.getAllUsers2();
        customAdapter2 = new CustomAdapter2(this,userModelArrayList2);
        listView.setAdapter(customAdapter2);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(GetAllUsersActivity2.this, AllReports.class);
                intent.putExtra("user", userModelArrayList2.get(position));
                startActivity(intent);
            }
        });
    }
}


