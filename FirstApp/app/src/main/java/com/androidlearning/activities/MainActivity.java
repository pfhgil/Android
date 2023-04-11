package com.androidlearning.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import com.androidlearning.R;
import com.androidlearning.other.User;
import com.androidlearning.other.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity
{
    private Button nextButton;

    private TextInputLayout nicknameInputLayout;
    private TextInputLayout passwordInputLayout;

    public static final User currentUser = new User();

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextButton = findViewById(R.id.nextButton);

        nicknameInputLayout = findViewById(R.id.nicknameInputLayout);
        passwordInputLayout = findViewById(R.id.passwordInputLayout);

        // -----------------------------------------------------

        nextButton.setEnabled(false);

        nicknameInputLayout.setError("Неверный формат логина");
        passwordInputLayout.setError("Неверный формат пароляkek");

        Utils.TextInputEditTextUtils.addEditTextListener(nicknameInputLayout, Utils.Patterns.nicknamePattern,
                "Неверный формат логина",
                () -> nextButton.setEnabled(nicknameInputLayout.getError() == null && passwordInputLayout.getError() == null));


        Utils.TextInputEditTextUtils.addEditTextListener(passwordInputLayout, "Неверный формат пароля",
                () -> nextButton.setEnabled(nicknameInputLayout.getError() == null && passwordInputLayout.getError() == null));

        nextButton.setOnClickListener(view -> {
            if(nextButton.isEnabled()) {
                currentUser.setNickname(nicknameInputLayout.getEditText().getText().toString());
                currentUser.setPassword(passwordInputLayout.getEditText().getText().toString());

                Intent intent = new Intent(this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}