import java.util.ArrayList;
import java.util.List;
public class ProjectListTest {

  public static void main(String[] args) {
    // Creating instances of MyDate for the projects
    MyDate startDate1 = new MyDate(2023, 1, 1);
    MyDate startDate2 = new MyDate(2023, 2, 1);

    // Creating an instance of ProjectList
    ProjectList projectList = new ProjectList();

    // Creating projects and adding them to the list
    Project project1 = new Project("Commercial", startDate1, null, new MyDate(), 1000000, "InProgress", 0, 0);
    Project project2 = new Project("Residential", startDate2, null, new MyDate(), 500000, "NewBuild", 0, 0);

    projectList.addProject(project1, false);
    projectList.addProject(project2, false);

    // Displaying completed and unfinished projects
    System.out.println("Completed Projects:");
    displayProjects(projectList.getCompletedProjects());

    System.out.println("\nUnfinished Projects:");
    displayProjects(projectList.getUnfinishedProjects());

    // Retrieving a project by ID
    double projectIdToRetrieve = project1.getId();
    Project retrievedProject = projectList.retrieveProjectById(projectIdToRetrieve);
    if (retrievedProject != null) {
      System.out.println("\nFound Project by ID: " + retrievedProject.generateProgressReport());
    } else {
      System.out.println("\nProject with ID " + projectIdToRetrieve + " not found.");
    }

    // Removing a project
    double projectIdToRemove = project2.getId();
    projectList.removeProject(project2, false);

    // Displaying updated lists
    System.out.println("\nUpdated Unfinished Projects after removal:");
    displayProjects(projectList.getUnfinishedProjects());
  }

  private static void displayProjects(
      List<Project> projects) {
    for (Project project : projects) {
      System.out.println(project.generateProgressReport());
      System.out.println();
    }
  }
}