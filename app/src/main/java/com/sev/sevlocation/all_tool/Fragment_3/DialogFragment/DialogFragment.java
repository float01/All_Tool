package com.sev.sevlocation.all_tool.Fragment_3.DialogFragment;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sev.sevlocation.all_tool.R;

/**
 * Created by SEV on 6/24/2017.
 */

public class DialogFragment extends AppCompatActivity{
    Button btn_show;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialogfragment_3);
        btn_show=(Button) findViewById(R.id.btn_show);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show Dialog và truyền giá trị vào dialog
                // Các bạn có thể truyền cả object nếu muốn.
                android.support.v4.app.FragmentManager manager=getSupportFragmentManager();
                InfoDialogFragment dialogFragment=InfoDialogFragment.newInstance("Đinh Thế Anh");
                dialogFragment.show(manager,null);
            }
        });
    }
}
