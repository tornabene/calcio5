package com.infogroup.rest.mandati.rest;

import java.io.Serializable;

public class Posizione implements Serializable {

	private String riferimentoMandato;
	private Integer annoDecorrenza;
	private Integer meseDecorrenza;
	private String datiOperatore;
	private Double importoDaPagare;
	
	
	public Double getImportoDaPagare() {
		return importoDaPagare;
	}
	public void setImportoDaPagare(Double importoDaPagare) {
		this.importoDaPagare = importoDaPagare;
	}
	public String getRiferimentoMandato() {
		return riferimentoMandato;
	}
	public void setRiferimentoMandato(String riferimentoMandato) {
		this.riferimentoMandato = riferimentoMandato;
	}
	public String getDatiOperatore() {
		return datiOperatore;
	}
	public void setDatiOperatore(String datiOperatore) {
		this.datiOperatore = datiOperatore;
	}
	public Integer getAnnoDecorrenza() {
		return annoDecorrenza;
	}
	public void setAnnoDecorrenza(Integer annoDecorrenza) {
		this.annoDecorrenza = annoDecorrenza;
	}
	public Integer getMeseDecorrenza() {
		return meseDecorrenza;
	}
	public void setMeseDecorrenza(Integer meseDecorrenza) {
		this.meseDecorrenza = meseDecorrenza;
	}
	
	
}
