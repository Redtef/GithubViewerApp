package com.example.githubviewer.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateService {

    public String getCurrentDateString() {
        Date c = Calendar.getInstance().getTime();
        System.out.println("Current time => " + c);
// Date is to be returned in this format "2019-12-12" yyyy-mm-dd
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(c);

    }
}
