package com.example.singlechoicedialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button showButton;
    String[] data = {"a", "b", "c", "d"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = findViewById(R.id.showButton);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                singleChoice alertDialog = new singleChoice(MainActivity.this, data);

                alertDialog.show(getSupportFragmentManager(), "single choice dialog");

                alertDialog.setCancelable(false);
            }
        });


    }
}
