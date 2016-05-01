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



        return data;
    }
}
