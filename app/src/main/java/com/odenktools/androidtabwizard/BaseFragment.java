package com.odenktools.androidtabwizard;

import android.support.v4.app.Fragment;

/**
 *
 */
public abstract class BaseFragment extends Fragment {

    public BaseFragment() {

    }

    protected MainActivity getBaseAct() {
        return ((MainActivity) getActivity());
    }
}
