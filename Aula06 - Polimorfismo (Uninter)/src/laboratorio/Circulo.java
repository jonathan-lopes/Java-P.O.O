package laboratorio;

public class Circulo extends FiguraGeometrica {
	public Circulo(double raio)
	{
		super(raio, 0);
	}
	
	@Override
	public double calculaArea()
	{
		return 2 * Math.PI * this.lado1;
	}
}
