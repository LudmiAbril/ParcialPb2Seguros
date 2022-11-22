package ar.edu.unlam.pb2.eva03;

import java.util.Set;
import java.util.TreeSet;

public class PolizaCombinadoFamiliar extends SegurosGenerales implements Ivida, Ibienes {
    private Vivienda casa;
    private Set<Beneficiario>beneficiarios;
    private Boolean tuvoAlgunAccidente;
    private Boolean fueRobado;
	
	
	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,
			Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.beneficiarios=new TreeSet<Beneficiario>();
		this.fueRobado=false;
		this.tuvoAlgunAccidente=false;
	}


	

	public Boolean getTuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}




	public void setTuvoAlgunAccidente(Boolean tuvoAlgunAccidente) {
		this.tuvoAlgunAccidente = tuvoAlgunAccidente;
	}




	public Boolean getFueRobado() {
		return fueRobado;
	}




	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}




	public Vivienda getCasa() {
		return casa;
	}



	public void setCasa(Vivienda casa) {
		this.casa = casa;
	}



	public Set<Beneficiario> getBeneficiarios() {
		return beneficiarios;
	}



	public void setBeneficiarios(Set<Beneficiario> beneficiarios) {
		this.beneficiarios = beneficiarios;
	}




	@Override
	public void agregarBienAsegurado(Object bien) {
		setCasa((Vivienda)bien);
		
	}




	@Override
	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipo) {
		Beneficiario beneficiario=new Beneficiario(persona,tipo);
		this.beneficiarios.add(beneficiario);
		
	}




	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return this.beneficiarios.size();
	}
	
	

}
