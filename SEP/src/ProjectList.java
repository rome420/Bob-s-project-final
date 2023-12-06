import java.util.ArrayList;
import java.util.List;

public class ProjectList {
  private List<Project> completedProjects = new ArrayList<>();
  private List<Project> unfinishedProjects = new ArrayList<>();

  public ProjectList(String projectType, MyDate startDate, MyDate endDate,
      MyDate DurationInMonths, double estimatedPrice, String projectStatus,
      double projectId, double manHoursUsed) {
    Project project = new Project(projectType, startDate, endDate, DurationInMonths,
        estimatedPrice, projectStatus, projectId, manHoursUsed);
    addProject(project, false);  // Assuming new projects are unfinished by default
  }

  public List<Project> getCompletedProjects() {
    return completedProjects;
  }

  public List<Project> getUnfinishedProjects() {
    return unfinishedProjects;
  }

  public void addProject(Project project, boolean isFinished) {
    if (isFinished) {
      completedProjects.add(project);
    } else {
      unfinishedProjects.add(project);
    }
  }

  public Project retrieveProjectById(double id) {
    for (Project p : completedProjects) {
      if (p.getId() == id) {
        return p;
      }
    }

    for (Project p : unfinishedProjects) {
      if (p.getId() == id) {
        return p;
      }
    }

    return null;
  }

  public void removeProject(Project project, boolean isFinished) {
    if (isFinished) {
      completedProjects.remove(project);
    } else {
      unfinishedProjects.remove(project);
    }
  }

  public Project searchProjectByType(String projectType) {
    for (Project p : completedProjects) {
      if (p.getProjectType().equals(projectType)) {
        return p;
      }
    }

    for (Project p : unfinishedProjects) {
      if (p.getProjectType().equals(projectType)) {
        return p;
      }
    }

    return null;
  }
}
