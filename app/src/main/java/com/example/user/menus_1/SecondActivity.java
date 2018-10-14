package com.example.user.menus_1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class SecondActivity extends AppCompatActivity {

    LinearLayout LY2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        LY2 = (LinearLayout)findViewById(R.id.LY2);
        String st1="";
        st1=getIntent().getExtras().getString("n");
        if(st1.equals("Blue")) {
            LY2.setBackgroundColor(Color.BLUE);
        } else if(st1.equals("Red")){
            LY2.setBackgroundColor(Color.RED);
        }
        else if(st1.equals("Black")){
            LY2.setBackgroundColor(Color.BLACK);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,250,"Green");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        String st2=item.getTitle().toString();
        if(st2.equals("Blue")){
            LY2.setBackgroundColor(Color.BLUE);
        } else if(st2.equals("Red")){
            LY2.setBackgroundColor(Color.RED);
        }
        else if(st2.equals("Black")){
            LY2.setBackgroundColor(Color.BLACK);
        }
        else{
            LY2.setBackgroundColor(Color.GREEN);
        }
        return true;
    }
    public void goTo2(View view){
        Intent x = new Intent(this, MainActivity.class);
        startActivity(x);
    }
}
