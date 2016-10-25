package com.example.caidan;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.net.wifi.WifiConfiguration.PairwiseCipher.NONE;
import static android.widget.Toast.*;

public class MenuDome extends Activity{
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dome);
        tv1= (TextView) findViewById(R.id.tv1);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
        makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
        Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
    }
}
