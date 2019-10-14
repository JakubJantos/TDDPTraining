package SDA_Mapa;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class NameAggregatorTest {
    @Test
    public void test(){
        //given
        List<String>names = Arrays.asList("ania", "adam","tomek", "marcin", "michal");

        //when
        Map<Character, List<String>>nameByStartingLetter = NameAggregator.aggregate(names);

        //then
        assertThat(nameByStartingLetter.get('a'))
                .contains("ania", "adam");
        assertThat(nameByStartingLetter.get('t'))
                .contains("tomek");
        assertThat(nameByStartingLetter.get('m'))
                .contains("marcin","michal");

    }
}
