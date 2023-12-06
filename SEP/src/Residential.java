class Residential extends Project {
  private double squareMeters;
  private int numberOfKitchens;
  private int numberOfBathrooms;
  private int otherRoomsWithPlumbing;
  private boolean isNewBuild;

  public Residential(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,
      double estimatedPrice, String projectStatus, double projectId, double manHoursUsed,
      double squareMeters) {
    super(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus, projectId, manHoursUsed);
    this.squareMeters = squareMeters;
  }

  public double getSquareMeters() {
    return squareMeters;
  }

//
}
