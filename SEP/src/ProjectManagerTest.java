import java.util.List;

public class ProjectManagerTest {

  public static void main(String[] args) {
    // Create an instance of ProjectManager
    ProjectManager projectManager = new ProjectManager();

    // Test adding projects
    Commercial commercialProject = (Commercial) projectManager.createDefaultProject("Commercial");
    Residential residentialProject = (Residential) projectManager.createDefaultProject("Residential");

    projectManager.addProject(commercialProject, true);
    projectManager.addProject(residentialProject, false);

    // Test finding a project by ID
    Project foundProject = projectManager.findProjectById(commercialProject.getId());
    System.out.println("Found Project: " + foundProject.generateProgressReport());

    // Test getting all projects
    System.out.println("All Projects:");
    for (Project project : projectManager.getAllProjects()) {
      System.out.println(project.generateProgressReport());
    }

    // Test getting projects by type
    List<Project> commercialProjects = projectManager.getProjectsByType("Commercial");
    System.out.println("Commercial Projects:");
    for (Project project : commercialProjects) {
      System.out.println(project.generateProgressReport());
    }

    // Test removing a project
    projectManager.removeProject(commercialProject, true);
    System.out.println("All Projects after removal:");
    for (Project project : projectManager.getAllProjects()) {
      System.out.println(project.generateProgressReport());
    }

    // Test creating a default project
    Residential defaultResidentialProject = (Residential) projectManager.createDefaultProject("Residential");
    System.out.println("Default Project: " + defaultResidentialProject.generateProgressReport());
  }
}



