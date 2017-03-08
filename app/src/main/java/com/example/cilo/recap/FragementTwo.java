package com.example.cilo.recap;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cilo on 3/8/17.
 */

public class FragementTwo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_two, container,false);
        TextView unameTV = (TextView) view.findViewById(R.id.username);

        Bundle bundle = this.getArguments();

        if(bundle != null){
            String uname = bundle.getString("uname");
            unameTV.setText(uname);
        }
        return view;
    }
}













