package com.dicoding.picodiplima.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.ed_Username);
        password = findViewById(R.id.ed_password);
        login = findViewById(R.id.btn_LOGIN);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String getUsername = login.getText().toString();
        String getPassword = password.getText().toString();

        switch (view.getId()) {
            case R.id.btn_LOGIN:
                if (TextUtils.isEmpty(getUsername) | TextUtils.isEmpty(getPassword)) {
                    Toast.makeText(this, "Silahkan Cek Kembali", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                    break;
                }
        }
    }
}
