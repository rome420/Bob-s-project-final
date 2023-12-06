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





}





