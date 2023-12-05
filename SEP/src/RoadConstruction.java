class RoadConstruction extends Project {
  private double roadLengthKilometers;

  public RoadConstruction(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,
      double estimatedPrice, String projectStatus, double projectId, double manHoursUsed,
      double roadLengthKilometers) {
    super(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus, projectId, manHoursUsed);
    this.roadLengthKilometers = roadLengthKilometers;
  }

  public double getRoadLengthKilometers() {
    return roadLengthKilometers;
  }

  // Additional methods or properties specific to RoadConstruction projects...
}