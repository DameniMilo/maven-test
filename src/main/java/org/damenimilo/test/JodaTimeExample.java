package main.java.org.damenimilo.test;


import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;
import java.util.TimeZone;

/**
 * @author Damien GAILLARD
 */
public class JodaTimeExample {

    public static void jodaTimeTest() {
        DateTimeFormatter dateFormat = DateTimeFormat.forPattern("G,C,Y,x,w,e,E,Y,D,M,d,a,K,h,H,k,m,s,S,z,Z");

        String dob = "2002-01-15";
        LocalTime localTime = new LocalTime();
        LocalDate localDate = new LocalDate();
        LocalDateTime localDateTime = new LocalDateTime();
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();

        DateTime dateTimeCurrent = new DateTime();
        DateTime dateTimeParis = new DateTime(DateTimeZone.forTimeZone(TimeZone.getTimeZone("France/Paris")));

        System.out.println("dateFormatr : " + dateFormat.print(localDateTime));
        System.out.println("LocalTime : " + localTime.toString());
        System.out.println("localDate : " + localDate.toString());
        System.out.println("localDateTime : " + localDateTime.toString());
        System.out.println("DateTimeZone : " + dateTimeZone.toString());

        System.out.println("dateTimeCurrent : " + dateTimeCurrent.toString());
        System.out.println("dateTimeParis : " + dateTimeParis.toString());

        DateTime dateTimeCurrentMinus = dateTimeCurrent.minusMinutes(30);
        DateTime dateTimeParisMinus = dateTimeParis.minusMinutes(120);
        DateTime dateTimeLastUpdate = new DateTime("2015-08-26T16:00:44.087-04:00");
        System.out.println("*** " + dateTimeParis.isAfter(dateTimeLastUpdate) + " *** dateTimeParis (" + dateTimeParis.toString() + ") is AFTER dateTimeLastUpdate : " + dateTimeLastUpdate.toString());
        System.out.println("*** " + dateTimeParis.isBefore(dateTimeLastUpdate) + " *** dateTimeParis (" + dateTimeParis.toString() + ") is BEFORE dateTimeLastUpdate : " + dateTimeLastUpdate.toString());
        System.out.println("*** " + dateTimeParisMinus.isAfter(dateTimeLastUpdate) + " *** dateTimeParisMinus (" + dateTimeParisMinus.toString() + ") is AFTER dateTimeLastUpdate : " + dateTimeLastUpdate.toString());
        System.out.println("*** " + dateTimeParisMinus.isBefore(dateTimeLastUpdate) + " *** dateTimeParisMinus (" + dateTimeParisMinus.toString() + ") is BEFORE dateTimeLastUpdate : " + dateTimeLastUpdate.toString());
        System.out.println("*** " + dateTimeCurrent.isAfter(dateTimeLastUpdate) + " *** dateTimeCurrent (" + dateTimeCurrent.toString() + ") is AFTER dateTimeLastUpdate : " + dateTimeLastUpdate.toString());
        System.out.println("*** " + dateTimeCurrent.isBefore(dateTimeLastUpdate) + " *** dateTimeCurrent (" + dateTimeCurrent.toString() + ") is BEFORE dateTimeLastUpdate : " + dateTimeLastUpdate.toString());
        System.out.println("*** " + dateTimeCurrentMinus.isAfter(dateTimeLastUpdate) + " *** dateTimeCurrentMinus (" + dateTimeCurrentMinus.toString() + ") is AFTER dateTimeLastUpdate : " + dateTimeLastUpdate.toString());
        System.out.println("*** " + dateTimeCurrentMinus.isBefore(dateTimeLastUpdate) + " *** dateTimeCurrentMinus (" + dateTimeCurrentMinus.toString() + ") is BEFORE dateTimeLastUpdate : " + dateTimeLastUpdate.toString());
        Date x = dateTimeParis.toDate();
        System.out.println(x);
        System.out.println(new DateTime(x).toString());
    }
}
