package ar.edu.unlam.pb2.eva03;

import java.util.Set;
import java.util.TreeSet;

public class PolizaAccidentesPersonales extends SegurosDeVida implements Ivida {
	private Set<Beneficiario>beneficiarios;

	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,
			Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.beneficiarios=new TreeSet<Beneficiario>();
	}

	
	
	public Set<Beneficiario> getBeneficiario() {
		return beneficiarios;
	}

	public void setBeneficiario(Set<Beneficiario> beneficiario) {
		this.beneficiarios = beneficiario;
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
