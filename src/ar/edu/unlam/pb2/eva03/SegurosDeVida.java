package ar.edu.unlam.pb2.eva03;

import java.util.Set;
import java.util.TreeSet;

public class SegurosDeVida extends SegurosGenerales {
	private Set<Beneficiario>beneficiarios;
	public SegurosDeVida(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima, Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.beneficiarios=new TreeSet<Beneficiario>();
	}
	public Set<Beneficiario> getBeneficiario() {
		return beneficiarios;
	}

	public void setBeneficiario(Set<Beneficiario> beneficiario) {
		this.beneficiarios = beneficiario;
	}

}
