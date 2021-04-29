package com.example.mathsmodule.english_module;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.mathsmodule.R;

public class ImageAdapterSlide extends PagerAdapter {
    private Context mcontext;
    private int[] mImageIds= new int[] {R.drawable.ast,R.drawable.bst,R.drawable.cst,R.drawable.dst,
            R.drawable.est,R.drawable.fst,R.drawable.gst,R.drawable.hst,R.drawable.ist,R.drawable.jst,
            R.drawable.kst,R.drawable.lst,R.drawable.mst,R.drawable.nst,R.drawable.ost,R.drawable.pst,
            R.drawable.qst,R.drawable.rst,R.drawable.sst,R.drawable.tst,R.drawable.ust,R.drawable.vst,
            R.drawable.wst,R.drawable.xst,R.drawable.yst,R.drawable.szt};
    ImageAdapterSlide(Context context)
    {
        mcontext=context;
    }
    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mcontext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
