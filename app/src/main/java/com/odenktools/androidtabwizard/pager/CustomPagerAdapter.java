package com.odenktools.androidtabwizard.pager;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.List;
import com.odenktools.androidtabwizard.BaseFragment;

/**
 *
 * @param <Fragment>
 */
public abstract class CustomPagerAdapter<Fragment extends BaseFragment> extends FragmentStatePagerAdapter {

    List<Fragment> fragments;
    List<String> titles;
    private boolean doNotifyDataSetChangedOnce = false;

    public CustomPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public CustomPagerAdapter(FragmentManager fm, List<Fragment> fragments, List<String> titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    @Override
    public abstract Fragment getItem(int position);

    @Override
    public int getCount() {
        if (doNotifyDataSetChangedOnce) {
            doNotifyDataSetChangedOnce = false;
            this.notifyDataSetChanged();
        }
        return fragments.size();
    }

    public List<Fragment> getFragments() {
        return fragments;
    }

    public void setFragments(List<Fragment> fragments) {
        this.fragments = fragments;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }
}

