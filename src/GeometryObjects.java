public abstract class GeometryObjects implements Comparable<GeometryObjects> {
    double square;
    //int scale;
    abstract double getSquare();

    abstract void setScale(int scale);

    @Override
    public int compareTo(GeometryObjects o) {
        if (this.square>o.square)
            return 1;
        if (this.square<o.square)
            return -1;
        return 0;
    }
}