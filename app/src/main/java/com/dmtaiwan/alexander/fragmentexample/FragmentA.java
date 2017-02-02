package com.dmtaiwan.alexander.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Alexander on 2/2/2017.
 */

public class FragmentA extends Fragment {

    private FragmentListener listener;

    public static FragmentA newInstance(FragmentListener listener) {
        FragmentA frag = new FragmentA();
        frag.listener = listener;
        return frag;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_a, container, false);

        Button myButton = (Button) rootView.findViewById(R.id.replace_fragment_button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onButtonPressed();
            }
        });
        return rootView;

    }

    public interface FragmentListener {
        public void onButtonPressed();
    }

}
