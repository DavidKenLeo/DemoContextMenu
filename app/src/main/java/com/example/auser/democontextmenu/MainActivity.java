package com.example.auser.democontextmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.net.Uri;
import android.os.Environment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView tv =(TextView)findViewById(R.id.textView);
        registerForContextMenu(tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        handle(item);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        handle(item);
        return super.onContextItemSelected(item);
    }

    void customToast(CharSequence textID,int drawableID) {
        Toast toast = Toast.makeText(this, textID, Toast.LENGTH_SHORT);
        View original = toast.getView();
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        ImageView img = new ImageView(this);
        img.setImageResource(drawableID);
        linearLayout.addView(img);
        linearLayout.addView(original);
        toast.setView(linearLayout);
        toast.show();
    }

    void handle(MenuItem item){
        switch(item.getItemId()){
            case R.id.action_settings:
                customToast(item.getTitle(),R.drawable.angry);
                break;
            case R.id.item1:
                customToast(item.getTitle(),R.drawable.angry);
                break;
            case R.id.item2:
                customToast(item.getTitle(),R.drawable.angry);
                break;
            case R.id.item3:
                customToast(item.getTitle(),R.drawable.angry);
                break;
            case R.id.item4:
                customToast(item.getTitle(),R.drawable.angry);
                break;
            case R.id.submitem1:
                customToast(item.getTitle(),R.drawable.angry);
                break;
            case R.id.submitem2:
                customToast(item.getTitle(),R.drawable.angry);
                break;
            case R.id.submitem3:
                customToast(item.getTitle(),R.drawable.angry);
                break;
            case R.id.submitem4:
                customToast(item.getTitle(),R.drawable.angry);
                break;
            case R.id.submitem5:
                customToast(item.getTitle(),R.drawable.angry);
                break;
        }
    }
}
