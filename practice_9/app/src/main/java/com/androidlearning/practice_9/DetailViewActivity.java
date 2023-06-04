package com.androidlearning.practice_9;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailViewActivity extends AppCompatActivity
{
    public static String info = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view_activity);

        TextView infoTextView = findViewById(R.id.infoTextView);
        infoTextView.setText(info);
    }
}
