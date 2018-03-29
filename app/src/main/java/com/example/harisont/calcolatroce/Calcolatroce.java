package com.example.harisont.calcolatroce;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Console;

public class Calcolatroce extends AppCompatActivity implements View.OnClickListener {
    String display = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcolatroce);

        Button ac = (Button) findViewById(R.id.buttonac);
        ac.setOnClickListener(this);
        Button c = (Button) findViewById(R.id.buttonc);
        c.setOnClickListener(this);
        Button by = (Button) findViewById(R.id.buttonby);
        by.setOnClickListener(this);
        Button div = (Button) findViewById(R.id.buttondiv);
        div.setOnClickListener(this);
        Button dot = (Button) findViewById(R.id.buttondot);
        dot.setOnClickListener(this);
        Button eq = (Button) findViewById(R.id.buttonequals);
        eq.setOnClickListener(this);
        Button min = (Button) findViewById(R.id.buttonminus);
        min.setOnClickListener(this);
        Button off = (Button) findViewById(R.id.buttonoff);
        off.setOnClickListener(this);
        Button plus = (Button) findViewById(R.id.buttonplus);
        plus.setOnClickListener(this);
        Button s = (Button) findViewById(R.id.buttonsign);
        s.setOnClickListener(this);
        Button numberedButtons[] = new Button[10];
        for (int i = 0; i <= 9; i++) {
            int id = getResources().getIdentifier("button" + i, "id", getPackageName());
            numberedButtons[i] = (Button) findViewById(id);
            numberedButtons[i].setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        boolean isClicked = true;
        if(isClicked) {
            v.setBackgroundColor(Color.parseColor("#212121"));
        }

        switch (v.getId()) {

            case R.id.buttonac:
                // do your code
                break;
            case R.id.buttonc:
                // do your code
                break;
            case R.id.buttonby:
                // do your code
                break;
            case R.id.buttondiv:
                // do your code
                break;
            case R.id.buttondot:
                // do your code
                break;
            case R.id.buttonequals:
                // do your code
                break;
            case R.id.buttonminus:
                // do your code
                break;
            case R.id.buttonoff:
                // do your code
                break;
            case R.id.buttonplus:
                // do your code
                break;
            case R.id.button0:
                display("0");
                break;
            case R.id.button1:
                display("1");
                break;
            case R.id.button2:
                display("2");
                break;
            case R.id.button3:
                display("3");
                break;
            case R.id.button4:
                display("4");
                break;
            case R.id.button5:
                display("5");
                break;
            case R.id.button6:
                display("6");
                break;
            case R.id.button7:
                display("7");
                break;
            case R.id.button8:
                display("8");
                break;
            case R.id.button9:
                display("9");
                break;
            default:
                break;
        }
    }

    private void display(String d) {
        display += d;
        TextView tw = findViewById(R.id.textView);
        tw.setText(display);
    }

}
