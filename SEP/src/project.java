public class project
{
  private String projectType;
  private MyDate startDate;
  private MyDate endDate;
  private MyDate expectedDuration;
  private double estimatedPrice;
  private String projectStatus;

  public Project(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration, double estimatedPrice, String projectStatus)
  {
    this.projectType = projectType;
    this.startDate = startDate;
    this.endDate = endDate;
    this.expectedDuration = expectedDuration;
    this.estimatedPrice = estimatedPrice;
    this.projectStatus = projectStatus;
  }

  // Getter methods
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

}



