package com.androidlearning.practice_9;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.itemsRecyclerView);

        final ArrayList<Group> groups = new ArrayList<>();
        groups.add(new Group(this, "П50-1-20", R.drawable.chmonya_2));
        groups.add(new Group(this, "П50-2-20", R.drawable.chmonya_1));
        groups.add(new Group(this, "П50-3-20", R.drawable.chmonya_3));
        groups.add(new Group(this, "П50-4-20", R.drawable.chmonya_4));
        groups.add(new Group(this, "П50-5-20", R.drawable.chmonya_5));
        groups.add(new Group(this, "П50-6-20", R.drawable.chmonya_6));
        groups.add(new Group(this, "П50-7-20", R.drawable.chmonya_7));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerViewAdapter(this, groups));
    }
}
