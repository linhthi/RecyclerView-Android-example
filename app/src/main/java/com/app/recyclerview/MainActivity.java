package com.app.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.programming_language);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        Log.d("Sao lai vay", s1[1]);
    }
}
