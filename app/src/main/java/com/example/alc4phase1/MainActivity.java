package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mAboutButton;
    Button mMyProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find button1
        mAboutButton = findViewById(R.id.button);

        //set onclicklistener on button1
        mAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intent
                Intent aboutIntent = new Intent(MainActivity.this, about_alc.class);
                aboutIntent.putExtra(about_alc.WEBSITE_ADDRESS, "https://andela.com/alc/");
                //start intent
                startActivity(aboutIntent);
            }
        });

        //find button2
        mMyProfileButton = findViewById(R.id.button1);

        //set onlcicklistener on button2
        mMyProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intent
                Intent button2Intent = new Intent(MainActivity.this, my_profile.class);
                //start intent
                startActivity(button2Intent);
            }
        });
    }
}
