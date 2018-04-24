package com.example.haspinder.c0728467_carservicereminder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DashboardActivity extends Activity {

    TextView textDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        textDate = (TextView) findViewById(R.id.textDate);
        Date c = Calendar.getInstance().getTime();
        System.out.println("Current time => " + c);

        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(c);
        textDate.setText(formattedDate);
    }
}
