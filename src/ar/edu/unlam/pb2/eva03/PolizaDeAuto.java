package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends SegurosGenerales {
	private Auto bienAsegurado;

	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima,premio);
	}

	public Auto getAuto() {
		return bienAsegurado;
	}

	public void agregarBienAsegurado(Auto bienAsegurado) {
		this.bienAsegurado = bienAsegurado;
	}


}
