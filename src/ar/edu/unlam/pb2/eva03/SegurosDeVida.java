package ar.edu.unlam.pb2.eva03;

import java.util.Set;
import java.util.TreeSet;

public class SegurosDeVida extends SegurosGenerales {
	private Set<Beneficiario>beneficiarios;
	private Boolean tuvoAlgunAccidente;
	public SegurosDeVida(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima, Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.beneficiarios=new TreeSet<Beneficiario>();
		this.tuvoAlgunAccidente=false;
	}
	
	
	
	public Set<Beneficiario> getBeneficiario() {
		return beneficiarios;
	}

	public void setBeneficiario(Set<Beneficiario> beneficiario) {
		this.beneficiarios = beneficiario;
	}



	public Boolean getTuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}



	public void setTuvoAlgunAccidente(Boolean tuvoAlgunAccidente) {
		this.tuvoAlgunAccidente = tuvoAlgunAccidente;
	}

}
