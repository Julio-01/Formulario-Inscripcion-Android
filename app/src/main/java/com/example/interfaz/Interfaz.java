package com.example.interfaz;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Interfaz extends Activity{

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int itemId = item.getItemId();
        if (itemId == R.id.action_new) {
            Log.d("HomeActivity", (String) "action_new");
            return true;
        } else if (itemId == R.id.action_delete) {
            Log.d("HomeActivity", (String) "action_delete");
            return true;
        } else if (itemId == R.id.action_empty) {
            Log.d("HomeActivity", (String) "action_empty");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
