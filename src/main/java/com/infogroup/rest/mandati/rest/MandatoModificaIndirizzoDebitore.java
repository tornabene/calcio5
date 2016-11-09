package com.infogroup.rest.mandati.rest;

import io.swagger.annotations.ApiModelProperty;

public class MandatoModificaIndirizzoDebitore extends MandatoModificaAutorizzato {

 

	@ApiModelProperty(required = true)
	private String indirisso;
	
	@ApiModelProperty(required = true)
	private String provincia;
	
	@ApiModelProperty(required = true)
	private String comune;
	
	@ApiModelProperty(required = true)
	private String siglaCodiceAmbito;

	public String getIndirisso() {
		return indirisso;
	}

	public void setIndirisso(String indirisso) {
		this.indirisso = indirisso;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getSiglaCodiceAmbito() {
		return siglaCodiceAmbito;
	}

	public void setSiglaCodiceAmbito(String siglaCodiceAmbito) {
		this.siglaCodiceAmbito = siglaCodiceAmbito;
	}
	
		
}
