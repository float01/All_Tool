package com.sev.sevlocation.all_tool.Fragment_3.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
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

public class GreenFragment extends Fragment {
    private TextView tv_tong;
    private EditText edtA,edtB;
    private Button btn_tinh;
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
        final View view=inflater.inflate(R.layout.fragment_green_3,container,false);
        tv_tong= (TextView) view.findViewById(R.id.tv_tong);
        edtA=(EditText) view.findViewById(R.id.edt_a);
        edtB=(EditText) view.findViewById(R.id.edt_b);
        btn_tinh=(Button) view.findViewById(R.id.btn_tinh);
        btn_tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển dữ liệu đến Fragment khác.
                fr = new BlueFragment();
                Bundle bundle = new Bundle();
                bundle.putString("soA", edtA.getText().toString());
                bundle.putString("soB", edtB.getText().toString());
                fr.setArguments(bundle);
                // 4 dòng dưới gọi sẽ hủy Fragment green
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
                // Thay thế fragment hiện tại: R.id.fr_green thành fragment fr_blue.
                fragmentTransaction.replace(R.id.fr_green, fr);
                fragmentTransaction.commit();

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
            tv_tong.setText("Tổng là: "+ bundle.getString("tongAB"));
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
