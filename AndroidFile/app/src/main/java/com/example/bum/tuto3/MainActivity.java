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


<<<<<<< HEAD

            public void webClick(View v){
=======
    }
                public void webClick(View v){

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://youtube.com"));
                    startActivity(intent);

            }


>>>>>>> 9408ba3e8233ae567f0f7ff1d552eeac1e94e33c

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://youtube.com"));
                startActivity(intent);

        }

<<<<<<< HEAD
=======

>>>>>>> 9408ba3e8233ae567f0f7ff1d552eeac1e94e33c
}
