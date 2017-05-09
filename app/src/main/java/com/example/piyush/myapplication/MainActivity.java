package com.example.piyush.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout lyout=new LinearLayout(this);
        lyout.setOrientation(LinearLayout.VERTICAL);
      //  LinearLayout.LayoutParams paramroot=new LinearLayout.LayoutParams(500,500);
        LinearLayout.LayoutParams paramroot=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);


        lyout.setLayoutParams(paramroot);

        final EditText edtname=new EditText(this);
        edtname.setHint("Any text");
     //   LinearLayout.LayoutParams editname=new LinearLayout.LayoutParams(500,500);
        LinearLayout.LayoutParams editname=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        edtname.setLayoutParams(editname);
        lyout.addView(edtname);

        Button button=new Button(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st=edtname.getText().toString();
                edtname.setText(st.toUpperCase());
            }
        });
        button.setText("OK");
        LinearLayout.LayoutParams Butt=new LinearLayout.LayoutParams(500,150);
        button.setLayoutParams(Butt);
        lyout.addView(button);
        setContentView(lyout);

    }
}
