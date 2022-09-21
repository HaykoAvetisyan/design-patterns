package structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
       // Project project = new RealProject("https://github.com/someProject");

        Project project1 = new ProxyProject("https://github.com/someother");

        project1.run();
    }
}
