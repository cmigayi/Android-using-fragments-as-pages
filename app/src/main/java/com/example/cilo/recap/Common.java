package com.example.cilo.recap;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;

/**
 * Created by cilo on 3/8/17.
 */

public class Common {
    FragmentManager fm;

    public Common( FragmentManager fm){
        this.fm = fm;
    }

    //method to help manage the fragments
    public void getPage(FrameLayout fl, Fragment fr){

        int fid = fl.getId();

        fm.beginTransaction().add(fid,fr).commit();
    }
}
