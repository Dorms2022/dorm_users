package com.example.dorms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Wednesday extends Fragment {

    String[] witem_b ={"w1", "w2"};
    String[] witem_l ={"w3", "w4"};
    String[] witem_d ={"w5", "w6"};
    AutoCompleteTextView wed1,wed2,wed3;
    ArrayAdapter<String>w_adapter;
    ArrayAdapter<String>w_adapter2;
    ArrayAdapter<String>w_adapter3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.wednesday,container,false);

        wed1=view.findViewById(R.id.breakfast_w);
        w_adapter=new ArrayAdapter<String>(getContext(),R.layout.list_item,witem_b);
        wed2=view.findViewById(R.id.lunch_w);
        w_adapter2=new ArrayAdapter<String>(getContext(),R.layout.list_item,witem_l);
        wed3=view.findViewById(R.id.dinner_w);
        w_adapter3=new ArrayAdapter<String>(getContext(),R.layout.list_item,witem_d);

        wed1.setAdapter(w_adapter);
        wed2.setAdapter(w_adapter2);
        wed3.setAdapter(w_adapter3);

        wed1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String b_item = parent.getItemAtPosition(position).toString();

            }
        });
        wed2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String l_item = parent.getItemAtPosition(position).toString();

            }
        });
        wed3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String d_item = parent.getItemAtPosition(position).toString();

            }
        });
        return view;

    }
}
