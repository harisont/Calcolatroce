package com.example.harisont.calcolatroce;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Console;

public class Calcolatroce extends AppCompatActivity implements View.OnClickListener {
    String display = "";
    double operand1, operand2, result;
    String currentOp;

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
        TextView tw = findViewById(R.id.textView);

        switch (v.getId()) {

            case R.id.buttonsign:
                double parsed_display = Double.parseDouble(display);
                parsed_display = - parsed_display;
                display = ""+parsed_display;
                tw.setText(display);
                break;
            case R.id.buttonac:
                display = "";
                tw.setText("0");
                break;
            case R.id.buttonc:
                if (display.length() > 1) display = display.substring(0, display.length()-1);
                else if (display.length() == 1) display = "0";
                tw.setText(display);
                break;
            case R.id.buttonby:
                setOp("*");
                break;
            case R.id.buttondiv:
                setOp("/");
                break;
            case R.id.buttondot:
                writeNumber(".");
                break;
            case R.id.buttonequals:
                operand2 = Double.parseDouble(display);
                if (currentOp == "*") result = operand1 * operand2;
                else if (currentOp == "+") result = operand1 + operand2;
                else if (currentOp == "/") result = operand1 / operand2;
                else if (currentOp == "-") result = operand1 - operand2;
                tw.setText(result+"");
                break;
            case R.id.buttonminus:
                setOp("-");
                break;
            case R.id.buttonoff:
                finish();
                break;
            case R.id.buttonplus:
                setOp("+");
                break;
            case R.id.button0:
                writeNumber("0");
                break;
            case R.id.button1:
                writeNumber("1");
                break;
            case R.id.button2:
                writeNumber("2");
                break;
            case R.id.button3:
                writeNumber("3");
                break;
            case R.id.button4:
                writeNumber("4");
                break;
            case R.id.button5:
                writeNumber("5");
                break;
            case R.id.button6:
                writeNumber("6");
                break;
            case R.id.button7:
                writeNumber("7");
                break;
            case R.id.button8:
                writeNumber("8");
                break;
            case R.id.button9:
                writeNumber("9");
                break;
            default:
                break;
        }
    }

    private void writeNumber(String d) {
        display += d;
        TextView tw = findViewById(R.id.textView);
        tw.setText(display);
    }

    private void setOp(String op) {
        operand1 = Double.parseDouble(display);
        currentOp = op;
        display = "";
        TextView tw = findViewById(R.id.textView);
        tw.setText(display);
    }

}
