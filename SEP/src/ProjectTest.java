import java.io.PrintStream;

public class ProjectTest {

  public static void main(String[] args)
  {
    MyDate startDate = new MyDate(6,12,2023);
    Project project1 = new Project("Residential", startDate, new ProjectManager());
    Project project2 = new Project("Residential", startDate, new ProjectManager());

    ProjectList projectList1 = new ProjectList();
    projectList1.addProject(project1, true);
    projectList1.addProject(project2, false);

    System.out.println(project1.getManHoursUsed());
    System.out.println(project1.getEstimatedPrice());
    System.out.println(project1.getStartDate());
    System.out.println(project1.getDurationInMonths());

    System.out.println(projectList1.getUnfinishedProjects());
    System.out.println(projectList1.getCompletedProjects());

  }
}

// Start and end date does not show actual date

// Expected duration should be calculated by program

// Project ID long or int