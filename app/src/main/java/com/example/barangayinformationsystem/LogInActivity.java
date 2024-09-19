package com.example.barangayinformationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    TextView forgotPasswordTextView;
    TextView signUpTextView;
    ImageButton backImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        initializeComponents();
        addUnderlineToForgotPasswordTextView();
    }

    public void goToRegisterActivity(View view) {
        Intent intent = new Intent(LogInActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }

    private void addUnderlineToForgotPasswordTextView() {

        forgotPasswordTextView.setPaintFlags(forgotPasswordTextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        signUpTextView.setPaintFlags(signUpTextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

    }

    private void initializeComponents() {

        forgotPasswordTextView = findViewById(R.id.forgotPasswordTextView);
        signUpTextView = findViewById(R.id.signUpTextView);
        backImageButton = findViewById(R.id.backImageButton);

    }
}