public class ProjectListTest {

  public static void main(String[] args) {
    // Create a sample project list for testing
    ProjectList projectList = new ProjectList("Sample Project", new MyDate(2023, 1, 1),
        new MyDate(2023, 2, 1), new MyDate(0, 1, 0), 1000.0, "In-Progress", 12345, 0);

    // Test adding projects
    Project project1 = new Project("Project 1", new MyDate(2023, 3, 1),
        new MyDate(2023, 4, 1), new MyDate(0, 1, 0), 1500.0, "Completed", 54321, 10.5);
    projectList.addProject(project1, true);

    Project project2 = new Project("Project 2", new MyDate(2023, 5, 1),
        new MyDate(2023, 6, 1), new MyDate(0, 2, 0), 2000.0, "In-Progress", 67890, 20.5);
    projectList.addProject(project2, false);

    // Test retrieving projects by ID
    Project retrievedProject = projectList.retrieveProjectById(54321);
    System.out.println("Retrieved Project by ID: " + retrievedProject.generateProgressReport());

    // Test removing projects
    projectList.removeProject(project1, true);

    // Test searching projects by type
    Project searchedProject = projectList.searchProjectByType("Project 2");
    if (searchedProject != null) {
      System.out.println("Searched Project by Type: " + searchedProject.generateProgressReport());
    } else {
      System.out.println("Project not found.");
    }

    // Print the lists of completed and unfinished projects
    System.out.println("Completed Projects:");
    for (Project p : projectList.getCompletedProjects()) {
      System.out.println(p.generateProgressReport());
    }

    System.out.println("\nUnfinished Projects:");
    for (Project p : projectList.getUnfinishedProjects()) {
      System.out.println(p.generateProgressReport());
    }
  }
}