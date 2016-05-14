package com.example.andy.metroinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andy.metroinfo.adapter.ExitsAdapter;
import com.example.andy.metroinfo.adapter.PlacesAdapter;
import com.example.andy.metroinfo.dto.ExitDTO;
import com.example.andy.metroinfo.dto.PlacesDTO;

import java.util.ArrayList;
import java.util.List;


public class Station extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        getSupportActionBar().setTitle(intent.getStringExtra("TITLE"));


        TextView textView = (TextView) findViewById(R.id.subtitle);
        textView.setText(intent.getStringExtra("SUBTITLE"));
        int number = Integer.parseInt(intent.getStringExtra("SUBTITLE"));

        ImageView photostation = (ImageView) findViewById(R.id.photostation);

        RecyclerView recyclerViewExits = (RecyclerView) findViewById(R.id.recyclerViewExits);
        RecyclerView recyclerViewPlaces = (RecyclerView) findViewById(R.id.recyclerViewPlaces);

        recyclerViewExits.setHasFixedSize(true);
        recyclerViewPlaces.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManagerexit = new LinearLayoutManager(this);
        RecyclerView.LayoutManager layoutManagerplaces = new LinearLayoutManager(this);

        recyclerViewExits.setLayoutManager(layoutManagerexit);
        recyclerViewPlaces.setLayoutManager(layoutManagerplaces);

        List<ExitDTO> dataExits = new ArrayList<>();
        List<PlacesDTO> dataPlaces = new ArrayList<>();

        switch(number)
        {
            case 110:
                photostation.setImageResource(R.drawable.metroexits);

                dataExits.add(new ExitDTO(R.string.num1dot, R.string.exit_110));

                dataPlaces.add(new PlacesDTO(R.drawable.auchan_logo, R.string.num1dot));
                break;

            case 111:
                break;
        }


        RecyclerView.Adapter adapter = new ExitsAdapter(dataExits);
        recyclerViewExits.setAdapter(adapter);

        RecyclerView.Adapter adapter1 = new PlacesAdapter(dataPlaces);
        recyclerViewPlaces.setAdapter(adapter1);

        photostation.setImageResource(R.drawable.metroexits);




    }
}
