package com.example.githubviewer;

import com.example.githubviewer.service.DateService;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateServiceTest {

    @Test
    public void Date_isCorrect() {
        DateService dateService = new DateService();
        String dateExpected = "2019-11-18";
        String dateActual = dateService.getCurrentDateString();

        assertEquals(dateExpected, dateActual);
    }
}
