package com.infogroup.rest.mandati.rest;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.infogroup.rest.mandati.JSR310DateTimeSerializer;
import com.infogroup.rest.mandati.JSR310LocalDateTimeDeserializer;

import io.swagger.annotations.ApiModelProperty;

public class MandatoModificaTitolareConto extends MandatoModificaAutorizzato {

	@ApiModelProperty(required = true)
	private String debitore;

	@ApiModelProperty(required = true)
	private String codiceFiscaleTitolareConto;

	@ApiModelProperty(required = true)
	private String titolareConto;

	@ApiModelProperty(required = true)
	@JsonSerialize(using=JSR310DateTimeSerializer.class)
	@JsonDeserialize(using=JSR310LocalDateTimeDeserializer.class)
	private LocalDateTime dataRevoca;

	@ApiModelProperty(required = true,notes="Numero Protocollo del riquadro in altro a destra")
	private String numeroProtocollo;
	
	@ApiModelProperty(required = true)
	@JsonSerialize(using=JSR310DateTimeSerializer.class)
	@JsonDeserialize(using=JSR310LocalDateTimeDeserializer.class)
	private LocalDateTime dataProtocollo;

	@ApiModelProperty(required = true,notes="Telefono Inserito nel mandato")
	private String telefonoMandato;	
	
	
	@ApiModelProperty(required = true,notes="Mail Inserita nel mandato")
	private String emailMandato;	
	
	public String getNumeroProtocollo() {
		return numeroProtocollo;
	}

	public void setNumeroProtocollo(String numeroProtocollo) {
		this.numeroProtocollo = numeroProtocollo;
	}

	public LocalDateTime getDataProtocollo() {
		return dataProtocollo;
	}

	public void setDataProtocollo(LocalDateTime dataProtocollo) {
		this.dataProtocollo = dataProtocollo;
	}

	public String getTelefonoMandato() {
		return telefonoMandato;
	}

	public void setTelefonoMandato(String telefonoMandato) {
		this.telefonoMandato = telefonoMandato;
	}

	public String getEmailMandato() {
		return emailMandato;
	}

	public void setEmailMandato(String emailMandato) {
		this.emailMandato = emailMandato;
	}

	public String getDebitore() {
		return debitore;
	}

	public void setDebitore(String debitore) {
		this.debitore = debitore;
	}

	public String getCodiceFiscaleTitolareConto() {
		return codiceFiscaleTitolareConto;
	}

	public void setCodiceFiscaleTitolareConto(String codiceFiscaleTitolareConto) {
		this.codiceFiscaleTitolareConto = codiceFiscaleTitolareConto;
	}

	public String getTitolareConto() {
		return titolareConto;
	}

	public void setTitolareConto(String titolareConto) {
		this.titolareConto = titolareConto;
	}

	public LocalDateTime getDataRevoca() {
		return dataRevoca;
	}

	public void setDataRevoca(LocalDateTime dataRevoca) {
		this.dataRevoca = dataRevoca;
	}

	
}
