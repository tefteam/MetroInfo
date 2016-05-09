package com.example.andy.metroinfo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.andy.metroinfo.R;
import com.example.andy.metroinfo.dto.ExitDTO;

import java.util.List;

/**
 * Created by andy on 09.05.16.
 */
public class ExitsAdapter extends RecyclerView.Adapter<ExitsAdapter.ExitAdapterItem>{

    public List<ExitDTO> data;

    public ExitsAdapter(List<ExitDTO> data) {
        this.data = data;
    }

    @Override
    public ExitsAdapter.ExitAdapterItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.exitcard, parent, false);

        return new ExitAdapterItem(view);
    }

    @Override
    public void onBindViewHolder(ExitAdapterItem holder, int position) {
        ExitDTO exitDTO = data.get(position);
        holder.exit.setText(exitDTO.getExit());
        holder.exit_ind.setText(exitDTO.getExit_ind());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class ExitAdapterItem extends RecyclerView.ViewHolder
    {
        TextView exit_ind;
        TextView exit;

        public ExitAdapterItem(final View itemView) {
            super(itemView);
            exit_ind = (TextView) itemView.findViewById(R.id.exit_ind);
            exit = (TextView) itemView.findViewById(R.id.exit);
        }
    }
}
