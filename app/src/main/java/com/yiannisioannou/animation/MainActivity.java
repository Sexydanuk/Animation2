package com.yiannisioannou.animation;

import android.os.Bundle;
import android.view.Menu;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.MenuItem;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.animate().translationXBy(-1000f).alpha(0f).setDuration(2000);

        //ImageView homer = (ImageView) findViewById(R.id.homer);
        //homer.animate().alpha(1f).setDuration(2000);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    private boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean anOptionsItemSelected(MenuItem item) {
         int id = item.getItemId();
         if (id == R.id.action_settings) {
             return true;
         }
        return super.onOptionsItemSelected(item);
    }
}
