package com.arcfix.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arcfix.R;
import com.arcfix.adapter.FeedListAdapter;
import com.arcfix.rest_api.data_model.MainResponse;

import butterknife.Bind;
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.adapters.SlideInBottomAnimationAdapter;
import jp.wasabeef.recyclerview.animators.FadeInAnimator;

/**
 * Created by deep on 21/03/16.
 */
public class FeedsFragment extends Fragment {
    @Bind(R.id.feed_list)
    RecyclerView mListView;
    private MainResponse data;
    private FeedListAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View feedView=inflater.inflate(R.layout.fragment_feeds,null);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mListView.setLayoutManager(layoutManager);
        return feedView;

    }

    void setAdapter(){
        mListView.setItemAnimator(new FadeInAnimator());

        mAdapter = new FeedListAdapter(getActivity(), onClick,data);

        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(mAdapter);
        SlideInBottomAnimationAdapter scaleAdapter = new SlideInBottomAnimationAdapter(alphaAdapter);
        mListView.setAdapter(scaleAdapter);
    }
    private View.OnClickListener onClick=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}