import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poll {

    private String title;

    private final Map<String, List<String>> options = new HashMap<>();

    public Poll(String title, List<String> options) {

        this.title = title;

        for (String option : options) {
            
            this.options.put(option, new ArrayList<>());
            
        }

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append("\n");
        sb.append("Options: ");
        
        for (Map.Entry<String, List<String>> option : options.entrySet()) {
            sb.append(option.getKey()).append(", ");
        }

        if (!options.isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    public void addVote(String user, String option) {

        this.options.get(option).add(user);
        System.out.println("New vote for option: " + option);

    }

    String getTitle() {
        
        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

}
