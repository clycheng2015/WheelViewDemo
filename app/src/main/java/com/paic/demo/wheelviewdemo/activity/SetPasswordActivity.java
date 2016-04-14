package com.paic.demo.wheelviewdemo.activity;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.Button;
import android.widget.Toast;

import com.paic.demo.wheelviewdemo.R;
import com.paic.demo.wheelviewdemo.widget.WheelView;
import com.paic.demo.wheelviewdemo.adapter.StrericWheelAdapter;


public class SetPasswordActivity extends Activity {
    String[] mNumStr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //我改的
        initWheel(R.id.passw_1, mNumStr);
        initWheel(R.id.passw_2, mNumStr);
        initWheel(R.id.passw_3, mNumStr);
        initWheel(R.id.passw_4, mNumStr);
        initWheel(R.id.passw_5, mNumStr);
        Button btn = (Button) findViewById(R.id.btn_mix);
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(SetPasswordActivity.this, getWheelValue(R.id.passw_1),Toast.LENGTH_SHORT).show();
                Toast.makeText(SetPasswordActivity.this, getWheelValue(R.id.passw_2),Toast.LENGTH_SHORT).show();
                Toast.makeText(SetPasswordActivity.this, getWheelValue(R.id.passw_3),Toast.LENGTH_SHORT).show();
                Toast.makeText(SetPasswordActivity.this, getWheelValue(R.id.passw_4),Toast.LENGTH_SHORT).show();
                Toast.makeText(SetPasswordActivity.this, getWheelValue(R.id.passw_5),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean wheelScrolled = false;

    /**
     * Updates entered PIN status
     */

    private String getWheelValue(int id) {
        return getWheel(id).getCurrentItemValue();
    }

    /**
     * Returns wheel by Id
     *
     * @param id the wheel Id
     * @return the wheel with passed Id
     * 我添加的
     */
    private WheelView getWheel(int id) {
        return (WheelView) findViewById(id);
    }

    private void initWheel(int id, String[] strContents) {
        WheelView wheel = getWheel(id);
        wheel.setAdapter(new StrericWheelAdapter(strContents));
        wheel.setCurrentItem(0);

        wheel.setCyclic(true);
        wheel.setInterpolator(new AnticipateOvershootInterpolator());
    }
}
