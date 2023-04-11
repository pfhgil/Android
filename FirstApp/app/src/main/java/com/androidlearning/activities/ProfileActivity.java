package com.androidlearning.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.androidlearning.R;

public class ProfileActivity extends AppCompatActivity
{
    private TextView userNicknameTextView;
    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        setTitle("Profile");

        userNicknameTextView = findViewById(R.id.nicknameTextView);
        settingsButton = findViewById(R.id.settingsButton);

        settingsButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public void onStart()
    {
        super.onStart();

        userNicknameTextView.setText(MainActivity.currentUser.getNickname());
    }
}
