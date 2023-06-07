import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mirea.MinNumber;

public class MinNumberTest {

    @Test
    void shouldCalculateMaxNumberIfA (){
        int a=10;
        int b=20;
        MinNumber minAB = new MinNumber();
        int expected = 10;
        int actual=minAB.minNumberChoice(a,b);

        Assertions.assertEquals(expected,actual);

    }

}
