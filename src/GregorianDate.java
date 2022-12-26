//Ally Hassett -- CS 1410

public class GregorianDate extends Date{
    //Default -- today's date
    public GregorianDate(){
        this.year = 1970;
        this.month = 1;
        this.day = 1;

        //86,400,000 milliseconds in a day
        int daysSince = (int)((System.currentTimeMillis() + java.util.TimeZone.getDefault().getRawOffset())/ 86400000);
        this.addDays(daysSince);
    }

    //Not default date
    public GregorianDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Checks if leap year
    @Override
    public boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        } else if(year % 100 == 0){
            return false;
        } else{
            return year % 4 == 0;
        }
    }
}
