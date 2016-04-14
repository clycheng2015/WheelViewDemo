package com.paic.demo.wheelviewdemo.listener;

import com.paic.demo.wheelviewdemo.widget.WheelView;

/**
 * Created by chengliangyan402 on 16/3/7.
 */
public interface OnWheelChangedListener {
    /**
     * Callback method to be invoked when current item changed
     * @param wheel the wheel view whose state has changed
     * @param oldValue the old value of current item
     * @param newValue the new value of current item
     */
    void onChanged(WheelView wheel, int oldValue, int newValue);
}
