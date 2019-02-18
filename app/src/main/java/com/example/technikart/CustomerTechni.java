package com.example.technikart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ravi sastry on 3/22/2017.
 */
public class CustomerTechni extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customertechni);
    }
public  void customer(View v){
    Intent i=new Intent(this,LoginRegCustomer.class);
    startActivity(i);
}
    public void technitian(View v){
        Intent i=new Intent(this,TechnitianReg.class);
        startActivity(i);
    }
}
