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
        data.add(new MetroInfoDTO(R.string.heroivdnipra,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.minskaya,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.obolon,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.petrovka,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.tarasshevchenko,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.kontraktovaya,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.poshtovaya,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.maidan,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.ploshadlva,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.olimpiiskaya,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.dvorezukraine,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.lybidskaya,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.demiivskaya,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.goloseevskaya,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.vasilkovskaya,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.vistavochniycentr,Integer.toString(i = i+1), R.drawable.shape_blue));
        data.add(new MetroInfoDTO(R.string.ipodrom,Integer.toString(i = i+1), R.drawable.shape_blue));

        return data;
    }
}
