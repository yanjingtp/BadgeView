package com.test.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tv = (TextView) findViewById(R.id.tv);

        BadgeView badgeView = new BadgeView(this, tv);  //初始化徽章

        badgeView.setText("10");  //徽章内容
        badgeView.setBadgePosition(BadgeView.POSITION_TOP_LEFT);  //徽章位置，默认右上角
        badgeView.show();  //显示

    }

}
