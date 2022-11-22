package ar.edu.unlam.pb2.eva03;


public class PolizaAccidentesPersonales extends SegurosDeVida implements Ivida {

	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,
			Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
	}



	@Override
	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipo) {
		Beneficiario beneficiario=new Beneficiario(persona,tipo);
		this.getBeneficiario().add(beneficiario);
		
	}



	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return this.getBeneficiario().size();
	}
	

}
