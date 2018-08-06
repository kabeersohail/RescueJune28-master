package com.example.sohail.rescue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ChangingMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changing_map);
        Toast.makeText(ChangingMap.this,"Modifying map",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(ChangingMap.this,MapsActivity.class));
    }
}
