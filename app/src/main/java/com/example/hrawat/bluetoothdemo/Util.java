package com.example.hrawat.bluetoothdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by hrawat on 12-04-2017.
 */

public class Util {
    public static void showToast(Context ctx , String msg){
        Toast.makeText(ctx , "Bluetooth : "+msg ,Toast.LENGTH_SHORT ).show();
    }
}
