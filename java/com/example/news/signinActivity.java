package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class signinActivity extends AppCompatActivity {
EditText name;
EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
       name= findViewById(R.id.username);
       pass =findViewById(R.id.pass);

    }

    public void goToBookList(View view) {
        Intent i =new Intent(signinActivity.this,bookActivity.class);
        startActivity(i);
    }
}
