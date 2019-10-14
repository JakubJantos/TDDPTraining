import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PolygonTest {
    @Test
    public void test() {
        //geven
        Polygon polygon = new Polygon(5);

        //then
        assertNotNull(polygon);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        Polygon polygon = new Polygon(2);


    }
}
