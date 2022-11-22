package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends SegurosGenerales implements Ibienes {
	private Auto auto;

	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima,premio);
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	@Override
	public void agregarBienAsegurado(Object bien) {
		this.auto=(Auto) bien;
		
	}

	
	


}
