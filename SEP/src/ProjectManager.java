import java.util.ArrayList;
import java.util.List;

public class ProjectManager
{
  private List<Project> projects;
  private List<Customer> customers;

  public ProjectManager()
  {
    projects = new ArrayList<>();
    customers = new ArrayList<>();
  }

  // Project-related methods

  public void addProject(Project project, boolean isFinished)
  {
    projects.add(project);
    project.setFinishedProjects(isFinished);
  }

  public void removeProject(Project project, boolean isFinished)
  {
    projects.remove(project);
    project.setFinishedProjects(isFinished);
  }

  public List<Project> getAllProjects()
  {
    return projects;
  }

  public Project findProjectById(double projectId)
  {
    for (Project project : projects)
    {
      if (project.getId() == projectId)
      {
        return project;
      }
    }
    return null;
  }

  public void addCustomer(Customer customer)
  {
    customers.add(customer);
  }

  public void removeCustomer(Customer customer)
  {
    customers.remove(customer);
  }

  public List<Customer> getAllCustomers()
  {
    return customers;
  }

  public Customer findCustomerByName(String name)
  {
    for (Customer customer : customers)
    {
      if (customer.getName().equals(name))
      {
        return customer;
      }
    }
    return null;
  }

  public List<Project> getProjectsByType(String projectType)
  {
    List<Project> projectsByType = new ArrayList<>();

    for (Project project : projects)
    {
      if (projectType.equalsIgnoreCase("Commercial") && project instanceof Commercial)
      {
        projectsByType.add(project);
      }
      else if (projectType.equalsIgnoreCase("Industrial") && project instanceof Industrial)
      {
        projectsByType.add(project);
      }
      else if (projectType.equalsIgnoreCase("RoadConstruction") && project instanceof RoadConstruction)
      {
        projectsByType.add(project);
      }
      else if (projectType.equalsIgnoreCase("Residential") && project instanceof Residential)
      {
        projectsByType.add(project);
      }
    }

    return projectsByType;
  }

  public Commercial createDefaultCommercialProject() {
    // You can set default values for Commercial projects here
    Commercial commercial = new Commercial("Commercial", new MyDate(26, 8, 2001), new MyDate(0,0,0000), new MyDate(0),
        0, "New Build", 0, 0, 0, 1, "Default Building Use");

    // Set specific default values for Commercial
    double estimatedPrice = 500000; // Set the default estimated price to 500000
    int durationInMonths = 18; // Set the default duration to 18 months

    // Validate the estimated price and duration
    if (estimatedPrice >= 500000 && estimatedPrice <= 2000000
        && durationInMonths >= 12 && durationInMonths <= 24) {
      commercial.setEstimatedPrice(estimatedPrice);
      commercial.setDurationInMonths(durationInMonths);
    } else {
      commercial.setEstimatedPrice(0);
      commercial.setDurationInMonths(0); // Use the new method to set duration directly
    }

    return commercial;
  }

  public Residential createDefaultResidentialProject() {
    // You can set default values for Residential projects here
    Residential residential = new Residential("Residential", new MyDate(26, 8, 2001), new MyDate(0, 0, 0000), new MyDate(0),
        0, "in-progress", 0, 0, 0, 1, 1, 1, true);

    // Set specific default values for Residential
    double estimatedPrice = 100000; // Set the default estimated price to 400000
    int durationInMonths = 9; // Set the default duration to 24 months

    // Validate the estimated price and duration
    if (estimatedPrice >= 100000 && estimatedPrice <= 500000
        && durationInMonths >= 6 && durationInMonths <= 12) {
      residential.setEstimatedPrice(estimatedPrice);
      residential.setDurationInMonths(durationInMonths);
    } else {
      residential.setEstimatedPrice(0);
      residential.setDurationInMonths(0); // Use the new method to set duration directly
    }

    return residential;
  }

  public Industrial createDefaultIndustrialProject() {
    // You can set default values for Industrial projects here
    Industrial industrial = new Industrial("Industrial", new MyDate(26, 8, 2001), new MyDate(0, 0, 0000), new MyDate(0),
        0, "New Build", 0, 0, 0, "Manufacturing Plant");

    // Set specific default values for Industrial
    double estimatedPrice = 2000000; // Set the default estimated price to 8000000
    int durationInMonths = 30; // Set the default duration to 30 months

    // Validate the estimated price and duration
    if (estimatedPrice >= 2000000 && estimatedPrice <= 10000000
        && durationInMonths >= 24 && durationInMonths <= 36) {
      industrial.setEstimatedPrice(estimatedPrice);
      industrial.setDurationInMonths(durationInMonths);
    } else {
      industrial.setEstimatedPrice(0);
      industrial.setDurationInMonths(0); // Use the new method to set duration directly
    }

    return industrial;
  }
  public RoadConstruction createDefaultRoadConstructionProject() {
    // You can set default values for Road Construction projects here
    RoadConstruction roadConstruction = new RoadConstruction(
        "RoadConstruction", new MyDate(26, 8, 2001), new MyDate(0, 0, 0000), new MyDate(0),
        0, "New Build", 0, 0, 0, 10, 0, "none");

    // Set specific default values for Road Construction
    double estimatedPrice = 3000000; // Example value, you can provide any budget here
    int durationInMonths = 18; // Set the default duration to 30 months

    // Validate the estimated price and duration
    if (estimatedPrice >= 1000000 && estimatedPrice <= 5000000
        && durationInMonths >= 12 && durationInMonths <= 24) {
      roadConstruction.setEstimatedPrice(estimatedPrice);
      roadConstruction.setDurationInMonths(durationInMonths);
    } else {
      roadConstruction.setEstimatedPrice(0);
      roadConstruction.setDurationInMonths(0); // Use the new method to set duration directly
    }

    return roadConstruction;
  }


}





