package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;



public class Fragment2 extends Fragment{   //继承自Fragment类的Fragment3类。在该类中，重写了onCreateView方法用于创建视图
    private RecyclerView recyclerView;
    private List<String> list= new ArrayList<>();
    private Context context;
    private Myadapter myadapter;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.tab2,container,false);
        context=view.getContext();
        recyclerView=view.findViewById(R.id.recycleview);
        list=new ArrayList();
        for (int i=0; i<9;i++)
        {
            list.add("这是第"+i+"行数据");
        }
        myadapter = new Myadapter(context,list);
        recyclerView.setAdapter(myadapter);
        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);

        return view;

    }
}