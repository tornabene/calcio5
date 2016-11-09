package com.infogroup.rest.mandati.rest;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.infogroup.rest.mandati.JSR310DateTimeSerializer;
import com.infogroup.rest.mandati.JSR310LocalDateTimeDeserializer;

import io.swagger.annotations.ApiModelProperty;

public   class  MandatoModificaNonAutorizzato extends MandatoModifica{

	@ApiModelProperty(required=true )
	private String causaleRevoca;
	
	
	@ApiModelProperty(required=true )
	private String messaggio;
	
	@ApiModelProperty(required=true)
	@JsonSerialize(using=JSR310DateTimeSerializer.class)
	@JsonDeserialize(using=JSR310LocalDateTimeDeserializer.class)
	private LocalDateTime dataRevoca;
	
	
	private Boolean inziativaBanca;
	
	@ApiModelProperty(required=true,allowableValues="1,2",notes="1 iniziativa Regione Lombardia, 2 iniziativa Regione Lombardia su richiesta del cliente" )
	private String tipoRevoca;

	public String getCausaleRevoca() {
		return causaleRevoca;
	}

	public void setCausaleRevoca(String causaleRevoca) {
		this.causaleRevoca = causaleRevoca;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public LocalDateTime getDataRevoca() {
		return dataRevoca;
	}

	public void setDataRevoca(LocalDateTime dataRevoca) {
		this.dataRevoca = dataRevoca;
	}

	public Boolean getInziativaBanca() {
		return inziativaBanca;
	}

	public void setInziativaBanca(Boolean inziativaBanca) {
		this.inziativaBanca = inziativaBanca;
	}

	public String getTipoRevoca() {
		return tipoRevoca;
	}

	public void setTipoRevoca(String tipoRevoca) {
		this.tipoRevoca = tipoRevoca;
	}
	
	
	
	
}
