package com.paic.demo.wheelviewdemo.listener;

import com.paic.demo.wheelviewdemo.widget.WheelView;

/**
 * Created by chengliangyan402 on 16/3/7.
 */
public interface OnWheelScrollListener {
    /**
     * Callback method to be invoked when scrolling started.
     * @param wheel the wheel view whose state has changed.
     */
    void onScrollingStarted(WheelView wheel);

    /**
     * Callback method to be invoked when scrolling ended.
     * @param wheel the wheel view whose state has changed.
     */
    void onScrollingFinished(WheelView wheel);
}
