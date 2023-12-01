import java.awt.*;

public class Socks implements Comparable <Socks> {
    int cnt;
    Color color;
    String material;

    public Socks(int cnt, Color color, String material) {
        this.cnt = cnt;
        this.color = color;
        this.material = material;
    }

    @Override
    public int compareTo(Socks o) {
        if (this.cnt>o.cnt)
            return 1;
        if (this.cnt<o.cnt)
            return -1;
        int ColorSum1 = this.color.getRed()+this.color.getBlue()+this.color.getGreen();
        int ColorSum2 = o.color.getRed()+o.color.getBlue()+o.color.getGreen();

        if (ColorSum1>ColorSum2)
            return 1;
        if (ColorSum1<ColorSum2)
            return -1;

        return this.material.compareTo(o.material);
    }

    @Override
    public String toString() {
        return "Socks{" +
                "cnt=" + cnt +
                ", color=" + color +
                ", material='" + material + '\'' +
                '}';
    }
}
