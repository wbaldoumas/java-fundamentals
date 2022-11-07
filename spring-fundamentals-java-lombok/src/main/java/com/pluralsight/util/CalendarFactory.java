package com.pluralsight.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalendarFactory implements FactoryBean<Calendar> {

    private final Calendar instance = Calendar.getInstance();

    public void AddDays(int numDays) {
        instance.add(Calendar.DAY_OF_YEAR, numDays);
    }

    @Override
    public Calendar getObject() {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

}
