package cn.caratel.lib.web;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONObject;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkView;

import cn.caratel.lib.http.GsonUtil;
import cn.caratel.lib.util.ToastUtil;

/**
 * @author xz
 */
public class WebActivity extends AppCompatActivity {
    static final String NEWSID = "newsId";
    static final String REQUEST_TOKEN = "request_token";
    static final String REQUEST_URL = "request_url";
    private String mNewsId;
    private String mRequestToken;
    private String mRequestUrl;
    private XWalkView mWeb;
    private TextView mTitleTv;
    private TextView mInfoTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        XWalkPreferences.setValue("enable-javascript", true);
//        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);
        setContentView(R.layout.lib_activity_web);

        Uri data = getIntent().getData();
        if (data != null) {
            mNewsId = getIntent().getData().getQueryParameter(NEWSID);
            mRequestToken = getIntent().getData().getQueryParameter(REQUEST_TOKEN);
            mRequestUrl = getIntent().getData().getQueryParameter(REQUEST_URL);
        }
        if (TextUtils.isEmpty(mNewsId)) {
            mNewsId = getIntent().getStringExtra(NEWSID);
            mRequestToken = getIntent().getStringExtra(REQUEST_TOKEN);
            mRequestUrl = getIntent().getStringExtra(REQUEST_URL);
        }
        mTitleTv = findViewById(R.id.lib_web_title);
        mInfoTv = findViewById(R.id.lib_web_info);
        mWeb = findViewById(R.id.lib_web);
        if (!TextUtils.isEmpty(mNewsId)) {
            initData();
        } else {
            ToastUtil.show("没有发现来源");
        }
    }

    private void initData() {
        OkHttpUtils
                .get()
                .url(mRequestUrl)
                .addParams("token", mRequestToken)
                .addParams("method", "newsDetail")
                .addParams("newsId", mNewsId)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(okhttp3.Call call, Exception e, int id) {
                        if (!TextUtils.equals(e.getMessage(), "Canceled") && !TextUtils.equals(e.getMessage(), "Socket closed")) {
                            ToastUtil.show("请求失败，请检查网络");
                        }
                        if (TextUtils.equals(e.getMessage(), "Socket closed")) {
                            ToastUtil.show("服务器连接超时");
                        }
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            NewsDetailDto datas = GsonUtil.jsonStringToObject(jsonObject.getString("datas"), NewsDetailDto.class);
                            mTitleTv.setText(datas.getNewsTitle());
                            mInfoTv.setText("编稿时间：" + datas.getNewsTime());
                            mWeb.loadDataWithBaseURL(null, datas.getNewsContent(), "text/html", "utf-8", null);
                        } catch (Exception e) {
                            ToastUtil.show("数据解析失败");
                            e.printStackTrace();
                        }
                    }
                });
    }

    @Override
    protected void onStop() {
        mWeb.onDestroy();
        super.onStop();
    }
}
