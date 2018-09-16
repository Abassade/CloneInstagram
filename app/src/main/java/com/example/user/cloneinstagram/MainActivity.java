package com.example.user.cloneinstagram;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.nfc.Tag;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    SectionPageAdapter adapter;
    ViewPager pager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setItemTextColor(ColorStateList.valueOf(Color.TRANSPARENT));

        pager = findViewById(R.id.pager);
        tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager, true);
        tabLayout.setSelectedTabIndicatorColor(Color.TRANSPARENT);
        pager.setCurrentItem(1);
        setUpViewPager(pager);

        adapter = new SectionPageAdapter(getSupportFragmentManager());


        tabLayout.getTabAt(0).setIcon(R.drawable.ic_photo_camera_black_24dp);
        tabLayout.getTabAt(1).setText("Instagram");
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_perm_contact_calendar_black_24dp);

    }

    private void setUpViewPager(ViewPager pager) {

        SectionPageAdapter sectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
        sectionPageAdapter.addFragment(new Fragment_tab_one());
        sectionPageAdapter.addFragment(new Fragment_tab_two());
        sectionPageAdapter.addFragment(new Fragment_tab_three());
        pager.setAdapter(sectionPageAdapter);
    }

}
