package cn.caratel.lib.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * @创建者 xz
 * @创建时间
 * @描述 纯色的圆角View
 */
public class FilletColorView extends View {
    public FilletColorView(Context context) {
        super(context);
    }

    public FilletColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FilletColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public FilletColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
