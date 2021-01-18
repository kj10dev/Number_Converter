package com.example.numberconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Convert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);

        Button convert = findViewById(R.id.btnConvert);             //This creates a button linked to the xml resource
        convert.setOnClickListener(new View.OnClickListener() {     //and when the user clicks it, the onclick starts to conversion
            @Override
            public void onClick(View v) {
                EditText decNum = findViewById(R.id.edtAmount);
                TextView finalNum = findViewById(R.id.tvFinal);

                int convNum = Integer.parseInt(decNum.getText().toString());
                String result;
                result = decTobinary(convNum);
                finalNum.setText(result);
            }
        });

        Button reset = findViewById(R.id.btnRest);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText decNum = findViewById(R.id.edtAmount);
                TextView finalNum = findViewById(R.id.tvFinal);

                decNum.setText("");
                finalNum.setText("");
            }
        });

    }
        public String decTobinary(int num){
                int dummy;
                String sConverted = "";

                dummy = num;
                do {
                    if(dummy%2 == 0){
                        sConverted = sConverted + "0";
                        dummy = dummy/2;
                    }
                    else{
                        sConverted = sConverted + "1";
                        dummy = dummy/2;
                    }
                }while(dummy != 0);

                return reverseString(sConverted);
        }

    String reverseString(String s){
        String revS = "";

        for (int i = 0; i < s.length(); i++)
        {
            revS += s.charAt(s.length() - i - 1);
        }

        return revS;
    }
}