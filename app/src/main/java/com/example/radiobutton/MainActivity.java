package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup g;
    RadioButton b;
    Button k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g=findViewById(R.id.gbb);
        k=findViewById(R.id.button);

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = g.getCheckedRadioButtonId();
                b = findViewById(id);

                String gender = b.getText().toString();
    Intent obj = new Intent(MainActivity.this,second.class);
            obj.putExtra("k",gender);
            startActivity(obj);

            }
        });
    }
}
