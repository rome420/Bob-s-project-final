class Commercial extends Project {
  private double squareMeters;
  private int numberOfFloors;
  private String buildingUse;


  public Commercial(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,
      double estimatedPrice, String projectStatus, double projectId, double manHoursUsed,
      double squareMeters) {
    super(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus, projectId, manHoursUsed);
    this.squareMeters = squareMeters;
    this.numberOfFloors = 1;
    this.buildingUse = buildingUse;
  }

  public double getSquareMeters() {
    return squareMeters;
  }

  public void setSquareMeters(double squareMeters) {
    this.squareMeters = squareMeters;
  }

  public int getNumberOfFloors() {
    return numberOfFloors;
  }

  public void setNumberOfFloors(int numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }

  public String getBuildingUse() {
    return buildingUse;
  }

  public void setBuildingUse(String buildingUse) {
    this.buildingUse = buildingUse;
  }


}





