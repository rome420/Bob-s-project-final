public class Industrial extends Project {
  private double squareMeters;
  private String facilityType;

  public Industrial(String projectType, MyDate startDate, ProjectManager projectManager) {
    super(projectType, startDate, projectManager);
    this.squareMeters = 0; // Default value, change as needed
    this.facilityType = "Default Facility Type"; // Default value, change as needed
    setDefaultValues();
  }

  private void setDefaultValues() {
    // Set Industrial-specific default values
    double estimatedPrice = 2000000; // Set the default estimated price to 8000000
    int durationInMonths = 30; // Set the default duration to 30 months

    // Validate the estimated price and duration
    if (estimatedPrice >= 2000000 && estimatedPrice <= 10000000 && durationInMonths >= 24 && durationInMonths <= 36) {
      this.setEstimatedPrice(estimatedPrice);
      this.setDurationInMonths(durationInMonths);
    } else {
      this.setEstimatedPrice(0);
      this.setDurationInMonths(0);
    }

    // Calculate duration in months (if needed)
    // ...
  }

  public double getSquareMeters() {
    return squareMeters;
  }

  public String getFacilityType() {
    return facilityType;
  }

  public void setSquareMeters(double squareMeters) {
    this.squareMeters = squareMeters;
  }

  public void setFacilityType(String facilityType) {
    this.facilityType = facilityType;
  }

}