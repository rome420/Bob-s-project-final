class Commercial extends Project {
  private double squareMeters;
  private int numberOfFloors;
  private String buildingUse;


  public Commercial(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,
      double estimatedPrice, String projectStatus, double projectId, double manHoursUsed,
      double squareMeters) {
    super(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus, projectId, manHoursUsed);
    this.squareMeters = squareMeters;
    this.numberOfFloors = numberOfFloors;
    this.buildingUse = buildingUse;
  }

  public double getSquareMeters() {
    return squareMeters;
  }

}





