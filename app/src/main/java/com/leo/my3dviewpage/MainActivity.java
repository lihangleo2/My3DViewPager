package com.leo.my3dviewpage;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    //这里的图片从百度图片中下载，图片规格是960*640
    private static final int[] drawableIds = new int[]{R.mipmap.wangze1, R.mipmap.wangze2, R.mipmap.wangze3,
            R.mipmap.wangze4, R.mipmap.wangze5, R.mipmap.wangze6, R.mipmap.wangze7, R.mipmap.wangze8, R.mipmap.wangze9,
            R.mipmap.wangze10};
    private ViewPager mViewPager;
    private RelativeLayout mRelativeLayout;
    private MyPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
//        mViewPager.setPageTransformer(true,new RotationPageTransformer());
        mViewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        mViewPager.setOffscreenPageLimit(2); //下面会说到
        mPagerAdapter = new MyPagerAdapter(drawableIds, this);
        mViewPager.setAdapter(mPagerAdapter);
    }

}
