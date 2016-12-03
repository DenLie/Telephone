package com.lugovenkomail.den.insert1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void phone(View view){
        String number = "tel:+89254226820";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(number));
        startActivity(intent);
    }
}
