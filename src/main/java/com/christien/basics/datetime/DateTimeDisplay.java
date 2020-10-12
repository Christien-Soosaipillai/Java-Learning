package com.christien.basics.datetime;

import database.DBConnection;
import database.DataBaseConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateTimeDisplay {

    public static void main(String[] args){
        Date today = new Date();
        DateTimeSelector selector = new DateTimeSelector();
        String isoDate = selector.isoSelector(today);
        System.out.println("ISO DateTime from String.format: " + isoDate);

        LocalDateTime dateTime = LocalDateTime.now();
        String isoDate2 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ISO DateTime from DateTimeFormatter: " + isoDate2);

        //Get connection
        DataBaseConnector dataBaseConnector = new DataBaseConnector();
        Connection connection = dataBaseConnector.getConnection(DBConnection.MAIN_DB);

        //convert date from java to sql
        Statement mystmt = null;
        try {
            mystmt = connection.createStatement();

            //3.Execute SQL query
            String selectStmt = "SELECT * FROM christien_sync_db.date_test;";

            //4.execute statement
            ResultSet results =  mystmt.executeQuery(selectStmt);

            while(results.next()){
                System.out.println(results.getInt("id") + " ," + results.getString("user") + " ," + results.getDate("date"));       //formatted to java Date
                System.out.println(results.getInt("id") + " ," + results.getString("user") + " ," + results.getString("date"));     //gets raw string for date format in sql YYYY-MM-DD hh:mm:ss
                DateFormat formatDayOnly;
                formatDayOnly = new SimpleDateFormat("YYYY-MM-DD");
                Date dbdateTime = results.getDate("date");
                System.out.println(formatDayOnly.parse(String.valueOf(dbdateTime)));

            }

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
