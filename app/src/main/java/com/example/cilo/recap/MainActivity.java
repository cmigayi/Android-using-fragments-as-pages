package com.example.cilo.recap;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    FrameLayout frame;
    Fragment frag;
    Common common;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        common = new Common(getSupportFragmentManager());

        //FrameLayout is where all the pages are displayed, page-manager of some sort
        frame = (FrameLayout) findViewById(R.id.frag);

        //Initializing our first page, the home page
        frag  = new FragementOne();

        //Setup the page, the fragments
        common.getPage(frame,frag);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        switch(itemId){
            case R.id.home:
                //home is selected, initialize its page
                frag = new FragementOne();
                Bundle bundle = new Bundle();
                bundle.putSerializable("frame",frame.getId());
                frag.setArguments(bundle);

                break;
            case R.id.settings:
                //Settings is selected, initialize its page
                frag = new FragementTwo();
                break;
        }

        //setup the page selected in the fragment method.
        common.getPage(frame,frag);

        return false;
    }
}












