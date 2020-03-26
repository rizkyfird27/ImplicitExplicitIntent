package com.example.implicitexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view) {
        String nomor = "087736653446" ;
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel",nomor,null));
        startActivity(panggil);
    }

    public void buka(View view) {
        String url ="https://www.google.com/" ;
        Intent buka = new Intent(Intent.ACTION_VIEW);
        buka.setData(Uri.parse(url));
        startActivity(buka);
    }

    public void about(View view) {
        Intent about = new Intent(MainActivity.this, ActivityAbout.class);
        startActivity(about);
    }
}

