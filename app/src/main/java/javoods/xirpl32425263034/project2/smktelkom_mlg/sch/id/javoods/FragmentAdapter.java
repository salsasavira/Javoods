package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment.MakananFragment;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment.mDinginFragment;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment.mPanasFragment;

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
                return new mPanasFragment();
            case 1:
                return new mDinginFragment();
            case 2:
                return new MakananFragment();
        }
        return null;

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            //
            //Your tab titles
            //
            case 0:
                return "Daging";
            case 1:
                return "Sayuran";
            case 2:
                return "Ikan";
            default:
                return null;
        }
    }
}
