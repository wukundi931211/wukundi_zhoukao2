package com.baiwei.tianlong.wukundi_zhoukao2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.baiwei.tianlong.wukundi_zhoukao2.mvp.model.beans.FragmentOneBeans;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentOneAdapter extends RecyclerView.Adapter<FragmentOneAdapter.FragmentOneHolder> {
    List<FragmentOneBeans.DataBean> data;

    private Context context;

    public FragmentOneAdapter(List<FragmentOneBeans.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public FragmentOneHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.fragment_one_list, viewGroup, false);
        return new FragmentOneHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FragmentOneHolder fragmentOneHolder, int i) {
            fragmentOneHolder.titile.setText(data.get(i).getTitle());
            fragmentOneHolder.oneFr.setImageURI(data.get(i).getLogo());
    }

    @Override
    public int getItemCount() {
        return data == null ? 0: data.size();
    }


    public class FragmentOneHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.one_fr)
        SimpleDraweeView oneFr;
        @BindView(R.id.titile)
        TextView titile;
        public FragmentOneHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
