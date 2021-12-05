package test;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateTimeSetting {
    
        public static String getCurrentDateTime() {
        SimpleDateFormat fromatt = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        Date date = new Date();
        return fromatt.format(date);
        
    }
        
        public static String setDateTime(Date date) {
        SimpleDateFormat fromatt = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        return fromatt.format(date);
    }
    
}
