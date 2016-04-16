package com.example.andy.metroinfo;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.andy.metroinfo.adapter.TabsPagerFragmentAdapter;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;

public class MainActivity extends AppCompatActivity {

    private static final int LAYOUT = R.layout.activity_main;
    private ViewPager viewpager;
    private TabLayout tabLayout;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        initToolbar();
        initNavigationView();
        initTabs();

    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer(toolbar);
    }

    private void initTabs() {
        viewpager = (ViewPager) findViewById(R.id.viewPager);
        TabsPagerFragmentAdapter adapter = new TabsPagerFragmentAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewpager);
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

    private void initNavigationView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar, R.string.open, R.string.closed);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        //NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);


    }
    private void showNotification(){
        viewpager.setCurrentItem(Constants.second);
    }
}
