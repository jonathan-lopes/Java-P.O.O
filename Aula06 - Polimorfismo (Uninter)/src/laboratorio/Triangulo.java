package laboratorio;

public class Triangulo extends FiguraGeometrica {
	public Triangulo(double base, double altura)
	{
		super(base, altura);
	}
	
	@Override
	public double calculaArea()
	{
		return this.lado1 * this.lado2 / 2;
	}
}
