import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class VawelCheckerTest {
    @Test
    @Parameters({"a, true", "b, false", "®, false","o true"})
    public void test(char c, boolean expectetResult){

        boolean isVowel = VawelChecker.isVowel(c);

        assertEquals(isVowel, expectetResult);
    }
}
