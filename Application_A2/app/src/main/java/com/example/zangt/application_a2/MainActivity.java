package com.example.zangt.application_a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textView);
        final EditText editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Code here executes on main thread after user presses button
                passwordCheck pv = new passwordCheck();
                if (pv. lengthCheck(editText.getText().toString()) != 0) {
                    textView.setText("Password should at least 8 digits");
                }
                else if (pv.equalCheck(editText.getText().toString()) !=1) {
                    textView.setText("Your can not set password as password!!");
                }
                else if (pv.digitsCheck(editText.getText().toString()) != 30) {
                    textView.setText("Password level - Low");
                }
                else if (pv.ifLower(editText.getText().toString()) != 60) {
                    textView.setText("Password level - Medium");
                }
                else if (pv.ifUpper(editText.getText().toString()) != 90) {
                    textView.setText("Password level - High");
                }
            }
        });
    }
}