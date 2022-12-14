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

public void denunciarSiniestro(Integer numPoliza) throws PolizaInexistenteException {
	SegurosGenerales poliza=getPoliza(numPoliza);
	if(poliza instanceof PolizaDeAuto) {
		((PolizaDeAuto) poliza).setFueRobado(true);
	}
	if(poliza instanceof PolizaAccidentesPersonales) {
		((PolizaAccidentesPersonales) poliza).setTuvoAlgunAccidente(true);
	}
	if(poliza instanceof PolizaCombinadoFamiliar) {
		((PolizaCombinadoFamiliar) poliza).setFueRobado(true);
		((PolizaCombinadoFamiliar) poliza).setTuvoAlgunAccidente(true);
	}
	
}

public SegurosGenerales getPoliza(Integer numPoliza) throws PolizaInexistenteException {
	for(SegurosGenerales p :this.polizasEmitidas) {
		if(p.getNumeroDePoliza().equals(numPoliza)) {
			return p;
		}
	} throw new PolizaInexistenteException();
}
}
