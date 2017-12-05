package com.bumslap.bum.gitpto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import android.widget.TextView;

public class MainActivity extends Activity {
    TextView bumText;


public class MainActivity extends Activity {
    TextView oyountxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button oyounBtn = (Button)findViewById(R.id.oyounbtn);
        oyountxt = (TextView)findViewById(R.id.oyoun);

        oyounBtn.setOnClickListener(clickoyoun);

        bumText = findViewById(R.id.bumText);


    }

    public void onClickedBum(View v){
        bumText.setText("gohsangbum");

    }

    Button.OnClickListener clickoyoun = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            oyountxt.setText("oyoun ");
        }
    };
}
