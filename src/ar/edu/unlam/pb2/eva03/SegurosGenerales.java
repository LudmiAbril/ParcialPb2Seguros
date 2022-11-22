package ar.edu.unlam.pb2.eva03;

public class SegurosGenerales {
	protected Integer numeroDePoliza;
	protected Persona asegurado;
	protected Double sumaAsegurada;
	protected Double prima;
	protected Double premio;
	
	public SegurosGenerales(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,Double premio) {
		this.numeroDePoliza = numeroDePoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.premio=premio;
	}
	
	public Double getPremio() {
		return premio;
	}
	public void setPremio(Double premio) {
		this.premio = premio;
	}

	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}
	public void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}
	public Persona getAsegurado() {
		return asegurado;
	}
	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}
	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	public Double getPrima() {
		return prima;
	}
	public void setPrima(Double prima) {
		this.prima = prima;
	}

}
