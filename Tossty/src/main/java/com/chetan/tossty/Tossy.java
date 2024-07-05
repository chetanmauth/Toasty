package com.chetan.tossty;

import android.content.Context;
import android.widget.Toast;

public class Tossy {

    public static void showTossy(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
