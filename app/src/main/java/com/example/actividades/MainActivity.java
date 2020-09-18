package com.example.actividades;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        loadComponents();
    }
    private void loadComponents(){
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this); }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1: {
                Intent actividad1 = new Intent(this, Actividad1.class);
                actividad1.putExtra("msn", "vamos a la actividad 1");
                startActivity(actividad1);
                break;
            }
            case R.id.btn2: {
                Intent actividad2 = new Intent(this, Acrividad2.class);
                actividad2.putExtra("msn", "vamos a la actividad 2");
                startActivity(actividad2);
                break;
            }
            case R.id.btn3: {
                Intent actividad3 = new Intent(this, Acrividad3.class);
                actividad3.putExtra("msn", "vamos a la actividad 3");
                startActivity(actividad3);
                break;
            }
            case R.id.btn4: {
                Intent actividad4 = new Intent(this, Acrividad4.class);
                actividad4.putExtra("msn", "vamos a la actividad 4");
                startActivity(actividad4);
                break;
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}