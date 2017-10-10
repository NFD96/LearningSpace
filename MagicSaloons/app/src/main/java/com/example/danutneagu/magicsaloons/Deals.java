package com.example.danutneagu.magicsaloons;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;

public class Deals extends AppCompatActivity {
    private static final String TAG = "Deals";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deals);

        CalendarView simpleCalendarView = (CalendarView)findViewById(R.id.calendarView);
        long selectedDate = simpleCalendarView.getDate(); // get selected date in milliseconds
//        simpleCalendarView.setDate();
        simpleCalendarView.setFirstDayOfWeek(1);
        int firstDayOfWeek = simpleCalendarView.getFirstDayOfWeek(); // get first day of week
//        simpleCalendarView.setMaxDate();
//        simpleCalendarView.setMinDate();
        long minDate= simpleCalendarView.getMinDate();
        long maxDate = simpleCalendarView.getMaxDate();
        simpleCalendarView.setShowWeekNumber(true);
        simpleCalendarView.getShowWeekNumber();
        Drawable verticalBar = simpleCalendarView.getSelectedDateVerticalBar();
        simpleCalendarView.setSelectedDateVerticalBar(getResources().getDrawable(R.mipmap.ic_launcher));



    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
        overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }

}
