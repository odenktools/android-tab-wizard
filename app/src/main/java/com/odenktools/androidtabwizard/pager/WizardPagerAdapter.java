package com.odenktools.androidtabwizard.pager;

import android.support.v4.app.FragmentManager;

import com.odenktools.androidtabwizard.BaseFragment;

import java.util.List;

/**
 *
 */
public class WizardPagerAdapter extends CustomPagerAdapter<BaseFragment> {
    public WizardPagerAdapter(FragmentManager fm, List<BaseFragment> baseFragments) {
        super(fm, baseFragments);
    }

    @Override
    public BaseFragment getItem(int position) {
        return fragments.get(position);
    }
}
