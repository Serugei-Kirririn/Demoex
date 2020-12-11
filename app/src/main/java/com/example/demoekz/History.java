package com.example.demoekz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class History extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.history);
    }
    public void onClickMenu(View v) {
        Intent a = new Intent(History.this, Menu.class);
        startActivity(a);
        finish();
    }
}
