package com.sev.sevlocation.all_tool.Fragment_3.ListFragment;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.sev.sevlocation.all_tool.R;

/**
 * Created by SEV on 6/25/2017.
 */

public class ListFragment_list extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listfragment_list_3,container,true);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.hanhtinh,android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showdata(adapter.getItem(position).toString());
//                Toast.makeText(getActivity(), ""+adapter.getItem(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void showdata(String str) {
        //ánh xạ conttrol fragmentDetail của màn hình ngang
        //khởi tạo đối tượng act_InfoFragmentContact
        ListFragment_info frmDetailLand =
                (ListFragment_info) getFragmentManager()
                        .findFragmentById(R.id.frm_info);

        //nếu quay dọc thì không ánh xạ được fragmentDetail
        //truyền objectContact và mở act_Info_Contact_Doc
        //->truyền objContact cho -> actInfoFragmentContact
        String message;
        if (frmDetailLand == null || !frmDetailLand.isInLayout()) {
            message = "Màn hình dọc";
            Intent intent = new Intent(getActivity(), ListFragment_Activity_Info.class);
            intent.putExtra("msg",str);
            startActivity(intent);
        } else {
            //nếu quay ngang set thông tin contact -> actInfoFragmentContact
            message = "Màn hình ngang";
            frmDetailLand.getInfoName(str);
        }
    }



}
