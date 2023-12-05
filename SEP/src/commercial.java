/**
 * A class representing a type of project
 *
 * @author Ildo Mota
 * @version 1.0 December 2023
 */
public class commercial
{
  double squareMeters;

  /**
   * One argument constructor. Illegal square meters will be converted to a legal value
   * @param squareMeters Square meters used in the type of project
   */
  public commercial(double squareMeters)
  {
    if (squareMeters < 0)
    {
      squareMeters = 0;
    }
    this.squareMeters=squareMeters;
  }

  /**
   * A simple getter for the square meters
   * @return returns the Square Meters
   */
  public double getSquareMeters()
  {
    return squareMeters;
  }

  /**
   * A simple setter for the square meters
   * @param squareMeters Square meters used in the type of project
   */
  public void setSquareMeters(double squareMeters)
  {
    this.squareMeters=squareMeters;
  }
}
