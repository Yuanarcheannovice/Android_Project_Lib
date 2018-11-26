package cn.caratel.lib.util;

import android.text.TextUtils;
import android.util.Log;

/**
 * @创建者
 * @创建时间
 * @描述
 */
public class ShowLogUtil {

    public static void e(String tag, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        Log.e(tag, str);
    }

    public static void e(String tag, String str, String... params) {

        Log.e(tag, String.format(str, params));
    }


    public static void i(String tag, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        Log.i(tag, str);
    }


    public static void d(String tag, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        Log.d(tag, str);
    }
}
