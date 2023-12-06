public class MyDate
{
  private int day;
  private int month;
  private int year;

  private int numberOfDays;

  private String monthName;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public MyDate(int month) {
    this.month = month;
  }

  public MyDate(){
    this.day = 0;
    this.month = 0;
    this.year = 0000;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }
  public String getMonthName()
  {
    if (month == 1)
    {
      this.monthName = "January";
    }
    else if (month == 2)
    {
      this.monthName = "February";
    }
    else if (month == 3)
    {
      this.monthName = "March";
    }
    else if (month == 4)
    {
      this.monthName = "April";
    }
    else if (month == 5)
    {
      this.monthName = "May";
    }
    else if (month == 6)
    {
      this.monthName = "June";
    }
    else if (month == 7)
    {
      this.monthName = "July";
    }
    else if (month == 8)
    {
      this.monthName = "August";
    }
    else if (month == 9)
    {
      this.monthName = "September";
    }
    else if (month == 10)
    {
      this.monthName = "October";
    }
    else if (month == 11)
    {
      this.monthName = "November";
    }
    else
    {
      this.monthName = "December";
    }
    return monthName;
  }

  public int numberOfDaysInMonth()
  {
    if (isLeapYear() == true && month == 2)
    {
      this.numberOfDays = 29;
    }
    else if (isLeapYear() == false && month == 2)
    {
      this.numberOfDays = 28;
    }
    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
    {
      this.numberOfDays = 31;
    }
    else
    {
      this.numberOfDays = 30;
    }

    return numberOfDays;

  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;

    if (year < 0)
    {
      this.year = year * (-1);
    }
    if (month < 1)
    {
      this.month = 1;
    }
    if (month > 12)
    {
      this.month = 12;
    }
    if (day < 1)
    {
      this.day = 1;
    }
    if (day > numberOfDaysInMonth())
    {
      this.day = numberOfDaysInMonth();
    }
  }

  public boolean isLeapYear()
  {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public int yearBetween(MyDate otherDate)
  {
    int years = Math.abs(this.year - otherDate.getYear());
    return years;
  }

  @Override
  public String toString() {
    return String.format("%02d/%02d/%04d", day, month, year);
  }

}