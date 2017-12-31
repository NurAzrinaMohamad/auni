package com.example.user.auni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Share extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("Text/Plain");
                String shareBody = "Your Body Here";
                String shareSub = "Your Subject here";
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });
    }


    public void gotoMaps(View view){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void gotoSms(View view){
        Intent intent = new Intent(this,Sms.class);
        startActivity(intent);
    }
}
