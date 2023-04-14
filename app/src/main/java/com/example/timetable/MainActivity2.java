package com.example.timetable;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LinkedList list = (LinkedList) getIntent().getSerializableExtra("Object");
        int no=(int) getIntent().getIntExtra("no",0);
        if(no==4){
            num4(list);
        }
        else if (no==5) {
            num5(list);
        }
        else if(no==6){
            num6(list);
        }
        else if(no==7){
            num7(list);
        }
        else if(no==8){
            num8(list);
        }
        else if(no==9){
            num9(list);
        }
        else if(no==10){
            num10(list);
        }
        else if(no==11){
            num11(list);
        }
        else if(no==12){
            num12(list);
        }
    }
    void num4(LinkedList list){
        String[][][] tt=new String[2000][5][4];
        int n=0;
        I1node loop1=list.head.next.next.next.i1;
        while(loop1!=null){
            I1node loop2=list.head.next.next.i1;
            while(loop2!=null){
                I1node loop3=list.head.next.i1;
                while(loop3!=null) {
                    I1node loop4=list.head.i1;
                    while(loop4!=null) {
                        I2node innerloop1 = loop1.i2;
                        while (innerloop1 != null) {
                            if (Objects.equals(innerloop1.day, "Monday")) {
                                tt[n][0][innerloop1.time] = loop1.Slot;
                            } else if (Objects.equals(innerloop1.day, "Tuesday")) {
                                tt[n][1][innerloop1.time] = loop1.Slot;
                            } else if (Objects.equals(innerloop1.day, "Wednesday")) {
                                tt[n][2][innerloop1.time] = loop1.Slot;
                            } else if (Objects.equals(innerloop1.day, "Thursday")) {
                                tt[n][3][innerloop1.time] = loop1.Slot;
                            } else if (Objects.equals(innerloop1.day, "Friday")) {
                                tt[n][4][innerloop1.time] = loop1.Slot;
                            }
                            innerloop1 = innerloop1.next;
                        }

                        int c1 = 0;
                        I2node innerloop2 = loop2.i2;
                        while (innerloop2 != null) {
                            if (Objects.equals(innerloop2.day, "Monday")) {
                                if (tt[n][0][innerloop2.time] != null) {
                                    c1 = 1;
                                }
                            } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                if (tt[n][1][innerloop2.time] != null) {
                                    c1 = 1;
                                }
                            } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                if (tt[n][2][innerloop2.time] != null) {
                                    c1 = 1;
                                }
                            }
                            if (Objects.equals(innerloop2.day, "Thursday")) {
                                if (tt[n][3][innerloop2.time] != null) {
                                    c1 = 1;
                                }
                            } else if (Objects.equals(innerloop2.day, "Friday")) {
                                if (tt[n][4][innerloop2.time] != null) {
                                    c1 = 1;
                                }
                            }
                            innerloop2 = innerloop2.next;
                        }
                        if (c1 != 1) {
                            innerloop2 = loop2.i2;
                            while (innerloop2 != null) {
                                if (Objects.equals(innerloop2.day, "Monday")) {
                                    tt[n][0][innerloop2.time] = loop2.Slot;
                                } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                    tt[n][1][innerloop2.time] = loop2.Slot;
                                } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                    tt[n][2][innerloop2.time] = loop2.Slot;
                                } else if (Objects.equals(innerloop2.day, "Thursday")) {
                                    tt[n][3][innerloop2.time] = loop2.Slot;
                                } else if (Objects.equals(innerloop2.day, "Friday")) {
                                    tt[n][4][innerloop2.time] = loop2.Slot;
                                }
                                innerloop2 = innerloop2.next;
                            }
                        }
                        int c2 = 0;
                        I2node innerloop3 = loop3.i2;
                        while (innerloop3 != null) {
                            if (Objects.equals(innerloop3.day, "Monday")) {
                                if (tt[n][0][innerloop3.time] != null) {
                                    c2 = 1;
                                }
                            } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                if (tt[n][1][innerloop3.time] != null) {
                                    c2 = 1;
                                }
                            } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                if (tt[n][2][innerloop3.time] != null) {
                                    c2 = 1;
                                }
                            }
                            if (Objects.equals(innerloop3.day, "Thursday")) {
                                if (tt[n][3][innerloop3.time] != null) {
                                    c2 = 1;
                                }
                            } else if (Objects.equals(innerloop3.day, "Friday")) {
                                if (tt[n][4][innerloop3.time] != null) {
                                    c2 = 1;
                                }
                            }
                            innerloop3 = innerloop3.next;
                        }
                        if (c2 != 1) {
                            innerloop3 = loop3.i2;
                            while (innerloop3 != null) {
                                if (Objects.equals(innerloop3.day, "Monday")) {
                                    tt[n][0][innerloop3.time] = loop3.Slot;
                                } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                    tt[n][1][innerloop3.time] = loop3.Slot;
                                } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                    tt[n][2][innerloop3.time] = loop3.Slot;
                                } else if (Objects.equals(innerloop3.day, "Thursday")) {
                                    tt[n][3][innerloop3.time] = loop3.Slot;
                                } else if (Objects.equals(innerloop3.day, "Friday")) {
                                    tt[n][4][innerloop3.time] = loop3.Slot;
                                }
                                innerloop3 = innerloop3.next;
                            }
                        }
                        int c3 = 0;
                        I2node innerloop4 = loop4.i2;
                        while (innerloop4 != null) {
                            if (Objects.equals(innerloop4.day, "Monday")) {
                                if (tt[n][0][innerloop4.time] != null) {
                                    c3 = 1;
                                }
                            } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                if (tt[n][1][innerloop4.time] != null) {
                                    c3 = 1;
                                }
                            } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                if (tt[n][2][innerloop4.time] != null) {
                                    c3 = 1;
                                }
                            }
                            if (Objects.equals(innerloop4.day, "Thursday")) {
                                if (tt[n][3][innerloop4.time] != null) {
                                    c3 = 1;
                                }
                            } else if (Objects.equals(innerloop4.day, "Friday")) {
                                if (tt[n][4][innerloop4.time] != null) {
                                    c3 = 1;
                                }
                            }
                            innerloop4 = innerloop4.next;
                        }
                        if (c3 != 1) {
                            innerloop4 = loop4.i2;
                            while (innerloop4 != null) {
                                if (Objects.equals(innerloop4.day, "Monday")) {
                                    tt[n][0][innerloop4.time] = loop4.Slot;
                                } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                    tt[n][1][innerloop4.time] = loop4.Slot;
                                } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                    tt[n][2][innerloop4.time] = loop4.Slot;
                                } else if (Objects.equals(innerloop4.day, "Thursday")) {
                                    tt[n][3][innerloop4.time] = loop4.Slot;
                                } else if (Objects.equals(innerloop4.day, "Friday")) {
                                    tt[n][4][innerloop4.time] = loop4.Slot;
                                }
                                innerloop4 = innerloop4.next;
                            }
                        }
                        n++;

                        loop4 = loop4.next;
                    }
                    loop3 = loop3.next;
                }
                loop2=loop2.next;
            }
            loop1=loop1.next;
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<4;k++){
                    if(tt[i][j][k]!=null){
                        sum[i]=sum[i]+1;
                    }
                }
            }
        }
//        int max = 3;
        int max = Arrays.stream(sum).max().getAsInt();
        int no = 0;
        for(int i=0;i<n;i++){
            if(max==sum[i]){
                no=i;
                break;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(tt[no][i][j]!=null){
                    if(i==0&&j==0){
                        TextView t=(TextView) findViewById(R.id.M1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==1){
                        TextView t=(TextView) findViewById(R.id.M2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==2){
                        TextView t=(TextView) findViewById(R.id.M3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==3){
                        TextView t=(TextView) findViewById(R.id.M4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==0){
                        TextView t=(TextView) findViewById(R.id.T1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==1){
                        TextView t=(TextView) findViewById(R.id.T2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==2){
                        TextView t=(TextView) findViewById(R.id.T3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==3){
                        TextView t=(TextView) findViewById(R.id.T4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==0){
                        TextView t=(TextView) findViewById(R.id.W1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==1){
                        TextView t=(TextView) findViewById(R.id.W2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==2){
                        TextView t=(TextView) findViewById(R.id.W3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==3){
                        TextView t=(TextView) findViewById(R.id.W4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==0){
                        TextView t=(TextView) findViewById(R.id.Th1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==1){
                        TextView t=(TextView) findViewById(R.id.Th2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==2){
                        TextView t=(TextView) findViewById(R.id.Th3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==3){
                        TextView t=(TextView) findViewById(R.id.Th4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==0){
                        TextView t=(TextView) findViewById(R.id.F1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==1){
                        TextView t=(TextView) findViewById(R.id.F2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==2){
                        TextView t=(TextView) findViewById(R.id.F3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==3){
                        TextView t=(TextView) findViewById(R.id.F4);
                        t.setText(tt[no][i][j]);
                    }
                }
            }
        }
    }
    void num5(LinkedList list){
        String[][][] tt=new String[2000][5][4];
        int n=0;
        I1node loop1=list.head.next.next.next.next.i1;
        while(loop1!=null){
            I1node loop2=list.head.next.next.next.i1;
            while(loop2!=null){
                I1node loop3=list.head.next.next.i1;
                while(loop3!=null) {
                    I1node loop4=list.head.next.i1;
                    while(loop4!=null) {
                        I1node loop5=list.head.i1;
                        while(loop5!=null) {
                            I2node innerloop1 = loop1.i2;
                            while (innerloop1 != null) {
                                if (Objects.equals(innerloop1.day, "Monday")) {
                                    tt[n][0][innerloop1.time] = loop1.Slot;
                                } else if (Objects.equals(innerloop1.day, "Tuesday")) {
                                    tt[n][1][innerloop1.time] = loop1.Slot;
                                } else if (Objects.equals(innerloop1.day, "Wednesday")) {
                                    tt[n][2][innerloop1.time] = loop1.Slot;
                                } else if (Objects.equals(innerloop1.day, "Thursday")) {
                                    tt[n][3][innerloop1.time] = loop1.Slot;
                                } else if (Objects.equals(innerloop1.day, "Friday")) {
                                    tt[n][4][innerloop1.time] = loop1.Slot;
                                }
                                innerloop1 = innerloop1.next;
                            }

                            int c1 = 0;
                            I2node innerloop2 = loop2.i2;
                            while (innerloop2 != null) {
                                if (Objects.equals(innerloop2.day, "Monday")) {
                                    if (tt[n][0][innerloop2.time] != null) {
                                        c1 = 1;
                                    }
                                } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                    if (tt[n][1][innerloop2.time] != null) {
                                        c1 = 1;
                                    }
                                } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                    if (tt[n][2][innerloop2.time] != null) {
                                        c1 = 1;
                                    }
                                }
                                if (Objects.equals(innerloop2.day, "Thursday")) {
                                    if (tt[n][3][innerloop2.time] != null) {
                                        c1 = 1;
                                    }
                                } else if (Objects.equals(innerloop2.day, "Friday")) {
                                    if (tt[n][4][innerloop2.time] != null) {
                                        c1 = 1;
                                    }
                                }
                                innerloop2 = innerloop2.next;
                            }
                            if (c1 != 1) {
                                innerloop2 = loop2.i2;
                                while (innerloop2 != null) {
                                    if (Objects.equals(innerloop2.day, "Monday")) {
                                        tt[n][0][innerloop2.time] = loop2.Slot;
                                    } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                        tt[n][1][innerloop2.time] = loop2.Slot;
                                    } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                        tt[n][2][innerloop2.time] = loop2.Slot;
                                    } else if (Objects.equals(innerloop2.day, "Thursday")) {
                                        tt[n][3][innerloop2.time] = loop2.Slot;
                                    } else if (Objects.equals(innerloop2.day, "Friday")) {
                                        tt[n][4][innerloop2.time] = loop2.Slot;
                                    }
                                    innerloop2 = innerloop2.next;
                                }
                            }
                            int c2 = 0;
                            I2node innerloop3 = loop3.i2;
                            while (innerloop3 != null) {
                                if (Objects.equals(innerloop3.day, "Monday")) {
                                    if (tt[n][0][innerloop3.time] != null) {
                                        c2 = 1;
                                    }
                                } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                    if (tt[n][1][innerloop3.time] != null) {
                                        c2 = 1;
                                    }
                                } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                    if (tt[n][2][innerloop3.time] != null) {
                                        c2 = 1;
                                    }
                                }
                                if (Objects.equals(innerloop3.day, "Thursday")) {
                                    if (tt[n][3][innerloop3.time] != null) {
                                        c2 = 1;
                                    }
                                } else if (Objects.equals(innerloop3.day, "Friday")) {
                                    if (tt[n][4][innerloop3.time] != null) {
                                        c2 = 1;
                                    }
                                }
                                innerloop3 = innerloop3.next;
                            }
                            if (c2 != 1) {
                                innerloop3 = loop3.i2;
                                while (innerloop3 != null) {
                                    if (Objects.equals(innerloop3.day, "Monday")) {
                                        tt[n][0][innerloop3.time] = loop3.Slot;
                                    } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                        tt[n][1][innerloop3.time] = loop3.Slot;
                                    } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                        tt[n][2][innerloop3.time] = loop3.Slot;
                                    } else if (Objects.equals(innerloop3.day, "Thursday")) {
                                        tt[n][3][innerloop3.time] = loop3.Slot;
                                    } else if (Objects.equals(innerloop3.day, "Friday")) {
                                        tt[n][4][innerloop3.time] = loop3.Slot;
                                    }
                                    innerloop3 = innerloop3.next;
                                }
                            }
                            int c3 = 0;
                            I2node innerloop4 = loop4.i2;
                            while (innerloop4 != null) {
                                if (Objects.equals(innerloop4.day, "Monday")) {
                                    if (tt[n][0][innerloop4.time] != null) {
                                        c3 = 1;
                                    }
                                } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                    if (tt[n][1][innerloop4.time] != null) {
                                        c3 = 1;
                                    }
                                } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                    if (tt[n][2][innerloop4.time] != null) {
                                        c3 = 1;
                                    }
                                }
                                if (Objects.equals(innerloop4.day, "Thursday")) {
                                    if (tt[n][3][innerloop4.time] != null) {
                                        c3 = 1;
                                    }
                                } else if (Objects.equals(innerloop4.day, "Friday")) {
                                    if (tt[n][4][innerloop4.time] != null) {
                                        c3 = 1;
                                    }
                                }
                                innerloop4 = innerloop4.next;
                            }
                            if (c3 != 1) {
                                innerloop4 = loop4.i2;
                                while (innerloop4 != null) {
                                    if (Objects.equals(innerloop4.day, "Monday")) {
                                        tt[n][0][innerloop4.time] = loop4.Slot;
                                    } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                        tt[n][1][innerloop4.time] = loop4.Slot;
                                    } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                        tt[n][2][innerloop4.time] = loop4.Slot;
                                    } else if (Objects.equals(innerloop4.day, "Thursday")) {
                                        tt[n][3][innerloop4.time] = loop4.Slot;
                                    } else if (Objects.equals(innerloop4.day, "Friday")) {
                                        tt[n][4][innerloop4.time] = loop4.Slot;
                                    }
                                    innerloop4 = innerloop4.next;
                                }
                            }
                            int c4 = 0;
                            I2node innerloop5 = loop5.i2;
                            while (innerloop5 != null) {
                                if (Objects.equals(innerloop5.day, "Monday")) {
                                    if (tt[n][0][innerloop5.time] != null) {
                                        c4 = 1;
                                    }
                                } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                    if (tt[n][1][innerloop5.time] != null) {
                                        c4 = 1;
                                    }
                                } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                    if (tt[n][2][innerloop5.time] != null) {
                                        c4 = 1;
                                    }
                                }
                                if (Objects.equals(innerloop5.day, "Thursday")) {
                                    if (tt[n][3][innerloop5.time] != null) {
                                        c4 = 1;
                                    }
                                } else if (Objects.equals(innerloop5.day, "Friday")) {
                                    if (tt[n][4][innerloop5.time] != null) {
                                        c4 = 1;
                                    }
                                }
                                innerloop5 = innerloop5.next;
                            }
                            if (c4 != 1) {
                                innerloop5 = loop5.i2;
                                while (innerloop5 != null) {
                                    if (Objects.equals(innerloop5.day, "Monday")) {
                                        tt[n][0][innerloop5.time] = loop5.Slot;
                                    } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                        tt[n][1][innerloop5.time] = loop5.Slot;
                                    } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                        tt[n][2][innerloop5.time] = loop5.Slot;
                                    } else if (Objects.equals(innerloop5.day, "Thursday")) {
                                        tt[n][3][innerloop5.time] = loop5.Slot;
                                    } else if (Objects.equals(innerloop5.day, "Friday")) {
                                        tt[n][4][innerloop5.time] = loop5.Slot;
                                    }
                                    innerloop5 = innerloop5.next;
                                }
                            }
                            n++;
                            loop5 = loop5.next;
                        }
                        loop4 = loop4.next;
                    }
                    loop3 = loop3.next;
                }
                loop2=loop2.next;
            }
            loop1=loop1.next;
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<4;k++){
                    if(tt[i][j][k]!=null){
                        sum[i]=sum[i]+1;
                    }
                }
            }
        }
//        int max = 3;
        int max = Arrays.stream(sum).max().getAsInt();
        int no = 0;
        for(int i=0;i<n;i++){
            if(max==sum[i]){
                no=i;
                break;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(tt[no][i][j]!=null){
                    if(i==0&&j==0){
                        TextView t=(TextView) findViewById(R.id.M1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==1){
                        TextView t=(TextView) findViewById(R.id.M2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==2){
                        TextView t=(TextView) findViewById(R.id.M3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==3){
                        TextView t=(TextView) findViewById(R.id.M4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==0){
                        TextView t=(TextView) findViewById(R.id.T1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==1){
                        TextView t=(TextView) findViewById(R.id.T2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==2){
                        TextView t=(TextView) findViewById(R.id.T3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==3){
                        TextView t=(TextView) findViewById(R.id.T4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==0){
                        TextView t=(TextView) findViewById(R.id.W1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==1){
                        TextView t=(TextView) findViewById(R.id.W2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==2){
                        TextView t=(TextView) findViewById(R.id.W3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==3){
                        TextView t=(TextView) findViewById(R.id.W4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==0){
                        TextView t=(TextView) findViewById(R.id.Th1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==1){
                        TextView t=(TextView) findViewById(R.id.Th2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==2){
                        TextView t=(TextView) findViewById(R.id.Th3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==3){
                        TextView t=(TextView) findViewById(R.id.Th4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==0){
                        TextView t=(TextView) findViewById(R.id.F1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==1){
                        TextView t=(TextView) findViewById(R.id.F2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==2){
                        TextView t=(TextView) findViewById(R.id.F3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==3){
                        TextView t=(TextView) findViewById(R.id.F4);
                        t.setText(tt[no][i][j]);
                    }
                }
            }
        }
    }
    void num6(LinkedList list){
        String[][][] tt=new String[2000][5][4];
        int n=0;
        I1node loop1=list.head.next.next.next.next.next.i1;
        while(loop1!=null){
            I1node loop2=list.head.next.next.next.next.i1;
            while(loop2!=null){
                I1node loop3=list.head.next.next.next.i1;
                while(loop3!=null) {
                    I1node loop4=list.head.next.next.i1;
                    while(loop4!=null) {
                        I1node loop5=list.head.next.i1;
                        while(loop5!=null) {
                            I1node loop6=list.head.i1;
                            while(loop6!=null) {
                                I2node innerloop1 = loop1.i2;
                                while (innerloop1 != null) {
                                    if (Objects.equals(innerloop1.day, "Monday")) {
                                        tt[n][0][innerloop1.time] = loop1.Slot;
                                    } else if (Objects.equals(innerloop1.day, "Tuesday")) {
                                        tt[n][1][innerloop1.time] = loop1.Slot;
                                    } else if (Objects.equals(innerloop1.day, "Wednesday")) {
                                        tt[n][2][innerloop1.time] = loop1.Slot;
                                    } else if (Objects.equals(innerloop1.day, "Thursday")) {
                                        tt[n][3][innerloop1.time] = loop1.Slot;
                                    } else if (Objects.equals(innerloop1.day, "Friday")) {
                                        tt[n][4][innerloop1.time] = loop1.Slot;
                                    }
                                    innerloop1 = innerloop1.next;
                                }

                                int c1 = 0;
                                I2node innerloop2 = loop2.i2;
                                while (innerloop2 != null) {
                                    if (Objects.equals(innerloop2.day, "Monday")) {
                                        if (tt[n][0][innerloop2.time] != null) {
                                            c1 = 1;
                                        }
                                    } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                        if (tt[n][1][innerloop2.time] != null) {
                                            c1 = 1;
                                        }
                                    } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                        if (tt[n][2][innerloop2.time] != null) {
                                            c1 = 1;
                                        }
                                    }
                                    if (Objects.equals(innerloop2.day, "Thursday")) {
                                        if (tt[n][3][innerloop2.time] != null) {
                                            c1 = 1;
                                        }
                                    } else if (Objects.equals(innerloop2.day, "Friday")) {
                                        if (tt[n][4][innerloop2.time] != null) {
                                            c1 = 1;
                                        }
                                    }
                                    innerloop2 = innerloop2.next;
                                }
                                if (c1 != 1) {
                                    innerloop2 = loop2.i2;
                                    while (innerloop2 != null) {
                                        if (Objects.equals(innerloop2.day, "Monday")) {
                                            tt[n][0][innerloop2.time] = loop2.Slot;
                                        } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                            tt[n][1][innerloop2.time] = loop2.Slot;
                                        } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                            tt[n][2][innerloop2.time] = loop2.Slot;
                                        } else if (Objects.equals(innerloop2.day, "Thursday")) {
                                            tt[n][3][innerloop2.time] = loop2.Slot;
                                        } else if (Objects.equals(innerloop2.day, "Friday")) {
                                            tt[n][4][innerloop2.time] = loop2.Slot;
                                        }
                                        innerloop2 = innerloop2.next;
                                    }
                                }
                                int c2 = 0;
                                I2node innerloop3 = loop3.i2;
                                while (innerloop3 != null) {
                                    if (Objects.equals(innerloop3.day, "Monday")) {
                                        if (tt[n][0][innerloop3.time] != null) {
                                            c2 = 1;
                                        }
                                    } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                        if (tt[n][1][innerloop3.time] != null) {
                                            c2 = 1;
                                        }
                                    } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                        if (tt[n][2][innerloop3.time] != null) {
                                            c2 = 1;
                                        }
                                    }
                                    if (Objects.equals(innerloop3.day, "Thursday")) {
                                        if (tt[n][3][innerloop3.time] != null) {
                                            c2 = 1;
                                        }
                                    } else if (Objects.equals(innerloop3.day, "Friday")) {
                                        if (tt[n][4][innerloop3.time] != null) {
                                            c2 = 1;
                                        }
                                    }
                                    innerloop3 = innerloop3.next;
                                }
                                if (c2 != 1) {
                                    innerloop3 = loop3.i2;
                                    while (innerloop3 != null) {
                                        if (Objects.equals(innerloop3.day, "Monday")) {
                                            tt[n][0][innerloop3.time] = loop3.Slot;
                                        } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                            tt[n][1][innerloop3.time] = loop3.Slot;
                                        } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                            tt[n][2][innerloop3.time] = loop3.Slot;
                                        } else if (Objects.equals(innerloop3.day, "Thursday")) {
                                            tt[n][3][innerloop3.time] = loop3.Slot;
                                        } else if (Objects.equals(innerloop3.day, "Friday")) {
                                            tt[n][4][innerloop3.time] = loop3.Slot;
                                        }
                                        innerloop3 = innerloop3.next;
                                    }
                                }
                                int c3 = 0;
                                I2node innerloop4 = loop4.i2;
                                while (innerloop4 != null) {
                                    if (Objects.equals(innerloop4.day, "Monday")) {
                                        if (tt[n][0][innerloop4.time] != null) {
                                            c3 = 1;
                                        }
                                    } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                        if (tt[n][1][innerloop4.time] != null) {
                                            c3 = 1;
                                        }
                                    } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                        if (tt[n][2][innerloop4.time] != null) {
                                            c3 = 1;
                                        }
                                    }
                                    if (Objects.equals(innerloop4.day, "Thursday")) {
                                        if (tt[n][3][innerloop4.time] != null) {
                                            c3 = 1;
                                        }
                                    } else if (Objects.equals(innerloop4.day, "Friday")) {
                                        if (tt[n][4][innerloop4.time] != null) {
                                            c3 = 1;
                                        }
                                    }
                                    innerloop4 = innerloop4.next;
                                }
                                if (c3 != 1) {
                                    innerloop4 = loop4.i2;
                                    while (innerloop4 != null) {
                                        if (Objects.equals(innerloop4.day, "Monday")) {
                                            tt[n][0][innerloop4.time] = loop4.Slot;
                                        } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                            tt[n][1][innerloop4.time] = loop4.Slot;
                                        } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                            tt[n][2][innerloop4.time] = loop4.Slot;
                                        } else if (Objects.equals(innerloop4.day, "Thursday")) {
                                            tt[n][3][innerloop4.time] = loop4.Slot;
                                        } else if (Objects.equals(innerloop4.day, "Friday")) {
                                            tt[n][4][innerloop4.time] = loop4.Slot;
                                        }
                                        innerloop4 = innerloop4.next;
                                    }
                                }
                                int c4 = 0;
                                I2node innerloop5 = loop5.i2;
                                while (innerloop5 != null) {
                                    if (Objects.equals(innerloop5.day, "Monday")) {
                                        if (tt[n][0][innerloop5.time] != null) {
                                            c4 = 1;
                                        }
                                    } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                        if (tt[n][1][innerloop5.time] != null) {
                                            c4 = 1;
                                        }
                                    } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                        if (tt[n][2][innerloop5.time] != null) {
                                            c4 = 1;
                                        }
                                    }
                                    if (Objects.equals(innerloop5.day, "Thursday")) {
                                        if (tt[n][3][innerloop5.time] != null) {
                                            c4 = 1;
                                        }
                                    } else if (Objects.equals(innerloop5.day, "Friday")) {
                                        if (tt[n][4][innerloop5.time] != null) {
                                            c4 = 1;
                                        }
                                    }
                                    innerloop5 = innerloop5.next;
                                }
                                if (c4 != 1) {
                                    innerloop5 = loop5.i2;
                                    while (innerloop5 != null) {
                                        if (Objects.equals(innerloop5.day, "Monday")) {
                                            tt[n][0][innerloop5.time] = loop5.Slot;
                                        } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                            tt[n][1][innerloop5.time] = loop5.Slot;
                                        } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                            tt[n][2][innerloop5.time] = loop5.Slot;
                                        } else if (Objects.equals(innerloop5.day, "Thursday")) {
                                            tt[n][3][innerloop5.time] = loop5.Slot;
                                        } else if (Objects.equals(innerloop5.day, "Friday")) {
                                            tt[n][4][innerloop5.time] = loop5.Slot;
                                        }
                                        innerloop5 = innerloop5.next;
                                    }
                                }
                                int c5 = 0;
                                I2node innerloop6 = loop6.i2;
                                while (innerloop6 != null) {
                                    if (Objects.equals(innerloop6.day, "Monday")) {
                                        if (tt[n][0][innerloop6.time] != null) {
                                            c5 = 1;
                                        }
                                    } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                        if (tt[n][1][innerloop6.time] != null) {
                                            c5 = 1;
                                        }
                                    } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                        if (tt[n][2][innerloop6.time] != null) {
                                            c5 = 1;
                                        }
                                    }
                                    if (Objects.equals(innerloop6.day, "Thursday")) {
                                        if (tt[n][3][innerloop6.time] != null) {
                                            c5 = 1;
                                        }
                                    } else if (Objects.equals(innerloop6.day, "Friday")) {
                                        if (tt[n][4][innerloop6.time] != null) {
                                            c5 = 1;
                                        }
                                    }
                                    innerloop6 = innerloop6.next;
                                }
                                if (c5 != 1) {
                                    innerloop6 = loop6.i2;
                                    while (innerloop6 != null) {
                                        if (Objects.equals(innerloop6.day, "Monday")) {
                                            tt[n][0][innerloop6.time] = loop6.Slot;
                                        } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                            tt[n][1][innerloop6.time] = loop6.Slot;
                                        } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                            tt[n][2][innerloop6.time] = loop6.Slot;
                                        } else if (Objects.equals(innerloop6.day, "Thursday")) {
                                            tt[n][3][innerloop6.time] = loop6.Slot;
                                        } else if (Objects.equals(innerloop6.day, "Friday")) {
                                            tt[n][4][innerloop6.time] = loop6.Slot;
                                        }
                                        innerloop6 = innerloop6.next;
                                    }
                                }
                                n++;
                                loop6 = loop6.next;
                            }
                            loop5 = loop5.next;
                        }
                        loop4 = loop4.next;
                    }
                    loop3 = loop3.next;
                }
                loop2=loop2.next;
            }
            loop1=loop1.next;
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<4;k++){
                    if(tt[i][j][k]!=null){
                        sum[i]=sum[i]+1;
                    }
                }
            }
        }
//        int max = 3;
        int max = Arrays.stream(sum).max().getAsInt();
        int no = 0;
        for(int i=0;i<n;i++){
            if(max==sum[i]){
                no=i;
                break;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(tt[no][i][j]!=null){
                    if(i==0&&j==0){
                        TextView t=(TextView) findViewById(R.id.M1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==1){
                        TextView t=(TextView) findViewById(R.id.M2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==2){
                        TextView t=(TextView) findViewById(R.id.M3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==3){
                        TextView t=(TextView) findViewById(R.id.M4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==0){
                        TextView t=(TextView) findViewById(R.id.T1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==1){
                        TextView t=(TextView) findViewById(R.id.T2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==2){
                        TextView t=(TextView) findViewById(R.id.T3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==3){
                        TextView t=(TextView) findViewById(R.id.T4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==0){
                        TextView t=(TextView) findViewById(R.id.W1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==1){
                        TextView t=(TextView) findViewById(R.id.W2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==2){
                        TextView t=(TextView) findViewById(R.id.W3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==3){
                        TextView t=(TextView) findViewById(R.id.W4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==0){
                        TextView t=(TextView) findViewById(R.id.Th1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==1){
                        TextView t=(TextView) findViewById(R.id.Th2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==2){
                        TextView t=(TextView) findViewById(R.id.Th3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==3){
                        TextView t=(TextView) findViewById(R.id.Th4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==0){
                        TextView t=(TextView) findViewById(R.id.F1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==1){
                        TextView t=(TextView) findViewById(R.id.F2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==2){
                        TextView t=(TextView) findViewById(R.id.F3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==3){
                        TextView t=(TextView) findViewById(R.id.F4);
                        t.setText(tt[no][i][j]);
                    }
                }
            }
        }
    }
    void num7(LinkedList list){
        String[][][] tt=new String[2000][5][4];
        int n=0;
        I1node loop1=list.head.next.next.next.next.next.next.i1;
        while(loop1!=null){
            I1node loop2=list.head.next.next.next.next.next.i1;
            while(loop2!=null){
                I1node loop3=list.head.next.next.next.next.i1;
                while(loop3!=null) {
                    I1node loop4=list.head.next.next.next.i1;
                    while(loop4!=null) {
                        I1node loop5=list.head.next.next.i1;
                        while(loop5!=null) {
                            I1node loop6=list.head.next.i1;
                            while(loop6!=null) {
                                I1node loop7=list.head.i1;
                                while (loop7!=null) {
                                    I2node innerloop1 = loop1.i2;
                                    while (innerloop1 != null) {
                                        if (Objects.equals(innerloop1.day, "Monday")) {
                                            tt[n][0][innerloop1.time] = loop1.Slot;
                                        } else if (Objects.equals(innerloop1.day, "Tuesday")) {
                                            tt[n][1][innerloop1.time] = loop1.Slot;
                                        } else if (Objects.equals(innerloop1.day, "Wednesday")) {
                                            tt[n][2][innerloop1.time] = loop1.Slot;
                                        } else if (Objects.equals(innerloop1.day, "Thursday")) {
                                            tt[n][3][innerloop1.time] = loop1.Slot;
                                        } else if (Objects.equals(innerloop1.day, "Friday")) {
                                            tt[n][4][innerloop1.time] = loop1.Slot;
                                        }
                                        innerloop1 = innerloop1.next;
                                    }

                                    int c1 = 0;
                                    I2node innerloop2 = loop2.i2;
                                    while (innerloop2 != null) {
                                        if (Objects.equals(innerloop2.day, "Monday")) {
                                            if (tt[n][0][innerloop2.time] != null) {
                                                c1 = 1;
                                            }
                                        } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                            if (tt[n][1][innerloop2.time] != null) {
                                                c1 = 1;
                                            }
                                        } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                            if (tt[n][2][innerloop2.time] != null) {
                                                c1 = 1;
                                            }
                                        }
                                        if (Objects.equals(innerloop2.day, "Thursday")) {
                                            if (tt[n][3][innerloop2.time] != null) {
                                                c1 = 1;
                                            }
                                        } else if (Objects.equals(innerloop2.day, "Friday")) {
                                            if (tt[n][4][innerloop2.time] != null) {
                                                c1 = 1;
                                            }
                                        }
                                        innerloop2 = innerloop2.next;
                                    }
                                    if (c1 != 1) {
                                        innerloop2 = loop2.i2;
                                        while (innerloop2 != null) {
                                            if (Objects.equals(innerloop2.day, "Monday")) {
                                                tt[n][0][innerloop2.time] = loop2.Slot;
                                            } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                tt[n][1][innerloop2.time] = loop2.Slot;
                                            } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                tt[n][2][innerloop2.time] = loop2.Slot;
                                            } else if (Objects.equals(innerloop2.day, "Thursday")) {
                                                tt[n][3][innerloop2.time] = loop2.Slot;
                                            } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                tt[n][4][innerloop2.time] = loop2.Slot;
                                            }
                                            innerloop2 = innerloop2.next;
                                        }
                                    }
                                    int c2 = 0;
                                    I2node innerloop3 = loop3.i2;
                                    while (innerloop3 != null) {
                                        if (Objects.equals(innerloop3.day, "Monday")) {
                                            if (tt[n][0][innerloop3.time] != null) {
                                                c2 = 1;
                                            }
                                        } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                            if (tt[n][1][innerloop3.time] != null) {
                                                c2 = 1;
                                            }
                                        } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                            if (tt[n][2][innerloop3.time] != null) {
                                                c2 = 1;
                                            }
                                        }
                                        if (Objects.equals(innerloop3.day, "Thursday")) {
                                            if (tt[n][3][innerloop3.time] != null) {
                                                c2 = 1;
                                            }
                                        } else if (Objects.equals(innerloop3.day, "Friday")) {
                                            if (tt[n][4][innerloop3.time] != null) {
                                                c2 = 1;
                                            }
                                        }
                                        innerloop3 = innerloop3.next;
                                    }
                                    if (c2 != 1) {
                                        innerloop3 = loop3.i2;
                                        while (innerloop3 != null) {
                                            if (Objects.equals(innerloop3.day, "Monday")) {
                                                tt[n][0][innerloop3.time] = loop3.Slot;
                                            } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                tt[n][1][innerloop3.time] = loop3.Slot;
                                            } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                tt[n][2][innerloop3.time] = loop3.Slot;
                                            } else if (Objects.equals(innerloop3.day, "Thursday")) {
                                                tt[n][3][innerloop3.time] = loop3.Slot;
                                            } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                tt[n][4][innerloop3.time] = loop3.Slot;
                                            }
                                            innerloop3 = innerloop3.next;
                                        }
                                    }
                                    int c3 = 0;
                                    I2node innerloop4 = loop4.i2;
                                    while (innerloop4 != null) {
                                        if (Objects.equals(innerloop4.day, "Monday")) {
                                            if (tt[n][0][innerloop4.time] != null) {
                                                c3 = 1;
                                            }
                                        } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                            if (tt[n][1][innerloop4.time] != null) {
                                                c3 = 1;
                                            }
                                        } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                            if (tt[n][2][innerloop4.time] != null) {
                                                c3 = 1;
                                            }
                                        }
                                        if (Objects.equals(innerloop4.day, "Thursday")) {
                                            if (tt[n][3][innerloop4.time] != null) {
                                                c3 = 1;
                                            }
                                        } else if (Objects.equals(innerloop4.day, "Friday")) {
                                            if (tt[n][4][innerloop4.time] != null) {
                                                c3 = 1;
                                            }
                                        }
                                        innerloop4 = innerloop4.next;
                                    }
                                    if (c3 != 1) {
                                        innerloop4 = loop4.i2;
                                        while (innerloop4 != null) {
                                            if (Objects.equals(innerloop4.day, "Monday")) {
                                                tt[n][0][innerloop4.time] = loop4.Slot;
                                            } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                tt[n][1][innerloop4.time] = loop4.Slot;
                                            } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                tt[n][2][innerloop4.time] = loop4.Slot;
                                            } else if (Objects.equals(innerloop4.day, "Thursday")) {
                                                tt[n][3][innerloop4.time] = loop4.Slot;
                                            } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                tt[n][4][innerloop4.time] = loop4.Slot;
                                            }
                                            innerloop4 = innerloop4.next;
                                        }
                                    }
                                    int c4 = 0;
                                    I2node innerloop5 = loop5.i2;
                                    while (innerloop5 != null) {
                                        if (Objects.equals(innerloop5.day, "Monday")) {
                                            if (tt[n][0][innerloop5.time] != null) {
                                                c4 = 1;
                                            }
                                        } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                            if (tt[n][1][innerloop5.time] != null) {
                                                c4 = 1;
                                            }
                                        } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                            if (tt[n][2][innerloop5.time] != null) {
                                                c4 = 1;
                                            }
                                        }
                                        if (Objects.equals(innerloop5.day, "Thursday")) {
                                            if (tt[n][3][innerloop5.time] != null) {
                                                c4 = 1;
                                            }
                                        } else if (Objects.equals(innerloop5.day, "Friday")) {
                                            if (tt[n][4][innerloop5.time] != null) {
                                                c4 = 1;
                                            }
                                        }
                                        innerloop5 = innerloop5.next;
                                    }
                                    if (c4 != 1) {
                                        innerloop5 = loop5.i2;
                                        while (innerloop5 != null) {
                                            if (Objects.equals(innerloop5.day, "Monday")) {
                                                tt[n][0][innerloop5.time] = loop5.Slot;
                                            } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                tt[n][1][innerloop5.time] = loop5.Slot;
                                            } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                tt[n][2][innerloop5.time] = loop5.Slot;
                                            } else if (Objects.equals(innerloop5.day, "Thursday")) {
                                                tt[n][3][innerloop5.time] = loop5.Slot;
                                            } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                tt[n][4][innerloop5.time] = loop5.Slot;
                                            }
                                            innerloop5 = innerloop5.next;
                                        }
                                    }
                                    int c5 = 0;
                                    I2node innerloop6 = loop6.i2;
                                    while (innerloop6 != null) {
                                        if (Objects.equals(innerloop6.day, "Monday")) {
                                            if (tt[n][0][innerloop6.time] != null) {
                                                c5 = 1;
                                            }
                                        } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                            if (tt[n][1][innerloop6.time] != null) {
                                                c5 = 1;
                                            }
                                        } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                            if (tt[n][2][innerloop6.time] != null) {
                                                c5 = 1;
                                            }
                                        }
                                        if (Objects.equals(innerloop6.day, "Thursday")) {
                                            if (tt[n][3][innerloop6.time] != null) {
                                                c5 = 1;
                                            }
                                        } else if (Objects.equals(innerloop6.day, "Friday")) {
                                            if (tt[n][4][innerloop6.time] != null) {
                                                c5 = 1;
                                            }
                                        }
                                        innerloop6 = innerloop6.next;
                                    }
                                    if (c5 != 1) {
                                        innerloop6 = loop6.i2;
                                        while (innerloop6 != null) {
                                            if (Objects.equals(innerloop6.day, "Monday")) {
                                                tt[n][0][innerloop6.time] = loop6.Slot;
                                            } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                tt[n][1][innerloop6.time] = loop6.Slot;
                                            } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                tt[n][2][innerloop6.time] = loop6.Slot;
                                            } else if (Objects.equals(innerloop6.day, "Thursday")) {
                                                tt[n][3][innerloop6.time] = loop6.Slot;
                                            } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                tt[n][4][innerloop6.time] = loop6.Slot;
                                            }
                                            innerloop6 = innerloop6.next;
                                        }
                                    }
                                    int c6 = 0;
                                    I2node innerloop7 = loop7.i2;
                                    while (innerloop7 != null) {
                                        if (Objects.equals(innerloop7.day, "Monday")) {
                                            if (tt[n][0][innerloop7.time] != null) {
                                                c6 = 1;
                                            }
                                        } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                            if (tt[n][1][innerloop7.time] != null) {
                                                c6 = 1;
                                            }
                                        } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                            if (tt[n][2][innerloop7.time] != null) {
                                                c6 = 1;
                                            }
                                        }
                                        if (Objects.equals(innerloop7.day, "Thursday")) {
                                            if (tt[n][3][innerloop7.time] != null) {
                                                c6 = 1;
                                            }
                                        } else if (Objects.equals(innerloop7.day, "Friday")) {
                                            if (tt[n][4][innerloop7.time] != null) {
                                                c6 = 1;
                                            }
                                        }
                                        innerloop7 = innerloop7.next;
                                    }
                                    if (c6 != 1) {
                                        innerloop7 = loop7.i2;
                                        while (innerloop7 != null) {
                                            if (Objects.equals(innerloop7.day, "Monday")) {
                                                tt[n][0][innerloop7.time] = loop7.Slot;
                                            } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                tt[n][1][innerloop7.time] = loop7.Slot;
                                            } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                tt[n][2][innerloop7.time] = loop7.Slot;
                                            } else if (Objects.equals(innerloop7.day, "Thursday")) {
                                                tt[n][3][innerloop7.time] = loop7.Slot;
                                            } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                tt[n][4][innerloop7.time] = loop7.Slot;
                                            }
                                            innerloop7 = innerloop7.next;
                                        }
                                    }
                                    n++;
                                    loop7 = loop7.next;
                                }
                                loop6 = loop6.next;
                            }
                            loop5 = loop5.next;
                        }
                        loop4 = loop4.next;
                    }
                    loop3 = loop3.next;
                }
                loop2=loop2.next;
            }
            loop1=loop1.next;
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<4;k++){
                    if(tt[i][j][k]!=null){
                        sum[i]=sum[i]+1;
                    }
                }
            }
        }
        int max = Arrays.stream(sum).max().getAsInt();
        int no = 0;
        for(int i=0;i<n;i++){
            if(max==sum[i]){
                no=i;
                break;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(tt[no][i][j]!=null){
                    if(i==0&&j==0){
                        TextView t=(TextView) findViewById(R.id.M1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==1){
                        TextView t=(TextView) findViewById(R.id.M2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==2){
                        TextView t=(TextView) findViewById(R.id.M3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==3){
                        TextView t=(TextView) findViewById(R.id.M4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==0){
                        TextView t=(TextView) findViewById(R.id.T1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==1){
                        TextView t=(TextView) findViewById(R.id.T2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==2){
                        TextView t=(TextView) findViewById(R.id.T3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==3){
                        TextView t=(TextView) findViewById(R.id.T4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==0){
                        TextView t=(TextView) findViewById(R.id.W1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==1){
                        TextView t=(TextView) findViewById(R.id.W2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==2){
                        TextView t=(TextView) findViewById(R.id.W3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==3){
                        TextView t=(TextView) findViewById(R.id.W4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==0){
                        TextView t=(TextView) findViewById(R.id.Th1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==1){
                        TextView t=(TextView) findViewById(R.id.Th2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==2){
                        TextView t=(TextView) findViewById(R.id.Th3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==3){
                        TextView t=(TextView) findViewById(R.id.Th4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==0){
                        TextView t=(TextView) findViewById(R.id.F1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==1){
                        TextView t=(TextView) findViewById(R.id.F2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==2){
                        TextView t=(TextView) findViewById(R.id.F3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==3){
                        TextView t=(TextView) findViewById(R.id.F4);
                        t.setText(tt[no][i][j]);
                    }
                }
            }
        }
    }
    void num8(LinkedList list){
        String[][][] tt=new String[2000][5][4];
        int n=0;
        I1node loop1=list.head.next.next.next.next.next.next.next.i1;
        while(loop1!=null){
            I1node loop2=list.head.next.next.next.next.next.next.i1;
            while(loop2!=null){
                I1node loop3=list.head.next.next.next.next.next.i1;
                while(loop3!=null) {
                    I1node loop4=list.head.next.next.next.next.i1;
                    while(loop4!=null) {
                        I1node loop5=list.head.next.next.next.i1;
                        while(loop5!=null) {
                            I1node loop6=list.head.next.next.i1;
                            while(loop6!=null) {
                                I1node loop7=list.head.next.i1;
                                while (loop7!=null) {
                                    I1node loop8=list.head.i1;
                                    while(loop8!=null) {
                                        I2node innerloop1 = loop1.i2;
                                        while (innerloop1 != null) {
                                            if (Objects.equals(innerloop1.day, "Monday")) {
                                                tt[n][0][innerloop1.time] = loop1.Slot;
                                            } else if (Objects.equals(innerloop1.day, "Tuesday")) {
                                                tt[n][1][innerloop1.time] = loop1.Slot;
                                            } else if (Objects.equals(innerloop1.day, "Wednesday")) {
                                                tt[n][2][innerloop1.time] = loop1.Slot;
                                            } else if (Objects.equals(innerloop1.day, "Thursday")) {
                                                tt[n][3][innerloop1.time] = loop1.Slot;
                                            } else if (Objects.equals(innerloop1.day, "Friday")) {
                                                tt[n][4][innerloop1.time] = loop1.Slot;
                                            }
                                            innerloop1 = innerloop1.next;
                                        }

                                        int c1 = 0;
                                        I2node innerloop2 = loop2.i2;
                                        while (innerloop2 != null) {
                                            if (Objects.equals(innerloop2.day, "Monday")) {
                                                if (tt[n][0][innerloop2.time] != null) {
                                                    c1 = 1;
                                                }
                                            } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                if (tt[n][1][innerloop2.time] != null) {
                                                    c1 = 1;
                                                }
                                            } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                if (tt[n][2][innerloop2.time] != null) {
                                                    c1 = 1;
                                                }
                                            }
                                            if (Objects.equals(innerloop2.day, "Thursday")) {
                                                if (tt[n][3][innerloop2.time] != null) {
                                                    c1 = 1;
                                                }
                                            } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                if (tt[n][4][innerloop2.time] != null) {
                                                    c1 = 1;
                                                }
                                            }
                                            innerloop2 = innerloop2.next;
                                        }
                                        if (c1 != 1) {
                                            innerloop2 = loop2.i2;
                                            while (innerloop2 != null) {
                                                if (Objects.equals(innerloop2.day, "Monday")) {
                                                    tt[n][0][innerloop2.time] = loop2.Slot;
                                                } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                    tt[n][1][innerloop2.time] = loop2.Slot;
                                                } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                    tt[n][2][innerloop2.time] = loop2.Slot;
                                                } else if (Objects.equals(innerloop2.day, "Thursday")) {
                                                    tt[n][3][innerloop2.time] = loop2.Slot;
                                                } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                    tt[n][4][innerloop2.time] = loop2.Slot;
                                                }
                                                innerloop2 = innerloop2.next;
                                            }
                                        }
                                        int c2 = 0;
                                        I2node innerloop3 = loop3.i2;
                                        while (innerloop3 != null) {
                                            if (Objects.equals(innerloop3.day, "Monday")) {
                                                if (tt[n][0][innerloop3.time] != null) {
                                                    c2 = 1;
                                                }
                                            } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                if (tt[n][1][innerloop3.time] != null) {
                                                    c2 = 1;
                                                }
                                            } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                if (tt[n][2][innerloop3.time] != null) {
                                                    c2 = 1;
                                                }
                                            }
                                            if (Objects.equals(innerloop3.day, "Thursday")) {
                                                if (tt[n][3][innerloop3.time] != null) {
                                                    c2 = 1;
                                                }
                                            } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                if (tt[n][4][innerloop3.time] != null) {
                                                    c2 = 1;
                                                }
                                            }
                                            innerloop3 = innerloop3.next;
                                        }
                                        if (c2 != 1) {
                                            innerloop3 = loop3.i2;
                                            while (innerloop3 != null) {
                                                if (Objects.equals(innerloop3.day, "Monday")) {
                                                    tt[n][0][innerloop3.time] = loop3.Slot;
                                                } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                    tt[n][1][innerloop3.time] = loop3.Slot;
                                                } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                    tt[n][2][innerloop3.time] = loop3.Slot;
                                                } else if (Objects.equals(innerloop3.day, "Thursday")) {
                                                    tt[n][3][innerloop3.time] = loop3.Slot;
                                                } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                    tt[n][4][innerloop3.time] = loop3.Slot;
                                                }
                                                innerloop3 = innerloop3.next;
                                            }
                                        }
                                        int c3 = 0;
                                        I2node innerloop4 = loop4.i2;
                                        while (innerloop4 != null) {
                                            if (Objects.equals(innerloop4.day, "Monday")) {
                                                if (tt[n][0][innerloop4.time] != null) {
                                                    c3 = 1;
                                                }
                                            } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                if (tt[n][1][innerloop4.time] != null) {
                                                    c3 = 1;
                                                }
                                            } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                if (tt[n][2][innerloop4.time] != null) {
                                                    c3 = 1;
                                                }
                                            }
                                            if (Objects.equals(innerloop4.day, "Thursday")) {
                                                if (tt[n][3][innerloop4.time] != null) {
                                                    c3 = 1;
                                                }
                                            } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                if (tt[n][4][innerloop4.time] != null) {
                                                    c3 = 1;
                                                }
                                            }
                                            innerloop4 = innerloop4.next;
                                        }
                                        if (c3 != 1) {
                                            innerloop4 = loop4.i2;
                                            while (innerloop4 != null) {
                                                if (Objects.equals(innerloop4.day, "Monday")) {
                                                    tt[n][0][innerloop4.time] = loop4.Slot;
                                                } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                    tt[n][1][innerloop4.time] = loop4.Slot;
                                                } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                    tt[n][2][innerloop4.time] = loop4.Slot;
                                                } else if (Objects.equals(innerloop4.day, "Thursday")) {
                                                    tt[n][3][innerloop4.time] = loop4.Slot;
                                                } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                    tt[n][4][innerloop4.time] = loop4.Slot;
                                                }
                                                innerloop4 = innerloop4.next;
                                            }
                                        }
                                        int c4 = 0;
                                        I2node innerloop5 = loop5.i2;
                                        while (innerloop5 != null) {
                                            if (Objects.equals(innerloop5.day, "Monday")) {
                                                if (tt[n][0][innerloop5.time] != null) {
                                                    c4 = 1;
                                                }
                                            } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                if (tt[n][1][innerloop5.time] != null) {
                                                    c4 = 1;
                                                }
                                            } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                if (tt[n][2][innerloop5.time] != null) {
                                                    c4 = 1;
                                                }
                                            }
                                            if (Objects.equals(innerloop5.day, "Thursday")) {
                                                if (tt[n][3][innerloop5.time] != null) {
                                                    c4 = 1;
                                                }
                                            } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                if (tt[n][4][innerloop5.time] != null) {
                                                    c4 = 1;
                                                }
                                            }
                                            innerloop5 = innerloop5.next;
                                        }
                                        if (c4 != 1) {
                                            innerloop5 = loop5.i2;
                                            while (innerloop5 != null) {
                                                if (Objects.equals(innerloop5.day, "Monday")) {
                                                    tt[n][0][innerloop5.time] = loop5.Slot;
                                                } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                    tt[n][1][innerloop5.time] = loop5.Slot;
                                                } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                    tt[n][2][innerloop5.time] = loop5.Slot;
                                                } else if (Objects.equals(innerloop5.day, "Thursday")) {
                                                    tt[n][3][innerloop5.time] = loop5.Slot;
                                                } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                    tt[n][4][innerloop5.time] = loop5.Slot;
                                                }
                                                innerloop5 = innerloop5.next;
                                            }
                                        }
                                        int c5 = 0;
                                        I2node innerloop6 = loop6.i2;
                                        while (innerloop6 != null) {
                                            if (Objects.equals(innerloop6.day, "Monday")) {
                                                if (tt[n][0][innerloop6.time] != null) {
                                                    c5 = 1;
                                                }
                                            } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                if (tt[n][1][innerloop6.time] != null) {
                                                    c5 = 1;
                                                }
                                            } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                if (tt[n][2][innerloop6.time] != null) {
                                                    c5 = 1;
                                                }
                                            }
                                            if (Objects.equals(innerloop6.day, "Thursday")) {
                                                if (tt[n][3][innerloop6.time] != null) {
                                                    c5 = 1;
                                                }
                                            } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                if (tt[n][4][innerloop6.time] != null) {
                                                    c5 = 1;
                                                }
                                            }
                                            innerloop6 = innerloop6.next;
                                        }
                                        if (c5 != 1) {
                                            innerloop6 = loop6.i2;
                                            while (innerloop6 != null) {
                                                if (Objects.equals(innerloop6.day, "Monday")) {
                                                    tt[n][0][innerloop6.time] = loop6.Slot;
                                                } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                    tt[n][1][innerloop6.time] = loop6.Slot;
                                                } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                    tt[n][2][innerloop6.time] = loop6.Slot;
                                                } else if (Objects.equals(innerloop6.day, "Thursday")) {
                                                    tt[n][3][innerloop6.time] = loop6.Slot;
                                                } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                    tt[n][4][innerloop6.time] = loop6.Slot;
                                                }
                                                innerloop6 = innerloop6.next;
                                            }
                                        }
                                        int c6 = 0;
                                        I2node innerloop7 = loop7.i2;
                                        while (innerloop7 != null) {
                                            if (Objects.equals(innerloop7.day, "Monday")) {
                                                if (tt[n][0][innerloop7.time] != null) {
                                                    c6 = 1;
                                                }
                                            } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                if (tt[n][1][innerloop7.time] != null) {
                                                    c6 = 1;
                                                }
                                            } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                if (tt[n][2][innerloop7.time] != null) {
                                                    c6 = 1;
                                                }
                                            }
                                            if (Objects.equals(innerloop7.day, "Thursday")) {
                                                if (tt[n][3][innerloop7.time] != null) {
                                                    c6 = 1;
                                                }
                                            } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                if (tt[n][4][innerloop7.time] != null) {
                                                    c6 = 1;
                                                }
                                            }
                                            innerloop7 = innerloop7.next;
                                        }
                                        if (c6 != 1) {
                                            innerloop7 = loop7.i2;
                                            while (innerloop7 != null) {
                                                if (Objects.equals(innerloop7.day, "Monday")) {
                                                    tt[n][0][innerloop7.time] = loop7.Slot;
                                                } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                    tt[n][1][innerloop7.time] = loop7.Slot;
                                                } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                    tt[n][2][innerloop7.time] = loop7.Slot;
                                                } else if (Objects.equals(innerloop7.day, "Thursday")) {
                                                    tt[n][3][innerloop7.time] = loop7.Slot;
                                                } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                    tt[n][4][innerloop7.time] = loop7.Slot;
                                                }
                                                innerloop7 = innerloop7.next;
                                            }
                                        }
                                        int c7 = 0;
                                        I2node innerloop8 = loop8.i2;
                                        while (innerloop8 != null) {
                                            if (Objects.equals(innerloop8.day, "Monday")) {
                                                if (tt[n][0][innerloop8.time] != null) {
                                                    c7 = 1;
                                                }
                                            } else if (Objects.equals(innerloop8.day, "Tuesday")) {
                                                if (tt[n][1][innerloop8.time] != null) {
                                                    c7 = 1;
                                                }
                                            } else if (Objects.equals(innerloop8.day, "Wednesday")) {
                                                if (tt[n][2][innerloop8.time] != null) {
                                                    c7 = 1;
                                                }
                                            }
                                            if (Objects.equals(innerloop8.day, "Thursday")) {
                                                if (tt[n][3][innerloop8.time] != null) {
                                                    c7 = 1;
                                                }
                                            } else if (Objects.equals(innerloop8.day, "Friday")) {
                                                if (tt[n][4][innerloop8.time] != null) {
                                                    c7 = 1;
                                                }
                                            }
                                            innerloop8 = innerloop8.next;
                                        }
                                        if (c7 != 1) {
                                            innerloop8 = loop8.i2;
                                            while (innerloop8 != null) {
                                                if (Objects.equals(innerloop8.day, "Monday")) {
                                                    tt[n][0][innerloop8.time] = loop8.Slot;
                                                } else if (Objects.equals(innerloop8.day, "Tuesday")) {
                                                    tt[n][1][innerloop8.time] = loop8.Slot;
                                                } else if (Objects.equals(innerloop8.day, "Wednesday")) {
                                                    tt[n][2][innerloop8.time] = loop8.Slot;
                                                } else if (Objects.equals(innerloop8.day, "Thursday")) {
                                                    tt[n][3][innerloop8.time] = loop8.Slot;
                                                } else if (Objects.equals(innerloop8.day, "Friday")) {
                                                    tt[n][4][innerloop8.time] = loop8.Slot;
                                                }
                                                innerloop8 = innerloop8.next;
                                            }
                                        }
                                        n++;
                                        loop8 = loop8.next;
                                    }
                                    loop7 = loop7.next;
                                }
                                loop6 = loop6.next;
                            }
                            loop5 = loop5.next;
                        }
                        loop4 = loop4.next;
                    }
                    loop3 = loop3.next;
                }
                loop2=loop2.next;
            }
            loop1=loop1.next;
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<4;k++){
                    if(tt[i][j][k]!=null){
                        sum[i]=sum[i]+1;
                    }
                }
            }
        }
        int max = Arrays.stream(sum).max().getAsInt();
        int no = 0;
        for(int i=0;i<n;i++){
            if(max==sum[i]){
                no=i;
                break;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(tt[no][i][j]!=null){
                    if(i==0&&j==0){
                        TextView t=(TextView) findViewById(R.id.M1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==1){
                        TextView t=(TextView) findViewById(R.id.M2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==2){
                        TextView t=(TextView) findViewById(R.id.M3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==3){
                        TextView t=(TextView) findViewById(R.id.M4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==0){
                        TextView t=(TextView) findViewById(R.id.T1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==1){
                        TextView t=(TextView) findViewById(R.id.T2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==2){
                        TextView t=(TextView) findViewById(R.id.T3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==3){
                        TextView t=(TextView) findViewById(R.id.T4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==0){
                        TextView t=(TextView) findViewById(R.id.W1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==1){
                        TextView t=(TextView) findViewById(R.id.W2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==2){
                        TextView t=(TextView) findViewById(R.id.W3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==3){
                        TextView t=(TextView) findViewById(R.id.W4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==0){
                        TextView t=(TextView) findViewById(R.id.Th1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==1){
                        TextView t=(TextView) findViewById(R.id.Th2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==2){
                        TextView t=(TextView) findViewById(R.id.Th3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==3){
                        TextView t=(TextView) findViewById(R.id.Th4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==0){
                        TextView t=(TextView) findViewById(R.id.F1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==1){
                        TextView t=(TextView) findViewById(R.id.F2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==2){
                        TextView t=(TextView) findViewById(R.id.F3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==3){
                        TextView t=(TextView) findViewById(R.id.F4);
                        t.setText(tt[no][i][j]);
                    }
                }
            }
        }
    }
    void num9(LinkedList list){
        String[][][] tt=new String[4000][5][4];
        int n=0;
        I1node loop1=list.head.next.next.next.next.next.next.next.next.i1;
        while(loop1!=null){
            I1node loop2=list.head.next.next.next.next.next.next.next.i1;
            while(loop2!=null){
                I1node loop3=list.head.next.next.next.next.next.next.i1;
                while(loop3!=null) {
                    I1node loop4=list.head.next.next.next.next.next.i1;
                    while(loop4!=null) {
                        I1node loop5=list.head.next.next.next.next.i1;
                        while(loop5!=null) {
                            I1node loop6=list.head.next.next.next.i1;
                            while(loop6!=null) {
                                I1node loop7=list.head.next.next.i1;
                                while (loop7!=null) {
                                    I1node loop8=list.head.next.i1;
                                    while(loop8!=null) {
                                        I1node loop9=list.head.i1;
                                        while(loop9!=null) {
                                            I2node innerloop1 = loop1.i2;
                                            while (innerloop1 != null) {
                                                if (Objects.equals(innerloop1.day, "Monday")) {
                                                    tt[n][0][innerloop1.time] = loop1.Slot;
                                                } else if (Objects.equals(innerloop1.day, "Tuesday")) {
                                                    tt[n][1][innerloop1.time] = loop1.Slot;
                                                } else if (Objects.equals(innerloop1.day, "Wednesday")) {
                                                    tt[n][2][innerloop1.time] = loop1.Slot;
                                                } else if (Objects.equals(innerloop1.day, "Thursday")) {
                                                    tt[n][3][innerloop1.time] = loop1.Slot;
                                                } else if (Objects.equals(innerloop1.day, "Friday")) {
                                                    tt[n][4][innerloop1.time] = loop1.Slot;
                                                }
                                                innerloop1 = innerloop1.next;
                                            }

                                            int c1 = 0;
                                            I2node innerloop2 = loop2.i2;
                                            while (innerloop2 != null) {
                                                if (Objects.equals(innerloop2.day, "Monday")) {
                                                    if (tt[n][0][innerloop2.time] != null) {
                                                        c1 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                    if (tt[n][1][innerloop2.time] != null) {
                                                        c1 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                    if (tt[n][2][innerloop2.time] != null) {
                                                        c1 = 1;
                                                    }
                                                }
                                                if (Objects.equals(innerloop2.day, "Thursday")) {
                                                    if (tt[n][3][innerloop2.time] != null) {
                                                        c1 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                    if (tt[n][4][innerloop2.time] != null) {
                                                        c1 = 1;
                                                    }
                                                }
                                                innerloop2 = innerloop2.next;
                                            }
                                            if (c1 != 1) {
                                                innerloop2 = loop2.i2;
                                                while (innerloop2 != null) {
                                                    if (Objects.equals(innerloop2.day, "Monday")) {
                                                        tt[n][0][innerloop2.time] = loop2.Slot;
                                                    } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                        tt[n][1][innerloop2.time] = loop2.Slot;
                                                    } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                        tt[n][2][innerloop2.time] = loop2.Slot;
                                                    } else if (Objects.equals(innerloop2.day, "Thursday")) {
                                                        tt[n][3][innerloop2.time] = loop2.Slot;
                                                    } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                        tt[n][4][innerloop2.time] = loop2.Slot;
                                                    }
                                                    innerloop2 = innerloop2.next;
                                                }
                                            }
                                            int c2 = 0;
                                            I2node innerloop3 = loop3.i2;
                                            while (innerloop3 != null) {
                                                if (Objects.equals(innerloop3.day, "Monday")) {
                                                    if (tt[n][0][innerloop3.time] != null) {
                                                        c2 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                    if (tt[n][1][innerloop3.time] != null) {
                                                        c2 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                    if (tt[n][2][innerloop3.time] != null) {
                                                        c2 = 1;
                                                    }
                                                }
                                                if (Objects.equals(innerloop3.day, "Thursday")) {
                                                    if (tt[n][3][innerloop3.time] != null) {
                                                        c2 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                    if (tt[n][4][innerloop3.time] != null) {
                                                        c2 = 1;
                                                    }
                                                }
                                                innerloop3 = innerloop3.next;
                                            }
                                            if (c2 != 1) {
                                                innerloop3 = loop3.i2;
                                                while (innerloop3 != null) {
                                                    if (Objects.equals(innerloop3.day, "Monday")) {
                                                        tt[n][0][innerloop3.time] = loop3.Slot;
                                                    } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                        tt[n][1][innerloop3.time] = loop3.Slot;
                                                    } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                        tt[n][2][innerloop3.time] = loop3.Slot;
                                                    } else if (Objects.equals(innerloop3.day, "Thursday")) {
                                                        tt[n][3][innerloop3.time] = loop3.Slot;
                                                    } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                        tt[n][4][innerloop3.time] = loop3.Slot;
                                                    }
                                                    innerloop3 = innerloop3.next;
                                                }
                                            }
                                            int c3 = 0;
                                            I2node innerloop4 = loop4.i2;
                                            while (innerloop4 != null) {
                                                if (Objects.equals(innerloop4.day, "Monday")) {
                                                    if (tt[n][0][innerloop4.time] != null) {
                                                        c3 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                    if (tt[n][1][innerloop4.time] != null) {
                                                        c3 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                    if (tt[n][2][innerloop4.time] != null) {
                                                        c3 = 1;
                                                    }
                                                }
                                                if (Objects.equals(innerloop4.day, "Thursday")) {
                                                    if (tt[n][3][innerloop4.time] != null) {
                                                        c3 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                    if (tt[n][4][innerloop4.time] != null) {
                                                        c3 = 1;
                                                    }
                                                }
                                                innerloop4 = innerloop4.next;
                                            }
                                            if (c3 != 1) {
                                                innerloop4 = loop4.i2;
                                                while (innerloop4 != null) {
                                                    if (Objects.equals(innerloop4.day, "Monday")) {
                                                        tt[n][0][innerloop4.time] = loop4.Slot;
                                                    } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                        tt[n][1][innerloop4.time] = loop4.Slot;
                                                    } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                        tt[n][2][innerloop4.time] = loop4.Slot;
                                                    } else if (Objects.equals(innerloop4.day, "Thursday")) {
                                                        tt[n][3][innerloop4.time] = loop4.Slot;
                                                    } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                        tt[n][4][innerloop4.time] = loop4.Slot;
                                                    }
                                                    innerloop4 = innerloop4.next;
                                                }
                                            }
                                            int c4 = 0;
                                            I2node innerloop5 = loop5.i2;
                                            while (innerloop5 != null) {
                                                if (Objects.equals(innerloop5.day, "Monday")) {
                                                    if (tt[n][0][innerloop5.time] != null) {
                                                        c4 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                    if (tt[n][1][innerloop5.time] != null) {
                                                        c4 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                    if (tt[n][2][innerloop5.time] != null) {
                                                        c4 = 1;
                                                    }
                                                }
                                                if (Objects.equals(innerloop5.day, "Thursday")) {
                                                    if (tt[n][3][innerloop5.time] != null) {
                                                        c4 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                    if (tt[n][4][innerloop5.time] != null) {
                                                        c4 = 1;
                                                    }
                                                }
                                                innerloop5 = innerloop5.next;
                                            }
                                            if (c4 != 1) {
                                                innerloop5 = loop5.i2;
                                                while (innerloop5 != null) {
                                                    if (Objects.equals(innerloop5.day, "Monday")) {
                                                        tt[n][0][innerloop5.time] = loop5.Slot;
                                                    } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                        tt[n][1][innerloop5.time] = loop5.Slot;
                                                    } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                        tt[n][2][innerloop5.time] = loop5.Slot;
                                                    } else if (Objects.equals(innerloop5.day, "Thursday")) {
                                                        tt[n][3][innerloop5.time] = loop5.Slot;
                                                    } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                        tt[n][4][innerloop5.time] = loop5.Slot;
                                                    }
                                                    innerloop5 = innerloop5.next;
                                                }
                                            }
                                            int c5 = 0;
                                            I2node innerloop6 = loop6.i2;
                                            while (innerloop6 != null) {
                                                if (Objects.equals(innerloop6.day, "Monday")) {
                                                    if (tt[n][0][innerloop6.time] != null) {
                                                        c5 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                    if (tt[n][1][innerloop6.time] != null) {
                                                        c5 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                    if (tt[n][2][innerloop6.time] != null) {
                                                        c5 = 1;
                                                    }
                                                }
                                                if (Objects.equals(innerloop6.day, "Thursday")) {
                                                    if (tt[n][3][innerloop6.time] != null) {
                                                        c5 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                    if (tt[n][4][innerloop6.time] != null) {
                                                        c5 = 1;
                                                    }
                                                }
                                                innerloop6 = innerloop6.next;
                                            }
                                            if (c5 != 1) {
                                                innerloop6 = loop6.i2;
                                                while (innerloop6 != null) {
                                                    if (Objects.equals(innerloop6.day, "Monday")) {
                                                        tt[n][0][innerloop6.time] = loop6.Slot;
                                                    } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                        tt[n][1][innerloop6.time] = loop6.Slot;
                                                    } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                        tt[n][2][innerloop6.time] = loop6.Slot;
                                                    } else if (Objects.equals(innerloop6.day, "Thursday")) {
                                                        tt[n][3][innerloop6.time] = loop6.Slot;
                                                    } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                        tt[n][4][innerloop6.time] = loop6.Slot;
                                                    }
                                                    innerloop6 = innerloop6.next;
                                                }
                                            }
                                            int c6 = 0;
                                            I2node innerloop7 = loop7.i2;
                                            while (innerloop7 != null) {
                                                if (Objects.equals(innerloop7.day, "Monday")) {
                                                    if (tt[n][0][innerloop7.time] != null) {
                                                        c6 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                    if (tt[n][1][innerloop7.time] != null) {
                                                        c6 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                    if (tt[n][2][innerloop7.time] != null) {
                                                        c6 = 1;
                                                    }
                                                }
                                                if (Objects.equals(innerloop7.day, "Thursday")) {
                                                    if (tt[n][3][innerloop7.time] != null) {
                                                        c6 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                    if (tt[n][4][innerloop7.time] != null) {
                                                        c6 = 1;
                                                    }
                                                }
                                                innerloop7 = innerloop7.next;
                                            }
                                            if (c6 != 1) {
                                                innerloop7 = loop7.i2;
                                                while (innerloop7 != null) {
                                                    if (Objects.equals(innerloop7.day, "Monday")) {
                                                        tt[n][0][innerloop7.time] = loop7.Slot;
                                                    } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                        tt[n][1][innerloop7.time] = loop7.Slot;
                                                    } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                        tt[n][2][innerloop7.time] = loop7.Slot;
                                                    } else if (Objects.equals(innerloop7.day, "Thursday")) {
                                                        tt[n][3][innerloop7.time] = loop7.Slot;
                                                    } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                        tt[n][4][innerloop7.time] = loop7.Slot;
                                                    }
                                                    innerloop7 = innerloop7.next;
                                                }
                                            }
                                            int c7 = 0;
                                            I2node innerloop8 = loop8.i2;
                                            while (innerloop8 != null) {
                                                if (Objects.equals(innerloop8.day, "Monday")) {
                                                    if (tt[n][0][innerloop8.time] != null) {
                                                        c7 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop8.day, "Tuesday")) {
                                                    if (tt[n][1][innerloop8.time] != null) {
                                                        c7 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop8.day, "Wednesday")) {
                                                    if (tt[n][2][innerloop8.time] != null) {
                                                        c7 = 1;
                                                    }
                                                }
                                                if (Objects.equals(innerloop8.day, "Thursday")) {
                                                    if (tt[n][3][innerloop8.time] != null) {
                                                        c7 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop8.day, "Friday")) {
                                                    if (tt[n][4][innerloop8.time] != null) {
                                                        c7 = 1;
                                                    }
                                                }
                                                innerloop8 = innerloop8.next;
                                            }
                                            if (c7 != 1) {
                                                innerloop8 = loop8.i2;
                                                while (innerloop8 != null) {
                                                    if (Objects.equals(innerloop8.day, "Monday")) {
                                                        tt[n][0][innerloop8.time] = loop8.Slot;
                                                    } else if (Objects.equals(innerloop8.day, "Tuesday")) {
                                                        tt[n][1][innerloop8.time] = loop8.Slot;
                                                    } else if (Objects.equals(innerloop8.day, "Wednesday")) {
                                                        tt[n][2][innerloop8.time] = loop8.Slot;
                                                    } else if (Objects.equals(innerloop8.day, "Thursday")) {
                                                        tt[n][3][innerloop8.time] = loop8.Slot;
                                                    } else if (Objects.equals(innerloop8.day, "Friday")) {
                                                        tt[n][4][innerloop8.time] = loop8.Slot;
                                                    }
                                                    innerloop8 = innerloop8.next;
                                                }
                                            }
                                            int c8 = 0;
                                            I2node innerloop9 = loop9.i2;
                                            while (innerloop9 != null) {
                                                if (Objects.equals(innerloop9.day, "Monday")) {
                                                    if (tt[n][0][innerloop9.time] != null) {
                                                        c8 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop9.day, "Tuesday")) {
                                                    if (tt[n][1][innerloop9.time] != null) {
                                                        c8 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop9.day, "Wednesday")) {
                                                    if (tt[n][2][innerloop9.time] != null) {
                                                        c8 = 1;
                                                    }
                                                }
                                                if (Objects.equals(innerloop9.day, "Thursday")) {
                                                    if (tt[n][3][innerloop9.time] != null) {
                                                        c8 = 1;
                                                    }
                                                } else if (Objects.equals(innerloop9.day, "Friday")) {
                                                    if (tt[n][4][innerloop9.time] != null) {
                                                        c8 = 1;
                                                    }
                                                }
                                                innerloop9 = innerloop9.next;
                                            }
                                            if (c8 != 1) {
                                                innerloop9 = loop9.i2;
                                                while (innerloop9 != null) {
                                                    if (Objects.equals(innerloop9.day, "Monday")) {
                                                        tt[n][0][innerloop9.time] = loop9.Slot;
                                                    } else if (Objects.equals(innerloop9.day, "Tuesday")) {
                                                        tt[n][1][innerloop9.time] = loop9.Slot;
                                                    } else if (Objects.equals(innerloop9.day, "Wednesday")) {
                                                        tt[n][2][innerloop9.time] = loop9.Slot;
                                                    } else if (Objects.equals(innerloop9.day, "Thursday")) {
                                                        tt[n][3][innerloop9.time] = loop9.Slot;
                                                    } else if (Objects.equals(innerloop9.day, "Friday")) {
                                                        tt[n][4][innerloop9.time] = loop9.Slot;
                                                    }
                                                    innerloop9 = innerloop9.next;
                                                }
                                            }
                                            n++;
                                            loop9 = loop9.next;
                                        }
                                        loop8 = loop8.next;
                                    }
                                    loop7 = loop7.next;
                                }
                                loop6 = loop6.next;
                            }
                            loop5 = loop5.next;
                        }
                        loop4 = loop4.next;
                    }
                    loop3 = loop3.next;
                }
                loop2=loop2.next;
            }
            loop1=loop1.next;
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<4;k++){
                    if(tt[i][j][k]!=null){
                        sum[i]=sum[i]+1;
                    }
                }
            }
        }
        int max = Arrays.stream(sum).max().getAsInt();
        int no = 0;
        for(int i=0;i<n;i++){
            if(max==sum[i]){
                no=i;
                break;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(tt[no][i][j]!=null){
                    if(i==0&&j==0){
                        TextView t=(TextView) findViewById(R.id.M1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==1){
                        TextView t=(TextView) findViewById(R.id.M2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==2){
                        TextView t=(TextView) findViewById(R.id.M3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==3){
                        TextView t=(TextView) findViewById(R.id.M4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==0){
                        TextView t=(TextView) findViewById(R.id.T1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==1){
                        TextView t=(TextView) findViewById(R.id.T2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==2){
                        TextView t=(TextView) findViewById(R.id.T3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==3){
                        TextView t=(TextView) findViewById(R.id.T4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==0){
                        TextView t=(TextView) findViewById(R.id.W1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==1){
                        TextView t=(TextView) findViewById(R.id.W2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==2){
                        TextView t=(TextView) findViewById(R.id.W3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==3){
                        TextView t=(TextView) findViewById(R.id.W4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==0){
                        TextView t=(TextView) findViewById(R.id.Th1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==1){
                        TextView t=(TextView) findViewById(R.id.Th2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==2){
                        TextView t=(TextView) findViewById(R.id.Th3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==3){
                        TextView t=(TextView) findViewById(R.id.Th4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==0){
                        TextView t=(TextView) findViewById(R.id.F1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==1){
                        TextView t=(TextView) findViewById(R.id.F2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==2){
                        TextView t=(TextView) findViewById(R.id.F3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==3){
                        TextView t=(TextView) findViewById(R.id.F4);
                        t.setText(tt[no][i][j]);
                    }
                }
            }
        }
    }
    void num10(LinkedList list){
        String[][][] tt=new String[10000][5][4];
        int n=0;
        I1node loop1=list.head.next.next.next.next.next.next.next.next.next.i1;
        while(loop1!=null){
            I1node loop2=list.head.next.next.next.next.next.next.next.next.i1;
            while(loop2!=null){
                I1node loop3=list.head.next.next.next.next.next.next.next.i1;
                while(loop3!=null) {
                    I1node loop4=list.head.next.next.next.next.next.next.i1;
                    while(loop4!=null) {
                        I1node loop5=list.head.next.next.next.next.next.i1;
                        while(loop5!=null) {
                            I1node loop6=list.head.next.next.next.next.i1;
                            while(loop6!=null) {
                                I1node loop7=list.head.next.next.next.i1;
                                while (loop7!=null) {
                                    I1node loop8=list.head.next.next.i1;
                                    while(loop8!=null) {
                                        I1node loop9=list.head.next.i1;
                                        while(loop9!=null) {
                                            I1node loop10=list.head.i1;
                                            while(loop10!=null) {
                                                I2node innerloop1 = loop1.i2;
                                                while (innerloop1 != null) {
                                                    if (Objects.equals(innerloop1.day, "Monday")) {
                                                        tt[n][0][innerloop1.time] = loop1.Slot;
                                                    } else if (Objects.equals(innerloop1.day, "Tuesday")) {
                                                        tt[n][1][innerloop1.time] = loop1.Slot;
                                                    } else if (Objects.equals(innerloop1.day, "Wednesday")) {
                                                        tt[n][2][innerloop1.time] = loop1.Slot;
                                                    } else if (Objects.equals(innerloop1.day, "Thursday")) {
                                                        tt[n][3][innerloop1.time] = loop1.Slot;
                                                    } else if (Objects.equals(innerloop1.day, "Friday")) {
                                                        tt[n][4][innerloop1.time] = loop1.Slot;
                                                    }
                                                    innerloop1 = innerloop1.next;
                                                }

                                                int c1 = 0;
                                                I2node innerloop2 = loop2.i2;
                                                while (innerloop2 != null) {
                                                    if (Objects.equals(innerloop2.day, "Monday")) {
                                                        if (tt[n][0][innerloop2.time] != null) {
                                                            c1 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                        if (tt[n][1][innerloop2.time] != null) {
                                                            c1 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                        if (tt[n][2][innerloop2.time] != null) {
                                                            c1 = 1;
                                                        }
                                                    }
                                                    if (Objects.equals(innerloop2.day, "Thursday")) {
                                                        if (tt[n][3][innerloop2.time] != null) {
                                                            c1 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                        if (tt[n][4][innerloop2.time] != null) {
                                                            c1 = 1;
                                                        }
                                                    }
                                                    innerloop2 = innerloop2.next;
                                                }
                                                if (c1 != 1) {
                                                    innerloop2 = loop2.i2;
                                                    while (innerloop2 != null) {
                                                        if (Objects.equals(innerloop2.day, "Monday")) {
                                                            tt[n][0][innerloop2.time] = loop2.Slot;
                                                        } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                            tt[n][1][innerloop2.time] = loop2.Slot;
                                                        } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                            tt[n][2][innerloop2.time] = loop2.Slot;
                                                        } else if (Objects.equals(innerloop2.day, "Thursday")) {
                                                            tt[n][3][innerloop2.time] = loop2.Slot;
                                                        } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                            tt[n][4][innerloop2.time] = loop2.Slot;
                                                        }
                                                        innerloop2 = innerloop2.next;
                                                    }
                                                }
                                                int c2 = 0;
                                                I2node innerloop3 = loop3.i2;
                                                while (innerloop3 != null) {
                                                    if (Objects.equals(innerloop3.day, "Monday")) {
                                                        if (tt[n][0][innerloop3.time] != null) {
                                                            c2 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                        if (tt[n][1][innerloop3.time] != null) {
                                                            c2 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                        if (tt[n][2][innerloop3.time] != null) {
                                                            c2 = 1;
                                                        }
                                                    }
                                                    if (Objects.equals(innerloop3.day, "Thursday")) {
                                                        if (tt[n][3][innerloop3.time] != null) {
                                                            c2 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                        if (tt[n][4][innerloop3.time] != null) {
                                                            c2 = 1;
                                                        }
                                                    }
                                                    innerloop3 = innerloop3.next;
                                                }
                                                if (c2 != 1) {
                                                    innerloop3 = loop3.i2;
                                                    while (innerloop3 != null) {
                                                        if (Objects.equals(innerloop3.day, "Monday")) {
                                                            tt[n][0][innerloop3.time] = loop3.Slot;
                                                        } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                            tt[n][1][innerloop3.time] = loop3.Slot;
                                                        } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                            tt[n][2][innerloop3.time] = loop3.Slot;
                                                        } else if (Objects.equals(innerloop3.day, "Thursday")) {
                                                            tt[n][3][innerloop3.time] = loop3.Slot;
                                                        } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                            tt[n][4][innerloop3.time] = loop3.Slot;
                                                        }
                                                        innerloop3 = innerloop3.next;
                                                    }
                                                }
                                                int c3 = 0;
                                                I2node innerloop4 = loop4.i2;
                                                while (innerloop4 != null) {
                                                    if (Objects.equals(innerloop4.day, "Monday")) {
                                                        if (tt[n][0][innerloop4.time] != null) {
                                                            c3 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                        if (tt[n][1][innerloop4.time] != null) {
                                                            c3 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                        if (tt[n][2][innerloop4.time] != null) {
                                                            c3 = 1;
                                                        }
                                                    }
                                                    if (Objects.equals(innerloop4.day, "Thursday")) {
                                                        if (tt[n][3][innerloop4.time] != null) {
                                                            c3 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                        if (tt[n][4][innerloop4.time] != null) {
                                                            c3 = 1;
                                                        }
                                                    }
                                                    innerloop4 = innerloop4.next;
                                                }
                                                if (c3 != 1) {
                                                    innerloop4 = loop4.i2;
                                                    while (innerloop4 != null) {
                                                        if (Objects.equals(innerloop4.day, "Monday")) {
                                                            tt[n][0][innerloop4.time] = loop4.Slot;
                                                        } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                            tt[n][1][innerloop4.time] = loop4.Slot;
                                                        } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                            tt[n][2][innerloop4.time] = loop4.Slot;
                                                        } else if (Objects.equals(innerloop4.day, "Thursday")) {
                                                            tt[n][3][innerloop4.time] = loop4.Slot;
                                                        } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                            tt[n][4][innerloop4.time] = loop4.Slot;
                                                        }
                                                        innerloop4 = innerloop4.next;
                                                    }
                                                }
                                                int c4 = 0;
                                                I2node innerloop5 = loop5.i2;
                                                while (innerloop5 != null) {
                                                    if (Objects.equals(innerloop5.day, "Monday")) {
                                                        if (tt[n][0][innerloop5.time] != null) {
                                                            c4 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                        if (tt[n][1][innerloop5.time] != null) {
                                                            c4 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                        if (tt[n][2][innerloop5.time] != null) {
                                                            c4 = 1;
                                                        }
                                                    }
                                                    if (Objects.equals(innerloop5.day, "Thursday")) {
                                                        if (tt[n][3][innerloop5.time] != null) {
                                                            c4 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                        if (tt[n][4][innerloop5.time] != null) {
                                                            c4 = 1;
                                                        }
                                                    }
                                                    innerloop5 = innerloop5.next;
                                                }
                                                if (c4 != 1) {
                                                    innerloop5 = loop5.i2;
                                                    while (innerloop5 != null) {
                                                        if (Objects.equals(innerloop5.day, "Monday")) {
                                                            tt[n][0][innerloop5.time] = loop5.Slot;
                                                        } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                            tt[n][1][innerloop5.time] = loop5.Slot;
                                                        } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                            tt[n][2][innerloop5.time] = loop5.Slot;
                                                        } else if (Objects.equals(innerloop5.day, "Thursday")) {
                                                            tt[n][3][innerloop5.time] = loop5.Slot;
                                                        } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                            tt[n][4][innerloop5.time] = loop5.Slot;
                                                        }
                                                        innerloop5 = innerloop5.next;
                                                    }
                                                }
                                                int c5 = 0;
                                                I2node innerloop6 = loop6.i2;
                                                while (innerloop6 != null) {
                                                    if (Objects.equals(innerloop6.day, "Monday")) {
                                                        if (tt[n][0][innerloop6.time] != null) {
                                                            c5 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                        if (tt[n][1][innerloop6.time] != null) {
                                                            c5 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                        if (tt[n][2][innerloop6.time] != null) {
                                                            c5 = 1;
                                                        }
                                                    }
                                                    if (Objects.equals(innerloop6.day, "Thursday")) {
                                                        if (tt[n][3][innerloop6.time] != null) {
                                                            c5 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                        if (tt[n][4][innerloop6.time] != null) {
                                                            c5 = 1;
                                                        }
                                                    }
                                                    innerloop6 = innerloop6.next;
                                                }
                                                if (c5 != 1) {
                                                    innerloop6 = loop6.i2;
                                                    while (innerloop6 != null) {
                                                        if (Objects.equals(innerloop6.day, "Monday")) {
                                                            tt[n][0][innerloop6.time] = loop6.Slot;
                                                        } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                            tt[n][1][innerloop6.time] = loop6.Slot;
                                                        } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                            tt[n][2][innerloop6.time] = loop6.Slot;
                                                        } else if (Objects.equals(innerloop6.day, "Thursday")) {
                                                            tt[n][3][innerloop6.time] = loop6.Slot;
                                                        } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                            tt[n][4][innerloop6.time] = loop6.Slot;
                                                        }
                                                        innerloop6 = innerloop6.next;
                                                    }
                                                }
                                                int c6 = 0;
                                                I2node innerloop7 = loop7.i2;
                                                while (innerloop7 != null) {
                                                    if (Objects.equals(innerloop7.day, "Monday")) {
                                                        if (tt[n][0][innerloop7.time] != null) {
                                                            c6 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                        if (tt[n][1][innerloop7.time] != null) {
                                                            c6 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                        if (tt[n][2][innerloop7.time] != null) {
                                                            c6 = 1;
                                                        }
                                                    }
                                                    if (Objects.equals(innerloop7.day, "Thursday")) {
                                                        if (tt[n][3][innerloop7.time] != null) {
                                                            c6 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                        if (tt[n][4][innerloop7.time] != null) {
                                                            c6 = 1;
                                                        }
                                                    }
                                                    innerloop7 = innerloop7.next;
                                                }
                                                if (c6 != 1) {
                                                    innerloop7 = loop7.i2;
                                                    while (innerloop7 != null) {
                                                        if (Objects.equals(innerloop7.day, "Monday")) {
                                                            tt[n][0][innerloop7.time] = loop7.Slot;
                                                        } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                            tt[n][1][innerloop7.time] = loop7.Slot;
                                                        } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                            tt[n][2][innerloop7.time] = loop7.Slot;
                                                        } else if (Objects.equals(innerloop7.day, "Thursday")) {
                                                            tt[n][3][innerloop7.time] = loop7.Slot;
                                                        } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                            tt[n][4][innerloop7.time] = loop7.Slot;
                                                        }
                                                        innerloop7 = innerloop7.next;
                                                    }
                                                }
                                                int c7 = 0;
                                                I2node innerloop8 = loop8.i2;
                                                while (innerloop8 != null) {
                                                    if (Objects.equals(innerloop8.day, "Monday")) {
                                                        if (tt[n][0][innerloop8.time] != null) {
                                                            c7 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop8.day, "Tuesday")) {
                                                        if (tt[n][1][innerloop8.time] != null) {
                                                            c7 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop8.day, "Wednesday")) {
                                                        if (tt[n][2][innerloop8.time] != null) {
                                                            c7 = 1;
                                                        }
                                                    }
                                                    if (Objects.equals(innerloop8.day, "Thursday")) {
                                                        if (tt[n][3][innerloop8.time] != null) {
                                                            c7 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop8.day, "Friday")) {
                                                        if (tt[n][4][innerloop8.time] != null) {
                                                            c7 = 1;
                                                        }
                                                    }
                                                    innerloop8 = innerloop8.next;
                                                }
                                                if (c7 != 1) {
                                                    innerloop8 = loop8.i2;
                                                    while (innerloop8 != null) {
                                                        if (Objects.equals(innerloop8.day, "Monday")) {
                                                            tt[n][0][innerloop8.time] = loop8.Slot;
                                                        } else if (Objects.equals(innerloop8.day, "Tuesday")) {
                                                            tt[n][1][innerloop8.time] = loop8.Slot;
                                                        } else if (Objects.equals(innerloop8.day, "Wednesday")) {
                                                            tt[n][2][innerloop8.time] = loop8.Slot;
                                                        } else if (Objects.equals(innerloop8.day, "Thursday")) {
                                                            tt[n][3][innerloop8.time] = loop8.Slot;
                                                        } else if (Objects.equals(innerloop8.day, "Friday")) {
                                                            tt[n][4][innerloop8.time] = loop8.Slot;
                                                        }
                                                        innerloop8 = innerloop8.next;
                                                    }
                                                }
                                                int c8 = 0;
                                                I2node innerloop9 = loop9.i2;
                                                while (innerloop9 != null) {
                                                    if (Objects.equals(innerloop9.day, "Monday")) {
                                                        if (tt[n][0][innerloop9.time] != null) {
                                                            c8 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop9.day, "Tuesday")) {
                                                        if (tt[n][1][innerloop9.time] != null) {
                                                            c8 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop9.day, "Wednesday")) {
                                                        if (tt[n][2][innerloop9.time] != null) {
                                                            c8 = 1;
                                                        }
                                                    }
                                                    if (Objects.equals(innerloop9.day, "Thursday")) {
                                                        if (tt[n][3][innerloop9.time] != null) {
                                                            c8 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop9.day, "Friday")) {
                                                        if (tt[n][4][innerloop9.time] != null) {
                                                            c8 = 1;
                                                        }
                                                    }
                                                    innerloop9 = innerloop9.next;
                                                }
                                                if (c8 != 1) {
                                                    innerloop9 = loop9.i2;
                                                    while (innerloop9 != null) {
                                                        if (Objects.equals(innerloop9.day, "Monday")) {
                                                            tt[n][0][innerloop9.time] = loop9.Slot;
                                                        } else if (Objects.equals(innerloop9.day, "Tuesday")) {
                                                            tt[n][1][innerloop9.time] = loop9.Slot;
                                                        } else if (Objects.equals(innerloop9.day, "Wednesday")) {
                                                            tt[n][2][innerloop9.time] = loop9.Slot;
                                                        } else if (Objects.equals(innerloop9.day, "Thursday")) {
                                                            tt[n][3][innerloop9.time] = loop9.Slot;
                                                        } else if (Objects.equals(innerloop9.day, "Friday")) {
                                                            tt[n][4][innerloop9.time] = loop9.Slot;
                                                        }
                                                        innerloop9 = innerloop9.next;
                                                    }
                                                }
                                                int c9 = 0;
                                                I2node innerloop10 = loop10.i2;
                                                while (innerloop10 != null) {
                                                    if (Objects.equals(innerloop10.day, "Monday")) {
                                                        if (tt[n][0][innerloop10.time] != null) {
                                                            c9 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop10.day, "Tuesday")) {
                                                        if (tt[n][1][innerloop10.time] != null) {
                                                            c9 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop10.day, "Wednesday")) {
                                                        if (tt[n][2][innerloop10.time] != null) {
                                                            c9 = 1;
                                                        }
                                                    }
                                                    if (Objects.equals(innerloop10.day, "Thursday")) {
                                                        if (tt[n][3][innerloop10.time] != null) {
                                                            c9 = 1;
                                                        }
                                                    } else if (Objects.equals(innerloop10.day, "Friday")) {
                                                        if (tt[n][4][innerloop10.time] != null) {
                                                            c9 = 1;
                                                        }
                                                    }
                                                    innerloop10 = innerloop10.next;
                                                }
                                                if (c9 != 1) {
                                                    innerloop10 = loop10.i2;
                                                    while (innerloop10 != null) {
                                                        if (Objects.equals(innerloop10.day, "Monday")) {
                                                            tt[n][0][innerloop10.time] = loop10.Slot;
                                                        } else if (Objects.equals(innerloop10.day, "Tuesday")) {
                                                            tt[n][1][innerloop10.time] = loop10.Slot;
                                                        } else if (Objects.equals(innerloop10.day, "Wednesday")) {
                                                            tt[n][2][innerloop10.time] = loop10.Slot;
                                                        } else if (Objects.equals(innerloop10.day, "Thursday")) {
                                                            tt[n][3][innerloop10.time] = loop10.Slot;
                                                        } else if (Objects.equals(innerloop10.day, "Friday")) {
                                                            tt[n][4][innerloop10.time] = loop10.Slot;
                                                        }
                                                        innerloop10 = innerloop10.next;
                                                    }
                                                }
                                                n++;
                                                loop10 = loop10.next;
                                            }
                                            loop9 = loop9.next;
                                        }
                                        loop8 = loop8.next;
                                    }
                                    loop7 = loop7.next;
                                }
                                loop6 = loop6.next;
                            }
                            loop5 = loop5.next;
                        }
                        loop4 = loop4.next;
                    }
                    loop3 = loop3.next;
                }
                loop2=loop2.next;
            }
            loop1=loop1.next;
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<4;k++){
                    if(tt[i][j][k]!=null){
                        sum[i]=sum[i]+1;
                    }
                }
            }
        }
        int max = Arrays.stream(sum).max().getAsInt();
        int no = 0;
        for(int i=0;i<n;i++){
            if(max==sum[i]){
                no=i;
                break;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(tt[no][i][j]!=null){
                    if(i==0&&j==0){
                        TextView t=(TextView) findViewById(R.id.M1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==1){
                        TextView t=(TextView) findViewById(R.id.M2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==2){
                        TextView t=(TextView) findViewById(R.id.M3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==3){
                        TextView t=(TextView) findViewById(R.id.M4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==0){
                        TextView t=(TextView) findViewById(R.id.T1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==1){
                        TextView t=(TextView) findViewById(R.id.T2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==2){
                        TextView t=(TextView) findViewById(R.id.T3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==3){
                        TextView t=(TextView) findViewById(R.id.T4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==0){
                        TextView t=(TextView) findViewById(R.id.W1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==1){
                        TextView t=(TextView) findViewById(R.id.W2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==2){
                        TextView t=(TextView) findViewById(R.id.W3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==3){
                        TextView t=(TextView) findViewById(R.id.W4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==0){
                        TextView t=(TextView) findViewById(R.id.Th1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==1){
                        TextView t=(TextView) findViewById(R.id.Th2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==2){
                        TextView t=(TextView) findViewById(R.id.Th3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==3){
                        TextView t=(TextView) findViewById(R.id.Th4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==0){
                        TextView t=(TextView) findViewById(R.id.F1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==1){
                        TextView t=(TextView) findViewById(R.id.F2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==2){
                        TextView t=(TextView) findViewById(R.id.F3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==3){
                        TextView t=(TextView) findViewById(R.id.F4);
                        t.setText(tt[no][i][j]);
                    }
                }
            }
        }
    }
    void num11(LinkedList list){
        String[][][] tt=new String[100000][5][4];
        int n=0;
        I1node loop1=list.head.next.next.next.next.next.next.next.next.next.next.i1;
        while(loop1!=null){
            I1node loop2=list.head.next.next.next.next.next.next.next.next.next.i1;
            while(loop2!=null){
                I1node loop3=list.head.next.next.next.next.next.next.next.next.i1;
                while(loop3!=null) {
                    I1node loop4=list.head.next.next.next.next.next.next.next.i1;
                    while(loop4!=null) {
                        I1node loop5=list.head.next.next.next.next.next.next.i1;
                        while(loop5!=null) {
                            I1node loop6=list.head.next.next.next.next.next.i1;
                            while(loop6!=null) {
                                I1node loop7=list.head.next.next.next.next.i1;
                                while (loop7!=null) {
                                    I1node loop8=list.head.next.next.next.i1;
                                    while(loop8!=null) {
                                        I1node loop9=list.head.next.next.i1;
                                        while(loop9!=null) {
                                            I1node loop10=list.head.next.i1;
                                            while(loop10!=null) {
                                                I1node loop11=list.head.i1;
                                                while(loop11!=null) {
                                                    I2node innerloop1 = loop1.i2;
                                                    while (innerloop1 != null) {
                                                        if (Objects.equals(innerloop1.day, "Monday")) {
                                                            tt[n][0][innerloop1.time] = loop1.Slot;
                                                        } else if (Objects.equals(innerloop1.day, "Tuesday")) {
                                                            tt[n][1][innerloop1.time] = loop1.Slot;
                                                        } else if (Objects.equals(innerloop1.day, "Wednesday")) {
                                                            tt[n][2][innerloop1.time] = loop1.Slot;
                                                        } else if (Objects.equals(innerloop1.day, "Thursday")) {
                                                            tt[n][3][innerloop1.time] = loop1.Slot;
                                                        } else if (Objects.equals(innerloop1.day, "Friday")) {
                                                            tt[n][4][innerloop1.time] = loop1.Slot;
                                                        }
                                                        innerloop1 = innerloop1.next;
                                                    }

                                                    int c1 = 0;
                                                    I2node innerloop2 = loop2.i2;
                                                    while (innerloop2 != null) {
                                                        if (Objects.equals(innerloop2.day, "Monday")) {
                                                            if (tt[n][0][innerloop2.time] != null) {
                                                                c1 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                            if (tt[n][1][innerloop2.time] != null) {
                                                                c1 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                            if (tt[n][2][innerloop2.time] != null) {
                                                                c1 = 1;
                                                            }
                                                        }
                                                        if (Objects.equals(innerloop2.day, "Thursday")) {
                                                            if (tt[n][3][innerloop2.time] != null) {
                                                                c1 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                            if (tt[n][4][innerloop2.time] != null) {
                                                                c1 = 1;
                                                            }
                                                        }
                                                        innerloop2 = innerloop2.next;
                                                    }
                                                    if (c1 != 1) {
                                                        innerloop2 = loop2.i2;
                                                        while (innerloop2 != null) {
                                                            if (Objects.equals(innerloop2.day, "Monday")) {
                                                                tt[n][0][innerloop2.time] = loop2.Slot;
                                                            } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                                tt[n][1][innerloop2.time] = loop2.Slot;
                                                            } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                                tt[n][2][innerloop2.time] = loop2.Slot;
                                                            } else if (Objects.equals(innerloop2.day, "Thursday")) {
                                                                tt[n][3][innerloop2.time] = loop2.Slot;
                                                            } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                                tt[n][4][innerloop2.time] = loop2.Slot;
                                                            }
                                                            innerloop2 = innerloop2.next;
                                                        }
                                                    }
                                                    int c2 = 0;
                                                    I2node innerloop3 = loop3.i2;
                                                    while (innerloop3 != null) {
                                                        if (Objects.equals(innerloop3.day, "Monday")) {
                                                            if (tt[n][0][innerloop3.time] != null) {
                                                                c2 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                            if (tt[n][1][innerloop3.time] != null) {
                                                                c2 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                            if (tt[n][2][innerloop3.time] != null) {
                                                                c2 = 1;
                                                            }
                                                        }
                                                        if (Objects.equals(innerloop3.day, "Thursday")) {
                                                            if (tt[n][3][innerloop3.time] != null) {
                                                                c2 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                            if (tt[n][4][innerloop3.time] != null) {
                                                                c2 = 1;
                                                            }
                                                        }
                                                        innerloop3 = innerloop3.next;
                                                    }
                                                    if (c2 != 1) {
                                                        innerloop3 = loop3.i2;
                                                        while (innerloop3 != null) {
                                                            if (Objects.equals(innerloop3.day, "Monday")) {
                                                                tt[n][0][innerloop3.time] = loop3.Slot;
                                                            } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                                tt[n][1][innerloop3.time] = loop3.Slot;
                                                            } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                                tt[n][2][innerloop3.time] = loop3.Slot;
                                                            } else if (Objects.equals(innerloop3.day, "Thursday")) {
                                                                tt[n][3][innerloop3.time] = loop3.Slot;
                                                            } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                                tt[n][4][innerloop3.time] = loop3.Slot;
                                                            }
                                                            innerloop3 = innerloop3.next;
                                                        }
                                                    }
                                                    int c3 = 0;
                                                    I2node innerloop4 = loop4.i2;
                                                    while (innerloop4 != null) {
                                                        if (Objects.equals(innerloop4.day, "Monday")) {
                                                            if (tt[n][0][innerloop4.time] != null) {
                                                                c3 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                            if (tt[n][1][innerloop4.time] != null) {
                                                                c3 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                            if (tt[n][2][innerloop4.time] != null) {
                                                                c3 = 1;
                                                            }
                                                        }
                                                        if (Objects.equals(innerloop4.day, "Thursday")) {
                                                            if (tt[n][3][innerloop4.time] != null) {
                                                                c3 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                            if (tt[n][4][innerloop4.time] != null) {
                                                                c3 = 1;
                                                            }
                                                        }
                                                        innerloop4 = innerloop4.next;
                                                    }
                                                    if (c3 != 1) {
                                                        innerloop4 = loop4.i2;
                                                        while (innerloop4 != null) {
                                                            if (Objects.equals(innerloop4.day, "Monday")) {
                                                                tt[n][0][innerloop4.time] = loop4.Slot;
                                                            } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                                tt[n][1][innerloop4.time] = loop4.Slot;
                                                            } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                                tt[n][2][innerloop4.time] = loop4.Slot;
                                                            } else if (Objects.equals(innerloop4.day, "Thursday")) {
                                                                tt[n][3][innerloop4.time] = loop4.Slot;
                                                            } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                                tt[n][4][innerloop4.time] = loop4.Slot;
                                                            }
                                                            innerloop4 = innerloop4.next;
                                                        }
                                                    }
                                                    int c4 = 0;
                                                    I2node innerloop5 = loop5.i2;
                                                    while (innerloop5 != null) {
                                                        if (Objects.equals(innerloop5.day, "Monday")) {
                                                            if (tt[n][0][innerloop5.time] != null) {
                                                                c4 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                            if (tt[n][1][innerloop5.time] != null) {
                                                                c4 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                            if (tt[n][2][innerloop5.time] != null) {
                                                                c4 = 1;
                                                            }
                                                        }
                                                        if (Objects.equals(innerloop5.day, "Thursday")) {
                                                            if (tt[n][3][innerloop5.time] != null) {
                                                                c4 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                            if (tt[n][4][innerloop5.time] != null) {
                                                                c4 = 1;
                                                            }
                                                        }
                                                        innerloop5 = innerloop5.next;
                                                    }
                                                    if (c4 != 1) {
                                                        innerloop5 = loop5.i2;
                                                        while (innerloop5 != null) {
                                                            if (Objects.equals(innerloop5.day, "Monday")) {
                                                                tt[n][0][innerloop5.time] = loop5.Slot;
                                                            } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                                tt[n][1][innerloop5.time] = loop5.Slot;
                                                            } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                                tt[n][2][innerloop5.time] = loop5.Slot;
                                                            } else if (Objects.equals(innerloop5.day, "Thursday")) {
                                                                tt[n][3][innerloop5.time] = loop5.Slot;
                                                            } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                                tt[n][4][innerloop5.time] = loop5.Slot;
                                                            }
                                                            innerloop5 = innerloop5.next;
                                                        }
                                                    }
                                                    int c5 = 0;
                                                    I2node innerloop6 = loop6.i2;
                                                    while (innerloop6 != null) {
                                                        if (Objects.equals(innerloop6.day, "Monday")) {
                                                            if (tt[n][0][innerloop6.time] != null) {
                                                                c5 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                            if (tt[n][1][innerloop6.time] != null) {
                                                                c5 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                            if (tt[n][2][innerloop6.time] != null) {
                                                                c5 = 1;
                                                            }
                                                        }
                                                        if (Objects.equals(innerloop6.day, "Thursday")) {
                                                            if (tt[n][3][innerloop6.time] != null) {
                                                                c5 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                            if (tt[n][4][innerloop6.time] != null) {
                                                                c5 = 1;
                                                            }
                                                        }
                                                        innerloop6 = innerloop6.next;
                                                    }
                                                    if (c5 != 1) {
                                                        innerloop6 = loop6.i2;
                                                        while (innerloop6 != null) {
                                                            if (Objects.equals(innerloop6.day, "Monday")) {
                                                                tt[n][0][innerloop6.time] = loop6.Slot;
                                                            } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                                tt[n][1][innerloop6.time] = loop6.Slot;
                                                            } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                                tt[n][2][innerloop6.time] = loop6.Slot;
                                                            } else if (Objects.equals(innerloop6.day, "Thursday")) {
                                                                tt[n][3][innerloop6.time] = loop6.Slot;
                                                            } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                                tt[n][4][innerloop6.time] = loop6.Slot;
                                                            }
                                                            innerloop6 = innerloop6.next;
                                                        }
                                                    }
                                                    int c6 = 0;
                                                    I2node innerloop7 = loop7.i2;
                                                    while (innerloop7 != null) {
                                                        if (Objects.equals(innerloop7.day, "Monday")) {
                                                            if (tt[n][0][innerloop7.time] != null) {
                                                                c6 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                            if (tt[n][1][innerloop7.time] != null) {
                                                                c6 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                            if (tt[n][2][innerloop7.time] != null) {
                                                                c6 = 1;
                                                            }
                                                        }
                                                        if (Objects.equals(innerloop7.day, "Thursday")) {
                                                            if (tt[n][3][innerloop7.time] != null) {
                                                                c6 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                            if (tt[n][4][innerloop7.time] != null) {
                                                                c6 = 1;
                                                            }
                                                        }
                                                        innerloop7 = innerloop7.next;
                                                    }
                                                    if (c6 != 1) {
                                                        innerloop7 = loop7.i2;
                                                        while (innerloop7 != null) {
                                                            if (Objects.equals(innerloop7.day, "Monday")) {
                                                                tt[n][0][innerloop7.time] = loop7.Slot;
                                                            } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                                tt[n][1][innerloop7.time] = loop7.Slot;
                                                            } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                                tt[n][2][innerloop7.time] = loop7.Slot;
                                                            } else if (Objects.equals(innerloop7.day, "Thursday")) {
                                                                tt[n][3][innerloop7.time] = loop7.Slot;
                                                            } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                                tt[n][4][innerloop7.time] = loop7.Slot;
                                                            }
                                                            innerloop7 = innerloop7.next;
                                                        }
                                                    }
                                                    int c7 = 0;
                                                    I2node innerloop8 = loop8.i2;
                                                    while (innerloop8 != null) {
                                                        if (Objects.equals(innerloop8.day, "Monday")) {
                                                            if (tt[n][0][innerloop8.time] != null) {
                                                                c7 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop8.day, "Tuesday")) {
                                                            if (tt[n][1][innerloop8.time] != null) {
                                                                c7 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop8.day, "Wednesday")) {
                                                            if (tt[n][2][innerloop8.time] != null) {
                                                                c7 = 1;
                                                            }
                                                        }
                                                        if (Objects.equals(innerloop8.day, "Thursday")) {
                                                            if (tt[n][3][innerloop8.time] != null) {
                                                                c7 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop8.day, "Friday")) {
                                                            if (tt[n][4][innerloop8.time] != null) {
                                                                c7 = 1;
                                                            }
                                                        }
                                                        innerloop8 = innerloop8.next;
                                                    }
                                                    if (c7 != 1) {
                                                        innerloop8 = loop8.i2;
                                                        while (innerloop8 != null) {
                                                            if (Objects.equals(innerloop8.day, "Monday")) {
                                                                tt[n][0][innerloop8.time] = loop8.Slot;
                                                            } else if (Objects.equals(innerloop8.day, "Tuesday")) {
                                                                tt[n][1][innerloop8.time] = loop8.Slot;
                                                            } else if (Objects.equals(innerloop8.day, "Wednesday")) {
                                                                tt[n][2][innerloop8.time] = loop8.Slot;
                                                            } else if (Objects.equals(innerloop8.day, "Thursday")) {
                                                                tt[n][3][innerloop8.time] = loop8.Slot;
                                                            } else if (Objects.equals(innerloop8.day, "Friday")) {
                                                                tt[n][4][innerloop8.time] = loop8.Slot;
                                                            }
                                                            innerloop8 = innerloop8.next;
                                                        }
                                                    }
                                                    int c8 = 0;
                                                    I2node innerloop9 = loop9.i2;
                                                    while (innerloop9 != null) {
                                                        if (Objects.equals(innerloop9.day, "Monday")) {
                                                            if (tt[n][0][innerloop9.time] != null) {
                                                                c8 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop9.day, "Tuesday")) {
                                                            if (tt[n][1][innerloop9.time] != null) {
                                                                c8 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop9.day, "Wednesday")) {
                                                            if (tt[n][2][innerloop9.time] != null) {
                                                                c8 = 1;
                                                            }
                                                        }
                                                        if (Objects.equals(innerloop9.day, "Thursday")) {
                                                            if (tt[n][3][innerloop9.time] != null) {
                                                                c8 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop9.day, "Friday")) {
                                                            if (tt[n][4][innerloop9.time] != null) {
                                                                c8 = 1;
                                                            }
                                                        }
                                                        innerloop9 = innerloop9.next;
                                                    }
                                                    if (c8 != 1) {
                                                        innerloop9 = loop9.i2;
                                                        while (innerloop9 != null) {
                                                            if (Objects.equals(innerloop9.day, "Monday")) {
                                                                tt[n][0][innerloop9.time] = loop9.Slot;
                                                            } else if (Objects.equals(innerloop9.day, "Tuesday")) {
                                                                tt[n][1][innerloop9.time] = loop9.Slot;
                                                            } else if (Objects.equals(innerloop9.day, "Wednesday")) {
                                                                tt[n][2][innerloop9.time] = loop9.Slot;
                                                            } else if (Objects.equals(innerloop9.day, "Thursday")) {
                                                                tt[n][3][innerloop9.time] = loop9.Slot;
                                                            } else if (Objects.equals(innerloop9.day, "Friday")) {
                                                                tt[n][4][innerloop9.time] = loop9.Slot;
                                                            }
                                                            innerloop9 = innerloop9.next;
                                                        }
                                                    }
                                                    int c9 = 0;
                                                    I2node innerloop10 = loop10.i2;
                                                    while (innerloop10 != null) {
                                                        if (Objects.equals(innerloop10.day, "Monday")) {
                                                            if (tt[n][0][innerloop10.time] != null) {
                                                                c9 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop10.day, "Tuesday")) {
                                                            if (tt[n][1][innerloop10.time] != null) {
                                                                c9 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop10.day, "Wednesday")) {
                                                            if (tt[n][2][innerloop10.time] != null) {
                                                                c9 = 1;
                                                            }
                                                        }
                                                        if (Objects.equals(innerloop10.day, "Thursday")) {
                                                            if (tt[n][3][innerloop10.time] != null) {
                                                                c9 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop10.day, "Friday")) {
                                                            if (tt[n][4][innerloop10.time] != null) {
                                                                c9 = 1;
                                                            }
                                                        }
                                                        innerloop10 = innerloop10.next;
                                                    }
                                                    if (c9 != 1) {
                                                        innerloop10 = loop10.i2;
                                                        while (innerloop10 != null) {
                                                            if (Objects.equals(innerloop10.day, "Monday")) {
                                                                tt[n][0][innerloop10.time] = loop10.Slot;
                                                            } else if (Objects.equals(innerloop10.day, "Tuesday")) {
                                                                tt[n][1][innerloop10.time] = loop10.Slot;
                                                            } else if (Objects.equals(innerloop10.day, "Wednesday")) {
                                                                tt[n][2][innerloop10.time] = loop10.Slot;
                                                            } else if (Objects.equals(innerloop10.day, "Thursday")) {
                                                                tt[n][3][innerloop10.time] = loop10.Slot;
                                                            } else if (Objects.equals(innerloop10.day, "Friday")) {
                                                                tt[n][4][innerloop10.time] = loop10.Slot;
                                                            }
                                                            innerloop10 = innerloop10.next;
                                                        }
                                                    }
                                                    int c10 = 0;
                                                    I2node innerloop11 = loop11.i2;
                                                    while (innerloop11 != null) {
                                                        if (Objects.equals(innerloop11.day, "Monday")) {
                                                            if (tt[n][0][innerloop11.time] != null) {
                                                                c10 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop11.day, "Tuesday")) {
                                                            if (tt[n][1][innerloop11.time] != null) {
                                                                c10 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop11.day, "Wednesday")) {
                                                            if (tt[n][2][innerloop11.time] != null) {
                                                                c10 = 1;
                                                            }
                                                        }
                                                        if (Objects.equals(innerloop11.day, "Thursday")) {
                                                            if (tt[n][3][innerloop11.time] != null) {
                                                                c10 = 1;
                                                            }
                                                        } else if (Objects.equals(innerloop11.day, "Friday")) {
                                                            if (tt[n][4][innerloop11.time] != null) {
                                                                c10 = 1;
                                                            }
                                                        }
                                                        innerloop11 = innerloop11.next;
                                                    }
                                                    if (c10 != 1) {
                                                        innerloop11 = loop11.i2;
                                                        while (innerloop11 != null) {
                                                            if (Objects.equals(innerloop11.day, "Monday")) {
                                                                tt[n][0][innerloop11.time] = loop11.Slot;
                                                            } else if (Objects.equals(innerloop11.day, "Tuesday")) {
                                                                tt[n][1][innerloop11.time] = loop11.Slot;
                                                            } else if (Objects.equals(innerloop11.day, "Wednesday")) {
                                                                tt[n][2][innerloop11.time] = loop11.Slot;
                                                            } else if (Objects.equals(innerloop11.day, "Thursday")) {
                                                                tt[n][3][innerloop11.time] = loop11.Slot;
                                                            } else if (Objects.equals(innerloop11.day, "Friday")) {
                                                                tt[n][4][innerloop11.time] = loop11.Slot;
                                                            }
                                                            innerloop11 = innerloop11.next;
                                                        }
                                                    }
                                                    n++;
                                                    loop11 = loop11.next;
                                                }
                                                loop10 = loop10.next;
                                            }
                                            loop9 = loop9.next;
                                        }
                                        loop8 = loop8.next;
                                    }
                                    loop7 = loop7.next;
                                }
                                loop6 = loop6.next;
                            }
                            loop5 = loop5.next;
                        }
                        loop4 = loop4.next;
                    }
                    loop3 = loop3.next;
                }
                loop2=loop2.next;
            }
            loop1=loop1.next;
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<4;k++){
                    if(tt[i][j][k]!=null){
                        sum[i]=sum[i]+1;
                    }
                }
            }
        }
        int max = Arrays.stream(sum).max().getAsInt();
        int no = 0;
        for(int i=0;i<n;i++){
            if(max==sum[i]){
                no=i;
                break;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(tt[no][i][j]!=null){
                    if(i==0&&j==0){
                        TextView t=(TextView) findViewById(R.id.M1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==1){
                        TextView t=(TextView) findViewById(R.id.M2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==2){
                        TextView t=(TextView) findViewById(R.id.M3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==3){
                        TextView t=(TextView) findViewById(R.id.M4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==0){
                        TextView t=(TextView) findViewById(R.id.T1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==1){
                        TextView t=(TextView) findViewById(R.id.T2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==2){
                        TextView t=(TextView) findViewById(R.id.T3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==3){
                        TextView t=(TextView) findViewById(R.id.T4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==0){
                        TextView t=(TextView) findViewById(R.id.W1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==1){
                        TextView t=(TextView) findViewById(R.id.W2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==2){
                        TextView t=(TextView) findViewById(R.id.W3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==3){
                        TextView t=(TextView) findViewById(R.id.W4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==0){
                        TextView t=(TextView) findViewById(R.id.Th1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==1){
                        TextView t=(TextView) findViewById(R.id.Th2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==2){
                        TextView t=(TextView) findViewById(R.id.Th3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==3){
                        TextView t=(TextView) findViewById(R.id.Th4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==0){
                        TextView t=(TextView) findViewById(R.id.F1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==1){
                        TextView t=(TextView) findViewById(R.id.F2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==2){
                        TextView t=(TextView) findViewById(R.id.F3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==3){
                        TextView t=(TextView) findViewById(R.id.F4);
                        t.setText(tt[no][i][j]);
                    }
                }
            }
        }
    }
    void num12(LinkedList list){
        String[][][] tt=new String[100000][5][4];
        int n=0;
        I1node loop1=list.head.next.next.next.next.next.next.next.next.next.next.next.i1;
        while(loop1!=null){
            I1node loop2=list.head.next.next.next.next.next.next.next.next.next.next.i1;
            while(loop2!=null){
                I1node loop3=list.head.next.next.next.next.next.next.next.next.next.i1;
                while(loop3!=null) {
                    I1node loop4=list.head.next.next.next.next.next.next.next.next.i1;
                    while(loop4!=null) {
                        I1node loop5=list.head.next.next.next.next.next.next.next.i1;
                        while(loop5!=null) {
                            I1node loop6=list.head.next.next.next.next.next.next.i1;
                            while(loop6!=null) {
                                I1node loop7=list.head.next.next.next.next.next.i1;
                                while (loop7!=null) {
                                    I1node loop8=list.head.next.next.next.next.i1;
                                    while(loop8!=null) {
                                        I1node loop9=list.head.next.next.next.i1;
                                        while(loop9!=null) {
                                            I1node loop10=list.head.next.next.i1;
                                            while(loop10!=null) {
                                                I1node loop11=list.head.next.i1;
                                                while(loop11!=null) {
                                                    I1node loop12=list.head.i1;
                                                    while(loop12!=null) {
                                                        I2node innerloop1 = loop1.i2;
                                                        while (innerloop1 != null) {
                                                            if (Objects.equals(innerloop1.day, "Monday")) {
                                                                tt[n][0][innerloop1.time] = loop1.Slot;
                                                            } else if (Objects.equals(innerloop1.day, "Tuesday")) {
                                                                tt[n][1][innerloop1.time] = loop1.Slot;
                                                            } else if (Objects.equals(innerloop1.day, "Wednesday")) {
                                                                tt[n][2][innerloop1.time] = loop1.Slot;
                                                            } else if (Objects.equals(innerloop1.day, "Thursday")) {
                                                                tt[n][3][innerloop1.time] = loop1.Slot;
                                                            } else if (Objects.equals(innerloop1.day, "Friday")) {
                                                                tt[n][4][innerloop1.time] = loop1.Slot;
                                                            }
                                                            innerloop1 = innerloop1.next;
                                                        }

                                                        int c1 = 0;
                                                        I2node innerloop2 = loop2.i2;
                                                        while (innerloop2 != null) {
                                                            if (Objects.equals(innerloop2.day, "Monday")) {
                                                                if (tt[n][0][innerloop2.time] != null) {
                                                                    c1 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop2.time] != null) {
                                                                    c1 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop2.time] != null) {
                                                                    c1 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop2.day, "Thursday")) {
                                                                if (tt[n][3][innerloop2.time] != null) {
                                                                    c1 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                                if (tt[n][4][innerloop2.time] != null) {
                                                                    c1 = 1;
                                                                }
                                                            }
                                                            innerloop2 = innerloop2.next;
                                                        }
                                                        if (c1 != 1) {
                                                            innerloop2 = loop2.i2;
                                                            while (innerloop2 != null) {
                                                                if (Objects.equals(innerloop2.day, "Monday")) {
                                                                    tt[n][0][innerloop2.time] = loop2.Slot;
                                                                } else if (Objects.equals(innerloop2.day, "Tuesday")) {
                                                                    tt[n][1][innerloop2.time] = loop2.Slot;
                                                                } else if (Objects.equals(innerloop2.day, "Wednesday")) {
                                                                    tt[n][2][innerloop2.time] = loop2.Slot;
                                                                } else if (Objects.equals(innerloop2.day, "Thursday")) {
                                                                    tt[n][3][innerloop2.time] = loop2.Slot;
                                                                } else if (Objects.equals(innerloop2.day, "Friday")) {
                                                                    tt[n][4][innerloop2.time] = loop2.Slot;
                                                                }
                                                                innerloop2 = innerloop2.next;
                                                            }
                                                        }
                                                        int c2 = 0;
                                                        I2node innerloop3 = loop3.i2;
                                                        while (innerloop3 != null) {
                                                            if (Objects.equals(innerloop3.day, "Monday")) {
                                                                if (tt[n][0][innerloop3.time] != null) {
                                                                    c2 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop3.time] != null) {
                                                                    c2 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop3.time] != null) {
                                                                    c2 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop3.day, "Thursday")) {
                                                                if (tt[n][3][innerloop3.time] != null) {
                                                                    c2 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                                if (tt[n][4][innerloop3.time] != null) {
                                                                    c2 = 1;
                                                                }
                                                            }
                                                            innerloop3 = innerloop3.next;
                                                        }
                                                        if (c2 != 1) {
                                                            innerloop3 = loop3.i2;
                                                            while (innerloop3 != null) {
                                                                if (Objects.equals(innerloop3.day, "Monday")) {
                                                                    tt[n][0][innerloop3.time] = loop3.Slot;
                                                                } else if (Objects.equals(innerloop3.day, "Tuesday")) {
                                                                    tt[n][1][innerloop3.time] = loop3.Slot;
                                                                } else if (Objects.equals(innerloop3.day, "Wednesday")) {
                                                                    tt[n][2][innerloop3.time] = loop3.Slot;
                                                                } else if (Objects.equals(innerloop3.day, "Thursday")) {
                                                                    tt[n][3][innerloop3.time] = loop3.Slot;
                                                                } else if (Objects.equals(innerloop3.day, "Friday")) {
                                                                    tt[n][4][innerloop3.time] = loop3.Slot;
                                                                }
                                                                innerloop3 = innerloop3.next;
                                                            }
                                                        }
                                                        int c3 = 0;
                                                        I2node innerloop4 = loop4.i2;
                                                        while (innerloop4 != null) {
                                                            if (Objects.equals(innerloop4.day, "Monday")) {
                                                                if (tt[n][0][innerloop4.time] != null) {
                                                                    c3 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop4.time] != null) {
                                                                    c3 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop4.time] != null) {
                                                                    c3 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop4.day, "Thursday")) {
                                                                if (tt[n][3][innerloop4.time] != null) {
                                                                    c3 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                                if (tt[n][4][innerloop4.time] != null) {
                                                                    c3 = 1;
                                                                }
                                                            }
                                                            innerloop4 = innerloop4.next;
                                                        }
                                                        if (c3 != 1) {
                                                            innerloop4 = loop4.i2;
                                                            while (innerloop4 != null) {
                                                                if (Objects.equals(innerloop4.day, "Monday")) {
                                                                    tt[n][0][innerloop4.time] = loop4.Slot;
                                                                } else if (Objects.equals(innerloop4.day, "Tuesday")) {
                                                                    tt[n][1][innerloop4.time] = loop4.Slot;
                                                                } else if (Objects.equals(innerloop4.day, "Wednesday")) {
                                                                    tt[n][2][innerloop4.time] = loop4.Slot;
                                                                } else if (Objects.equals(innerloop4.day, "Thursday")) {
                                                                    tt[n][3][innerloop4.time] = loop4.Slot;
                                                                } else if (Objects.equals(innerloop4.day, "Friday")) {
                                                                    tt[n][4][innerloop4.time] = loop4.Slot;
                                                                }
                                                                innerloop4 = innerloop4.next;
                                                            }
                                                        }
                                                        int c4 = 0;
                                                        I2node innerloop5 = loop5.i2;
                                                        while (innerloop5 != null) {
                                                            if (Objects.equals(innerloop5.day, "Monday")) {
                                                                if (tt[n][0][innerloop5.time] != null) {
                                                                    c4 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop5.time] != null) {
                                                                    c4 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop5.time] != null) {
                                                                    c4 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop5.day, "Thursday")) {
                                                                if (tt[n][3][innerloop5.time] != null) {
                                                                    c4 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                                if (tt[n][4][innerloop5.time] != null) {
                                                                    c4 = 1;
                                                                }
                                                            }
                                                            innerloop5 = innerloop5.next;
                                                        }
                                                        if (c4 != 1) {
                                                            innerloop5 = loop5.i2;
                                                            while (innerloop5 != null) {
                                                                if (Objects.equals(innerloop5.day, "Monday")) {
                                                                    tt[n][0][innerloop5.time] = loop5.Slot;
                                                                } else if (Objects.equals(innerloop5.day, "Tuesday")) {
                                                                    tt[n][1][innerloop5.time] = loop5.Slot;
                                                                } else if (Objects.equals(innerloop5.day, "Wednesday")) {
                                                                    tt[n][2][innerloop5.time] = loop5.Slot;
                                                                } else if (Objects.equals(innerloop5.day, "Thursday")) {
                                                                    tt[n][3][innerloop5.time] = loop5.Slot;
                                                                } else if (Objects.equals(innerloop5.day, "Friday")) {
                                                                    tt[n][4][innerloop5.time] = loop5.Slot;
                                                                }
                                                                innerloop5 = innerloop5.next;
                                                            }
                                                        }
                                                        int c5 = 0;
                                                        I2node innerloop6 = loop6.i2;
                                                        while (innerloop6 != null) {
                                                            if (Objects.equals(innerloop6.day, "Monday")) {
                                                                if (tt[n][0][innerloop6.time] != null) {
                                                                    c5 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop6.time] != null) {
                                                                    c5 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop6.time] != null) {
                                                                    c5 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop6.day, "Thursday")) {
                                                                if (tt[n][3][innerloop6.time] != null) {
                                                                    c5 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                                if (tt[n][4][innerloop6.time] != null) {
                                                                    c5 = 1;
                                                                }
                                                            }
                                                            innerloop6 = innerloop6.next;
                                                        }
                                                        if (c5 != 1) {
                                                            innerloop6 = loop6.i2;
                                                            while (innerloop6 != null) {
                                                                if (Objects.equals(innerloop6.day, "Monday")) {
                                                                    tt[n][0][innerloop6.time] = loop6.Slot;
                                                                } else if (Objects.equals(innerloop6.day, "Tuesday")) {
                                                                    tt[n][1][innerloop6.time] = loop6.Slot;
                                                                } else if (Objects.equals(innerloop6.day, "Wednesday")) {
                                                                    tt[n][2][innerloop6.time] = loop6.Slot;
                                                                } else if (Objects.equals(innerloop6.day, "Thursday")) {
                                                                    tt[n][3][innerloop6.time] = loop6.Slot;
                                                                } else if (Objects.equals(innerloop6.day, "Friday")) {
                                                                    tt[n][4][innerloop6.time] = loop6.Slot;
                                                                }
                                                                innerloop6 = innerloop6.next;
                                                            }
                                                        }
                                                        int c6 = 0;
                                                        I2node innerloop7 = loop7.i2;
                                                        while (innerloop7 != null) {
                                                            if (Objects.equals(innerloop7.day, "Monday")) {
                                                                if (tt[n][0][innerloop7.time] != null) {
                                                                    c6 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop7.time] != null) {
                                                                    c6 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop7.time] != null) {
                                                                    c6 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop7.day, "Thursday")) {
                                                                if (tt[n][3][innerloop7.time] != null) {
                                                                    c6 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                                if (tt[n][4][innerloop7.time] != null) {
                                                                    c6 = 1;
                                                                }
                                                            }
                                                            innerloop7 = innerloop7.next;
                                                        }
                                                        if (c6 != 1) {
                                                            innerloop7 = loop7.i2;
                                                            while (innerloop7 != null) {
                                                                if (Objects.equals(innerloop7.day, "Monday")) {
                                                                    tt[n][0][innerloop7.time] = loop7.Slot;
                                                                } else if (Objects.equals(innerloop7.day, "Tuesday")) {
                                                                    tt[n][1][innerloop7.time] = loop7.Slot;
                                                                } else if (Objects.equals(innerloop7.day, "Wednesday")) {
                                                                    tt[n][2][innerloop7.time] = loop7.Slot;
                                                                } else if (Objects.equals(innerloop7.day, "Thursday")) {
                                                                    tt[n][3][innerloop7.time] = loop7.Slot;
                                                                } else if (Objects.equals(innerloop7.day, "Friday")) {
                                                                    tt[n][4][innerloop7.time] = loop7.Slot;
                                                                }
                                                                innerloop7 = innerloop7.next;
                                                            }
                                                        }
                                                        int c7 = 0;
                                                        I2node innerloop8 = loop8.i2;
                                                        while (innerloop8 != null) {
                                                            if (Objects.equals(innerloop8.day, "Monday")) {
                                                                if (tt[n][0][innerloop8.time] != null) {
                                                                    c7 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop8.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop8.time] != null) {
                                                                    c7 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop8.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop8.time] != null) {
                                                                    c7 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop8.day, "Thursday")) {
                                                                if (tt[n][3][innerloop8.time] != null) {
                                                                    c7 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop8.day, "Friday")) {
                                                                if (tt[n][4][innerloop8.time] != null) {
                                                                    c7 = 1;
                                                                }
                                                            }
                                                            innerloop8 = innerloop8.next;
                                                        }
                                                        if (c7 != 1) {
                                                            innerloop8 = loop8.i2;
                                                            while (innerloop8 != null) {
                                                                if (Objects.equals(innerloop8.day, "Monday")) {
                                                                    tt[n][0][innerloop8.time] = loop8.Slot;
                                                                } else if (Objects.equals(innerloop8.day, "Tuesday")) {
                                                                    tt[n][1][innerloop8.time] = loop8.Slot;
                                                                } else if (Objects.equals(innerloop8.day, "Wednesday")) {
                                                                    tt[n][2][innerloop8.time] = loop8.Slot;
                                                                } else if (Objects.equals(innerloop8.day, "Thursday")) {
                                                                    tt[n][3][innerloop8.time] = loop8.Slot;
                                                                } else if (Objects.equals(innerloop8.day, "Friday")) {
                                                                    tt[n][4][innerloop8.time] = loop8.Slot;
                                                                }
                                                                innerloop8 = innerloop8.next;
                                                            }
                                                        }
                                                        int c8 = 0;
                                                        I2node innerloop9 = loop9.i2;
                                                        while (innerloop9 != null) {
                                                            if (Objects.equals(innerloop9.day, "Monday")) {
                                                                if (tt[n][0][innerloop9.time] != null) {
                                                                    c8 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop9.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop9.time] != null) {
                                                                    c8 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop9.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop9.time] != null) {
                                                                    c8 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop9.day, "Thursday")) {
                                                                if (tt[n][3][innerloop9.time] != null) {
                                                                    c8 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop9.day, "Friday")) {
                                                                if (tt[n][4][innerloop9.time] != null) {
                                                                    c8 = 1;
                                                                }
                                                            }
                                                            innerloop9 = innerloop9.next;
                                                        }
                                                        if (c8 != 1) {
                                                            innerloop9 = loop9.i2;
                                                            while (innerloop9 != null) {
                                                                if (Objects.equals(innerloop9.day, "Monday")) {
                                                                    tt[n][0][innerloop9.time] = loop9.Slot;
                                                                } else if (Objects.equals(innerloop9.day, "Tuesday")) {
                                                                    tt[n][1][innerloop9.time] = loop9.Slot;
                                                                } else if (Objects.equals(innerloop9.day, "Wednesday")) {
                                                                    tt[n][2][innerloop9.time] = loop9.Slot;
                                                                } else if (Objects.equals(innerloop9.day, "Thursday")) {
                                                                    tt[n][3][innerloop9.time] = loop9.Slot;
                                                                } else if (Objects.equals(innerloop9.day, "Friday")) {
                                                                    tt[n][4][innerloop9.time] = loop9.Slot;
                                                                }
                                                                innerloop9 = innerloop9.next;
                                                            }
                                                        }
                                                        int c9 = 0;
                                                        I2node innerloop10 = loop10.i2;
                                                        while (innerloop10 != null) {
                                                            if (Objects.equals(innerloop10.day, "Monday")) {
                                                                if (tt[n][0][innerloop10.time] != null) {
                                                                    c9 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop10.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop10.time] != null) {
                                                                    c9 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop10.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop10.time] != null) {
                                                                    c9 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop10.day, "Thursday")) {
                                                                if (tt[n][3][innerloop10.time] != null) {
                                                                    c9 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop10.day, "Friday")) {
                                                                if (tt[n][4][innerloop10.time] != null) {
                                                                    c9 = 1;
                                                                }
                                                            }
                                                            innerloop10 = innerloop10.next;
                                                        }
                                                        if (c9 != 1) {
                                                            innerloop10 = loop10.i2;
                                                            while (innerloop10 != null) {
                                                                if (Objects.equals(innerloop10.day, "Monday")) {
                                                                    tt[n][0][innerloop10.time] = loop10.Slot;
                                                                } else if (Objects.equals(innerloop10.day, "Tuesday")) {
                                                                    tt[n][1][innerloop10.time] = loop10.Slot;
                                                                } else if (Objects.equals(innerloop10.day, "Wednesday")) {
                                                                    tt[n][2][innerloop10.time] = loop10.Slot;
                                                                } else if (Objects.equals(innerloop10.day, "Thursday")) {
                                                                    tt[n][3][innerloop10.time] = loop10.Slot;
                                                                } else if (Objects.equals(innerloop10.day, "Friday")) {
                                                                    tt[n][4][innerloop10.time] = loop10.Slot;
                                                                }
                                                                innerloop10 = innerloop10.next;
                                                            }
                                                        }
                                                        int c10 = 0;
                                                        I2node innerloop11 = loop11.i2;
                                                        while (innerloop11 != null) {
                                                            if (Objects.equals(innerloop11.day, "Monday")) {
                                                                if (tt[n][0][innerloop11.time] != null) {
                                                                    c10 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop11.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop11.time] != null) {
                                                                    c10 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop11.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop11.time] != null) {
                                                                    c10 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop11.day, "Thursday")) {
                                                                if (tt[n][3][innerloop11.time] != null) {
                                                                    c10 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop11.day, "Friday")) {
                                                                if (tt[n][4][innerloop11.time] != null) {
                                                                    c10 = 1;
                                                                }
                                                            }
                                                            innerloop11 = innerloop11.next;
                                                        }
                                                        if (c10 != 1) {
                                                            innerloop11 = loop11.i2;
                                                            while (innerloop11 != null) {
                                                                if (Objects.equals(innerloop11.day, "Monday")) {
                                                                    tt[n][0][innerloop11.time] = loop11.Slot;
                                                                } else if (Objects.equals(innerloop11.day, "Tuesday")) {
                                                                    tt[n][1][innerloop11.time] = loop11.Slot;
                                                                } else if (Objects.equals(innerloop11.day, "Wednesday")) {
                                                                    tt[n][2][innerloop11.time] = loop11.Slot;
                                                                } else if (Objects.equals(innerloop11.day, "Thursday")) {
                                                                    tt[n][3][innerloop11.time] = loop11.Slot;
                                                                } else if (Objects.equals(innerloop11.day, "Friday")) {
                                                                    tt[n][4][innerloop11.time] = loop11.Slot;
                                                                }
                                                                innerloop11 = innerloop11.next;
                                                            }
                                                        }
                                                        int c11 = 0;
                                                        I2node innerloop12 = loop12.i2;
                                                        while (innerloop12 != null) {
                                                            if (Objects.equals(innerloop12.day, "Monday")) {
                                                                if (tt[n][0][innerloop12.time] != null) {
                                                                    c11 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop12.day, "Tuesday")) {
                                                                if (tt[n][1][innerloop12.time] != null) {
                                                                    c11 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop12.day, "Wednesday")) {
                                                                if (tt[n][2][innerloop12.time] != null) {
                                                                    c11 = 1;
                                                                }
                                                            }
                                                            if (Objects.equals(innerloop12.day, "Thursday")) {
                                                                if (tt[n][3][innerloop12.time] != null) {
                                                                    c11 = 1;
                                                                }
                                                            } else if (Objects.equals(innerloop12.day, "Friday")) {
                                                                if (tt[n][4][innerloop12.time] != null) {
                                                                    c11 = 1;
                                                                }
                                                            }
                                                            innerloop12 = innerloop12.next;
                                                        }
                                                        if (c11 != 1) {
                                                            innerloop12 = loop12.i2;
                                                            while (innerloop12 != null) {
                                                                if (Objects.equals(innerloop12.day, "Monday")) {
                                                                    tt[n][0][innerloop12.time] = loop12.Slot;
                                                                } else if (Objects.equals(innerloop12.day, "Tuesday")) {
                                                                    tt[n][1][innerloop12.time] = loop12.Slot;
                                                                } else if (Objects.equals(innerloop12.day, "Wednesday")) {
                                                                    tt[n][2][innerloop12.time] = loop12.Slot;
                                                                } else if (Objects.equals(innerloop12.day, "Thursday")) {
                                                                    tt[n][3][innerloop12.time] = loop12.Slot;
                                                                } else if (Objects.equals(innerloop12.day, "Friday")) {
                                                                    tt[n][4][innerloop12.time] = loop12.Slot;
                                                                }
                                                                innerloop12 = innerloop12.next;
                                                            }
                                                        }
                                                        n++;
                                                        loop12 = loop12.next;
                                                    }
                                                    loop11 = loop11.next;
                                                }
                                                loop10 = loop10.next;
                                            }
                                            loop9 = loop9.next;
                                        }
                                        loop8 = loop8.next;
                                    }
                                    loop7 = loop7.next;
                                }
                                loop6 = loop6.next;
                            }
                            loop5 = loop5.next;
                        }
                        loop4 = loop4.next;
                    }
                    loop3 = loop3.next;
                }
                loop2=loop2.next;
            }
            loop1=loop1.next;
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<4;k++){
                    if(tt[i][j][k]!=null){
                        sum[i]=sum[i]+1;
                    }
                }
            }
        }
        int max = Arrays.stream(sum).max().getAsInt();
        int no = 0;
        for(int i=0;i<n;i++){
            if(max==sum[i]){
                no=i;
                break;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(tt[no][i][j]!=null){
                    if(i==0&&j==0){
                        TextView t=(TextView) findViewById(R.id.M1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==1){
                        TextView t=(TextView) findViewById(R.id.M2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==2){
                        TextView t=(TextView) findViewById(R.id.M3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==0&&j==3){
                        TextView t=(TextView) findViewById(R.id.M4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==0){
                        TextView t=(TextView) findViewById(R.id.T1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==1){
                        TextView t=(TextView) findViewById(R.id.T2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==2){
                        TextView t=(TextView) findViewById(R.id.T3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==1&&j==3){
                        TextView t=(TextView) findViewById(R.id.T4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==0){
                        TextView t=(TextView) findViewById(R.id.W1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==1){
                        TextView t=(TextView) findViewById(R.id.W2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==2){
                        TextView t=(TextView) findViewById(R.id.W3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==2&&j==3){
                        TextView t=(TextView) findViewById(R.id.W4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==0){
                        TextView t=(TextView) findViewById(R.id.Th1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==1){
                        TextView t=(TextView) findViewById(R.id.Th2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==2){
                        TextView t=(TextView) findViewById(R.id.Th3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==3&&j==3){
                        TextView t=(TextView) findViewById(R.id.Th4);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==0){
                        TextView t=(TextView) findViewById(R.id.F1);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==1){
                        TextView t=(TextView) findViewById(R.id.F2);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==2){
                        TextView t=(TextView) findViewById(R.id.F3);
                        t.setText(tt[no][i][j]);
                    }
                    if(i==4&&j==3){
                        TextView t=(TextView) findViewById(R.id.F4);
                        t.setText(tt[no][i][j]);
                    }
                }
            }
        }
    }
}

