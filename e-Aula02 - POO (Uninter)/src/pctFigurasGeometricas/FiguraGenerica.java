package pctFigurasGeometricas;

public abstract class FiguraGenerica {
	protected float base;
	protected float altura;
	protected float area;
		
	public FiguraGenerica() {}

	public FiguraGenerica(float b, float a) {
		this.base = b;
		this.altura = a;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	public abstract float calcularArea(float base, float altura);
	
	
}
