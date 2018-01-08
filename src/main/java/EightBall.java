import org.junit.*;

import java.util.ArrayList;

public class EightBall {
    private ArrayList<String> answers;

    public EightBall() {
        this.answers = new ArrayList<>();
    }

    public int getAnswersCount() {
        return this.answers.size();
    }
}
