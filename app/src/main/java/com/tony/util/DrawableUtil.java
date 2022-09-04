package com.tony.util;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

import androidx.core.graphics.drawable.DrawableCompat;

/**
 * drawable相关工具类
 *
 * @description drawable相关工具类
 * @author: tonyxiong
 * @date: 2022/3/22
 */
public class DrawableUtil {

    /**
     * 对图片单一着色着色器着色
     */
    public static Drawable tintDrawable(Drawable drawable, ColorStateList colors) {
        final Drawable wrappedDrawable = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(wrappedDrawable, colors);
        return wrappedDrawable;
    }

    /**
     * 着色器：对图片不同状态着色
     *
     * @param drawable 要着色的drawable
     * @param color 颜色的整数值
     */
    public static Drawable tintDrawable(Drawable drawable, int color) {
        final Drawable wrappedDrawable = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(wrappedDrawable, color);
        return wrappedDrawable;
    }

}
