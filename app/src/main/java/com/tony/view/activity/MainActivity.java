package com.tony.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tony.R;
import com.tony.bean.HomeInfo;
import com.tony.constant.IdConstant;
import com.tony.view.activity.adapter.HomeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] homeContentArray = new String[]{
            "图片过滤器"
    };
    private int[] homeIdArray = new int[]{
            IdConstant.ID_PIC_DRAW_COLOR
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.rv_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        HomeAdapter homeAdapter = new HomeAdapter(getHomeInfoList());
        recyclerView.setAdapter(homeAdapter);
    }

    private List<HomeInfo> getHomeInfoList() {
        int size = homeContentArray.length;
        List<HomeInfo> homeInfoList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            HomeInfo homeInfo = new HomeInfo();
            homeInfo.id = homeIdArray[i];
            homeInfo.content = homeContentArray[i];
            homeInfoList.add(homeInfo);
        }
        return homeInfoList;
    }
}