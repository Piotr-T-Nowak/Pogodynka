package com.pepenowak.pogodynka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SetupActivity extends AppCompatActivity {

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        startButton = (Button) findViewById(R.id.start_button);
        startButton.setOnClickListener(onStartClickListener);
    }

    View.OnClickListener onStartClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("SetupActivity", "kliknieto przycisk");

        }
    };
}
