package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView main_one, main_two, main_three, main_four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        main_one = findViewById(R.id.main_one);
        
        main_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "GO", Toast.LENGTH_SHORT).show();
                
                Intent intent = new Intent(MainActivity.this, View_one.class);
                startActivity(intent);
            }
        });
    }
}
