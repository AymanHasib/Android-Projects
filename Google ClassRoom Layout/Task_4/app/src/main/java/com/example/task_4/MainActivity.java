package com.example.task_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] teamNames;
    private String[] leaderNames;
    private int[] images = {R.drawable.android, R.drawable.web, R.drawable.graphics,
                            R.drawable.data, R.drawable.img_code, R.drawable.img_backtoschool,
                            R.drawable.img_breakfast, R.drawable.img_learnlanguage,
                            R.drawable.img_reachout, R.drawable.img_graduation};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkup();
        customListViewConnect();
    }

    private void linkup(){
        listView = findViewById(R.id.listViewId);

        teamNames = getResources().getStringArray(R.array.team_name);
        leaderNames = getResources().getStringArray(R.array.leader_name);
        return;
    }

    private void customListViewConnect(){
        CustomAdapter adapter = new CustomAdapter(this, teamNames, leaderNames, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String teamNameValue = teamNames[position];
                Toast.makeText(MainActivity.this, teamNameValue+" Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return;
    }
}