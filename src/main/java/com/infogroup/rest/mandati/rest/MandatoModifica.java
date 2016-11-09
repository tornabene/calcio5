package com.infogroup.rest.mandati.rest;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.infogroup.rest.mandati.JSR310DateTimeSerializer;
import com.infogroup.rest.mandati.JSR310LocalDateTimeDeserializer;

import io.swagger.annotations.ApiModelProperty;

public abstract class  MandatoModifica implements Serializable {
	
	@ApiModelProperty(required=true)
	private String riferimentoMandato; //contiene la targa
	
	@ApiModelProperty(required=true,notes="Codice Ambito Mittente")
	private String codiceAmbitoMittente;
	
	@ApiModelProperty(required=true,notes="Codice ABI Banca Allineamento Ricevente")
	private String codiceAbiBancaAllineamentoRicevente;
	
	
	@ApiModelProperty(required=true,notes="Codice Sia Regione Lombardia")
	private String codiceSiaAzienda;
	
	@ApiModelProperty(required=true)
	private String codiceFiscaleDebitore; 
	
	@ApiModelProperty(required=true)
	@JsonSerialize(using=JSR310DateTimeSerializer.class)
	@JsonDeserialize(using=JSR310LocalDateTimeDeserializer.class)
	private LocalDateTime dataRichiestaModifica;

	public String getRiferimentoMandato() {
		return riferimentoMandato;
	}

	public void setRiferimentoMandato(String riferimentoMandato) {
		this.riferimentoMandato = riferimentoMandato;
	}

	public String getCodiceAmbitoMittente() {
		return codiceAmbitoMittente;
	}

	public void setCodiceAmbitoMittente(String codiceAmbitoMittente) {
		this.codiceAmbitoMittente = codiceAmbitoMittente;
	}

	public String getCodiceAbiBancaAllineamentoRicevente() {
		return codiceAbiBancaAllineamentoRicevente;
	}

	public void setCodiceAbiBancaAllineamentoRicevente(String codiceAbiBancaAllineamentoRicevente) {
		this.codiceAbiBancaAllineamentoRicevente = codiceAbiBancaAllineamentoRicevente;
	}

	public String getCodiceSiaAzienda() {
		return codiceSiaAzienda;
	}

	public void setCodiceSiaAzienda(String codiceSiaAzienda) {
		this.codiceSiaAzienda = codiceSiaAzienda;
	}

	public String getCodiceFiscaleDebitore() {
		return codiceFiscaleDebitore;
	}

	public void setCodiceFiscaleDebitore(String codiceFiscaleDebitore) {
		this.codiceFiscaleDebitore = codiceFiscaleDebitore;
	}

	public LocalDateTime getDataRichiestaModifica() {
		return dataRichiestaModifica;
	}

	public void setDataRichiestaModifica(LocalDateTime dataRichiestaModifica) {
		this.dataRichiestaModifica = dataRichiestaModifica;
	}
	
	
			
}
