package com.christien.basics.datetime;

import java.util.Date;

public class DateTimeSelector {

    public String isoSelector(Date date){
        String str = String.format("%tc", date);
        return str;
    }

}
