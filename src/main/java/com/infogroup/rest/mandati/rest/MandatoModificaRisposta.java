package com.infogroup.rest.mandati.rest;

public class MandatoModificaRisposta extends MandatoModifica {

	private Esito esito;
	private String stato;
	private String messaggio;
	
	 

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


}
