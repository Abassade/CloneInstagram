package com.example.user.cloneinstagram;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment_tab_two extends Fragment{

    RecyclerView recyclerView;
    Myadapter myadapter;
    List<Item> mItem;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_two, container, false);

        mItem = new ArrayList<>();

        recyclerView = view.findViewById(R.id.recycler);
        myadapter = new Myadapter(mItem, getContext());

        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));
        mItem.add(new Item("Abass", R.drawable.abs));


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(myadapter);

        return view;
    }
}

