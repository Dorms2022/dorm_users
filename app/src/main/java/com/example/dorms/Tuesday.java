package com.example.dorms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Tuesday extends Fragment {

    String[] item_b ={"t1", "t2"};
    String[] item_l ={"t3", "t4"};
    String[] item_d ={"t5", "t6"};
    AutoCompleteTextView autoCompleteTextView,autoCompleteTextView2,autoCompleteTextView3;
    ArrayAdapter<String>adapteritems;
    ArrayAdapter<String>adapteritems2;
    ArrayAdapter<String>adapteritems3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tuesday,container,false);

        autoCompleteTextView=view.findViewById(R.id.breakfast);
        adapteritems=new ArrayAdapter<String>(getContext(),R.layout.list_item,item_b);
        autoCompleteTextView2=view.findViewById(R.id.lunch);
        adapteritems2=new ArrayAdapter<String>(getContext(),R.layout.list_item,item_l);
        autoCompleteTextView3=view.findViewById(R.id.dinner);
        adapteritems3=new ArrayAdapter<String>(getContext(),R.layout.list_item,item_d);

        autoCompleteTextView.setAdapter(adapteritems);
        autoCompleteTextView2.setAdapter(adapteritems2);
        autoCompleteTextView3.setAdapter(adapteritems3);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String b_item = parent.getItemAtPosition(position).toString();

            }
        });
        autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String l_item = parent.getItemAtPosition(position).toString();

            }
        });
        autoCompleteTextView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String d_item = parent.getItemAtPosition(position).toString();

            }
        });

        return view;
    }
}
