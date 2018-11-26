package cn.caratel.lib.widget.divider;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;

import cn.caratel.lib.widget.R;
import cn.caratel.lib.widget.divider.util.Y_Divider;
import cn.caratel.lib.widget.divider.util.Y_DividerBuilder;
import cn.caratel.lib.widget.divider.util.Y_DividerItemDecoration;


/**
 *
 * @author xz
 * @date 2017/11/24 0024
 * rv分割线高度10dp
 */

public class XRvDivider1 extends Y_DividerItemDecoration {
    private final int mColor;


    public XRvDivider1(Context context) {
        this(context, R.color.app_divider_color);
    }

    public XRvDivider1(Context context, @ColorRes int color) {
        super(context);
        mColor = ContextCompat.getColor(context, color);
    }


    @Override
    public Y_Divider getDivider(int itemPosition) {
        return  new Y_DividerBuilder()
                .setBottomSideLine(true, mColor, 1, 0, 0)
                .create();
    }
}
