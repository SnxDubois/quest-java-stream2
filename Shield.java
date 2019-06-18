import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
        List<Agent> agents = names.stream().map(str -> {
            String[] name = str.split(" ");
            Agent agent = new Agent(name[0], name[1]);
            return agent;
        }).collect(Collectors.toList());

        /*
         * List<Agent> agents = new ArrayList<>(); for (String str : names) { String[]
         * name = str.split(" "); Agent obj = new Agent(name[0], name[1]);
         * agents.add(obj); }
         */
        showAgents(agents);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}