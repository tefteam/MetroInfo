package com.example.andy.metroinfo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.andy.metroinfo.R;
import com.example.andy.metroinfo.dto.ExitDTO;
import com.example.andy.metroinfo.dto.PlacesDTO;

import java.util.List;

/**
 * Created by andy on 09.05.16.
 */
public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlacesAdapterItem>{

    List<PlacesDTO> data;

    public PlacesAdapter(List<PlacesDTO> data) {
        this.data = data;
    }

    @Override
    public PlacesAdapter.PlacesAdapterItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.places_card,parent,false);

        return new PlacesAdapterItem(view);
    }

    @Override
    public void onBindViewHolder(PlacesAdapter.PlacesAdapterItem holder, int position) {
        PlacesDTO placesDTO = data.get(position);


        holder.info.setImageResource(placesDTO.getInfo());
        holder.info_exit.setText(placesDTO.getInfo_exit());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class PlacesAdapterItem extends RecyclerView.ViewHolder
    {
        ImageView info;
        TextView info_exit;

        public PlacesAdapterItem(View itemView) {
            super(itemView);

            info = (ImageView) itemView.findViewById(R.id.info);
            info_exit = (TextView) itemView.findViewById(R.id.info_exit);
        }
    }
}
