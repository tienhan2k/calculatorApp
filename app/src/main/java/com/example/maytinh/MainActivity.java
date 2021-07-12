package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    TextView inputTV;
    TextView resultTV;
    String inp = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }

    private void initTextViews() {
        inputTV = (TextView) findViewById(R.id.inputTV);
        resultTV = (TextView) findViewById(R.id.resultTV);
    }
    private void setInp(String givenValue){
        inp=inp+givenValue;
        inputTV.setText(inp);

    }

    public void bang(View view)
    {
        Double result = null;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

        try {
            result = (Double) engine.eval(inp);
        } catch (ScriptException e)
        {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();
        }

        if(result != null)
            resultTV.setText(String.valueOf(result.doubleValue()));

    }

    public void clear(View view) {
        inputTV.setText("");
        inp="";
        resultTV.setText("");
    }

    public void seven(View view) {
        setInp("7");
    }

    public void eight(View view) {
        setInp("8");
    }

    public void nine(View view) {
        setInp("9");
    }

    public void nhan(View view) {
        setInp("*");
    }

    public void tru(View view) {
        setInp("-");
    }

    public void cong(View view) {
        setInp("+");
    }

    public void chia(View view) {
        setInp("/");
    }

    public void four(View view) {
        setInp("4");
    }

    public void five(View view) {
        setInp("5");
    }

    public void six(View view) {
        setInp("6");
    }

    public void one(View view) {
        setInp("1");
    }

    public void two(View view) {
        setInp("2");
    }

    public void three(View view) {
        setInp("3");
    }


    public void zero(View view) {
        setInp("0");
    }
}