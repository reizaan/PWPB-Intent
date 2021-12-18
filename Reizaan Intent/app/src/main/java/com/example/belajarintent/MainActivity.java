package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent;
    Button implicitintent;
    Button gd1;
    Button gd2;
    Button ui1;
    Button ui2;
    Button lv;
    Button iu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = findViewById(R.id.explicitintent);
        explicitintent.setOnClickListener(this);
        implicitintent = findViewById(R.id.implicitintent);
        implicitintent.setOnClickListener(this);
        gd1 = (Button) findViewById(R.id.gd1);
        gd1.setOnClickListener(this);
        gd2 = (Button) findViewById(R.id.gd2);
        gd2.setOnClickListener(this);
        ui1 = (Button) findViewById(R.id.ui1);
        ui1.setOnClickListener(this);
        ui2 = (Button) findViewById(R.id.ui2);
        ui2.setOnClickListener(this);
        lv = (Button) findViewById(R.id.lv);
        lv.setOnClickListener(this);
        iu = (Button) findViewById(R.id.iu);
        iu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
                case R.id.explicitintent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
                case R.id.implicitintent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(implicit);
                break;
                case R.id.gd1:
                Intent gd1 = new Intent(MainActivity.this, LatihanGridLayout.class);
                startActivity(gd1);
                break;
                case R.id.gd2:
                Intent gd2 = new Intent(MainActivity.this, SoalGridLayout.class);
                startActivity(gd2);
                break;
                case R.id.ui1:
                Intent ui1 = new Intent(MainActivity.this, UI1Activity.class);
                startActivity(ui1);
                break;
                case R.id.ui2:
                Intent ui2 = new Intent(MainActivity.this, UI2Activity.class);
                startActivity(ui2);
                break;
                case R.id.lv:
                Intent lv = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(lv);
                break;
                case R.id.iu:
                Intent iu = new Intent(MainActivity.this, InputUserActivity.class);
                startActivity(iu);
                break;
        }
    }
}