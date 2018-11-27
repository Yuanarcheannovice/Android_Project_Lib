package cn.caratel.lib_module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

//    private VLCTextureVideoView mVideoView;
//    private boolean isVideoBig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView textView=findViewById(R.id.am_tv);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        textView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//
//            }
//        });
//
//        mVideoView = findViewById(R.id.am_video);
//        mVideoView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//
//            }
//        });
//        mVideoView.setOnStateChangedListener(new VLCTextureVideoView.OnStateChangedListener() {
//            @Override
//            public void onStateChanged(VLCTextureVideoView view, VLCTextureVideoView.State state) {
//                switch (state) {
//                    case PREPARING:
//                        view.play();
//                        break;
//                    case ERROR:
//                        //  ToastUtil.show("播放出错");
//                        break;
//                    case STOPPED:
//                        break;
//                    default:
//                        break;
//                }
//            }
//        });
//        mVideoView.setOnKeyListener(new View.OnKeyListener() {
//            /**
//             * 1、"OK"键播放，暂停，
//             * 2、左右键播放进度控制，按下左、右键，快进或快退10秒，长按拉动进度条进行快进快退
//             * 3、上下键可以播放上一个视频，以及下一个视频
//             * 返回键退出焦点
//             */
//            @Override
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
////                if (event.getAction() == KeyEvent.ACTION_UP) {
////                    return true;
////                }
////                if (event.getAction() == KeyEvent.ACTION_DOWN) {
////                    switch (keyCode) {
////                        case KeyEvent.KEYCODE_BACK:
////                            //updateVideo(false);
////                            return true;
////                        case KeyEvent.KEYCODE_ESCAPE:
////                         //   updateVideo(false);
////                            return true;
////                        case KeyEvent.KEYCODE_DPAD_UP:
////                            //上
//////                            switchVideo(false);
////                            return true;
////                        case KeyEvent.KEYCODE_DPAD_DOWN:
////                            //下
//////                            switchVideo(true);
////                            return true;
////                        case KeyEvent.KEYCODE_DPAD_LEFT:
////                            //左
////                            return true;
////                        case KeyEvent.KEYCODE_DPAD_RIGHT:
////                            //右
////                            return true;
////                        case KeyEvent.KEYCODE_DPAD_CENTER:
//////                            if (isVideoBig) {
//////                                //确认键
//////                                if (mVideoView.getState() == VLCTextureVideoView.State.PAUSED) {
//////                                    mVideoView.onVideoResume();
//////                                } else {
//////                                    mVideoView.onVideoPause();
//////                                }
//////                            }
////                            return true;
////                        default:
////                            break;
////                    }
////                }
//                return false;
//            }
//        });
//        mVideoView.prepare("http://42.48.91.149:8000/jh/upload//picture/b5c3a73af461492b84a8a8dde9cacb8b.mp4");
//    }
//
//
//    /**
//     * 修改videoView的大小
//     */
//    public void updateVideo(final boolean isBig) {
//        mVideoView.post(new Runnable() {
//            @Override
//            public void run() {
//                if (mVideoView != null) {
//                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) mVideoView.getLayoutParams();
//                    if (isBig) {
//                        layoutParams.height = ConstraintLayout.LayoutParams.MATCH_PARENT;
//                        layoutParams.width = ConstraintLayout.LayoutParams.MATCH_PARENT;
//                        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//                        layoutParams.topToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
//                        layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
//                        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
//                        mVideoView.setPadding(0, 0, 0, 0);
//                        isVideoBig = true;
//                    } else {
//                        layoutParams.width = DpToUtil.dip2px(MainActivity.this, 501);
//                        layoutParams.height = DpToUtil.dip2px(MainActivity.this, 274);
////                        layoutParams.leftToLeft = mVideoView.getParent;
////                        layoutParams.topToBottom = R.id.am_video_layout;
////                        layoutParams.bottomToBottom = R.id.am_video_layout;
////                        layoutParams.rightToRight = R.id.am_video_layout;
//                        int padd = DpToUtil.dip2px(MainActivity.this, 3);
//                        mVideoView.setPadding(padd, padd, padd, padd);
//                        isVideoBig = false;
//                    }
//                    mVideoView.setLayoutParams(layoutParams);
//                }
//            }
//        });
    }
}
