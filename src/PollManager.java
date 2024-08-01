import java.util.ArrayList;
import java.util.List;

public class PollManager {

    private final List<Poll> pollList;

        public PollManager() {
        this.pollList = new ArrayList<>();

    }


    public void addPoll(Poll poll) {

        pollList.add(poll);
        System.out.println("New Poll created: " + poll.getTitle());

    }

    public void showPollList() {

        System.out.println("Here are all the previous polls: ");
        for (Poll poll : pollList) {

            System.out.println(poll);
            System.out.println();

        }

    }

}
