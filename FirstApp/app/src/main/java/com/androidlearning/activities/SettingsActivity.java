package com.androidlearning.activities;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.androidlearning.R;
import com.androidlearning.other.Utils;
import com.google.android.material.textfield.TextInputLayout;

public class SettingsActivity extends AppCompatActivity
{
    private TextInputLayout nicknameInputLayout;
    private TextInputLayout passwordInputLayout;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        setTitle("Settings");

        nicknameInputLayout = findViewById(R.id.settings_nicknameInputLayout);
        passwordInputLayout = findViewById(R.id.settings_passwordInputLayout);

        Utils.TextInputEditTextUtils.addEditTextListener(nicknameInputLayout, Utils.Patterns.nicknamePattern,
                "Неверный формат логина",
                () -> MainActivity.currentUser.setNickname(nicknameInputLayout.getEditText().getText().toString()));


        Utils.TextInputEditTextUtils.addEditTextListener(passwordInputLayout, "Неверный формат пароля",
                () -> MainActivity.currentUser.setPassword(passwordInputLayout.getEditText().getText().toString()));
    }

    @Override
    public void onStart()
    {
        super.onStart();

        nicknameInputLayout.getEditText().setText(MainActivity.currentUser.getNickname());
        passwordInputLayout.getEditText().setText(MainActivity.currentUser.getPassword());
    }
}
