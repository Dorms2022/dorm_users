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

public class Friday extends Fragment {

    String[] fitem_b ={"f1", "f2"};
    String[] fitem_l ={"f3", "f4"};
    String[] fitem_d ={"f5", "f6"};
    AutoCompleteTextView fri1,fri2,fri3;
    ArrayAdapter<String>f_adapter;
    ArrayAdapter<String>f_adapter2;
    ArrayAdapter<String>f_adapter3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.friday,container,false);

        fri1=view.findViewById(R.id.breakfast_f);
        f_adapter=new ArrayAdapter<String>(getContext(),R.layout.list_item,fitem_b);
        fri2=view.findViewById(R.id.lunch_f);
        f_adapter2=new ArrayAdapter<String>(getContext(),R.layout.list_item,fitem_l);
        fri3=view.findViewById(R.id.dinner_f);
        f_adapter3=new ArrayAdapter<String>(getContext(),R.layout.list_item,fitem_d);

        fri1.setAdapter(f_adapter);
        fri2.setAdapter(f_adapter2);
        fri3.setAdapter(f_adapter3);

        fri1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String b_item = parent.getItemAtPosition(position).toString();

            }
        });
        fri2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String l_item = parent.getItemAtPosition(position).toString();

            }
        });
        fri3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String d_item = parent.getItemAtPosition(position).toString();

            }
        });


        return view;

    }
}
