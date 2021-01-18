package com.example.numberconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickConverter (View view){
        Intent converterIntent = new Intent(this, Convert.class);
        startActivity(converterIntent);
    }

    public void onClickContact (View view){
        Intent contactIntent = new Intent(this, Contact.class);
        startActivity(contactIntent);
    }
}