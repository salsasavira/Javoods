package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment.AboutFragment;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment.CemilanFragment;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment.MakananFragment;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment.MinumanFragment;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment.SupportFragment;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager vp_pages;
    TabLayout tbl_pages;
    PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        vp_pages = (ViewPager) findViewById(R.id.vp_pages);
        pagerAdapter = new FragmentAdapter(getSupportFragmentManager());
        vp_pages.setAdapter(pagerAdapter);

        tbl_pages = (TabLayout) findViewById(R.id.tbl_pages);
        tbl_pages.setupWithViewPager(vp_pages);

        tbl_pages.setVisibility(View.GONE);
        vp_pages.setVisibility(View.GONE);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InputActivity.class));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment = null;
        int id = item.getItemId();

        if (id == R.id.nav_makanan) {
            tbl_pages.setVisibility(View.VISIBLE);
            vp_pages.setVisibility(View.VISIBLE);
            fragment = new MakananFragment();
            setTitle("Makanan");
        } else if (id == R.id.nav_minuman) {
            tbl_pages.setVisibility(View.GONE);
            vp_pages.setVisibility(View.GONE);
            fragment = new MinumanFragment();
            setTitle("Minuman");
        } else if (id == R.id.nav_cemilan) {
            tbl_pages.setVisibility(View.GONE);
            vp_pages.setVisibility(View.GONE);
            fragment = new CemilanFragment();
            setTitle("Cemilan");
        } else if (id == R.id.nav_about) {
            tbl_pages.setVisibility(View.GONE);
            vp_pages.setVisibility(View.GONE);
            fragment = new AboutFragment();
            setTitle("About Us");
        } else if (id == R.id.nav_support) {
            tbl_pages.setVisibility(View.GONE);
            vp_pages.setVisibility(View.GONE);
            fragment = new SupportFragment();
            setTitle("Support By");
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
