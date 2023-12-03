import java.util.ArrayList;

public class ProjectManager {
  private ArrayList<Project> projects = new ArrayList<>();
  private ArrayList<Customer> customers = new ArrayList<>();

  public void addProject(Project project) {
    projects.add(project);
  }

  public void addCustomer(Customer customer) {
    customers.add(customer);
  }

  public void assignCustomerToProject(Customer customer, Project project) {
    if (customers.contains(customer) && projects.contains(project)) {
      project.setCustomer(customer);
      System.out.println("Customer " + customer.getName() +
          " assigned to project " + project.getProjectType());
    } else {
      System.out.println("Customer or project not found.");
    }
  }

  public void setCustomer(Customer customer, String name, long phoneNumber) {
    if (customers.contains(customer)) {
      customer.setName(name);
      customer.setPhoneNumber(phoneNumber);
      System.out.println("Customer details updated.");
    } else {
      System.out.println("Customer not found.");
    }
  }

  public void setProject(Project project, String projectType, MyDate startDate, MyDate endDate,
      MyDate expectedDuration, double estimatedPrice, String projectStatus) {
    if (projects.contains(project)) {
      project.setProjectType(projectType);
      project.setStartDate(startDate);
      project.setEndDate(endDate);
      project.setExpectedDuration(expectedDuration);
      project.setEstimatedPrice(estimatedPrice);
      project.setProjectStatus(projectStatus);
      System.out.println("Project details updated.");
    } else {
      System.out.println("Project not found.");
    }
  }

  public void printProjectDetails() {
    for (Project project : projects) {
      System.out.println("Project Type: " + project.getProjectType());
      System.out.println("Customer: " + (project.getCustomer() != null ? project.getCustomer().getName() : "Not assigned"));
      System.out.println("Start Date: " + project.getStartDate().getDay() + " " +
          project.getStartDate().getMonthName() + " " +
          project.getStartDate().getYear());
      System.out.println("End Date: " + project.getEndDate().getDay() + " " +
          project.getEndDate().getMonthName() + " " +
          project.getEndDate().getYear());
      System.out.println("Expected Duration: " + project.getExpectedDuration().numberOfDaysInMonth() + " days");
      System.out.println("Estimated Price: $" + project.getEstimatedPrice());
      System.out.println("Project Status: " + project.getProjectStatus());
      System.out.println("--------------");
    }
  }

  public void printCustomerDetails() {
    for (Customer customer : customers) {
      System.out.println("Customer Name: " + customer.getName());
      System.out.println("Phone Number: " + customer.getPhoneNumber());
      System.out.println("--------------");
    }
  }

  public void printProjectStatusSummary() {
    System.out.println("Project Status Summary:");
    for (Project project : projects) {
      System.out.println(project.getProjectType() + ": " + project.getProjectStatus());
    }
  }

  // Additional methods...

  public ArrayList<Project> getProjects() {
    return projects;
  }

  public ArrayList<Customer> getCustomers() {
    return customers;
  }
}
