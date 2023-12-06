/**
 * A class representing a type of project
 *
 * @author Ildo Mota
 * @version 1.0 December 2023
 */
public class RoadConstruction extends Project {
  private int lengthInKm;
  private String roadType;

  public RoadConstruction(String projectType, MyDate startDate, ProjectManager projectManager) {
    super(projectType, startDate, projectManager);
    this.lengthInKm = 0; // Default value, change as needed
    this.roadType = "Default Road Type"; // Default value, change as needed
    setDefaultValues();
  }

  private void setDefaultValues() {
    // Set RoadConstruction-specific default values
    double estimatedPrice = 3000000;
    int durationInMonths = 18;

    // Validate the estimated price and duration
    if (estimatedPrice >= 1000000 && estimatedPrice <= 5000000 && durationInMonths >= 12 && durationInMonths <= 24) {
      this.setEstimatedPrice(estimatedPrice);
      this.setDurationInMonths(durationInMonths);
    } else {
      this.setEstimatedPrice(0);
      this.setDurationInMonths(0);
    }

    // Calculate duration in months (if needed)
    // ...
  }

  public int getLengthInKm() {
    return lengthInKm;
  }

  public String getRoadType() {
    return roadType;
  }

  public void setLengthInKm(int lengthInKm) {
    this.lengthInKm = lengthInKm;
  }

  public void setRoadType(String roadType) {
    this.roadType = roadType;
  }
}
