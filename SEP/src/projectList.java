import java.util.ArrayList;
public class projectList extends project
{
  private project project;

  ArrayList<project> completedProjects = new ArrayList<project>();
  ArrayList<project> unfinishedProjects = new ArrayList<project>();

  public ArrayList<project> getCompletedProjects()
  {
    return(completedProjects);
  }

  public ArrayList<project> getUnfinishedProjects()
  {
    return(unfinishedProjects);
  }

  public void addProject(project project, boolean isFinished) {
    if (isFinished) {
      completedProjects.add(project);
    } else {
      unfinishedProjects.add(project);
    }
  }

  public project retrieveProjectById(project project, long Id) {
    for (project p : completedProjects) {
      if (p.getId().equals(Id)) {
        return p;
      }
    }

    for (project p : unfinishedProjects) {
      if (p.getId().equals(Id)) {
        return p;
      }
    }

    return null;
  }

  public void removeProject(project project, boolean isFinished) {
    if (isFinished == true) {
      completedProjects.remove(project);
    } else {
      unfinishedProjects.remove(project);
    }
  }

  public void searchProjectByType(String projectType)
  {
    for (project p : completedProjects) {
      if (p.getProjectType().equals(projectType)) {
        return p;
      }
    }

    for (project p : unfinishedProjects) {
      if (p.getProjectType().equals(projectType)) {
        return p;
      }
    }

    return null;
  }




}
