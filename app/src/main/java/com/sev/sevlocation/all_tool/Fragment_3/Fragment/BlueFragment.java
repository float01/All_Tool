package com.sev.sevlocation.all_tool.Fragment_3.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sev.sevlocation.all_tool.R;

public class BlueFragment extends Fragment {
    private TextView tv_tong_blue;
    private  Button btn_back;
    private int tong=0;
    Fragment fr;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blue_3,container,false);
        tv_tong_blue= (TextView) view.findViewById(R.id.tv_tong_blue);
        btn_back=(Button) view.findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển dữ liệu đến Fragment khác.
                fr = new GreenFragment();
                Bundle bundle = new Bundle();
                bundle.putString("tongAB",""+ tong);
                fr.setArguments(bundle);
//                android.support.v4.app.FragmentManager fm = getFragmentManager();
//                android.support.v4.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
//                fragmentTransaction.replace(R.id.fr_blue, fr);
//                fragmentTransaction.commit();
                //Ví dụ về "addToBackStack" Khi ấn nút back thì fr_blue ko mất
                android.support.v4.app.FragmentManager fmgr = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fmgr.beginTransaction();
                ft.add(R.id.fr_blue, fr);
                ft.addToBackStack(fr.getClass().getSimpleName());
                ft.commit();
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Lấy dữ liệu truyền từ Fragment khác sang
        Bundle bundle=getArguments();
        if(null!=bundle)
            tong=Integer.parseInt(bundle.getString("soA")) + Integer.parseInt(bundle.getString("soB"));
            tv_tong_blue.setText("Tổng là: " + tong);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
