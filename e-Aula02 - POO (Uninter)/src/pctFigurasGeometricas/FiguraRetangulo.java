package pctFigurasGeometricas;

public class FiguraRetangulo extends FiguraGenerica {

	@Override
	public float calcularArea(float base, float altura) {
		area = (base * altura);
		return area;
	}

}
