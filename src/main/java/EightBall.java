import java.util.*;

public class EightBall {
    private ArrayList<String> answers;

    public EightBall() {
        this.answers = new ArrayList<>();
        answers.add("Yes");
        answers.add("Ask again later");
        answers.add("Don't count on it");
    }

    public int getAnswerCount() {
        return this.answers.size();
    }

    public String randomAnswer() {
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public void addAnswer(String answer){
        this.answers.add(answer);
    }

    public void removeAnswer(){
        this.answers.remove(0);
    }

}
