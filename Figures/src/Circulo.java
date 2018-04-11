
public class Circulo {

	private int radio;

	public Circulo(int radi) {
		this.radio = radi;
	}



	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double area(int radio) {
		final double PI=3.1416;
		return PI*(radio^2);
		
	}
	public double perimetro(int radio) {
		final double PI=3.1416;
		return 2*PI*radio;
		
	}

}
