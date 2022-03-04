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

public class Weekends extends Fragment {

    String[] ssitem_b ={"ss1", "ss2"};
    String[] ssitem_l ={"ss3", "ss4"};
    String[] ssitem_d ={"ss5", "ss6"};
    AutoCompleteTextView ss1,ss2,ss3;
    ArrayAdapter<String> week_adapter;
    ArrayAdapter<String>week_adapter2;
    ArrayAdapter<String>week_adapter3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.weekends,container,false);

        ss1=view.findViewById(R.id.breakfast_ss);
        week_adapter=new ArrayAdapter<String>(getContext(),R.layout.list_item,ssitem_b);
        ss2=view.findViewById(R.id.lunch_ss);
        week_adapter2=new ArrayAdapter<String>(getContext(),R.layout.list_item,ssitem_l);
        ss3=view.findViewById(R.id.dinner_ss);
        week_adapter3=new ArrayAdapter<String>(getContext(),R.layout.list_item,ssitem_d);

        ss1.setAdapter(week_adapter);
        ss2.setAdapter(week_adapter2);
        ss3.setAdapter(week_adapter3);

        ss1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String b_item = parent.getItemAtPosition(position).toString();

            }
        });
        ss2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String l_item = parent.getItemAtPosition(position).toString();

            }
        });
        ss3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String d_item = parent.getItemAtPosition(position).toString();

            }
        });
        return view;
    }
}
