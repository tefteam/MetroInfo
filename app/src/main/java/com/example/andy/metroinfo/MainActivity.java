package com.example.andy.metroinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.andy.metroinfo.adapter.TabsAdapter;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends AppCompatActivity {

    private static final int LAYOUT = R.layout.activity_main;
    private ViewPager viewpager;
    private TabLayout tabLayout;
    private DrawerLayout drawerLayout;
    public Toolbar toolbar;

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
        TabsAdapter adapter = new TabsAdapter(getApplicationContext(), getSupportFragmentManager());
        viewpager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewpager);
    }

    private void drawer(Toolbar toolbar) {
        AccountHeader accountHeader = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.train2)
                .build();

        Drawer drawer = new DrawerBuilder()
                .withActivity(this)
                .withHasStableIds(false)
                .withToolbar(toolbar)
                .withScrollToTopAfterClick(true)
                .withAccountHeader(accountHeader)
                .withActionBarDrawerToggle(true)
                .addDrawerItems(
                        new PrimaryDrawerItem()
                                .withName(R.string.mainpage)
                                .withIcon(R.drawable.ic_view_list_black_24dp)
                                .withIdentifier(1),

                        new PrimaryDrawerItem()
                                .withName(R.string.mappage)
                                .withIcon(R.drawable.ic_map_black_24dp)
                                .withIdentifier(2)
                                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                                    @Override
                                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                                        Intent intent = new Intent(MainActivity.this, Map.class);
                                        startActivity(intent);
                                        return false;
                                    }
                                })
                                .withSelectable(false),



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
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void initNavigationView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);



        //NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);


    }
    private void showNotification(){
        viewpager.setCurrentItem(Constants.second);
    }
}
