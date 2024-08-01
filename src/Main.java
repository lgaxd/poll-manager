import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the title of the poll:");
            String title = scanner.nextLine();

            List<String> options = new ArrayList<>();
            String option;
            System.out.println("Enter options for the poll (type 'done' to finish):");
            while (true) {
                option = scanner.nextLine();
                if (option.equalsIgnoreCase("done")) {
                    break;
                }
                options.add(option);
            }

            Poll poll = new Poll(title, options);
            poll.addVote("LGA", options.get(new Random().nextInt(options.size())));

            PollManager pollManager = new PollManager();
            pollManager.addPoll(poll);
            pollManager.showPollList();

        }
        
    }
}
