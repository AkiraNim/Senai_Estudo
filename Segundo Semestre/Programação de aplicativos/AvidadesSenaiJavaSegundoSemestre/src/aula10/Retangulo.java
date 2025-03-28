package aula10;

public class Retangulo implements ObjetoGeometrico{
	private double base ;
	private double altura;
	
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base*altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2*base+2*altura;
	}

}
