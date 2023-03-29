package com.example.kintsugi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        ImageView imageView;

            // initialize imageView
            // with method findViewById()
            imageView = findViewById(R.id.imageView4);

            // Apply OnClickListener  to imageView to
            // switch from one activity to another
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Intent class will help to go to next activity using
                    // it's object named intent.
                    // SecondActivty is the name of new created EmptyActivity.
                    Toast.makeText(home.this, "Clicked", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), events.class);
                    startActivity(intent);
                }
            });
        }


    }
