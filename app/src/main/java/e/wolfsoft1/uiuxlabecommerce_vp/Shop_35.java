package e.wolfsoft1.uiuxlabecommerce_vp;

import android.graphics.Color;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.Shop_35_Adapter;
import Adapter.ViewPagerAdapter;
import Model.Shop_35_Model;
import me.relex.circleindicator.CircleIndicator;

public class Shop_35 extends AppCompatActivity {

    ViewPager viewpager;
    private ViewPagerAdapter a1;
    CircleIndicator indicator;


    private RecyclerView recyclerview_35;
    private ArrayList<Shop_35_Model> apple_jobs_list;
    private Shop_35_Adapter adapter;

    String text[] = {"Grey melange in colour, this T-shirt from TOM TAILOR showcases.", "Style and comfort! These two attributes are well-defined.", "Play with the effortless groove of beach-inspired prints this summer.", "This green shirt, featuring a printed hem from People."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop35_main);

//viewpager
        viewpager = findViewById(R.id.viewpager);
        CircleIndicator indicator = findViewById(R.id.indicator);
        a1 = new ViewPagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(a1);

        indicator.setViewPager(viewpager);
        a1.registerDataSetObserver(indicator.getDataSetObserver());

        //recyclerview
        recyclerview_35 = findViewById(R.id.recyclerview_35);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Shop_35.this);
        recyclerview_35.setLayoutManager(layoutManager);
        recyclerview_35.setItemAnimator(new DefaultItemAnimator());

        apple_jobs_list = new ArrayList<>();

        for (int i = 0; i < text.length; i++) {
            Shop_35_Model model = new Shop_35_Model(text[i]);
            apple_jobs_list.add(model);

        }

        adapter = new Shop_35_Adapter(Shop_35.this, apple_jobs_list);
        recyclerview_35.setAdapter(adapter);

    }
}
