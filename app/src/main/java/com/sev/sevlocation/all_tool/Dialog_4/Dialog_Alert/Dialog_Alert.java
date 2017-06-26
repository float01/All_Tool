package com.sev.sevlocation.all_tool.Dialog_4.Dialog_Alert;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sev.sevlocation.all_tool.R;

/**
 * Created by SEV on 6/26/2017.
 */

public class Dialog_Alert extends AppCompatActivity implements View.OnClickListener{
    Button btn_dialog,btn_alert;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_alert_activity_3);
        btn_dialog=(Button) findViewById(R.id.btn_dialog);
        btn_alert=(Button) findViewById(R.id.btn_alert);
        btn_alert.setOnClickListener(this);
        btn_dialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_dialog:
                showdialog();
                break;
            case R.id.btn_alert:
                showAlertDialog();
                break;
        }
    }
    public void showdialog(){

        final Dialog dialog=new Dialog(Dialog_Alert.this);
        dialog.setTitle("Thông báo");
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog_alert_lt_3);
        dialog.show();
        Button btn_thoat=(Button) dialog.findViewById(R.id.btn_thoat);
        Button btn_huy=(Button) dialog.findViewById(R.id.btn_huy);
        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_huy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
    }
    public void showAlertDialog() {
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("All_Tool");
        builder.setCancelable(false);
        builder.setMessage("Bạn muốn đăng xuất không?");
        builder.setPositiveButton("Hủy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        } );
        builder.setNegativeButton("Đăng xuất", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog  alertDialog=builder.create();
        alertDialog.show();

    }
}
