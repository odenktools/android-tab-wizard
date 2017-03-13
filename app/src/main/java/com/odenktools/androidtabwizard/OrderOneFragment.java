package com.odenktools.androidtabwizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

public class OrderOneFragment extends BaseFragment {

    private FrameLayout layout = null;
    private Button btn_goto_ordertwo = null;
    private OrderTwoFragment mOrderTwoFragment = null;

    public static OrderOneFragment getInstance() {
        OrderOneFragment fragment = new OrderOneFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        layout = (FrameLayout) inflater.inflate(R.layout.orderone, container, false);

        btn_goto_ordertwo = (Button) layout.findViewById(R.id.btn_goto_ordertwo);
        btn_goto_ordertwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOrderTwoFragment == null) {
                    mOrderTwoFragment = new OrderTwoFragment();
                    getBaseAct().mBaseFragment.add(mOrderTwoFragment);
                    getBaseAct().mViewPager.getAdapter().notifyDataSetChanged();
                    getBaseAct().mViewPager.setCurrentItem(1);
                }else{
                    getBaseAct().mViewPager.setCurrentItem(1);
                }
            }
        });

        return layout;
    }
}
