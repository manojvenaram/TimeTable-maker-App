package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintHelper;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private LinearLayout parentLinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parentLinearLayout=(LinearLayout) findViewById(R.id.layout_list);

    }
    public void onAddField(View v) {
        final View rowView = getLayoutInflater().inflate(R.layout.test_field,null,false);
        LinearLayout slotLinearLayout = (LinearLayout) rowView.findViewById(R.id.slotlayout_list);
//        Button imageClose = (Button)rowView.findViewById(R.id.delete_button);
//        imageClose.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                removeView(rowView);
//            }
//        });
        Button AddSlot = (Button)rowView.findViewById(R.id.add_slot);
        AddSlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View slotView = getLayoutInflater().inflate(R.layout.slot_field, null,false);
                LinearLayout dayLinearLayout = (LinearLayout) slotView.findViewById(R.id.dayLayout);
                Button imageClose = (Button)slotView.findViewById(R.id.closeSlot);
                imageClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        slotLinearLayout.removeView(slotView);
                    }
                });
                Button addDate = (Button) slotView.findViewById(R.id.daytime);
                Dialog dialog = new Dialog(MainActivity.this);
                addDate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.setContentView(R.layout.timing);
                        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                        dialog.setCancelable(false);
                        Button addTime=(Button) dialog.findViewById(R.id.addTime);
                        addTime.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dayLinearLayout.removeAllViews();
                                CheckBox M1=(CheckBox) dialog.findViewById(R.id.M1);
                                CheckBox M2=(CheckBox) dialog.findViewById(R.id.M2);
                                CheckBox M3=(CheckBox) dialog.findViewById(R.id.M3);
                                CheckBox M4=(CheckBox) dialog.findViewById(R.id.M4);
                                CheckBox T1=(CheckBox) dialog.findViewById(R.id.T1);
                                CheckBox T2=(CheckBox) dialog.findViewById(R.id.T2);
                                CheckBox T3=(CheckBox) dialog.findViewById(R.id.T3);
                                CheckBox T4=(CheckBox) dialog.findViewById(R.id.T4);
                                CheckBox W1=(CheckBox) dialog.findViewById(R.id.W1);
                                CheckBox W2=(CheckBox) dialog.findViewById(R.id.W2);
                                CheckBox W3=(CheckBox) dialog.findViewById(R.id.W3);
                                CheckBox W4=(CheckBox) dialog.findViewById(R.id.W4);
                                CheckBox Th1=(CheckBox) dialog.findViewById(R.id.Th1);
                                CheckBox Th2=(CheckBox) dialog.findViewById(R.id.Th2);
                                CheckBox Th3=(CheckBox) dialog.findViewById(R.id.Th3);
                                CheckBox Th4=(CheckBox) dialog.findViewById(R.id.Th4);
                                CheckBox F1=(CheckBox) dialog.findViewById(R.id.F1);
                                CheckBox F2=(CheckBox) dialog.findViewById(R.id.F2);
                                CheckBox F3=(CheckBox) dialog.findViewById(R.id.F3);
                                CheckBox F4=(CheckBox) dialog.findViewById(R.id.F4);
                                if(M1.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Monday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("0");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(M2.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Monday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("1");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(M3.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Monday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("2");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(M4.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Monday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("3");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(T1.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Tuesday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("0");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(T2.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Tuesday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("1");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(T3.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Tuesday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("2");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(T4.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Tuesday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("3");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(W1.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Wednesday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("0");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(W2.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Wednesday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("1");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(W3.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Wednesday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("2");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(W4.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Wednesday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("3");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(Th1.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Thursday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("0");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(Th2.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Thursday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("1");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(Th3.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Thursday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("2");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(Th4.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Thursday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("3");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(F1.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Friday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("0");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(F2.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Friday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("1");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(F3.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Friday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("2");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                if(F4.isChecked()){
                                    final View dayTimeView = getLayoutInflater().inflate(R.layout.day_time, null,false);
                                    TextView day=(TextView) dayTimeView.findViewById(R.id.day);
                                    day.setText("Friday");
                                    TextView time=(TextView) dayTimeView.findViewById(R.id.time);
                                    time.setText("3");
                                    dayLinearLayout.addView(dayTimeView);
                                }
                                dialog.dismiss();
                            }
                        });
                        Button cancelD=(Button) dialog.findViewById(R.id.cancelD);
                        cancelD.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });
                        dialog.show();
                    }
                });
                slotLinearLayout.addView(slotView);

            }
        });
        parentLinearLayout.addView(rowView);
    }
    public int validate(String x,View view){
        if(x.isEmpty()){
//                    name.setError("error");
//                    b1.setBackgroundResource(R.drawable.errorbg);
            view.setBackgroundResource(R.drawable.errorbg);
            return 1;
        }else {
            view.setBackgroundResource(R.drawable.nrml);
            return 0;
        }
    }
    public void onSubmit(View v) {
//        int vali = 0;
        LinkedList list = new LinkedList();
        for (int i = 0; i < parentLinearLayout.getChildCount(); i++) {
            LinkedListi1 List1 = new LinkedListi1();
            View sub = parentLinearLayout.getChildAt(i);
            EditText t1 = (EditText) sub.findViewById(R.id.Subject);
//            vali = validate(t1.getText().toString(), t1);
            LinearLayout linear = parentLinearLayout.getChildAt(i).findViewById(R.id.slotlayout_list);
            for (int j = 0; j < linear.getChildCount(); j++) {
                LinkedListi2 List11 = new LinkedListi2();
                View slot = linear.getChildAt(j);
                EditText t2 = (EditText) slot.findViewById(R.id.Slot);
//                vali = validate(t2.getText().toString(), t2);
                LinearLayout dayday = slot.findViewById(R.id.dayLayout);
                int k;
                for (k = 0; k < dayday.getChildCount(); k++) {
                    View timing = dayday.getChildAt(k);
                    TextView day = (TextView) timing.findViewById(R.id.day);
                    TextView time = (TextView) timing.findViewById(R.id.time);
                    System.out.println(day.getText().toString()+"hihello"+time.getText().toString());
                    List11.add(day.getText().toString(), Integer.parseInt(time.getText().toString()));
                }
//                if(k==0){
//                    Button b1=slot.findViewById(R.id.daytime);
//                    b1.setBackgroundColor(R.color.black);
//                }
                List1.add(t2.getText().toString(), List11.head);
            }
            list.add(t1.getText().toString(), List1.head);
        }
//        list.printList();
//        if (vali == 0) {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra("Object", list);
            i.putExtra("no", parentLinearLayout.getChildCount());
//        i.putExtra("num", no);
            startActivity(i);
//        }
    }
}