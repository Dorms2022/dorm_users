package com.example.dorms;


import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

    CardView fees,transactions,complaint,v_comp,leave,v_leave;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home,container,false);


        fees= view.findViewById(R.id.fees);
        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Fees.class);
                startActivity(intent);
            }
        });

        complaint=view.findViewById(R.id.complaints);
        complaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Complaint.class);
                startActivity(intent);
            }
        });
        leave=view.findViewById(R.id.leave);
        leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Leave_apply.class);
                startActivity(intent);
            }
        });

        transactions=view.findViewById(R.id.transaction);
        transactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Trans_history.class);
                startActivity(intent);
            }
        });

        v_leave=view.findViewById(R.id.v_leave);
        v_leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),View_leave.class);
                startActivity(intent);
            }
        });



        return view;

    }

}
