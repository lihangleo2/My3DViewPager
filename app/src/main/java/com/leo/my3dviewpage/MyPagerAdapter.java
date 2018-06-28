package com.leo.my3dviewpage;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Administrator on 2018/5/17.
 */

public class MyPagerAdapter extends PagerAdapter {
    private int[] mBitmapIds;
    private Context mContext;

    public MyPagerAdapter(int[] data, Context context) {
        mBitmapIds = data;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mBitmapIds.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_main, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv);
        imageView.setImageResource(mBitmapIds[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

}
