package cn.caratel.lib.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.WindowManager;
import android.widget.VideoView;

/**
 * Created by xz on 2018/3/8.
 * 使videoview填满布局
 */

public class MatchVideoView extends VideoView {
    public MatchVideoView(Context context) {
        super(context);
    }

    public MatchVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MatchVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MatchVideoView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
//        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
//        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
//        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
//        if (widthMode == MeasureSpec.EXACTLY && heightMode == MeasureSpec.EXACTLY) {
//            setMeasuredDimension(widthSize, heightSize);
//
//        } else {
//            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        }

        WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();
        setMeasuredDimension(width, height);
    }


}
