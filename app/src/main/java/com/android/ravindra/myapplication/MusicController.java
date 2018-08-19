package com.android.ravindra.myapplication;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.MediaController;

/**
 * Created by Ravindra on 27-Nov-16.
 */
public class MusicController extends MediaController {

    public MusicController(Context context) {
        super(context);
    }

    @Override
    public void hide() {

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if(event.getKeyCode() == KeyEvent.KEYCODE_BACK){
            super.hide();//Hide mediaController
            //super.finish();//Close this activity
            return true;//If press Back button, finish here
        }
        //If not Back button, other button (volume) work as usual.
        return super.dispatchKeyEvent(event);
    }
}
