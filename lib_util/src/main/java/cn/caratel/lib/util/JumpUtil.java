package cn.caratel.lib.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class JumpUtil {

    /**
     * 打开 浏览器app
     */
    public static void openWebActivity(Context context, String url, String newId, String tokenStr) {
        try {
            Intent intent = new Intent();
            Uri uri = Uri.parse("web://cn.caratel.web:12345/1.web?newsId=" + newId + "&request_token=" + tokenStr + "&request_url=" + url);
            //注：setData、setDataAndType、setType 这三种方法只能单独使用，不可共用
            //单独以 setData 方法设置 URI
            //intent.setData(uri);
            //单独以 seType 方法设置 Type
            //intent.setType("text/plain");
            //上面分步骤设置是错误的，要么以 setDataAndType 方法设置 URI 及 mime type
            intent.setDataAndType(uri, "text/plain");
            context.startActivity(intent);
        } catch (Exception e) {
            ToastUtil.show("未找到浏览器模块");
            e.printStackTrace();
        }
    }

    public static void openWebActivityToClass(Context context, String url, String newId, String tokenStr) {
        try {
            Intent intent = new Intent();
            intent.putExtra("newsId", newId);
            intent.putExtra("request_token", tokenStr);
            intent.putExtra("request_url", url);
            intent.setClassName("cn.caratel.tv.lib.web", "cn.caratel.tv.lib.web.WebActivity");
            context.startActivity(intent);
        } catch (Exception e) {
            ToastUtil.show("未找到浏览器模块");
            e.printStackTrace();
        }
    }
}
