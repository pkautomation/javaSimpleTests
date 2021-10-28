import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import simple.Streets;

public class StreetsTest {
    private static final String EMPTY_STRING = "";

    @Test
    public void testBoundaryValues1(){
        Assertions.assertEquals("1 st Street is", Streets.rideTo(0));
    }

    @Test
    public void testBoundaryValues2(){
        Assertions.assertEquals(EMPTY_STRING, Streets.rideTo(-1));
    }

    @Test
    public void testBoundaryValues3(){
        Assertions.assertEquals("4 th Street is", Streets.rideTo(3));
    }

    @Test
    public void testBoundaryValue4(){
        Assertions.assertEquals(EMPTY_STRING, Streets.rideTo(4));
    }

    @Test
    public void testBoundaryValue5(){
        Assertions.assertEquals(EMPTY_STRING, Streets.rideTo(Integer.MAX_VALUE));
    }

    @Test
    public void testBoundaryValue6(){
        Assertions.assertEquals(EMPTY_STRING, Streets.rideTo(Integer.MIN_VALUE));
    }
}
