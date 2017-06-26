package com.sev.sevlocation.all_tool.Fragment_3.ListFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.sev.sevlocation.all_tool.Fragment_3.ListFragment.ListFragment_info;
import com.sev.sevlocation.all_tool.R;

/**
 * Created by SEV on 6/25/2017.
 */

public class ListFragment_Activity_Info extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listfragment_fr_info_3);
        Intent intent = getIntent();
        String msg =  intent.getStringExtra("msg");
        if (msg == null) {
            finish();
        }
        //khởi tạo đối tượng fragmentDoc và truyền tham số objectContact -> act_ListFragmentContact
        ListFragment_info frmDetail = (ListFragment_info) getFragmentManager().findFragmentById(R.id.frm_fr_info);
        frmDetail.getInfoName(msg);
    }
}
