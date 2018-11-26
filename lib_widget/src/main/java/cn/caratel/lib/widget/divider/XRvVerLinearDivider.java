package cn.caratel.lib.widget.divider;


import android.content.Context;
import android.support.v4.content.ContextCompat;

import cn.caratel.lib.widget.R;
import cn.caratel.lib.widget.divider.util.Y_Divider;
import cn.caratel.lib.widget.divider.util.Y_DividerBuilder;
import cn.caratel.lib.widget.divider.util.Y_DividerItemDecoration;


/**
 * Created by xcoder_xz on 8017/5/1 0001.
 */

public class XRvVerLinearDivider extends Y_DividerItemDecoration {

    private final int mColor;

    public XRvVerLinearDivider(Context context) {
        super(context);
        mColor = ContextCompat.getColor(context, R.color.lw_divider_color);
    }

    @Override
    public Y_Divider getDivider(int itemPosition) {
        Y_Divider divider;

        if (itemPosition == 0) {
            divider = new Y_DividerBuilder()
                    .setTopSideLine(true, mColor, 1, 0, 0)
                    .setBottomSideLine(true, mColor, 1, 0, 0)
                    .create();
        } else {
            divider = new Y_DividerBuilder()
                    .setBottomSideLine(true, mColor, 1, 0, 0)
                    .create();
        }
        return divider;
    }
}