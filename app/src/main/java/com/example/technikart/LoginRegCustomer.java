package com.example.technikart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by ravi sastry on 3/22/2017.
 */
public class LoginRegCustomer extends AppCompatActivity {
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginregcust);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
    }
    public void login(View v){
    }
    public void signup(View v){
        Intent i= new Intent(this,Signup.class);
        startActivity(i);
    }
}
