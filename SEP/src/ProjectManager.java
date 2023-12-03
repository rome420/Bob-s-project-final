import java.util.ArrayList;
import java.util.List;

public class ProjectManager { //hOIhieohfwqhfohweifowefhiwqfo
  private List<Project> projects;
  private List<Customer> customers;

  public ProjectManager() {
    projects = new ArrayList<>();
    customers = new ArrayList<>();
  }

  // Project-related methods

  public void addProject(Project project, boolean isFinished) {
    projects.add(project);
    project.setFinishedProjects(isFinished);
  }

  public void removeProject(Project project, boolean isFinished) {
    projects.remove(project);
    project.setFinishedProjects(isFinished);
  }

  public List<Project> getAllProjects() {
    return projects;
  }

  public Project findProjectById(double projectId) {
    for (Project project : projects) {
      if (project.getId() == projectId) {
        return project;
      }
    }
    return null;
  }


  public void addCustomer(Customer customer) {
    customers.add(customer);
  }

  public void removeCustomer(Customer customer) {
    customers.remove(customer);
  }

  public List<Customer> getAllCustomers() {
    return customers;
  }

  public Customer findCustomerByName(String name) {
    for (Customer customer : customers) {
      if (customer.getName().equals(name)) {
        return customer;
      }
    }
    return null;
  }


}
