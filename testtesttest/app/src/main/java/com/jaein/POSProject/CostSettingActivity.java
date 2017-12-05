package com.jaein.POSProject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CostSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost_setting);

        String[] Menu = {
                "피자", "짜장면", "라면", "숯불 김밥"
        };

        Spinner spinnerMenu = (Spinner)findViewById(R.id.spinnerMenu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                Menu);
        spinnerMenu.setAdapter(adapter);
        spinnerMenu.setSelection(0);

    }
}
