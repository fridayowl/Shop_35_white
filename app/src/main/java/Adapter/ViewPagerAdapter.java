package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragment.ViewpagerFragment_35;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    int mNoOfTabs;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);


    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {

            case 0:
                ViewpagerFragment_35 tab1 = new ViewpagerFragment_35();
                return tab1;

            case 1:
                ViewpagerFragment_35 tab2 = new ViewpagerFragment_35();
                return tab2;

            case 2:
                ViewpagerFragment_35 tab3 = new ViewpagerFragment_35();
                return tab3;


            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
