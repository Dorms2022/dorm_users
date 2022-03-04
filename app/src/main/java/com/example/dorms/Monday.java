package com.example.dorms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Monday extends Fragment {

    String[] mitem_b ={"m1", "m2"};
    String[] mitem_l ={"m3", "m4"};
    String[] mitem_d ={"m5", "m6"};
    AutoCompleteTextView mon1,mon2,mon3;
    ArrayAdapter<String> m_adapter;
    ArrayAdapter<String>m_adapter2;
    ArrayAdapter<String>m_adapter3;

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.monday,container,false);

        mon1=view.findViewById(R.id.breakfast_m);
        m_adapter=new ArrayAdapter<String>(getContext(),R.layout.list_item,mitem_b);
        mon2=view.findViewById(R.id.lunch_m);
        m_adapter2=new ArrayAdapter<String>(getContext(),R.layout.list_item,mitem_l);
        mon3=view.findViewById(R.id.dinner_m);
        m_adapter3=new ArrayAdapter<String>(getContext(),R.layout.list_item,mitem_d);

        mon1.setAdapter(m_adapter);
        mon2.setAdapter(m_adapter2);
        mon3.setAdapter(m_adapter3);

        mon1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String b_item = parent.getItemAtPosition(position).toString();

            }
        });
        mon2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String l_item = parent.getItemAtPosition(position).toString();

            }
        });
        mon3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String d_item = parent.getItemAtPosition(position).toString();

            }
        });


        return view;

    }
}
