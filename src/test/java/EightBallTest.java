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

}
