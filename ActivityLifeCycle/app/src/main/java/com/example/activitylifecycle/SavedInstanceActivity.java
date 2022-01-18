package com.example.activitylifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SavedInstanceActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        private EditText etFirstNumber;
        private EditText etSecondNumber;
        private TextView tvResult;
        private Button btnTinhTong;

        private int firstNumber;
        private int secondNumber;
        private int result;
    


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstNumber = (EditText)findViewById(R.id.editTextNumber1);
        etSecondNumber = (EditText)findViewById(R.id.editTextNumber2);
        tvResult = (TextView)findViewById(R.id.editTextNumber3);

        btnTinhTong.setOnClickListener(this);
    }

    @Override
            public void onClick(View view)
    {
        if (view == btnTinhTong)
        {
            if (etFirstNumber.getText().toString().isEmpty() || etSecondNumber.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Nhap lai", Toast.LENGTH_SHORT).show();
            }
            else
            {
                firstNumber = Integer.parseInt(etFirstNumber.getText().toString());
                secondNumber = Integer.parseInt(etSecondNumber.getText().toString());

                result = firstNumber + secondNumber;

                tvResult.setText(String.valueOf(result));
            }
        }
    }

    }


