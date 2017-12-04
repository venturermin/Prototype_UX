package com.bumslap.bum.gitpto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button button;
    TextView textView;
    TextView bumText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.jaein);
        textView = findViewById(R.id.textViewjaein);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("jaein");
            }
        });

        bumText = findViewById(R.id.bumText);


    }


    public void onClickedBum(View v){
        bumText.setText("gohsangbum");


    }
}
