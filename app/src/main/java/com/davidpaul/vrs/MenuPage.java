package com.davidpaul.vrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MenuPage extends AppCompatActivity {
    @Bind(R.id.viewMarks)
    LinearLayout viewMarks;
    @Bind(R.id.attendance)
    LinearLayout attendance;
    @Bind(R.id.examTimeTables)
    LinearLayout examTimeTables;
    @Bind(R.id.modelQuestionPapers)
    LinearLayout modelQuestionPapers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
        ButterKnife.bind(this);
        viewMarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuPage.this, MenuPageResult.class);
                i.putExtra("KeyResult", "View Marks");
                startActivity(i);
            }
        });
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuPage.this, MenuPageResult.class);
                i.putExtra("KeyResult", "Attendance");
                startActivity(i);
            }
        });
        examTimeTables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuPage.this, MenuPageResult.class);
                i.putExtra("KeyResult", "Exam Timetable");
                startActivity(i);
            }
        });
        modelQuestionPapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuPage.this, MenuPageResult.class);
                i.putExtra("KeyResult", "Model Question Paper");
                startActivity(i);
            }
        });
    }
}
