package com.tony.view.activity.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tony.bean.HomeInfo;
import com.tony.constant.IdConstant;
import com.tony.view.activity.DataBaseActivity;
import com.tony.view.activity.PicDrawColorActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 首页目录适配器
 * @author: tonyxiong
 * @date: 2022/9/4
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeAdapterViewHolder> {

    private List<HomeInfo> mDataList = new ArrayList<>();

    public HomeAdapter(List<HomeInfo> dataList) {
        this.mDataList = dataList;
    }

    @NonNull
    @Override
    public HomeAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new HomeAdapterViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapterViewHolder holder, int position) {
        if (holder == null) {
            return;
        }
        HomeInfo homeInfo = mDataList.get(position);
        View view = holder.itemView;
        if (!(view instanceof TextView)) {
            return;
        }
        TextView tv = (TextView) view;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        tv.setLayoutParams(layoutParams);
        tv.setPadding(10,10,10,10);
        tv.setGravity(Gravity.CENTER);
        tv.setText(homeInfo.content);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = tv.getContext();
                switch (homeInfo.id) {
                    case IdConstant.ID_PIC_DRAW_COLOR:
                        context.startActivity(new Intent(context, PicDrawColorActivity.class));
                        break;
                    case IdConstant.ID_DATA_BASE:
                        context.startActivity(new Intent(context, DataBaseActivity.class));
                        break;

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class HomeAdapterViewHolder extends RecyclerView.ViewHolder {//静态和非静态区别？？？

        public HomeAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
