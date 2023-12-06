public class Commercial extends Project {
  private String buildingUse;

  public Commercial(String projectType, MyDate startDate, ProjectManager projectManager) {
    super(projectType, startDate, projectManager);
    this.buildingUse = "Default Building Use"; // Default value, change as needed
    setDefaultValues();
  }

  private void setDefaultValues() {
    // Set Commercial-specific default values
    double estimatedPrice = 500000;
    int durationInMonths = 18;

    // Validate the estimated price and duration
    if (estimatedPrice >= 500000 && estimatedPrice <= 2000000 && durationInMonths >= 12 && durationInMonths <= 24) {
      this.setEstimatedPrice(estimatedPrice);
      this.setDurationInMonths(durationInMonths);
    } else {
      this.setEstimatedPrice(0);
      this.setDurationInMonths(0);
    }

    // Set other default values for Commercial
    this.setBuildingUse("Default Building Use");
  }

  public String getBuildingUse() {
    return buildingUse;
  }

  public void setBuildingUse(String buildingUse) {
    this.buildingUse = buildingUse;
  }
}




