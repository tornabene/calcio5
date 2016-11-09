package com.infogroup.rest.mandati.rest;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.infogroup.rest.mandati.JSR310DateTimeSerializer;
import com.infogroup.rest.mandati.JSR310LocalDateTimeDeserializer;

import io.swagger.annotations.ApiModelProperty;

public   class  MandatoModificaAutorizzato extends MandatoModifica {

	
	@ApiModelProperty(required=true)
	private String tipoCodiceIndividuale; 

	@ApiModelProperty(required=true)
	@JsonSerialize(using=JSR310DateTimeSerializer.class)
	@JsonDeserialize(using=JSR310LocalDateTimeDeserializer.class)
	private LocalDateTime dataRichiestaRevoca;
	
	@ApiModelProperty(required=true)
	@JsonSerialize(using=JSR310DateTimeSerializer.class)
	@JsonDeserialize(using=JSR310LocalDateTimeDeserializer.class)
	private LocalDateTime dataMandato;
	
	private String numeroProtocollo;
	
	@ApiModelProperty(required=true)
	private String ibanContoCorrenteAddebitare;

	public String getTipoCodiceIndividuale() {
		return tipoCodiceIndividuale;
	}

	public void setTipoCodiceIndividuale(String tipoCodiceIndividuale) {
		this.tipoCodiceIndividuale = tipoCodiceIndividuale;
	}

	public LocalDateTime getDataRichiestaRevoca() {
		return dataRichiestaRevoca;
	}

	public void setDataRichiestaRevoca(LocalDateTime dataRichiestaRevoca) {
		this.dataRichiestaRevoca = dataRichiestaRevoca;
	}

	public LocalDateTime getDataMandato() {
		return dataMandato;
	}

	public void setDataMandato(LocalDateTime dataMandato) {
		this.dataMandato = dataMandato;
	}

	public String getNumeroProtocollo() {
		return numeroProtocollo;
	}

	public void setNumeroProtocollo(String numeroProtocollo) {
		this.numeroProtocollo = numeroProtocollo;
	}

	public String getIbanContoCorrenteAddebitare() {
		return ibanContoCorrenteAddebitare;
	}

	public void setIbanContoCorrenteAddebitare(String ibanContoCorrenteAddebitare) {
		this.ibanContoCorrenteAddebitare = ibanContoCorrenteAddebitare;
	}

	
	
	
}
