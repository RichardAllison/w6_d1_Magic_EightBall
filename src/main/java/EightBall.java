import java.util.ArrayList;
import java.util.Arrays;

public class EightBall {
    private ArrayList<String> answers;

    public EightBall() {
        this.answers = new ArrayList<>(Arrays.asList("Yes", "Ask again later", "Don't count on it"));
    }

    public int getAnswerCount() {
        return this.answers.size();
    }


}
