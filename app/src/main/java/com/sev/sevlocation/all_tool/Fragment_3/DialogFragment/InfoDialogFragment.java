package com.sev.sevlocation.all_tool.Fragment_3.DialogFragment;

import android.os.Bundle;
import android.support.v4.app.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.sev.sevlocation.all_tool.R;

/**
 * Created by SEV on 6/24/2017.
 */

public class InfoDialogFragment extends android.support.v4.app.DialogFragment {
    TextView tv_ten,tv_lop,tv_ms;
    Button btn_update,btn_cancel;
    //Để nhận giá trị
    public static InfoDialogFragment newInstance(String data) {
        InfoDialogFragment dialog=new InfoDialogFragment();
        Bundle bundle=new Bundle();
        bundle.putString("data",data);
        dialog.setArguments(bundle);
        return dialog;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialogfragment_info_3, container);
    }

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // lấy giá trị tự bundle
        String data = getArguments().getString("data", "");
        tv_ten = (TextView) view.findViewById(R.id.tv_ten);
        tv_ms = (TextView) view.findViewById(R.id.tv_ms);
        tv_lop = (TextView) view.findViewById(R.id.tv_lop);
        btn_cancel = (Button) view.findViewById(R.id.btn_cancel);
        btn_update = (Button) view.findViewById(R.id.btn_update);
        tv_ten.setText(data);
        tv_lop.setText("13DTH02");
        tv_ms.setText("131151XXX");
        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Update clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });
    }
}
