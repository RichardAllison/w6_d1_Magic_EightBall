import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EightBallTest {

    EightBall eightBall;

    @Before
    public void before(){
        eightBall = new EightBall();
    }

    @Test
    public void hasLength(){
        assertEquals(3, eightBall.getAnswerCount());
    }

    @Test
    public void canAddAnswer(){
        eightBall.addAnswer("Most likely");
        assertEquals(4, eightBall.getAnswerCount());
    }

    @Test
    public void canRemoveAnswer(){
        eightBall.removeAnswer();
        assertEquals(2, eightBall.getAnswerCount());
    }

}
