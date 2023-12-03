public class Project
{
  private String projectType;
  private MyDate startDate;
  private MyDate endDate;
  private MyDate expectedDuration;
  private double estimatedPrice;
  private String projectStatus;
  private boolean isFinished;
  private double projectId;

  private double manHoursUsed;

  public Project(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration, double estimatedPrice, String projectStatus) {
    this.projectType = projectType;
    this.startDate = startDate;
    this.endDate = endDate;
    this.expectedDuration = expectedDuration;
    this.estimatedPrice = estimatedPrice;
    this.projectStatus = projectStatus;
    // Assuming the default value for isFinished is false when a Project is created
    this.isFinished = false;
  }

  // Getter methods...
  public String getProjectType() {
    return projectType;
  }

  public MyDate getStartDate() {
    return startDate;
  }

  public MyDate getEndDate() {
    return endDate;
  }

  public MyDate getExpectedDuration() {
    return expectedDuration;
  }

  public double getEstimatedPrice() {
    return estimatedPrice;
  }

  public String getProjectStatus() {
    return projectStatus;
  }

  public Boolean getFinishedProjects() {
    return isFinished;
  }

  // Setter methods...
  public void setProjectType(String projectType) {
    this.projectType = projectType;
  }

  public void setStartDate(MyDate startDate) {
    this.startDate = startDate;
  }

  public void setEndDate(MyDate endDate) {
    this.endDate = endDate;
  }

  public void setExpectedDuration(MyDate expectedDuration) {
    this.expectedDuration = expectedDuration;
  }

  public void setEstimatedPrice(double estimatedPrice) {
    this.estimatedPrice = estimatedPrice;
  }

  public void setProjectStatus(String projectStatus) {
    this.projectStatus = projectStatus;
  }

  public void setFinishedProjects(boolean isFinished) {
    this.isFinished = isFinished;
  }


}




