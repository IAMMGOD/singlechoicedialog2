package com.example.singlechoicedialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.lang.annotation.Native;

public class singleChoice extends DialogFragment {
    private AlertDialog.Builder builder;
    private Dialog dialog;
    private Context context;
    private String[] data;

    public singleChoice(Context context, String[] data){
        super();
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public  Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
        builder = new AlertDialog.Builder(context);
        builder.setTitle("Single Choice Alert Dialog");

        builder.setSingleChoiceItems(data, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(context, "Selected" + data[i], Toast.LENGTH_LONG).show();
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(context, "Dismissed", Toast.LENGTH_LONG).show();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(context, "Cancelled", Toast.LENGTH_LONG).show();
            }
        });
        return builder.create();
    }
}





















