class Residential extends Project {
  private double squareMeters;
  private int numberOfKitchens;
  private int numberOfBathrooms;
  private int otherRoomsWithPlumbing;
  private boolean isNewBuild;

  public Residential(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,
      double estimatedPrice, String projectStatus, double projectId, double manHoursUsed,
      double squareMeters,int numberOfKitchens, int numberOfBathrooms,
      int otherRoomsWithPlumbing, boolean isNewBuild) {
    super(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus, projectId, manHoursUsed);
    this.squareMeters = squareMeters;
    this.numberOfKitchens = 1;
    this.numberOfBathrooms = 1;
    this.otherRoomsWithPlumbing = otherRoomsWithPlumbing;
    this.isNewBuild = true;

  }


  public double getSquareMeters() {
    return squareMeters;
  }

  public int getNumberOfKitchens() {
    return numberOfKitchens;
  }

  public int getNumberOfBathrooms() {
    return numberOfBathrooms;
  }

  public int getOtherRoomsWithPlumbing() {
    return otherRoomsWithPlumbing;
  }

  public boolean getIsNewBuild() {
    return isNewBuild;
  }


  public void setSquareMeters(double squareMeters) {
    this.squareMeters = squareMeters;
  }

  public void setNumberOfKitchens(int numberOfKitchens) {
    this.numberOfKitchens = numberOfKitchens;
  }

  public void setNumberOfBathrooms(int numberOfBathrooms) {
    this.numberOfBathrooms = numberOfBathrooms;
  }

  public void setOtherRoomsWithPlumbing(int otherRoomsWithPlumbing) {
    this.otherRoomsWithPlumbing = otherRoomsWithPlumbing;
  }

  public void setNewBuild(boolean isNewBuild) {
    this.isNewBuild = isNewBuild;
  }


}
