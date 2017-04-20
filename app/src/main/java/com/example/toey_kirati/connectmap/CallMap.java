package com.example.toey_kirati.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);
    }
    public void runCallMap(View view) {
        //Initial veiw
        EditText latitude = (EditText) findViewById(R.id.mapLat);
        EditText longtitude = (EditText) findViewById(R.id.mapLong);
        EditText mlabel = (EditText) findViewById(R.id.mapLabel);

        String lat = latitude.getText().toString().trim();
        String Ing = longtitude.getText().toString().toString().trim();
        String mlabel = mlabel.gettext().toString().toString();
        Uri location = Uri.parse("http://maps.google.com/maps?q=loc:"+lat+","+Ing+","+mlabel+")");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        mapIntent.setPackage("com.google.android.apps.maps");

        startActivity(mapIntent);

    }
}
