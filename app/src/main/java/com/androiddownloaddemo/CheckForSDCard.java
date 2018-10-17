package com.androiddownloaddemo;

import android.os.Environment;

public class CheckForSDCard {
    //Check If SD Card is present or not methodss
    public boolean isSDCardPresent()
    {
        if(Environment.getExternalStorageState().equals(

                Environment.MEDIA_MOUNTED)) {
            return true;
        }
        return false;
    }
}
