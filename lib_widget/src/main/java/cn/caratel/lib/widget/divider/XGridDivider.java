package cn.caratel.lib.widget.divider;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;

import cn.caratel.lib.widget.R;
import cn.caratel.lib.widget.divider.util.Y_Divider;
import cn.caratel.lib.widget.divider.util.Y_DividerBuilder;
import cn.caratel.lib.widget.divider.util.Y_DividerItemDecoration;


/**
 * Created by Administrator on 4027/24/2 0002.
 */

public class XGridDivider extends Y_DividerItemDecoration {
    /**
     * 横着的数量
     */
    private final int mCount;
    /**
     * 颜色
     */
    private final int mColor;
    /**
     * 分割线宽度
     */
    private final int mWidth;

    private Y_Divider divider1;
    private Y_Divider divider2;

    public XGridDivider(Context context, @ColorRes int color, int horizontalCount, int dividerWidth) {
        super(context);
        mWidth = dividerWidth;
        mCount = horizontalCount;
        mColor = ContextCompat.getColor(context, color);
    }

    @Override
    public Y_Divider getDivider(int itemPosition) {
        if (itemPosition < mCount) {
            if (divider1 == null) {
                divider1 = new Y_DividerBuilder()
                        .setLeftSideLine(true, mColor, mWidth / 2, 0, 0)
                        .setTopSideLine(true, mColor, mWidth, 0, 0)
                        .setRightSideLine(true, mColor, mWidth / 2, 0, 0)
                        .create();
            }
            return divider1;
        } else {
            if (divider2 == null) {
                divider2 = new Y_DividerBuilder()
                        .setLeftSideLine(true, mColor, mWidth / 2, 0, 0)
                        .setTopSideLine(true, mColor, mWidth, 0, 0)
                        .setRightSideLine(true, mColor, mWidth / 2, 0, 0)
                        .setBottomSideLine(true, mColor, mWidth, 0, 0)
                        .create();
            }
            return divider2;
        }
    }
}
