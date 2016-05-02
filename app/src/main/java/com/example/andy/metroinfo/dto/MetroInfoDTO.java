package com.example.andy.metroinfo.dto;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;


public class MetroInfoDTO {
    private int title;
    private String subtitle;
    private int circle;

    public MetroInfoDTO(int title, String subtitle, int circle) {
        this.title = title;
        this.subtitle = subtitle;
        this.circle = circle;

    }

    public int getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public int getCircle() {
        return circle;
    }


}

