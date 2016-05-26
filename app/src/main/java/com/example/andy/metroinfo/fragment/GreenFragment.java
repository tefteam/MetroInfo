package com.example.andy.metroinfo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

public class GreenFragment extends DefaultFragment {

    public static final int LAYOUT = R.layout.green;

    public static GreenFragment getInstance(Context context) {
        Bundle args = new Bundle();
        GreenFragment fragment = new GreenFragment();

        fragment.setArguments(args);
        fragment.setTitle(context.getString(R.string.green));
        fragment.setContext(context);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewGreen);
        recyclerView.setAdapter(new MetroInfoAdapterLIst(createData()));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        return view;
    }

    public List<MetroInfoDTO> createData() {
        List<MetroInfoDTO> data = new ArrayList<>();

        int i = 309;
        data.add(new MetroInfoDTO(R.string.s310,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s311,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s312,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s314,Integer.toString(i = i+2), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s315,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s316,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s317,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s318,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s319,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s321,Integer.toString(i = i+2), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s322,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s323,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s324,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s325,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s326,Integer.toString(i = i+1), R.drawable.shape_green));
        data.add(new MetroInfoDTO(R.string.s327,Integer.toString(i = i+1), R.drawable.shape_green));


        return data;
    }
}
