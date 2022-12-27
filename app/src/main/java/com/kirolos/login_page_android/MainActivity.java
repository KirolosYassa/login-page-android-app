package com.kirolos.login_page_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onChangeBtnClick(View view){
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        String name = edtTxtName.getText().toString();
        TextView txtHello = findViewById(R.id.txtHello);
        txtHello.setText("Hello " + name);
    }
}