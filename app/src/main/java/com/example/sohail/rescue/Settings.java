package com.example.sohail.rescue;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.model.Marker;

public class Settings extends AppCompatActivity {
    Context context;

    public Settings(Context context) {
        this.context = context;
    }

    public Settings() {

    }

    ImageView darkmap,navybluemap,normal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        darkmap = findViewById(R.id.darkmap);
        navybluemap = findViewById(R.id.navyblue);
        normal = findViewById(R.id.normal);

        darkmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Marker marker = MapsActivity.isPresent.get("isPresent");
                if(marker != null){
                    marker.remove();
                }
                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("MapStyle","dark").apply();
                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                Toast.makeText(Settings.this,"Restart app",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        navybluemap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Marker marker = MapsActivity.isPresent.get("isPresent");
                if(marker != null){
                    marker.remove();
                }
                HelloService helloService = new HelloService();

                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("MapStyle","Navybluemap").apply();
                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                Toast.makeText(Settings.this,"Restart app",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Marker marker = MapsActivity.isPresent.get("isPresent");
                if(marker != null){
                    marker.remove();
                }
                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("MapStyle","normal").apply();
                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                Toast.makeText(Settings.this,"Restart app",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }

    public void navybluelowsdk(View view) {
        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("MapStyle","Navybluemap").apply();
        startActivity(new Intent(Settings.this,ChangingMap.class));
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP){
//            // Do something for lollipop and above versions
//            finishAndRemoveTask();
//            this.finishAffinity();
//        } else{
//            this.finishAffinity();
//            // do something for phones running an SDK before lollipop
//        }
//        Marker marker = MapsActivity.isPresent.get("isPresent");
//        if(marker != null){
//            marker.remove();
//        }
//        HelloService helloService = new HelloService();
//
//        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("MapStyle","Navybluemap").apply();
//        Intent i = getBaseContext().getPackageManager()
//                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
//        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        Toast.makeText(Settings.this,"Restart app",Toast.LENGTH_SHORT).show();
//        startActivity(i);
    }

    public void darklowsdk(View view) {
        startActivity(new Intent(Settings.this,ChangingMap.class));
        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("MapStyle","dark").apply();

//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP){
//            // Do something for lollipop and above versions
//            finishAndRemoveTask();
//            this.finishAffinity();
//        } else{
//            this.finishAffinity();
//            // do something for phones running an SDK before lollipop
//        }

//        Marker marker = MapsActivity.isPresent.get("isPresent");
//        if(marker != null){
//            marker.remove();
//        }
//        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("MapStyle","dark").apply();
//        Intent i = getBaseContext().getPackageManager()
//                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
//        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        Toast.makeText(Settings.this,"Restart app",Toast.LENGTH_SHORT).show();
//        startActivity(i);
    }

    public void normallowsdk(View view) {
        startActivity(new Intent(Settings.this,ChangingMap.class));
        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("MapStyle","normal").apply();

//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP){
//            // Do something for lollipop and above versions
//            finishAndRemoveTask();
//            this.finishAffinity();
//        } else{
//            this.finishAffinity();
//            // do something for phones running an SDK before lollipop
//        }
//        Marker marker = MapsActivity.isPresent.get("isPresent");
//        if(marker != null){
//            marker.remove();
//        }
//        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("MapStyle","normal").apply();
//        Intent i = getBaseContext().getPackageManager()
//                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
//        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        Toast.makeText(Settings.this,"Restart app",Toast.LENGTH_SHORT).show();
//        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Settings.this,MapsActivity.class));
    }
}
