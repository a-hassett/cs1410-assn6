//Ally Hassett -- CS 1440

public class Date {
    //Public variables
    public int year;
    public int month;
    public int day;

    //If day is too big to be a possible day, move through months and years until it is valid
    public void addDays(int days){
        this.day += days;
        while(this.day > getNumberOfDaysInMonth(this.year, this.month)){
            this.day -= getNumberOfDaysInMonth(this.year, this.month);
            this.month += 1;
            if(this.month > 12){
                this.month = 1;
                this.year += 1;
            }
        }
    }

    //If day is too small to be a possible day, move through months and years until it is valid
    public void subtractDays(int days){
        this.day -= days;
        while(this.day < 1){
            if(this.month - 1 < 1){
                this.day += getNumberOfDaysInMonth(this.year, 12);
            }else{
                this.day += getNumberOfDaysInMonth(this.year, this.month - 1);
            }
            this.month -= 1;
            if(this.month < 1){
                this.month = 12;
                this.year -= 1;
            }
        }
    }

    //Print the date in the form: Monthname day, year
    public void printLongDate(){
        System.out.printf("%s %d, %d", getMonthName(this.month), this.day, this.year);
    }

    //Print the date in the form: MM/DD/YYYY
    public void printShortDate(){
        System.out.printf("%d/%d/%d", this.month, this.day, this.year);
    }

    //Return name of the month publicly
    public String getMonthName(){
        return getMonthName(this.month);
    }

    //Return the number of the month publicly
    public int getMonth(){
        return this.month;
    }

    //Return the year publicly
    public int getYear(){
        return this.year;
    }

    //Return the number of the day publicly
    public int getDayOfMonth(){
        return this.day;
    }

    //If there is no parameter, make the default the current year
    public boolean isLeapYear(){
        return isLeapYear(this.year);
    }

    //Dummy leap year method; gets overridden in child classes
    public boolean isLeapYear(int year){
        return true;
    }

    //Different number of days in every month
    private int getNumberOfDaysInMonth(int year, int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }else if(month == 2){
            if(isLeapYear(year)){
                return 29;
            }else{
                return 28;
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }else{
            return 0;
        }
    }

    //Find name of the month using its number
    private static String getMonthName(int month){
        if(month == 1){
            return "January";
        }else if(month == 2){
            return "February";
        }else if(month == 3){
            return "March";
        }else if(month == 4){
            return "April";
        }else if(month == 5){
            return "May";
        }else if(month == 6){
            return "June";
        }else if(month == 7){
            return "July";
        }else if(month == 8){
            return "August";
        }else if(month == 9){
            return "September";
        }else if(month == 10){
            return "October";
        }else if(month == 11){
            return "November";
        }else if(month == 12){
            return "December";
        }else{
            return "";
        }
    }
}
