public class Residential extends Project {
  private int numberOfBedrooms;
  private int numberOfBathrooms;
  private boolean hasBackyard;

  public Residential(String projectType, MyDate startDate, ProjectManager projectManager) {
    super(projectType, startDate, projectManager);
    this.numberOfBedrooms = 0; // Default value, change as needed
    this.numberOfBathrooms = 0; // Default value, change as needed
    this.hasBackyard = false; // Default value, change as needed
    setDefaultValues();
  }

  private void setDefaultValues() {
    // Set Residential-specific default values
    double estimatedPrice = 100000; // Set the default estimated price to 400000
    int durationInMonths = 9; // Set the default duration to 24 months

    // Validate the estimated price and duration
    if (estimatedPrice >= 100000 && estimatedPrice <= 500000 && durationInMonths >= 6 && durationInMonths <= 12) {
      this.setEstimatedPrice(estimatedPrice);
      this.setDurationInMonths(durationInMonths);
    } else {
      this.setEstimatedPrice(0);
      this.setDurationInMonths(0);
    }

    // Calculate duration in months (if needed)
    // ...
  }

  public int getNumberOfBedrooms() {
    return numberOfBedrooms;
  }

  public int getNumberOfBathrooms() {
    return numberOfBathrooms;
  }

  public boolean hasBackyard() {
    return hasBackyard;
  }

  public void setNumberOfBedrooms(int numberOfBedrooms) {
    this.numberOfBedrooms = numberOfBedrooms;
  }

  public void setNumberOfBathrooms(int numberOfBathrooms) {
    this.numberOfBathrooms = numberOfBathrooms;
  }

  public void setHasBackyard(boolean hasBackyard) {
    this.hasBackyard = hasBackyard;
  }
}
