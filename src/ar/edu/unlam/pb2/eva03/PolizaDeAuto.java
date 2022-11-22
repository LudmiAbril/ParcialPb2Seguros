package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends SegurosGenerales implements Ibienes {
	private Auto auto;
	private Boolean fueRobado;

	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima,premio);
	this.fueRobado=false;
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

	public Boolean getFueRobado() {
		return fueRobado;
	}

	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}
	

	
	


}
