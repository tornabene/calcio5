package com.infogroup.rest.mandati.rest;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.infogroup.rest.mandati.JSR310DateTimeSerializer;
import com.infogroup.rest.mandati.JSR310LocalDateTimeDeserializer;

import io.swagger.annotations.ApiModelProperty;

public class  Mandato implements Serializable {
	
	@ApiModelProperty(required=true)
	private String riferimentoMandato; //contiene la targa
	
	//CITTADINO
	@ApiModelProperty(required=true)
	private String cognomeRagioneSocialeDebitore;
	@ApiModelProperty(required=true)
	private String codiceFiscaleDebitore;
	@ApiModelProperty(required=true)
	private String indirizzoDebitore;
	private String numeroCivicoDebitore;
	private String capDebitore;
	private String localitaDebitore;
	private String provinciaDebitore;

	@ApiModelProperty(required=true)
	private String ibanDebitore;
	private String cellulareDebitore;
	
	//REGIONE LOMBARDIA
	@ApiModelProperty(required=true)
	private String cognomeRagioneSocialeCreditore;
	@ApiModelProperty(required=true)
	private String codiceIdentificativoCreditore;
	
	@ApiModelProperty(required=true)
	private String sedeLegaleCreditore;
	
	@ApiModelProperty(required=true)
	private String numeroCivicoCreditore;
	
	@ApiModelProperty(required=true)
	private String capCreditore;
	
	@ApiModelProperty(required=true)
	private String localitaCreditore;
	
	@ApiModelProperty(required=true)
	private String provinciaCreditore;

	@ApiModelProperty(required=true)
	private String paeseCreditore;

	
	@JsonSerialize(using=JSR310DateTimeSerializer.class)
	@JsonDeserialize(using=JSR310LocalDateTimeDeserializer.class)
	private LocalDateTime dataSottoscrizione;
	private String  luogoSottoscrizione;
	
	@ApiModelProperty(required=true)
	private String  datiOperatore;
	
	public String getPaeseCreditore() {
		return paeseCreditore;
	}
	public void setPaeseCreditore(String paeseCreditore) {
		this.paeseCreditore = paeseCreditore;
	}
	public String getRiferimentoMandato() {
		return riferimentoMandato;
	}
	public void setRiferimentoMandato(String riferimentoMandato) {
		this.riferimentoMandato = riferimentoMandato;
	}
	public String getCognomeRagioneSocialeDebitore() {
		return cognomeRagioneSocialeDebitore;
	}
	public void setCognomeRagioneSocialeDebitore(String cognomeRagioneSocialeDebitore) {
		this.cognomeRagioneSocialeDebitore = cognomeRagioneSocialeDebitore;
	}
	public String getCodiceFiscaleDebitore() {
		return codiceFiscaleDebitore;
	}
	public void setCodiceFiscaleDebitore(String codiceFiscaleDebitore) {
		this.codiceFiscaleDebitore = codiceFiscaleDebitore;
	}
	public String getIndirizzoDebitore() {
		return indirizzoDebitore;
	}
	public void setIndirizzoDebitore(String indirizzoDebitore) {
		this.indirizzoDebitore = indirizzoDebitore;
	}
	public String getNumeroCivicoDebitore() {
		return numeroCivicoDebitore;
	}
	public void setNumeroCivicoDebitore(String numeroCivicoDebitore) {
		this.numeroCivicoDebitore = numeroCivicoDebitore;
	}
	public String getCapDebitore() {
		return capDebitore;
	}
	public void setCapDebitore(String capDebitore) {
		this.capDebitore = capDebitore;
	}
	public String getLocalitaDebitore() {
		return localitaDebitore;
	}
	public void setLocalitaDebitore(String localitaDebitore) {
		this.localitaDebitore = localitaDebitore;
	}
	public String getProvinciaDebitore() {
		return provinciaDebitore;
	}
	public void setProvinciaDebitore(String provinciaDebitore) {
		this.provinciaDebitore = provinciaDebitore;
	}
	public String getIbanDebitore() {
		return ibanDebitore;
	}
	public void setIbanDebitore(String ibanDebitore) {
		this.ibanDebitore = ibanDebitore;
	}
	public String getCellulareDebitore() {
		return cellulareDebitore;
	}
	public void setCellulareDebitore(String cellulareDebitore) {
		this.cellulareDebitore = cellulareDebitore;
	}
	public String getCognomeRagioneSocialeCreditore() {
		return cognomeRagioneSocialeCreditore;
	}
	public void setCognomeRagioneSocialeCreditore(String cognomeRagioneSocialeCreditore) {
		this.cognomeRagioneSocialeCreditore = cognomeRagioneSocialeCreditore;
	}
	public String getCodiceIdentificativoCreditore() {
		return codiceIdentificativoCreditore;
	}
	public void setCodiceIdentificativoCreditore(String codiceIdentificativoCreditore) {
		this.codiceIdentificativoCreditore = codiceIdentificativoCreditore;
	}
	public String getSedeLegaleCreditore() {
		return sedeLegaleCreditore;
	}
	public void setSedeLegaleCreditore(String sedeLegaleCreditore) {
		this.sedeLegaleCreditore = sedeLegaleCreditore;
	}
	public String getNumeroCivicoCreditore() {
		return numeroCivicoCreditore;
	}
	public void setNumeroCivicoCreditore(String numeroCivicoCreditore) {
		this.numeroCivicoCreditore = numeroCivicoCreditore;
	}
	public String getCapCreditore() {
		return capCreditore;
	}
	public void setCapCreditore(String capCreditore) {
		this.capCreditore = capCreditore;
	}
	public String getLocalitaCreditore() {
		return localitaCreditore;
	}
	public void setLocalitaCreditore(String localitaCreditore) {
		this.localitaCreditore = localitaCreditore;
	}
	public String getProvinciaCreditore() {
		return provinciaCreditore;
	}
	public void setProvinciaCreditore(String provinciaCreditore) {
		this.provinciaCreditore = provinciaCreditore;
	}
	public LocalDateTime getDataSottoscrizione() {
		return dataSottoscrizione;
	}
	public void setDataSottoscrizione(LocalDateTime dataSottoscrizione) {
		this.dataSottoscrizione = dataSottoscrizione;
	}
	public String getLuogoSottoscrizione() {
		return luogoSottoscrizione;
	}
	public void setLuogoSottoscrizione(String luogoSottoscrizione) {
		this.luogoSottoscrizione = luogoSottoscrizione;
	}
	public String getDatiOperatore() {
		return datiOperatore;
	}
	public void setDatiOperatore(String datiOperatore) {
		this.datiOperatore = datiOperatore;
	}
	
			
}
