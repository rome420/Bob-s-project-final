/**
 * A class representing a type of project
 *
 * @author Ildo Mota
 * @version 1.0 December 2023
 */
public class RoadConstruction extends Project { // aa
  private double roadLengthKilometers;
  private double roadWidthMeters;
  private int numberOfRoadAlterations;
  private String challenges;

  public RoadConstruction(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,
      double estimatedPrice, String projectStatus, double projectId, double manHoursUsed,
      double roadLengthKilometers,double roadWidthMeters,int numberOfRoadAlterations,String challenges) {
    super(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus, manHoursUsed);

    this.roadLengthKilometers =roadLengthKilometers ;
    this.roadWidthMeters = roadWidthMeters;
    this.numberOfRoadAlterations = 0;
    this.challenges = "None";

  }

  public double getRoadLengthKilometers() {
    return roadLengthKilometers;
  }

  public double getRoadWidthMeters() {
    return roadWidthMeters;
  }

  public int getNumberOfRoadAlterations() {
    return numberOfRoadAlterations;
  }

  public String getChallenges() {
    return challenges;
  }


  public void setRoadLengthKilometers(double roadLengthKilometers) {
    this.roadLengthKilometers = roadLengthKilometers;
  }

  public void setRoadWidthMeters(double roadWidthMeters) {
    this.roadWidthMeters = roadWidthMeters;
  }

  public void setNumberOfRoadAlterations(int numberOfRoadAlterations) {
    this.numberOfRoadAlterations = numberOfRoadAlterations;
  }

  public void setChallenges(String challenges) {
    this.challenges = challenges;
  }


}

