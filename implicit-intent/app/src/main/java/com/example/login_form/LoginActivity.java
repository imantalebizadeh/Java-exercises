package com.example.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView usernameInput = findViewById(R.id.usernameInput);
        TextView passwordInput = findViewById(R.id.passwordInput);
        Button loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                if (username.length() == 0 || password.length() == 0) {
                    Toast.makeText(LoginActivity.this, "لطفا نام کاربری و رمز عبور خود را وارد کنید", Toast.LENGTH_SHORT).show();
                } else {
                    if (username.equals("ایمان") && password.equals("12345")) {
                        Toast.makeText(LoginActivity.this, "با موفقیت وارد شدید", Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        intent.putExtra("username", username);

                        startActivity(intent);
                    } else {
                        Toast.makeText(LoginActivity.this, "نام کاربری یا رمز عبور صحبح نمی باشد", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}