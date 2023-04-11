package com.androidlearning.other;

import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;

import androidx.annotation.RequiresApi;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

@RequiresApi(api = Build.VERSION_CODES.O)
public class Utils
{
    public static class Patterns
    {
        public static final Pattern nicknamePattern = Pattern.compile("^[a-zA-Z]+?[a-zA-Z\\d]*[_{1}]?[a-zA-Z\\d]*$");
    }

    public static class TextInputEditTextUtils
    {
        public interface OnChangedListener
        {
            void onChanged();
        }

        public static void addEditTextListener(TextInputLayout inputLayout, Pattern textPattern,
                                               String errorMessage, OnChangedListener onChangedListener)
        {
            if(inputLayout.getEditText() == null) return;

            inputLayout.getEditText().addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    inputLayout.setError(inputLayout.getEditText().getText() != null &&
                            inputLayout.getEditText().getText().length() != 0 &&
                            (textPattern == null || textPattern.matcher(inputLayout.getEditText().getText().toString()).matches()) ? "" : errorMessage);

                    onChangedListener.onChanged();
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
        }

        public static void addEditTextListener(TextInputLayout inputLayout, String errorMessage, OnChangedListener onChangedListener)
        {
            addEditTextListener(inputLayout, null, errorMessage, onChangedListener);
        }
    }
}
