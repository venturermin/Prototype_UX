package com.bumslap.bum.gitpto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView bumText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bumText = findViewById(R.id.bumText);


    }


    public void onClickedBum(View v){
        bumText.setText("gohsangbum");

    }
}
