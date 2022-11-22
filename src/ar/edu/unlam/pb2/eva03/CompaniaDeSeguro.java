package ar.edu.unlam.pb2.eva03;

import java.util.Set;
import java.util.TreeSet;

public class CompaniaDeSeguro {
	private String nombre;
	private Set<SegurosGenerales>polizasEmitidas;
	
	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		this.polizasEmitidas = new TreeSet<SegurosGenerales>();
	}
	
	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return this.polizasEmitidas.size();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<SegurosGenerales> getPolizasEmitidas() {
		return polizasEmitidas;
	}
	public void setPolizasEmitidas(Set<SegurosGenerales> polizasEmitidas) {
		this.polizasEmitidas = polizasEmitidas;
	}
	
public void agregarPoliza(SegurosGenerales poliza) {
	this.polizasEmitidas.add(poliza);
}
}
