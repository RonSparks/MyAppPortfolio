package com.ronsparks.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // did this to see if how on click event listeners worked
        // need to do this for every listener - better to create
        // a method called from onCreate to instantiate all of this.
        Button button = (Button) findViewById(R.id.btnSpotifyStreamer);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                sendMessage (v);
            }
        });
    }


    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
        Button b = (Button)view;
        String buttonText = b.getText().toString();
        Toast.makeText(getApplicationContext(), getString(R.string.message_start) + " " + buttonText + " " + getString(R.string.message_end), Toast.LENGTH_SHORT).show();
    }
}
