public class ProjectTest {

  public static void main(String[] args) {
    // Create a sample project for testing
    MyDate startDate = new MyDate(2023, 1, 1);
    MyDate endDate = new MyDate(2023, 2, 1);
    MyDate expectedDuration = new MyDate(0, 1, 0); // 1 month
    Project project = new Project("Sample Project", startDate, endDate, expectedDuration, 1000.0,
        "In-Progress", 12345, 0);

    // Test getter methods
    System.out.println("Project Type: " + project.getProjectType());
    System.out.println("Start Date: " + project.getStartDate());
    System.out.println("End Date: " + project.getEndDate());
    System.out.println("Expected Duration: " + project.getDurationInMonths());
    System.out.println("Estimated Price: $" + project.getEstimatedPrice());
    System.out.println("Project Status: " + project.getProjectStatus());
    System.out.println("Is Finished: " + project.getFinishedProjects());
    System.out.println("Project ID: " + project.getId());
    System.out.println("Man Hours Used: " + project.getManHoursUsed());

    // Test setter methods
    project.setProjectType("New Project Type");
    project.setStartDate(new MyDate(2023, 3, 1));
    project.setEndDate(new MyDate(2023, 4, 1));
    project.setDurationInMonths(9); // 2 months
    project.setEstimatedPrice(1500.0);
    project.setProjectStatus("Completed");
    project.setFinishedProjects(true);
    project.setProjectId(54321);
    project.setManHoursUsed(10.5);

    // Test generateProgressReport method
    System.out.println(project.generateProgressReport());
  }
}

// Start and end date does not show actual date

// Expected duration should be calculated by program

// Project ID long or int

