package com.example.andy.metroinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


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

        TextView exitleft = (TextView) findViewById(R.id.exitleft);
        TextView exitright = (TextView) findViewById(R.id.exitright);

        ImageView firstmarket = (ImageView) findViewById(R.id.firstmarket);
        ImageView secondmarket = (ImageView) findViewById(R.id.secondmarket);
        ImageView thirdmarket = (ImageView) findViewById(R.id.thirdmarket);
        ImageView fourthmarket = (ImageView) findViewById(R.id.fourthmarket);
        ImageView fifthmarket = (ImageView) findViewById(R.id.fifthmarket);
        ImageView sixmarket = (ImageView) findViewById(R.id.sixmarket);
        ImageView sevenamarket = (ImageView) findViewById(R.id.sevenmarket);
        ImageView eightmarket = (ImageView) findViewById(R.id.eightmarket);

        if (number==110)
        {
            firstmarket.setImageResource(R.drawable.auchan_logo);
            secondmarket.setImageResource(R.drawable.silpo_logo);

        } else if (number==111)
        {
            firstmarket.setImageResource(R.drawable.silpo_logo);
            secondmarket.setImageResource(R.drawable.auchan_logo);
            thirdmarket.setImageResource(R.drawable.roshen_logo);
            fourthmarket.setImageResource(R.drawable.porter_pab_logo);
            fifthmarket.setImageResource(R.drawable.new_mail2_logo);

        }else if(number == 112)
        {
            firstmarket.setImageResource(R.drawable.cosmo_market_logo);
            secondmarket.setImageResource(R.drawable.roshen_logo);
        }


    }
}
