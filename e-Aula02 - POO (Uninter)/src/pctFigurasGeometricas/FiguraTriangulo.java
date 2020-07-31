package pctFigurasGeometricas;

public class FiguraTriangulo extends FiguraGenerica {

	@Override
	public float calcularArea(float base, float altura) {
		area = (base * altura) / 2;
		return area;
	}

}
