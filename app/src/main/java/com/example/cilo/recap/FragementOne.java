package com.example.cilo.recap;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

/**
 * Created by cilo on 3/8/17.
 */

public class FragementOne extends Fragment{

    Common common;
    FrameLayout frame;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       final View view = inflater.inflate(R.layout.fragement_one,container,false);

        common = new Common(getFragmentManager());

        Button btn = (Button) view.findViewById(R.id.submit);
        final EditText unameEt = (EditText) view.findViewById(R.id.username);

        frame = (FrameLayout) getActivity().findViewById(R.id.frag);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname = unameEt.getText().toString();

                Bundle bundle = new Bundle();
                FragementTwo f2 = new FragementTwo();
                bundle.putString("uname",uname);
                f2.setArguments(bundle);

                common.getPage(frame,f2);
            }
        });

       return view;
    }
}












