package cn.caratel.lib.util;


import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;

/**
 * Created by xz on 2018/6/4.
 *
 */

public class PageKeyUtil {



    /**
     * 不否允许Rv最后一个itemView是否有向下移动焦点的Key事件
     */
    public static View.OnKeyListener initLastViewKey() {
        return initLastViewKey(null);
    }

    /**
     * 是否允许Rv最后一个itemView是否有向下移动焦点的Key事件
     * 给Rv中最后一个View 设置key事件，让焦点向下移动时能到 某个view处
     *
     * @param nextView Rv中最后一个view准备移动到哪个view上
     */
    public static View.OnKeyListener initLastViewKey(final View nextView) {
        return new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //保证最后一个item的焦点向下移动时，会在指定view处
                if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN) {
                    if (event.getAction() == KeyEvent.ACTION_DOWN) {
                        if (nextView != null) {
                            nextView.requestFocus();
                        }
                    }
                    return true;
                }
                return false;
            }
        };
    }

    /**
     * 限制上一页只能向rv 转移焦点
     * 上一页:
     */
    public static void onTopKey(View view, final RecyclerView rv) {
        view.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_DPAD_UP) {
                    if (event.getAction() == KeyEvent.ACTION_DOWN) {
                        if (rv.getChildCount() > 0) {
                            rv.getChildAt(rv.getChildCount() - 1).requestFocus();
                        }
                    }
                    return true;
                } else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT) {
                    //去掉左移焦点
                    return true;
                }
                return false;
            }
        });
    }

    /**
     * 限制下一页只能向rv 转移焦点
     */
    public static void onNextKey(View view, final RecyclerView rv) {
        view.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_DPAD_UP) {
                    if (event.getAction() == KeyEvent.ACTION_DOWN) {
                        if (rv.getChildCount() > 0) {
                            rv.getChildAt(rv.getChildCount() - 1).requestFocus();
                        }
                    }
                    return true;
                }
                return false;
            }
        });
    }
}
