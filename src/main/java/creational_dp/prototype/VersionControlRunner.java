package creational_dp.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project project = new Project(1,"project", "psvm");

        System.out.println(project);

        ProjectFactory projectFactory = new ProjectFactory(project);

        Project project1 = projectFactory.cloneProject();


        Project cloneProject = (Project) project.copy();

        System.out.println(cloneProject);

    }
}
