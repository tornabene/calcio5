package com.infogroup.rest.mandati.rest;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.infogroup.rest.mandati.JSR310DateTimeSerializer;

public class MandatoRisposta extends Mandato {

	private Esito esito;
	private String stato;

	private String messaggio;
	@JsonSerialize(using=JSR310DateTimeSerializer.class)
	private LocalDateTime dataAutorizzazioneMandato;
	
	@JsonSerialize(using=JSR310DateTimeSerializer.class)
	private LocalDateTime dataMandato;
	
	 
	public LocalDateTime getDataMandato() {
		return dataMandato;
	}

	public void setDataMandato(LocalDateTime dataMandato) {
		this.dataMandato = dataMandato;
	}

	public Esito getEsito() {
		return esito;
	}

	public void setEsito(Esito esito) {
		this.esito = esito;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public LocalDateTime getDataAutorizzazioneMandato() {
		return dataAutorizzazioneMandato;
	}

	public void setDataAutorizzazioneMandato(LocalDateTime dataAutorizzazioneMandato) {
		this.dataAutorizzazioneMandato = dataAutorizzazioneMandato;
	}


}
