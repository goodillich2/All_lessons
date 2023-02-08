package lesson_10;

public class Date
{
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    Date()
    {}

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

class T2{
    public static void main(String[] args)
    {
       // Object -> Date
        Date date = new Date(2002, 11, 25);
        System.out.println(date.toString());
    }
}


