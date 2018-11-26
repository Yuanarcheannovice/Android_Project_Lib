package cn.caratel.lib.widget.divider;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import cn.caratel.lib.widget.R;
import cn.caratel.lib.widget.divider.util.Y_Divider;
import cn.caratel.lib.widget.divider.util.Y_DividerBuilder;
import cn.caratel.lib.widget.divider.util.Y_DividerItemDecoration;


/**
 * Created by Administrator on 4027/24/2 0002.
 */

public class XGridImageDivider extends Y_DividerItemDecoration {


    private final int mColor;
    private Y_Divider divider1;
    private Y_Divider divider2;
    private Y_Divider divider3;
    private Y_Divider dividerNone;

    public XGridImageDivider(Context context) {
        super(context);
        mColor = ContextCompat.getColor(context, R.color.lw_transparent);
        dividerNone = new Y_DividerBuilder().create();
    }

    @Override
    public Y_Divider getDivider(int itemPosition) {
        if (itemPosition < 3) {
            if (divider1 == null) {
                divider1 = new Y_DividerBuilder()
                        .setLeftSideLine(true, mColor, 10, 0, 0)
                        .setTopSideLine(true, mColor, 10, 0, 0)
                        .setRightSideLine(true, mColor, 10, 0, 0)
                        .create();
            }
            return divider1;
        } else {
            if (divider2 == null) {
                divider2 = new Y_DividerBuilder()
                        .setLeftSideLine(true, mColor, 10, 0, 0)
                        .setTopSideLine(true, mColor, 10, 0, 0)
                        .setRightSideLine(true, mColor, 10, 0, 0)
                        .setBottomSideLine(true, mColor, 10, 0, 0)
                        .create();
            }
            return divider2;
        }
    }
}
