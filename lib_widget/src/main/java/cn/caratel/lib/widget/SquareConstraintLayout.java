package cn.caratel.lib.widget;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

/**
 * Created by DEV on 2018/4/6.
 */

public class SquareConstraintLayout extends ConstraintLayout {
    public SquareConstraintLayout(Context context) {
        super(context);
    }

    public SquareConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//         super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);

    }
}
