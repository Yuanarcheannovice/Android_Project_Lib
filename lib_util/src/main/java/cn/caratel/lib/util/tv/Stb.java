package cn.caratel.lib.util.tv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;

import java.lang.reflect.Method;

/**
 * Created by wurenhai on 2017/5/9.
 */

public final class Stb {

    @SuppressLint("HardwareIds")
    public static String getId(Context context) {
        String id = getId();
        if (TextUtils.isEmpty(id)) {
            id = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        }
        return id;
    }

    public static String getId() {
        return get("ro.di.stb_id", null);
    }

    public static boolean isFactoryTestFinish() {
        return "success".equals(get("ro.di.stb_factorytest_finish", null));
    }

    public static String get(String key, String def) {
        try {
            Class<?> clazz = Class.forName("android.os.SystemProperties");
            Method get = clazz.getMethod("get", String.class, String.class);
            return (String)get.invoke(clazz, key, def);
        } catch (Exception e) {
            e.printStackTrace();
            return def;
        }
    }

    public static boolean getBoolean(String key, boolean def) {
        try {
            Class<?> clazz = Class.forName("android.os.SystemProperties");
            Method get = clazz.getMethod("getBoolean", String.class, boolean.class);
            return (boolean) get.invoke(clazz, key, def);
        } catch (Exception e) {
            e.printStackTrace();
            return def;
        }
    }

}
