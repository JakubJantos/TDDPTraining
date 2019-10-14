package zadanieStart;



public class PT {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(5, 4);
        Punkt p2 = new Punkt(2, 7);

        double distance = p2.distanceTo(p1);

        System.out.println(distance);

        System.out.println();

        Board board = new Board(10,10);

        System.out.println(board.toSting());

        board.insertPoint(2,2);
        board.insertPoint(6,3);
        board.insertPoint(5,4);
        board.insertPoint(1,6);
        board.insertPoint(9,9);

        System.out.println(board.toSting());

    }
}