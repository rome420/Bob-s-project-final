/**
 * A class representing a date
 *
 * @author Maciej Rom
 * @version 1.0 December 2023
 */
public class myDate
{
  private int day;
  private int month;
  private int year;

  private int numberOfDays;

  private String monthName;

  /**
   * Three-argument constructor. Illegal dates are converted to legal dates;
   * A negative year is set to its positive counterpart
   * A month less then 1 is set to 1 and a day more than 12 the last day is set to 12
   * A day less than 1 is set to 1 and a day more than the last day of
   * the specified month is set to this last day
   * @param day the day
   * @param month the month
   * @param year the year
   */
  public myDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  /**
   * A simple getter returning the day
   * @return the day
   */
  public int getDay()
  {
    return day;
  }

  /**
   * A simple getter returning the month
   * @return the month
   */
  public int getMonth()
  {
    return month;
  }

  /**
   * A simple getter returning the year
   * @return the year
   */
  public int getYear()
  {
    return year;
  }

  /**
   * A method which gets the month name by using a number
   * @return the name of the month
   */
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

  /**
   * A method that returns the number of the days in a month according if its
   * Leap year or not
   * @return the number of days in a month
   */
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

  /**
   * A set method converting a negative year to its positive counterpart
   *    * A month less then 1 is set to 1 and a day more than 12 the last day is set to 12
   *    * A day less than 1 is set to 1 and a day more than the last day of
   *    * the specified month is set to this last day
   * @param day the day
   * @param month the month
   * @param year the year
   */
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

  /**
   * A boolean method verifying if its Leap year or not
   * @return the value for the Leap year (true or false)
   */
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

}
