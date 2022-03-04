package com.example.dorms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Member;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Leave_apply extends AppCompatActivity implements DatePickerDialog.OnDateSetListener  {

    TextInputEditText from1,to1,comp1;
    private DatePickerDialog picker;
    Button apply;
    FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_apply);

        from1=(TextInputEditText)findViewById(R.id.from1);
        to1=(TextInputEditText)findViewById(R.id.to1);
        comp1=(TextInputEditText)findViewById(R.id.comp1);
        apply=(Button)findViewById(R.id.apply);

        firestore =  FirebaseFirestore.getInstance();

        Leave leave = new Leave();
        leave.setFrom(from1.getText().toString());
        leave.setTo(to1.getText().toString());
        leave.setComplaint(comp1.getText().toString());

// Add a new document with a generated ID

        Toast.makeText(Leave_apply.this, "Uploading...", Toast.LENGTH_SHORT).show();
        firestore.collection("Leave")
                .document("12344")
                .set(leave)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Leave_apply.this, "Uploading successfull.", Toast.LENGTH_SHORT).show();
                        } else Toast.makeText(Leave_apply.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                    }
                });


        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Leave_apply.this, "Clicked", Toast.LENGTH_SHORT).show();

                Leave leave = new Leave();
                leave.setFrom(from1.getText().toString());
                leave.setTo(to1.getText().toString());
                leave.setComplaint(comp1.getText().toString());

// Add a new document with a generated ID

                firestore.collection("Leave")
                        .add(leave)
                        .addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                            @Override
                            public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<DocumentReference> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(Leave_apply.this, "Successfull!", Toast.LENGTH_SHORT).show();
                                } else
                                    Toast.makeText(Leave_apply.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

        from1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_datepicker();
            }
        });
//
        to1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar=Calendar.getInstance();
                int day=calendar.get(Calendar.DAY_OF_MONTH);
                int month=calendar.get(Calendar.MONTH);
                int year=calendar.get(Calendar.YEAR);

                Toast.makeText(Leave_apply.this, String.valueOf(month), Toast.LENGTH_SHORT).show();

                picker= new DatePickerDialog(Leave_apply.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month++;
                        to1.setText(dayOfMonth+ "/" +month+"/"+year);
                    }
                },year,month,day);
                picker.show();
            }
        });


    }




    private void show_datepicker(){
        DatePickerDialog datePickerDialog=new DatePickerDialog(this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

        );
        datePickerDialog.show();
    }


    @Override
    public  void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        month++;
        String date= dayOfMonth+"/"+month+"/"+year;
        from1.setText(date);


    }


}