package com.davidpaul.vrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MenuPageResult extends AppCompatActivity {

    @Bind(R.id.txtResult)
    TextView txtResult;
    @Bind(R.id.calendar)
    CalendarView calendar;
    @Bind(R.id.calenderResult)
    TextView calenderResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page_result);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String result = intent.getExtras().getString("KeyResult");
        if (result.equals("Attendance")) {
            funAttendance();
        } else {
            calenderResult.setVisibility(View.GONE);
            calendar.setVisibility(View.GONE);
            txtResult.setVisibility(View.VISIBLE);
            txtResult.setText(intent.getExtras().getString("KeyResult"));
        }

    }

    private void funAttendance() {
        calenderResult.setVisibility(View.VISIBLE);
        calendar.setVisibility(View.VISIBLE);
        txtResult.setVisibility(View.GONE);
        String date = "22/8/2016";
        String parts[] = date.split("/");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);

        long milliTime = cal.getTimeInMillis();
        calendar.setDate(milliTime, true, true);
        calenderResult.setText("You took leave on " + date);
    }
}
