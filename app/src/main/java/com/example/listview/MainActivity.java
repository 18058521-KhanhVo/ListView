package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    CustomProductAdapter adt;
    ArrayList<Product> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= findViewById(R.id.lv);

        arrayList=new ArrayList<>();
        arrayList.add(new Product("Code",R.drawable.code,"$80"));
        arrayList.add(new Product("Google",R.drawable.google,"$80"));
        arrayList.add(new Product("Google",R.drawable.images,"$80"));

        adt = new CustomProductAdapter(this, R.layout.ittem_listview, arrayList);
        lv.setAdapter(adt);
    }
}