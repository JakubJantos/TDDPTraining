package zadanieStart;

public class Punkt {
    private double X;
    private double Y;

    public Punkt(int x, int y) {
        X = x;
        Y = y;
    }

    public double distanceTo(Punkt punkt){
        double distance = Math.sqrt(Math.pow((punkt.X - this.X),2) + Math.pow((punkt.Y - this.Y),2));

        return distance;
    }



}


