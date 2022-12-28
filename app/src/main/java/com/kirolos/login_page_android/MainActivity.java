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

    public void onRegisterBtnClick(View view){
        EditText edtTxtFname = findViewById(R.id.edtTxtFname);
        EditText edtTxtLname = findViewById(R.id.edtTxtLname);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);
        String Fname = edtTxtFname.getText().toString();
        String Lname = edtTxtLname.getText().toString();
        String Email = edtTxtEmail.getText().toString();

        TextView txtFname = findViewById(R.id.txtFname);
        txtFname.setText("First Name:  " + Fname);

        TextView txtLname = findViewById(R.id.txtLname);
        txtLname.setText("Last Name:  " + Lname);

        TextView txtEmail = findViewById(R.id.txtEmail);
        txtEmail.setText("Email:  " + Email);
    }
}