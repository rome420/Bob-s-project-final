import java.util.ArrayList;
import java.util.List;

public class Project
{
  private static int lastAssignedId = 1000;
  private String projectType;
  private MyDate startDate;
  private MyDate endDate;
  private int durationInMonths;
  private double estimatedPrice;
  private String projectStatus;
  private boolean isFinished;
  private int projectId;
  private double manHoursUsed;

  public Project(String projectType, MyDate startDate, ProjectManager projectManager)
  {
    this.projectType = projectType;
    this.startDate = startDate;
    this.endDate = new MyDate(); // Set a default value for endDate
    this.durationInMonths = 0; // Set a default value for durationInMonths
    this.estimatedPrice = 0; // Default value, change as needed
    this.projectStatus = "Not Started"; // Default value, change as needed
    this.isFinished = false; // Default value
    this.projectId = ++lastAssignedId;
    this.manHoursUsed = 0; // Default value
    // Set default values based on the projectType directly in the constructor
    setDefaultValues(projectType);
  }

  private void setDefaultValues(String projectType) {
    // Set default values based on the projectType
    // You can directly set values here based on the projectType
    // For example, check the projectType and set estimatedPrice, durationInMonths, etc.
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

  public int getDurationInMonths() {
    return durationInMonths;
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

  public int getId()
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

  public void setEndDate(MyDate endDate) {
    // Allow for setting the endDate to null
    if (endDate == null) {
      this.endDate = new MyDate(); // You can set a default value or leave it as null
    } else {
      this.endDate = endDate;
    }
  }

  public void setDurationInMonths(int months) {
    this.durationInMonths = months;
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

  public void setProjectId(int projectId)
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
    report.append("Expected Duration: ").append(durationInMonths).append(" months\n");
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

