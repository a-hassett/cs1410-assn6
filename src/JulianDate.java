//Ally Hassett -- CS 1410

public class JulianDate extends Date{
    //Default -- today's date
    public JulianDate(){
        this.year = 1;
        this.month = 1;
        this.day = 1;

        this.addDays(719164);

        //86,400,000 milliseconds in a day
        int daysSince = (int)((System.currentTimeMillis() + java.util.TimeZone.getDefault().getRawOffset())/ 86400000);
        this.addDays(daysSince);
    }

    //Not default date
    public JulianDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Checks if leap year
    @Override
    public boolean isLeapYear(int year){
        return year % 4 == 0;
    }
}
