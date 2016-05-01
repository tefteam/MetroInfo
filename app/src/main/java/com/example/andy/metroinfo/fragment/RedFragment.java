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

public class RedFragment extends DefaultFragment {

    public static final int LAYOUT = R.layout.red;

    public static RedFragment getInstance(Context context) {
        Bundle args = new Bundle();
        RedFragment fragment = new RedFragment();

        fragment.setArguments(args);
        fragment.setTitle(context.getString(R.string.red));
        fragment.setContext(context);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewRed);
        recyclerView.setAdapter(new MetroInfoAdapterLIst(createData()));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        //recyclerView.addOnItemTouchListener(
          //      new RecyclerItemClickListener(context, new RecyclerItemClickListener.OnItemClickListener){


            //    }
        return view;
    }

    public List<MetroInfoDTO> createData() {
        List<MetroInfoDTO> data = new ArrayList<>();
        int i = 109;
        data.add(new MetroInfoDTO(R.string.akademgorodok,Integer.toString(i = i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.zhitomyrskaya,Integer.toString(i = i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.sviatoshon,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.nivki,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.berest,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.shylyavska,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.politex,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.vokzal,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.university,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.teatr,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.krest,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.arsenalnaya,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.dnipro,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.hydropark,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.leftbank,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.darnytsya,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.chernigovskaya,Integer.toString(i=i+1), R.drawable.shape_red));
        data.add(new MetroInfoDTO(R.string.lesnaya,Integer.toString(i+1), R.drawable.shape_red));
        return data;
    }
}
