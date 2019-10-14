import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertjTest {
    @Test
    public void showAssert(){
        String string = "str";
        assertThat(string).isNotNull();
    }
}
