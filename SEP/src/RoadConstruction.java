public class RoadConstruction extends Project {
  private double roadLengthKilometers;
  private double roadWidthMeters;
  private int numberOfRoadAlterations;
  private String challenges;
  private double budget;////wfwqfweqvqwdwq


  public RoadConstruction(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,
      double estimatedPrice, String projectStatus, double projectId, double manHoursUsed) {
    super(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus, projectId, manHoursUsed);

    this.roadLengthKilometers =roadLengthKilometers ;
    this.roadWidthMeters = roadWidthMeters;
    this.numberOfRoadAlterations = 0;
    this.challenges = "None";
    this.budget = budget;
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

  public double getBudget() {
    return budget;
  }

  public void setRoadLengthKilometers(double roadLengthKilometers) {
    this.roadLengthKilometers = roadLengthKilometers;
  }

  public void setRoadWidthMeters(double roadWidthMeters) {
    this.roadWidthMeters = roadWidthMeters;
  }

  public void setNumberOfRoadAlterations(int numberOfRoadAlterations) {  // Changed from setNumberOfAlterations
    this.numberOfRoadAlterations = numberOfRoadAlterations;
  }

  public void setChallenges(String challenges) {
    this.challenges = challenges;
  }

  public void setBudget(double budget) {
    this.budget = budget;
  }


  public void updateRoadInformation(double newRoadLength, double newRoadWidth, int newNumberOfRoadAlterations, String newChallenges, double newBudget) {
    roadLengthKilometers = newRoadLength;
    roadWidthMeters = newRoadWidth;
    numberOfRoadAlterations = newNumberOfRoadAlterations;
    challenges = newChallenges;
    budget = newBudget;
  }




}

