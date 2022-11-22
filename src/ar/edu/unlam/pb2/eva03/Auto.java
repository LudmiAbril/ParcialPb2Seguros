package ar.edu.unlam.pb2.eva03;

public class Auto {
	private String marca;
	private String linea;
	private Integer anio;
	private Double sumaAsegurada;
	
	public Auto(String marca, String linea, Integer anio, Double sumaAsegurada) {
		this.marca = marca;
		this.linea = linea;
		this.anio = anio;
		this.sumaAsegurada = sumaAsegurada;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	
}
