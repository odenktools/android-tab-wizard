package com.odenktools.androidtabwizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

public class OrderTwoFragment extends BaseFragment {

    private FrameLayout layout = null;
    private Button btn_goto_orderfinish = null;
    private OrderFinishFragment mOrderFinishFragment = null;

    public OrderTwoFragment()
    {

    }

    public static OrderTwoFragment getInstance() {
        OrderTwoFragment fragment = new OrderTwoFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        layout = (FrameLayout) inflater.inflate(R.layout.ordertwo, container, false);

        btn_goto_orderfinish = (Button) layout.findViewById(R.id.btn_goto_orderfinish);

        btn_goto_orderfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOrderFinishFragment == null) {
                    mOrderFinishFragment = new OrderFinishFragment();
                    getBaseAct().mBaseFragment.add(mOrderFinishFragment);
                    getBaseAct().mViewPager.getAdapter().notifyDataSetChanged();
                    getBaseAct().mViewPager.setCurrentItem(2);
                }else{
                    getBaseAct().mViewPager.setCurrentItem(2);
                }
            }
        });

        return layout;
    }
}
