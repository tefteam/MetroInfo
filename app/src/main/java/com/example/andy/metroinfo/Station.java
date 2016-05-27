package com.example.andy.metroinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
        TextView next_station = (TextView) findViewById(R.id.next_station);
        TextView previous_station = (TextView) findViewById(R.id.previous_station);

        textView.setText(intent.getStringExtra("SUBTITLE"));
        int number = Integer.parseInt(intent.getStringExtra("SUBTITLE"));

        ImageView photostation = (ImageView) findViewById(R.id.photostation);

        RecyclerView recyclerViewExits = (RecyclerView) findViewById(R.id.recyclerViewExits);
        RecyclerView recyclerViewPlaces = (RecyclerView) findViewById(R.id.recyclerViewPlaces);

        recyclerViewExits.setHasFixedSize(true);
        recyclerViewPlaces.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManagerexit = new LinearLayoutManager(this)
        {
            public boolean canScrollVertically(){
                return false;
            }
        };
        RecyclerView.LayoutManager layoutManagerplaces = new LinearLayoutManager(this){
            public boolean canScrollVertically(){
                return false;
            }
        };

        recyclerViewExits.setLayoutManager(layoutManagerexit);
        recyclerViewPlaces.setLayoutManager(layoutManagerplaces);

        List<ExitDTO> dataExits = new ArrayList<>();
        List<PlacesDTO> dataPlaces = new ArrayList<>();

        switch(number)
        {
            case 110:
                photostation.setImageResource(R.drawable.station_blue_drawable);
                next_station.setText(R.string.s111);

                dataExits.add(new ExitDTO(R.string.num1dot, R.string.exit_110));

                dataPlaces.add(new PlacesDTO(R.drawable.auchan_logo, R.string.num1));
                break;

            case 111:
                photostation.setImageResource(R.drawable.station_blue_drawable);
                next_station.setText(R.string.s112);
                previous_station.setText(R.string.s110);

                break;

            case 112:
                photostation.setImageResource(R.drawable.station_blue_drawable);
                next_station.setText(R.string.s113);
                previous_station.setText(R.string.s111);
                break;

            case 113:
                photostation.setImageResource(R.drawable.station_blue_drawable);
                next_station.setText(R.string.s114);
                previous_station.setText(R.string.s112);
                break;

            case 114:
                photostation.setImageResource(R.drawable.station_blue_drawable);
                next_station.setText(R.string.s115);
                previous_station.setText(R.string.s113);
                break;

            case 115:
                photostation.setImageResource(R.drawable.station_blue_drawable);
                next_station.setText(R.string.s116);
                previous_station.setText(R.string.s114);
                break;


            case 116:
                photostation.setImageResource(R.drawable.station_blue_drawable);
                next_station.setText(R.string.s117);
                previous_station.setText(R.string.s115);

                dataExits.add(new ExitDTO(R.string.num1dot, R.string.exit_116));
                break;

            case 117:
                dataExits.add(new ExitDTO(R.string.num1dot, R.string.exit_117));
                break;

            case 212:

                photostation.setImageResource(R.drawable.station_blue_drawable);
                next_station.setText(R.string.s213);
                next_station.setText(R.string.s211);

                dataExits.add(new ExitDTO(R.string.num1dot, R.string.exit_211));
                dataExits.add(new ExitDTO(R.string.num2dot, R.string.exit_211));
                dataExits.add(new ExitDTO(R.string.num3dot, R.string.exit_211));
                dataExits.add(new ExitDTO(R.string.num4dot, R.string.exit_211));

                dataPlaces.add(new PlacesDTO(R.drawable.dream_town, R.string.num1));
                dataPlaces.add(new PlacesDTO(R.drawable.dream_town, R.string.num2));
                dataPlaces.add(new PlacesDTO(R.drawable.urksibbank, R.string.num2));
                dataPlaces.add(new PlacesDTO(R.drawable.privat_bank_bankomat, R.string.num3));
                dataPlaces.add(new PlacesDTO(R.drawable.skyhall_logo, R.string.num3));
                dataPlaces.add(new PlacesDTO(R.drawable.logo_velyka_kyshenia, R.string.num3));
                dataPlaces.add(new PlacesDTO(R.drawable.apteka_low_price, R.string.num3));
                dataPlaces.add(new PlacesDTO(R.drawable.metropolis, R.string.num4));
                dataPlaces.add(new PlacesDTO(R.drawable.adidas_logo, R.string.num4));
                dataPlaces.add(new PlacesDTO(R.drawable.liniakino, R.string.num4));
                break;
        }


        RecyclerView.Adapter adapter = new ExitsAdapter(dataExits);
        recyclerViewExits.setAdapter(adapter);

        RecyclerView.Adapter adapter1 = new PlacesAdapter(dataPlaces);
        recyclerViewPlaces.setAdapter(adapter1);






    }
}
