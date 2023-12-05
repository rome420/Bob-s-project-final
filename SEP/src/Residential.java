/**
 * A class representing a type of project
 *
 * @author Ildo Mota
 * @version 1.0 December 2023
 */
class Residential extends Project { // aa
  private double squareMeters;

  /**
   * A nine-argument constructor calling variables from the super class
   * (Project type, start date, end date, expected duration, estimated price,
   * project status, project ID and the man Hours used)
   * @param projectType the project type
   * @param startDate the start date
   * @param endDate the end date
   * @param expectedDuration the expected duration
   * @param estimatedPrice the estimated price for the project
   * @param projectStatus a status if its finished or non-finished
   * @param projectId the project ID
   * @param manHoursUsed the hours used by workers
   * @param squareMeters the square meters
   */
  public Residential(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,
      double estimatedPrice, String projectStatus, double projectId, double manHoursUsed,
      double squareMeters) {
    super(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus, projectId, manHoursUsed);
    this.squareMeters = squareMeters;
  }

  /**
   * A simple get method returning the Square meters
   * @return the Square meters
   */
  public double getSquareMeters() {
    return squareMeters;
  }

  // Additional methods or properties specific to Residential projects...
}
