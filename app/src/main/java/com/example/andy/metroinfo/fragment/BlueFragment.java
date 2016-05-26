package com.example.andy.metroinfo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andy.metroinfo.R;
import com.example.andy.metroinfo.adapter.MetroInfoAdapterLIst;
import com.example.andy.metroinfo.dto.MetroInfoDTO;

import java.util.ArrayList;
import java.util.List;

public class BlueFragment extends DefaultFragment {

    public static final int LAYOUT = R.layout.blue;
    
    public static BlueFragment getInstance(Context context) {
        Bundle args = new Bundle();
        BlueFragment fragment = new BlueFragment();

        fragment.setArguments(args);
        fragment.setTitle(context.getString(R.string.blue));
        fragment.setContext(context);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewBlue);
        recyclerView.setAdapter(new MetroInfoAdapterLIst(createData()));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        return view;
    }

    public List<MetroInfoDTO> createData() {
        List<MetroInfoDTO> data = new ArrayList<>();

        int i = 209;
        data.add(new MetroInfoDTO(R.string.s210,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s211,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s212,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s213,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s214,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s215,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s216,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s217,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s218,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s219,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s220,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s221,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s222,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s223,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s224,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s225,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.s226,Integer.toString(i = i+1), R.drawable.shape_blue));

        return data;
    }
}
