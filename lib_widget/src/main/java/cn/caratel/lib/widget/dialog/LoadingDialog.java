package cn.caratel.lib.widget.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import cn.caratel.lib.util.Util;
import cn.caratel.lib.widget.R;


/**
 * Created by xz on 2018/5/10.
 * 下载进度条dialog
 */

public class LoadingDialog {
    private Context mContext;
    private ProgressBar mProgressBar;
    private TextView mProgressTv;
    private AlertDialog mDialog;
    private View mView;
    private TextView mCancelTv;

    public LoadingDialog(Context context) {
        this.mContext = context;
    }


    private void initView() {
        mView = LayoutInflater.from(mContext).inflate(R.layout.lw_dialog_loding_layout, null);
        mProgressBar = (ProgressBar) mView.findViewById(R.id.min_appupdate_seekbar);
        mProgressTv = (TextView) mView.findViewById(R.id.min_appupdate_tv);
        mCancelTv = (TextView) mView.findViewById(R.id.dll_cacenl);
        mCancelTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dimiss();
            }
        });
    }

    public LoadingDialog createLoadingDialog() {
        initView();
        // 创建对话
        mDialog = new AlertDialog.Builder(mContext).create();
        // 设置返回键失
        mDialog.setCancelable(false);
        mDialog.setCanceledOnTouchOutside(false);
        // 显示对话
        mDialog.show();
        // 必须放到显示对话框下面，否则显示不出效果
        Window window = mDialog.getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        params.width = Util.getPhoneWidth(mContext) * 4 / 5;
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        params.gravity = Gravity.CENTER;
        window.setAttributes(params);
        // 加载布局组件
        mDialog.getWindow().setContentView(mView);
        return this;
    }


    public void refresProgress(float progress, long total) {
        if (mProgressBar != null) {
            mProgressBar.setProgress((int) (100 * progress));
        }
        if (mProgressTv != null) {
            mProgressTv.setText("正在下载:" + ((int) (100 * progress)) + "/100");
        }
    }

    public void refresProgress(float progress, long total, String showStr) {
        if (mProgressBar != null) {
            mProgressBar.setProgress((int) (100 * progress));
        }
        if (mProgressTv != null) {
            mProgressTv.setText(showStr + ((int) (100 * progress)) + "/100");
        }
    }

    public void refreshText(String str) {
        if (mProgressTv != null) {
            mProgressTv.setText(str);
        }
    }


    public void showCancel() {
        mCancelTv.setVisibility(View.INVISIBLE);
    }

    public void dimiss() {
        if (mDialog != null) {
            mDialog.cancel();
            mDialog.dismiss();
            mDialog = null;
            mProgressTv = null;
            mProgressBar = null;
            mCancelTv = null;
        }
    }
}