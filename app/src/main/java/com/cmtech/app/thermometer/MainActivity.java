package com.cmtech.app.thermometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_feature_1;
    Button btn_feature_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_feature_1 = (Button) findViewById(R.id.btn_feature_1);
        btn_feature_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_feature_1.getText().toString().equals("功能1")) {
                    btn_feature_1.setText("无功能1");
                } else {
                    btn_feature_1.setText("功能1");
                }
            }
        });

        btn_feature_2 = (Button) findViewById(R.id.btn_feature_2);
        btn_feature_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_feature_1.getText().toString().equals("功能2")) {
                    btn_feature_1.setText("无功能2");
                } else {
                    btn_feature_1.setText("功能2");
                }
            }
        });

    }
}
