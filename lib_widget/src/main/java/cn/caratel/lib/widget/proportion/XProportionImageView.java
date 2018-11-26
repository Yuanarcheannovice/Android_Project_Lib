package cn.caratel.lib.widget.proportion;


import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

import cn.caratel.lib.widget.R;


/**
 * Created by xz on 2017/5/9 0009.
 * 比例ImageView
 * 根据宽来设置高
 */

public class XProportionImageView extends ImageView {

    private final float mWidthRatio;//宽比例
    private final float mHeightRatio;//高比例

    public XProportionImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.XProportionImageView);
        mWidthRatio = typedArray.getFloat(R.styleable.XProportionImageView_xpiWidthRatio, -1);
        mHeightRatio = typedArray.getFloat(R.styleable.XProportionImageView_xpiHeightRatio, -1);
        typedArray.recycle();
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (mWidthRatio != -1 && mHeightRatio != -1) {
            final int widthSize = MeasureSpec.getSize(widthMeasureSpec);
//            final int heightSize = MeasureSpec.getSize(heightMeasureSpec);
            setMeasuredDimension(widthSize, Math.round(widthSize * mHeightRatio / mWidthRatio));
        }
    }

}



