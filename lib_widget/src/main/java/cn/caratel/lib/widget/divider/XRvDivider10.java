package cn.caratel.lib.widget.divider;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;

import cn.caratel.lib.widget.R;
import cn.caratel.lib.widget.divider.util.Y_Divider;
import cn.caratel.lib.widget.divider.util.Y_DividerBuilder;
import cn.caratel.lib.widget.divider.util.Y_DividerItemDecoration;


/**
 * @author xz
 * @date 2017/11/24 0024
 * rv分割线高度10dp
 */

public class XRvDivider10 extends Y_DividerItemDecoration {
    private final int mColor;
    private boolean isShowTopLine = false;
    private Y_Divider mDivider1;
    private Y_Divider mDivider2;

    public XRvDivider10(Context context) {
        this(context, R.color.app_divider_color);
    }

    public XRvDivider10(Context context, boolean isNeedTop) {
        this(context, R.color.app_divider_color,isNeedTop);
    }

    public XRvDivider10(Context context, @ColorRes int color) {
        this(context, R.color.app_divider_color,false);
    }

    public XRvDivider10(Context context, @ColorRes int color, boolean bool) {
        super(context);
        mColor = ContextCompat.getColor(context, color);
        this.isShowTopLine = bool;
    }

    @Override
    public Y_Divider getDivider(int itemPosition) {
        if (isShowTopLine && itemPosition == 0) {
            if (mDivider1 == null) {
                mDivider1 = new Y_DividerBuilder()
                        .setTopSideLine(true, mColor, 10, 0, 0)
                        .setBottomSideLine(true, mColor, 10, 0, 0)
                        .create();
            }
            return mDivider1;
        }
        if (mDivider2 == null) {
            mDivider2 = new Y_DividerBuilder()
                    .setBottomSideLine(true, mColor, 10, 0, 0)
                    .create();
        }
        return mDivider2;
    }
}
