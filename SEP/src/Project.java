User
import java.util.ArrayList;
import java.util.List;

public abstract class Project
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

  public Project(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration, double estimatedPrice, String projectStatus,
      double projectId, double manHoursUsed)
  {
    this.projectType = projectType;
    this.startDate = startDate;
    this.endDate = endDate;
    this.expectedDuration = expectedDuration;
    this.estimatedPrice = estimatedPrice;
    this.projectStatus = projectStatus;
    // Assuming the default value for isFinished is false when a project is created
    this.isFinished = false;
    this.projectId = projectId;
    this.manHoursUsed = 0;
  }

  // Getter methods...
  public String getProjectType()
  {
    return projectType;
  }

  public MyDate getStartDate()
  {
    return startDate;
  }

  public MyDate getEndDate()
  {
    return endDate;
  }

  public MyDate getExpectedDuration()
  {
    return expectedDuration;
  }

  public double getEstimatedPrice()
  {
    return estimatedPrice;
  }

  public String getProjectStatus()
  {
    return projectStatus;
  }

  public Boolean getFinishedProjects()
  {
    return isFinished;
  }

  public double getProjectId()
  {
    return projectId;
  }

  public double getManHoursUsed()
  {
    return manHoursUsed;
  }

  // Setter methods...
  public void setProjectType(String projectType)
  {
    this.projectType = projectType;
  }

  public void setStartDate(MyDate startDate)
  {
    this.startDate = startDate;
  }

  public void setEndDate(MyDate endDate)
  {
    this.endDate = endDate;
  }

  public void setExpectedDuration(MyDate expectedDuration)
  {
    this.expectedDuration = expectedDuration;
  }

  public void setEstimatedPrice(double estimatedPrice)
  {
    this.estimatedPrice = estimatedPrice;
  }

  public void setProjectStatus(String projectStatus)
  {
    this.projectStatus = projectStatus;
  }

  public void setFinishedProjects(boolean isFinished)
  {
    this.isFinished = isFinished;
  }

  public void setProjectId(double projectId)
  {
    this.projectId = projectId;
  }

  public void setManHoursUsed(double manHoursUsed)
  {
    this.manHoursUsed = manHoursUsed;
  }

  public String generateProgressReport() {
    StringBuilder report = new StringBuilder();

    // Basic project information
    report.append("Project ID: ").append(projectId).append("\n");
    report.append("Project Type: ").append(projectType).append("\n");
    report.append("Start Date: ").append(startDate).append("\n");
    report.append("End Date: ").append(endDate).append("\n");
    report.append("Expected Duration: ").append(expectedDuration).append("\n");
    report.append("Estimated Price: $").append(estimatedPrice).append("\n");
    report.append("Project Status: ").append(projectStatus).append("\n");
    report.append("Is Finished: ").append(isFinished).append("\n");
    report.append("Man Hours Used: ").append(manHoursUsed).append("\n");

    if (projectStatus.equalsIgnoreCase("in-progress")) {
      report.append("Project is in-progress.").append("\n");
    } else if (projectStatus.equalsIgnoreCase("completed")) {
      report.append("Project is completed.").append("\n");
    }

    return report.toString();
  }





}



