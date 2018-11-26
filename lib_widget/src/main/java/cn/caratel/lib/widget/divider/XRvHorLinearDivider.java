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

public class XRvHorLinearDivider extends Y_DividerItemDecoration {

    private final int mColor;
    Y_Divider divider;
    Y_Divider dividerOther;

    Y_Divider d;

    public XRvHorLinearDivider(Context context) {
        super(context);
        mColor = ContextCompat.getColor(context, R.color.lw_transparent);
        d = new Y_DividerBuilder()
                .create();
    }

    @Override
    public Y_Divider getDivider(int itemPosition) {

        if (itemPosition == 0) {
            if (divider == null) {
                divider = new Y_DividerBuilder()
                        .setLeftSideLine(true, mColor, 4, 0, 0)
                        .setRightSideLine(true, mColor, 4, 0, 0)
                        .create();
            }
            return divider;
        } else {
            if (dividerOther == null) {
                dividerOther = new Y_DividerBuilder()
                        .setRightSideLine(true, mColor, 4, 0, 0)
                        .create();
            }
            return dividerOther;
        }
    }
}