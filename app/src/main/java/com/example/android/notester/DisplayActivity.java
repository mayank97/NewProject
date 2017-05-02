package com.example.android.notester;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        if(MainFrameActivity.temp != null) {
            TextView name = (TextView) findViewById(R.id.name1);
            TextView roll = (TextView) findViewById(R.id.roll2);
            TextView branch = (TextView) findViewById(R.id.branch3);
            TextView contact = (TextView) findViewById(R.id.number4);
            TextView address = (TextView) findViewById(R.id.address5);
            TextView DOB = (TextView) findViewById(R.id.DOB6);
            TextView degree = (TextView) findViewById(R.id.degree7);
            TextView YOE = (TextView) findViewById(R.id.YOE8);

            name.setText(MainFrameActivity.temp.getName());
            roll.setText(MainFrameActivity.temp.getRollNumber());
            branch.setText(MainFrameActivity.temp.getBranch());
            contact.setText(MainFrameActivity.temp.getContact());
            address.setText(MainFrameActivity.temp.getAddress());
            DOB.setText(MainFrameActivity.temp.getDob());
            degree.setText(MainFrameActivity.temp.getDegree());
            YOE.setText(MainFrameActivity.temp.getYOE());

            Button edit_Button = (Button) findViewById(R.id.editButton);
            edit_Button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent editText = new Intent(DisplayActivity.this, NewNoteActivity.class);
                    NewNoteActivity.flag = 1;
                    startActivity(editText);
                    finish();

                }
            });
        }
    }
}
