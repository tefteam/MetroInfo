package com.example.andy.metroinfo.dto;

/**
 * Created by andy on 09.05.16.
 */
public class ExitDTO {
    private int exit_ind;
    private int exit;

    public ExitDTO(int exit_ind, int exit) {
        this.exit_ind = exit_ind;
        this.exit = exit;
    }

    public int getExit_ind() {
        return exit_ind;
    }

    public void setExit_ind(int exit_ind) {
        this.exit_ind = exit_ind;
    }

    public int getExit() {
        return exit;
    }

    public void setExit(int exit) {
        this.exit = exit;
    }
}
