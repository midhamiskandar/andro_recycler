package com.example.gf.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    String[] products = new String[]{"Windows", "OSX", "Ubuntu"};
    RecyclerView rv_products;
    RecyclerView.Adapter rv_adapter;
    RecyclerView.LayoutManager rv_layout_manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////--------Code Recycleview--------
        rv_products = (RecyclerView) findViewById(R.id.rv_products);
        rv_products.setHasFixedSize(true);
        rv_layout_manager = new LinearLayoutManager(this);
        rv_products.setLayoutManager(rv_layout_manager);
        rv_adapter = new MyAdapter(products);
        rv_products.setAdapter(rv_adapter);

        ////-------end recycleview--------
    }
}