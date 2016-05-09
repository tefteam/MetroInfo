package com.example.andy.metroinfo.dto;

/**
 * Created by andy on 09.05.16.
 */
public class PlacesDTO {
    private int info;
    private int info_exit;

    public PlacesDTO(int info, int info_exit) {
        this.info = info;
        this.info_exit = info_exit;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getInfo_exit() {
        return info_exit;
    }

    public void setInfo_exit(int info_exit) {
        this.info_exit = info_exit;
    }
}
