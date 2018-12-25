/**
 * Represents a Cube
 * @author AlgoDat
 */
public class Cube extends Cuboid {
	double length;

	/*
	 * Constructor without parameter
	 */
	public Cube() {
		length =1;
	}
	/*
	 * Constructor with one parameter
	 * 
	 * @param length the side length of the cube
	 */
	public Cube(double length) {
		this.length = length;
		this.height =length;
		this.width =length;

	}

	public double getLength(){
		return this.length;
	}

	@Override
	double calculateVolume() {
		return Math.pow(this.length,3);

	}

	@Override
	double calculateSurface() {
		return Math.pow(this.length,2)*6;	}

	public static void main(String[] args) {
		Cube cube = new Cube();
		System.out.println(cube.calculateSurface());
	}
	//TODO: ggf. weitere Methoden und member implementieren
}

