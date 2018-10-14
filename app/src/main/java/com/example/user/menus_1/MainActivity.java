package com.example.user.menus_1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    String st="",st2="";
    LinearLayout LY;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LY = (LinearLayout)findViewById(R.id.LY);
        btn = (Button)findViewById(R.id.btn);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        st2 = item.getTitle().toString();

    return true;
    }
    public void goTo(View view) {
        Intent t = new Intent(this, SecondActivity.class);
        t.putExtra("n", st2);
        startActivity(t);
    }
}
