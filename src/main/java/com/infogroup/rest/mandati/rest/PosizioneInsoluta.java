package com.infogroup.rest.mandati.rest;

import java.io.Serializable;

public class PosizioneInsoluta implements Serializable {

	private String riferimentoMandato;
	private Integer annoDecorrenza;
	private Integer meseDecorrenza;
	private String datiOperatore;
	
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
