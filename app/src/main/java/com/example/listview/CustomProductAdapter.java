package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomProductAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Product> arrayList;

    public CustomProductAdapter(Context ctx, int layoutItem, ArrayList<Product> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view=LayoutInflater.from(ctx).inflate(layoutItem,parent,false);
        TextView tvName= view.findViewById(R.id.textView);
        TextView tvPrice= view.findViewById(R.id.textView2);
        ImageView imageProduct=view.findViewById(R.id.imageView);

        tvName.setText(arrayList.get(i).getName());
        tvPrice.setText(arrayList.get(i).getProductPrice()+"");
        imageProduct.setImageResource(arrayList.get(i).getImageProduct());
        return view;
    }
}
