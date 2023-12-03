import java.util.ArrayList;
import java.util.List;

public abstract class project {
  private String projectType;
  private myDate startDate;
  private myDate endDate;
  private myDate expectedDuration;
  private double estimatedPrice;
  private String projectStatus;
  private boolean isFinished;
  private double projectId;

  private double manHoursUsed;

  public Project(String projectType, myDate startDate, myDate endDate, myDate expectedDuration, double estimatedPrice, String projectStatus) {
    this.projectType = projectType;
    this.startDate = startDate;
    this.endDate = endDate;
    this.expectedDuration = expectedDuration;
    this.estimatedPrice = estimatedPrice;
    this.projectStatus = projectStatus;
    // Assuming the default value for isFinished is false when a project is created
    this.isFinished = false;
  }

  // Getter methods...
  public String getProjectType() {
    return projectType;
  }

  public myDate getStartDate() {
    return startDate;
  }

  public myDate getEndDate() {
    return endDate;
  }

  public myDate getExpectedDuration() {
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

  public void setStartDate(myDate startDate) {
    this.startDate = startDate;
  }

  public void setEndDate(myDate endDate) {
    this.endDate = endDate;
  }

  public void setExpectedDuration(myDate expectedDuration) {
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

  // Abstract method to assign a team member
  public abstract int assignTeamMember(int teamMemberNumber);

  // Additional method to get the list of team members
  public abstract List<Integer> getTeamMembers();
}




