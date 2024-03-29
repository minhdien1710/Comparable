public class CompareCircle  extends Circle implements Comparable<CompareCircle>{

    public CompareCircle(){
    }

    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(CompareCircle o) {
        if(getRadius() > o.getRadius())
            return 1;
        else if (getRadius() < o.getRadius())
            return -1;
        else return 0;
    }
}
