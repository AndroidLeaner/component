package com.tony.view.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.tony.R;
import com.tony.util.DrawableUtil;

/**
 * @description 着色器页面
 * @author: tonyxiong
 * @date: 2022/9/4
 */
public class DataBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_tint);
        tintDrawableColor();
    }

    private void tintDrawableColor() {
        ImageView ivTint = findViewById(R.id.iv_tint);
        ivTint.setEnabled(false);
        ivTint.setClickable(false);
        Drawable sourceDrawable = getResources().getDrawable(R.drawable.ic_music_voice);
        Drawable tintDrawable = DrawableUtil.tintDrawable(sourceDrawable, getResources().getColorStateList(R.color.selector_room_type));
        ivTint.setImageDrawable(tintDrawable);
    }
}
