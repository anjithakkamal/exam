package com.example.sjcet.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText imageView studentimage,editText studentname,editText FatherName,editText mothername,editText gender,editText dob,editText email,editText level,editText deaprtment,editText phone;
    Button buttonregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonregister=(editText)findViewById(R.id.button);
        imageView studentimage=(editText)findViewById(R.id.textView10);
        editText Fathername=(editText)findViewById(R.id.editText3);
        editText mothername=(editText)findViewById(R.id.editText);
        editText gender=(editText)findViewById(R.id.editText2);
        editText dob=(editText)findViewById(R.id.editText2);
        editText email=(editText)findViewById(R.id.editText2);
        editText level=(editText)findViewById(R.id.editText2);
        editText department=(editText)findViewById(R.id.editText2);
        editText phone=(editText)findViewById(R.id.editText11);
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        setContentView(R.layout.activity_main2);
        editText studentimage=(editText)setContentView(R.id.imageView);
        editText fathername=(editText)setContentView(R.id.edit);



    }
}

