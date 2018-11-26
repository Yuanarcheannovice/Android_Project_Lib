package cn.caratel.lib.widget.proportion;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import cn.caratel.lib.widget.R;


/**
 * Created by xz on 2017/9/8 0008.
 * 比例RelativeLayout
 * 根据宽来设置高
 */

public class XProportionRelativeLayout extends RelativeLayout {
    private final float mWidthRatio;//宽比例

    private final float mHeightRatio;//高比例


    public XProportionRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.XProportionLayout);
        mWidthRatio = typedArray.getFloat(R.styleable.XProportionLayout_xplWidthRatio, -1);
        mHeightRatio = typedArray.getFloat(R.styleable.XProportionLayout_xplHeightRatio, -1);
        typedArray.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (mWidthRatio != -1 && mHeightRatio != -1) {
            final int widthMode = MeasureSpec.getMode(widthMeasureSpec);
            final int widthSize = MeasureSpec.getSize(widthMeasureSpec);
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(Math.round(mHeightRatio / mWidthRatio * widthSize), widthMode);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
