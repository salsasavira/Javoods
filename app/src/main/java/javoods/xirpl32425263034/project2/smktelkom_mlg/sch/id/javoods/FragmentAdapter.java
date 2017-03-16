package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment.CemilanFragment;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment.MakananFragment;

/**
 * Created by WINDOWS 8.1 on 16/3/2017.
 */

class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MakananFragment();
            case 1:
                return new CemilanFragment();
        }
        return null;

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            //
            //Your tab titles
            //
            case 0:
                return "Panas";
            case 1:
                return "Dingin";
            default:
                return null;
        }
    }
}
