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

public class Thursday extends Fragment {

    String[] thuitem_b ={"thu1", "thu2"};
    String[] thuitem_l ={"thu3", "thu4"};
    String[] thuitem_d ={"thu5", "thu6"};
    AutoCompleteTextView thu1,thu2,thu3;
    ArrayAdapter<String> thu_adapter;
    ArrayAdapter<String>thu_adapter2;
    ArrayAdapter<String>thu_adapter3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.thursday,container,false);

        thu1=view.findViewById(R.id.breakfast_thu);
        thu_adapter=new ArrayAdapter<String>(getContext(),R.layout.list_item,thuitem_b);
        thu2=view.findViewById(R.id.lunch_thu);
        thu_adapter2=new ArrayAdapter<String>(getContext(),R.layout.list_item,thuitem_l);
        thu3=view.findViewById(R.id.dinner_thu);
        thu_adapter3=new ArrayAdapter<String>(getContext(),R.layout.list_item,thuitem_d);

        thu1.setAdapter(thu_adapter);
        thu2.setAdapter(thu_adapter2);
        thu3.setAdapter(thu_adapter3);

        thu1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String b_item = parent.getItemAtPosition(position).toString();

            }
        });
        thu2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String l_item = parent.getItemAtPosition(position).toString();

            }
        });
        thu3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String d_item = parent.getItemAtPosition(position).toString();

            }
        });

       return view;
    }
}
