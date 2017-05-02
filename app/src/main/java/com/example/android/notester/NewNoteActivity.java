package com.example.android.notester;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NewNoteActivity extends AppCompatActivity {

    public static int totalnumber = 0;
    public static int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        Button upload = (Button) findViewById(R.id.upload);

        Button cancel_button = (Button) findViewById(R.id.cancel);
        Button save_button = (Button) findViewById(R.id.save);
        TextView showDater = (TextView) findViewById(R.id.showDate);

        Calendar myCalendar = Calendar.getInstance();

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat dateForamt = new SimpleDateFormat("MMMM dd, yyyy");

        String time = timeFormat.format(myCalendar.getTime());
        String date = dateForamt.format(myCalendar.getTime());
        String ender = date + " " + time;
        showDater.setText(ender);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NewNoteActivity.this, "Upload Profile Picture", Toast.LENGTH_SHORT).show();
            }
        });
        cancel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if (flag == 1) {

            EditText temp1 = (EditText) findViewById(R.id.name);
            EditText temp2 = (EditText) findViewById(R.id.roll);
            EditText temp3 = (EditText) findViewById(R.id.branch);
            EditText temp4 = (EditText) findViewById(R.id.number);
            EditText temp5 = (EditText) findViewById(R.id.address);
            EditText temp6 = (EditText) findViewById(R.id.DOB);
            EditText temp7 = (EditText) findViewById(R.id.degree);
            EditText temp8 = (EditText) findViewById(R.id.YOE);


            temp1.setText(MainFrameActivity.temp.getName(), TextView.BufferType.EDITABLE);
            temp2.setText(MainFrameActivity.temp.getRollNumber(), TextView.BufferType.EDITABLE);
            temp3.setText(MainFrameActivity.temp.getBranch(), TextView.BufferType.EDITABLE);
            temp4.setText(MainFrameActivity.temp.getContact(), TextView.BufferType.EDITABLE);
            temp5.setText(MainFrameActivity.temp.getAddress(), TextView.BufferType.EDITABLE);
            temp6.setText(MainFrameActivity.temp.getDob(), TextView.BufferType.EDITABLE);
            temp7.setText(MainFrameActivity.temp.getDegree(), TextView.BufferType.EDITABLE);
            temp8.setText(MainFrameActivity.temp.getYOE(), TextView.BufferType.EDITABLE);
        }

            save_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (flag == 0) {


                        EditText temp1 = (EditText) findViewById(R.id.name);
                        EditText temp2 = (EditText) findViewById(R.id.roll);
                        EditText temp3 = (EditText) findViewById(R.id.branch);
                        EditText temp4 = (EditText) findViewById(R.id.number);
                        EditText temp5 = (EditText) findViewById(R.id.address);
                        EditText temp6 = (EditText) findViewById(R.id.DOB);
                        EditText temp7 = (EditText) findViewById(R.id.degree);
                        EditText temp8 = (EditText) findViewById(R.id.YOE);


                        String name = temp1.getText().toString();
                        String rollnumber = temp2.getText().toString();
                        String branch = temp3.getText().toString();
                        String number = temp4.getText().toString();
                        String address = temp5.getText().toString();
                        String DOB =temp6.getText().toString();
                        String degree = temp7.getText().toString();
                        String YOE = temp8.getText().toString();


                        Note myNote = new Note(name, rollnumber, branch, number, address, DOB, degree, YOE);
                        totalnumber++;
                        MainActivity.NoteCollection.add(myNote);
                    } else if (flag == 1) {
                        flag = 0;
                        Log.v("NewNoteActivity", "I AM HERE.");


                        EditText temp1 = (EditText) findViewById(R.id.name);
                        EditText temp2 = (EditText) findViewById(R.id.roll);
                        EditText temp3 = (EditText) findViewById(R.id.branch);
                        EditText temp4 = (EditText) findViewById(R.id.number);
                        EditText temp5 = (EditText) findViewById(R.id.address);
                        EditText temp6 = (EditText) findViewById(R.id.DOB);
                        EditText temp7 = (EditText) findViewById(R.id.degree);
                        EditText temp8 = (EditText) findViewById(R.id.YOE);



/*                        EditText temp1 = (EditText) findViewById(R.id.note_title);
                        EditText temp2 = (EditText) findViewById(R.id.content);
                        CheckBox myBox = (CheckBox) findViewById(R.id.important);

  */                      for (int i = 0; i < MainActivity.NoteCollection.size(); i++) {
                            if ((MainActivity.NoteCollection.get(i).getName()).equals(MainFrameActivity.temp.getName()))
                            {
                            Log.v("NewNoteActivity", ""+i);
                                MainActivity.NoteCollection.get(i).setName(temp1.getText().toString());
                                MainActivity.NoteCollection.get(i).setRollNumber(temp2.getText().toString());
                                MainActivity.NoteCollection.get(i).setBranch(temp3.getText().toString());
                                MainActivity.NoteCollection.get(i).setContact(temp4.getText().toString());
                                MainActivity.NoteCollection.get(i).setAddress(temp5.getText().toString());
                                MainActivity.NoteCollection.get(i).setDob(temp6.getText().toString());
                                MainActivity.NoteCollection.get(i).setDegree(temp7.getText().toString());
                                MainActivity.NoteCollection.get(i).setYOE(temp8.getText().toString());

                                break;
                            }
                        }
                    }
                    finish();
                    Intent intent = new Intent(NewNoteActivity.this, MainFrameActivity.class);
                    startActivity(intent);

                }
            });


    }

}
