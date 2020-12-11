package com.example.demoekz;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
    }

    public void onClickSignUp(View v) {
        Intent i = new Intent(SignIn.this, SignUp.class);
        startActivity(i);
        finish();
    }

    public void onClickVhod(View v) {
        EditText log = (EditText)findViewById(R.id.logsignin);
        EditText pas = (EditText)findViewById(R.id.passsignin);


        if(log.getText().toString().equals("serk") && pas.getText().toString().equals("123")){
            Intent o = new Intent(SignIn.this, StartScreen.class);
            startActivity(o);
            finish();

        }
        else
        {
            Toast.makeText(this, "Неправильно введен пароль или логин", Toast.LENGTH_SHORT).show();
        }
    }
}
