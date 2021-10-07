import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line
       SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        try{
            Date myDate = format.parse(Integer.toString(month) + "-" + Integer.toString(day) + "-" + Integer.toString(year));
            System.out.println("The date is: " + format.format(myDate));

        }catch(ParseException e){
            System.out.println("Could not read date format.");
        }

        //Set specific date
        Calendar c = new GregorianCalendar(year, month-1, day);
        //Calendar c = Calendar.getInstance();

        //transform Calender into Date
        Date dateCal = c.getTime();
        //get weekday as text
        DateFormat format2 = new SimpleDateFormat("EEEE", Locale.ENGLISH);

        System.out.println("Day of week: " + c.get(Calendar.DAY_OF_WEEK) + " | Weekday: " + format2.format(dateCal));

    }
}