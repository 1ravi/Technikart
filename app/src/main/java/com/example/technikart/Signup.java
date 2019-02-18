package com.example.technikart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by ravi sastry on 3/23/2017.
 */
public class Signup extends AppCompatActivity {
    EditText firstname,lastname,email,newpassword,confirmpassword,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        firstname=(EditText)findViewById(R.id.firstname);
        lastname=(EditText)findViewById(R.id.lastname);
        email=(EditText)findViewById(R.id.email);
        newpassword=(EditText)findViewById(R.id.newpassword);
        confirmpassword=(EditText)findViewById(R.id.confirmpassword);
        phone=(EditText)findViewById(R.id.phone);
    }
}
