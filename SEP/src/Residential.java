class Residential extends Project { // aa
  private double squareMeters;

  public Residential(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,
      double estimatedPrice, String projectStatus, double projectId, double manHoursUsed,
      double squareMeters) {
    super(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus, projectId, manHoursUsed);
    this.squareMeters = squareMeters;
  }

  public double getSquareMeters() {
    return squareMeters;
  }

  // Additional methods or properties specific to Residential projects...
}
