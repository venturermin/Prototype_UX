package com.example.bum.tuto3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
                public void webClick(View v){

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://youtube.com"));
                    startActivity(intent);

            }






}
