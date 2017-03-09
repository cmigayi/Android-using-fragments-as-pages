package com.example.cilo.recap;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by cilo on 3/9/17.
 */

public class SharedPreference {
    SharedPreferences storage;

    static String SP_NAME = "User";

    public SharedPreference(Context c){
        storage = c.getSharedPreferences(SP_NAME,0);
    }

    public void storeData(String name){
        SharedPreferences.Editor editor = storage.edit();
        editor.putString("name",name);
        editor.commit();
    }

    public String getData(){
        String name = storage.getString("name","");
        return name;
    }

    public void deleteData(){
        SharedPreferences.Editor editor = storage.edit();
        editor.clear();
        editor.commit();
    }


}
