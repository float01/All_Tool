package com.sev.sevlocation.all_tool.Fragment_3.ListFragment;

import android.app.Fragment;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sev.sevlocation.all_tool.R;

/**
 * Created by SEV on 6/25/2017.
 */

public class ListFragment_info extends Fragment {
    TextView tv_chao;
    ImageView imgview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listfragment_info_3,container,true);
        tv_chao=(TextView) view.findViewById(R.id.tv_chao);
        imgview=(ImageView) view.findViewById(R.id.imgview);
        return view;
    }
    public void getInfoName(String name){
        tv_chao.setText(name);
        imgview.setImageResource(R.mipmap.ic_launcher);
    }
}
