/**
 * Represents a Cuboid
 * http://en.wikipedia.org/wiki/Cuboid
 *
 * @author AlgoDat
 */
public class Cuboid extends Body {

    double height, length, width;

    /*
     * Constructor for a Cuboid object
     */
    public Cuboid() {
        this.height = 1;
        this.length = 1;
        this.width = 1;
    }

    /*
     * Constructor for a Cuboid object
     *
     * @param h height
     * @param l length
     * @param w width
     */
    public Cuboid(double h, double l, double w) {
        this.height = h;
        this.length = l;
        this.width = w;
        if (height < 0) {
            h = 1;
        }
        if (length < 0) {
            this.length = 1;
        }
        if (width < 0) {
            this.width = 1;
        }

    }

    public double getHeight() {
        return this.height;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }


    @Override
    double calculateVolume() {
        return this.length*this.width*this.height;

    }

    double calculateSurface() {
        // TODO Auto-generated method stub
        return 2*(this.length*this.width + this.width* this.height + this.height*this.length);
    }

}

