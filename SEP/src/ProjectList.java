import java.util.ArrayList;

public class ProjectList {
  ArrayList<Project> completedProjects = new ArrayList<>();
  ArrayList<Project> unfinishedProjects = new ArrayList<>();

  public ProjectList(String projectType, MyDate startDate, MyDate endDate,
      MyDate expectedDuration, double estimatedPrice, String projectStatus,Boolean isFinnished,double projectId,double manHoursUsed) {
    // Assuming Project has a similar constructor, adjust as needed
    Project project = new Project(projectType, startDate, endDate, expectedDuration, estimatedPrice, projectStatus,isFinnished,projectId,manHoursUsed);
    addProject(project, false);  // Assuming new projects are unfinished by default
  }

  public ArrayList<Project> getCompletedProjects() {
    return completedProjects;
  }

  public ArrayList<Project> getUnfinishedProjects() {
    return unfinishedProjects;
  }

  public void addProject(Project project, boolean isFinished) {
    if (isFinished) {
      completedProjects.add(project);
    } else {
      unfinishedProjects.add(project);
    }
  }

  public Project retrieveProjectById(long id) {
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
