package com.example.gf.recyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by idham on 13-Sep-17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] ds_products;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cv_products;
        public TextView tv_product;
        public ViewHolder(View v) {
            super(v);
            cv_products = (CardView) v.findViewById(R.id.cv_products);
            tv_product = (TextView) v.findViewById(R.id.tv_product);
        }
    }

    public MyAdapter(String[] dataset) {
        ds_products = dataset;
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate (R.layout.content_product, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_product.setText(ds_products[position]);
    }

    @Override
    public int getItemCount() {
        return ds_products.length;
    }
}
