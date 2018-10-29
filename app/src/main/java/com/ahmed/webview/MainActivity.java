package com.ahmed.webview;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button googleBtn;
    GoogleFargment googleFargment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        googleBtn = findViewById(R.id.btn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                googleFargment = new GoogleFargment();
                FragmentManager manger = getSupportFragmentManager();
                FragmentTransaction transaction = manger.beginTransaction();
                transaction.add(R.id.linear,googleFargment);
                transaction.commit();

            }
        });


    }
}
