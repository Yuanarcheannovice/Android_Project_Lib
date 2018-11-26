package cn.caratel.lib.widget.divider;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import cn.caratel.lib.widget.R;
import cn.caratel.lib.widget.divider.util.Y_Divider;
import cn.caratel.lib.widget.divider.util.Y_DividerBuilder;
import cn.caratel.lib.widget.divider.util.Y_DividerItemDecoration;


/**
 * Created by DEV on 2018/5/7.
 */

public class CommonlyDivider extends Y_DividerItemDecoration {

    private final int mColor;
    Y_Divider divider;

    public CommonlyDivider(Context context) {
        super(context);
        mColor = ContextCompat.getColor(context, R.color.lw_divider_color);

    }

    @Override
    public Y_Divider getDivider(int itemPosition) {
        if (divider == null) {
            divider = new Y_DividerBuilder()
                    .setBottomSideLine(true, mColor, 1, 0, 0)
                    .create();
        }
        return divider;

    }
}