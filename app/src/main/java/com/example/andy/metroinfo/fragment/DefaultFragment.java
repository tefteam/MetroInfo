package com.example.andy.metroinfo.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public abstract class DefaultFragment extends Fragment {
    protected View view;
    protected Context context;
    private String title;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
