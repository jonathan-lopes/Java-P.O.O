package pctFigurasGeometricas;

public class MainFiguras {

	public static void main(String[] args) {
		FiguraTriangulo triangulo = new  FiguraTriangulo();
		triangulo.setAltura(10);
		triangulo.setBase(28);
		triangulo.calcularArea(triangulo.getAltura(), triangulo.getBase());
		
		System.out.println("Calculo da area do Triangulo...");
		System.out.println("Altura: " + triangulo.getAltura());
		System.out.println("Base: " + triangulo.getBase());
		System.out.println("Area: " + triangulo.getArea());
		System.out.println();
		
		FiguraRetangulo retangulo= new  FiguraRetangulo();
		retangulo.setAltura(18);
		retangulo.setBase(28);
		retangulo.calcularArea(retangulo.getAltura(), retangulo.getBase());
		
		System.out.println("Calculo da area do Retangulo...");
		System.out.println("Altura: " + retangulo.getAltura());
		System.out.println("Base: " + retangulo.getBase());
		System.out.println("Area: " + retangulo.getArea());
		System.out.println();

	}

}
