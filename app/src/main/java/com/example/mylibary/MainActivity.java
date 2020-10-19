package com.example.mylibary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks,btnCurrentReading,btnAllreadyRead,btnWantToRead,btnFavorit,btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AllBooksActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        btnAllBooks = findViewById(R.id.btnAllBooks);
        btnAbout = findViewById(R.id.btnAbout);
        btnAllreadyRead = findViewById(R.id.btnAllreadyRead);
        btnCurrentReading = findViewById(R.id.btnCurrentReading);
        btnFavorit = findViewById(R.id.btnFavorit);
        btnWantToRead = findViewById(R.id.btnWantToRead);
    }
}