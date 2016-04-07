package com.example.andy.metroinfo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        
    }

    private void drawer(Toolbar toolbar) {
        AccountHeader accountHeader = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.train)
                .build();

        Drawer drawer = new DrawerBuilder()
                .withActivity(this)
                .withDisplayBelowStatusBar(true)
                .withToolbar(toolbar)
                .withAccountHeader(accountHeader)
                .addDrawerItems(
                        new PrimaryDrawerItem()
                                .withName(R.string.mainpage)
                                .withIcon(R.drawable.ic_view_list_black_24dp)
                                .withIdentifier(1),

                        new PrimaryDrawerItem()
                                .withName(R.string.mappage)
                                .withIcon(R.drawable.ic_map_black_24dp)
                                .withIdentifier(2),

                        new DividerDrawerItem(),

                        new SecondaryDrawerItem()
                                .withName(R.string.settings)
                                .withIcon(R.drawable.ic_settings_black_24dp)
                                .withIdentifier(3),

                        new SecondaryDrawerItem()
                                .withName(R.string.aboutapp)
                                .withIcon(R.drawable.ic_question_answer_black_24dp)
                                .withIdentifier(4)
                )

                .build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
