package ar.edu.unlam.pb2.eva03;

public class Beneficiario implements Comparable<Beneficiario> {
	Persona beneficiario;
	TipoDeBeneficiario tipo;
	
	public Beneficiario(Persona beneficiario, TipoDeBeneficiario tipo) {
		this.beneficiario = beneficiario;
		this.tipo = tipo;
	}
	
	public Persona getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(Persona beneficiario) {
		this.beneficiario = beneficiario;
	}
	public TipoDeBeneficiario getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeBeneficiario tipo) {
		this.tipo = tipo;
	}

	@Override
	public int compareTo(Beneficiario o) {
		return this.getBeneficiario().getDni().compareTo(o.getBeneficiario().getDni());
	}
	
	

}
