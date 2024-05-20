package com.ngkn.loginscreen;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class CalculateMainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1, num2;
    TextView result;
    Button add, sub, mol, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate_activity_main);

        init();
    }

    public void init() {
        num1 = (EditText) findViewById(R.id.textNum1);
        num2 = (EditText) findViewById(R.id.textNum2);
        result = (TextView) findViewById(R.id.textResult);

        add = (Button) findViewById(R.id.btnAdd);
        add.setOnClickListener(this);

        sub = (Button) findViewById(R.id.btnSub);
        sub.setOnClickListener(this);

        mol = (Button) findViewById(R.id.btnMol);
        mol.setOnClickListener(this);

        div = (Button) findViewById(R.id.btnDiv);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btnAdd) {
            handleAdd();
        } else if (id == R.id.btnSub) {
            handleSub();
        } else if (id == R.id.btnMol) {
            handleMol();
        } else if (id == R.id.btnDiv) {
            handleDiv();
        }
    }

    private void handleAdd() {
        if (num1.getText().toString().trim().length() <= 0) {
            Toast.makeText(CalculateMainActivity.this, "Please input number 1", Toast.LENGTH_SHORT).show();
        } else if (num2.getText().toString().trim().length() <= 0) {
            Toast.makeText(CalculateMainActivity.this, "Please input number 2", Toast.LENGTH_SHORT).show();
        } else {
            int s1 = Integer.parseInt(num1.getText().toString());
            int s2 = Integer.parseInt(num2.getText().toString());
            int total = s1 + s2;
            result.setText(String.valueOf(total));
        }
    }

    private void handleSub() {
        if (num1.getText().toString().trim().length() <= 0) {
            Toast.makeText(CalculateMainActivity.this, "Please input number 1", Toast.LENGTH_SHORT).show();
        } else if (num2.getText().toString().trim().length() <= 0) {
            Toast.makeText(CalculateMainActivity.this, "Please input number 2", Toast.LENGTH_SHORT).show();
        } else {
            int s1 = Integer.parseInt(num1.getText().toString());
            int s2 = Integer.parseInt(num2.getText().toString());
            int total = s1 - s2;
            result.setText(String.valueOf(total));
        }
    }

    private void handleMol() {
        if (num1.getText().toString().trim().length() <= 0) {
            Toast.makeText(CalculateMainActivity.this, "Please input number 1", Toast.LENGTH_SHORT).show();
        } else if (num2.getText().toString().trim().length() <= 0) {
            Toast.makeText(CalculateMainActivity.this, "Please input number 2", Toast.LENGTH_SHORT).show();
        } else {
            int s1 = Integer.parseInt(num1.getText().toString());
            int s2 = Integer.parseInt(num2.getText().toString());
            int total = s1* s2;
            result.setText(String.valueOf(total));
        }
    }

    private void handleDiv() {
        if (num1.getText().toString().trim().length() <= 0) {
            Toast.makeText(CalculateMainActivity.this, "Please input number 1", Toast.LENGTH_SHORT).show();
        } else if (num2.getText().toString().trim().length() <= 0) {
            Toast.makeText(CalculateMainActivity.this, "Please input number 2", Toast.LENGTH_SHORT).show();
        } else {
            int s1 = Integer.parseInt(num1.getText().toString());
            int s2 = Integer.parseInt(num2.getText().toString());
            if (s2 == 0){
                Toast.makeText(CalculateMainActivity.this, "Number 2 must be different from 0", Toast.LENGTH_SHORT).show();
            }else {
                double total = (double) s1 /s2;
                DecimalFormat df = new DecimalFormat("#.###");
                String formattedTotal = df.format(total);

                result.setText(formattedTotal);
            }

        }
    }
}

