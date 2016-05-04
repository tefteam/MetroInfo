package com.example.andy.metroinfo.adapter;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andy.metroinfo.Map;
import com.example.andy.metroinfo.R;
import com.example.andy.metroinfo.Station;
import com.example.andy.metroinfo.dto.MetroInfoDTO;

import java.util.List;

/**
 * Created by andy on 23.04.16.
 */
public class MetroInfoAdapterLIst extends RecyclerView.Adapter<MetroInfoAdapterLIst.MetroinfoItem>
{

    public List<MetroInfoDTO> data;

    public MetroInfoAdapterLIst(List<MetroInfoDTO> data) {
        this.data = data;
    }

    @Override
    public MetroinfoItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent,false);

        return new MetroinfoItem(view);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onBindViewHolder(MetroinfoItem holder, int position) {
        MetroInfoDTO metroInfoDTO = data.get(position);
        holder.title.setText(metroInfoDTO.getTitle());
        holder.subtitle.setText(metroInfoDTO.getSubtitle());
        holder.shape.setImageResource(metroInfoDTO.getCircle());

    }

    public static class MetroinfoItem extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView title;
        TextView subtitle;
        ImageView shape;




        public MetroinfoItem(final View view) {
            super(view);

            cardView = (CardView) itemView.findViewById(R.id.cardView);
            title = (TextView) itemView.findViewById(R.id.title);
            subtitle = (TextView) itemView.findViewById(R.id.subtitle);
            shape = (ImageView) itemView.findViewById(R.id.shape);



            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), Station.class);
                    intent.putExtra("TITLE", title.getText().toString());
                    intent.putExtra("SUBTITLE", subtitle.getText().toString());
                    v.getContext().startActivity(intent);
                }
            });


        }
    }

}
