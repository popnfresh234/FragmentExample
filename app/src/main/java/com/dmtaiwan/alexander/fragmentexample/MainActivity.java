package com.dmtaiwan.alexander.fragmentexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FragmentA.FragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, FragmentA.newInstance(this))
                .commit();
    }

    @Override
    public void onButtonPressed() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new FragmentB())
                .commit();
    }
}
