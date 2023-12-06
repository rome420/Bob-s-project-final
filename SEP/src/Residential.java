class Residential extends Project {
  private double squareMeters;
  private int numberOfKitchens;
  private int numberOfBathrooms;
  private int otherRoomsWithPlumbing;
  private boolean isNewBuild;

  private int timeline;

  public Residential(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,
      double estimatedPrice, String projectStatus, double projectId, double manHoursUsed,
      double squareMeters,int numberOfKitchens, int numberOfBathrooms,
      int otherRoomsWithPlumbing, boolean isNewBuild,int timeline) {
    super(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus, projectId, manHoursUsed);
    this.squareMeters = squareMeters;
    this.numberOfKitchens = 1;
    this.numberOfBathrooms = 1;
    this.otherRoomsWithPlumbing = otherRoomsWithPlumbing;
    this.isNewBuild = true;
    this.timeline=9;

  }

  public double getSquareMeters() {
    return squareMeters;
  }


}
