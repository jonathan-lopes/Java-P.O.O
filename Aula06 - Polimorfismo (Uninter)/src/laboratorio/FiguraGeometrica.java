package laboratorio;

public class FiguraGeometrica {
	protected double lado1;
	protected double lado2;
	
	public FiguraGeometrica(double lado1, double lado2)
	{
		this.setLado1(lado1);
		this.setLado2(lado2);
	}
	
	public FiguraGeometrica()
	{
		this.setLado1(0);
		this.setLado2(0);
	}
	
	public double getLado1() {
		return this.lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public double getLado2() {
		return this.lado2;
	}
	
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public double calculaArea()
	{
		return this.lado1 * this.lado2;
	}
}
