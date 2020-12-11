package com.example.demoekz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu);
    }
    public void onClickSettings(View v) {
        Intent a = new Intent(Menu.this, Settings.class);
        startActivity(a);
        finish();
    }
    public void onClickHistory(View v) {
        Intent a = new Intent(Menu.this, History.class);
        startActivity(a);
        finish();
    }
}
