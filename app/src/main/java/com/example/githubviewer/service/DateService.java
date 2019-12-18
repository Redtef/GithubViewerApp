package com.example.githubviewer.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateService {

    public String getCurrentDateString() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH,-1);
        Date date= calendar.getTime();
// Date is to be returned in this format "2019-12-12" yyyy-mm-dd
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);

    }
}
