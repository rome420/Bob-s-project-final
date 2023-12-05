/**
 * A class representing a type of project
 *
 * @author Ildo Mota
 * @version 1.0 December 2023
 */

public class roadConstruction
{
  double roadLengthKilometers;

  /**
   * One argument constructor. Illegal square meters will be converted to a legal value
   * @param roadLengthKilometers the road length in kilometers used in the type of project
   */
  public roadConstruction(double roadLengthKilometers)
  {
    if (roadLengthKilometers < 0)
    {
      roadLengthKilometers = 0;
    }
    this.roadLengthKilometers=roadLengthKilometers;
  }

  /**
   * A simple getter for the square meters
   * @return returns the Length in Kilometers
   */
  public double getRoadLengthKilometers()
  {
    return roadLengthKilometers;
  }

  /**
   * A simple setter for the square meters
   * @param roadLengthKilometers the road length in kilometers used in the type of project
   */
  public void setRoadLengthKilometers(double roadLengthKilometers)
  {
    this.roadLengthKilometers=roadLengthKilometers;
  }
}
