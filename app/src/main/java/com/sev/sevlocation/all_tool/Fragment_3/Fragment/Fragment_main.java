package com.sev.sevlocation.all_tool.Fragment_3.Fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import com.sev.sevlocation.all_tool.R;

/**
 * Created by SEV on 6/24/2017.
 */

public class Fragment_main extends FragmentActivity implements View.OnClickListener{
    Button btngreen,btnblue;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_3);
        Anhxa();
        callFragment(new GreenFragment());
        btngreen.setOnClickListener(this);
        btnblue.setOnClickListener(this);

    }

    private void callFragment(android.support.v4.app.Fragment fragment) {
        android.support.v4.app.FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.frm_layout,fragment);
        transaction.commit();
    }

    private void Anhxa() {
        btnblue=(Button) findViewById(R.id.btn_blue);
        btngreen=(Button) findViewById(R.id.btn_green);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_green:
                callFragment(new GreenFragment());
                break;
            case R.id.btn_blue:
                callFragment(new BlueFragment());
                break;
        }
    }
}
