package com.odenktools.androidtabwizard;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

public class OrderFinishFragment extends BaseFragment {

    private FrameLayout layout = null;
    private Button btn_finish = null;
    private OrderTwoFragment mOrderTwoFragment = null;

    public static OrderFinishFragment getInstance() {
        OrderFinishFragment fragment = new OrderFinishFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        layout = (FrameLayout) inflater.inflate(R.layout.orderfinish, container, false);

        return layout;
    }
}