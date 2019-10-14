package zadanieStart;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void testIfNewlyCreatetBoardHasHeader() {
        //when
        Board b = new Board(5, 5);

        //then
        assertEquals(b.getCell(6, 6), '4');
        assertEquals(b.getCell(0, 0), '4');

        //and when
        Board b2 = new Board(7, 7);
        System.out.println(b2.toSting());

        //then
        assertEquals(b2.getCell(8, 8), '6');
        assertEquals(b2.getCell(0, 0), '6');
    }

    @Test
    public void test(){
        //given
        Board b = new Board(5,5);

        //when
        b.insertPoint(1, 1);

        //then
        assertEquals(b.getCell(3,3),'x');
    }

}