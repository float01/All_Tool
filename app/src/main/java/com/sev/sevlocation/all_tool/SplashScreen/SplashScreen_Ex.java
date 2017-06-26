package com.sev.sevlocation.all_tool.SplashScreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;

import com.sev.sevlocation.all_tool.MainActivity;
import com.sev.sevlocation.all_tool.R;

/**
 * Created by SEV on 6/23/2017.
 */

public class SplashScreen_Ex extends Activity {
    protected  boolean _active=true;
    protected int _splashTime=5000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        final Thread thread=new Thread(){
            @Override
            public void run() {
                try{
                    int waited=0;
                    while(_active && waited<_splashTime){
                        sleep(100);
                        if(_active)
                            waited+=100;
                    }
                } catch (InterruptedException e){

                }finally {
                    finish();
                    Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                    SplashScreen_Ex.this.startActivity(intent);
                    SplashScreen_Ex.this.finish();
                    onStop();
                }
            }
        };
        thread.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN)
            _active=false;
        return true;
    }
}
