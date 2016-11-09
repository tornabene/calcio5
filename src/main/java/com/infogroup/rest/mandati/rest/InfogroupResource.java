package com.infogroup.rest.mandati.rest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/infogroup/")
public class InfogroupResource  {

	 
	@RequestMapping(value = "/mandato/aderisci", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MandatoRisposta>> aderisciMandati(@RequestBody List<Mandato> mandati) {

		List<MandatoRisposta> risposta = new ArrayList<>();
		for (Mandato mandato : mandati) {
			MandatoRisposta target = new MandatoRisposta();
			BeanUtils.copyProperties(mandato, target);
			target.setStato("RICEVUTO");
			target.setEsito(Esito.SUCCESS);
			target.setDataMandato(LocalDateTime.now());
			risposta.add(target);
			
		}
		return new ResponseEntity<>(risposta, HttpStatus.OK);
	}

	@RequestMapping(value = "/mandato/revoca", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MandatoRevocaRisposta>> revocaMandati(@RequestBody List<MandatoRevoca> mandati) {

		List<MandatoRevocaRisposta> risposta = new ArrayList<>();
		for (MandatoRevoca mandato : mandati) {
			MandatoRevocaRisposta target = new MandatoRevocaRisposta();
			BeanUtils.copyProperties(mandato, target);
			target.setStato("REVOCATO");
			target.setEsito(Esito.SUCCESS);
			risposta.add(target);
		}
		return new ResponseEntity<>(risposta, HttpStatus.OK);
	}

 
	
	@RequestMapping(value = "/mandato/modificaMandatiIndirizzoDebitore", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MandatoModificaRisposta>> modificaMandatiIndirizzoDebitore(@RequestBody List<MandatoModificaIndirizzoDebitore> mandati) {

		List<MandatoModificaRisposta> risposta = new ArrayList<>();
		for (MandatoModificaIndirizzoDebitore mandato : mandati) {
			MandatoModificaRisposta target = new MandatoModificaRisposta();
			BeanUtils.copyProperties(mandato, target);
			target.setStato("MODIFICATO");
			target.setEsito(Esito.SUCCESS);
			risposta.add(target);
		}
		return new ResponseEntity<>(risposta, HttpStatus.OK);
	}
	
	

	
	@RequestMapping(value = "/mandato/modificaMandatiTitolareConto", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MandatoModificaRisposta>> modificaMandatiTitolareConto(@RequestBody List<MandatoModificaTitolareConto> mandati) {

		List<MandatoModificaRisposta> risposta = new ArrayList<>();
		for (MandatoModificaTitolareConto mandato : mandati) {
			MandatoModificaRisposta target = new MandatoModificaRisposta();
			BeanUtils.copyProperties(mandato, target);
			target.setStato("MODIFICATO");
			target.setEsito(Esito.SUCCESS);
			risposta.add(target);
		}
		return new ResponseEntity<>(risposta, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/mandato/modificaMandatiAutorizzato", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MandatoModificaRisposta>> modificaMandatiAutorizzato(@RequestBody List<MandatoModificaAutorizzato> mandati) {

		List<MandatoModificaRisposta> risposta = new ArrayList<>();
		for (MandatoModificaAutorizzato mandato : mandati) {
			MandatoModificaRisposta target = new MandatoModificaRisposta();
			BeanUtils.copyProperties(mandato, target);
			target.setStato("MODIFICATO");
			target.setEsito(Esito.SUCCESS);
			risposta.add(target);
		}
		return new ResponseEntity<>(risposta, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/mandato/modificaMandatiNonAutorizzato", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MandatoModificaRisposta>> modificaMandatiNonAutorizzato(@RequestBody List<MandatoModificaNonAutorizzato> mandati) {

		List<MandatoModificaRisposta> risposta = new ArrayList<>();
		for (MandatoModificaNonAutorizzato mandato : mandati) {
			MandatoModificaRisposta target = new MandatoModificaRisposta();
			BeanUtils.copyProperties(mandato, target);
			target.setStato("MODIFICATO");
			target.setEsito(Esito.SUCCESS);
			risposta.add(target);
		}
		return new ResponseEntity<>(risposta, HttpStatus.OK);
	}

	@RequestMapping(value = "/posisione/trasmissionePosizioneScadenzaMensile", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PosizioneRisposta>> trasmissionePosizioneScadenzaMensile(
			@RequestBody List<Posizione> posizione) {
		List<PosizioneRisposta> risposta = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			PosizioneRisposta target = new PosizioneRisposta();
			target.setStato("RICEVUTO");
			target.setEsito(Esito.SUCCESS);
			risposta.add(target);
		}
		return new ResponseEntity<>(risposta, HttpStatus.OK);
	}

	@RequestMapping(value = "/posisione/listaPosizioniPagateGiornaliero", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Posizione>> listaPosizioniPagateGiornaliero(LocalDate dataGiorno) {
		List<Posizione> risposta = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			PosizioneRisposta target = new PosizioneRisposta();
			target.setStato("PAGATO");
			target.setEsito(Esito.SUCCESS);
			risposta.add(target);
		}
		return new ResponseEntity<>(risposta, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/posisione/listaPosizioniInsolute", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Posizione>> listaPosizioniInsolute(LocalDate dataGiorno) {
		List<Posizione> risposta = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			PosizioneRisposta target = new PosizioneRisposta();
			target.setStato("INSOLUTA");
			target.setEsito(Esito.SUCCESS);
			risposta.add(target);
		}
		return new ResponseEntity<>(risposta, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/posisione/listaStatiMandati", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MandatoRisposta>> listaStatiMandati(LocalDate dataGiorno) {
		List<MandatoRisposta> risposta = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			MandatoRisposta target = new MandatoRisposta();
			target.setStato("APPROVATI");
			target.setEsito(Esito.SUCCESS);
			risposta.add(target);
		}
		return new ResponseEntity<>(risposta, HttpStatus.OK);
	}
	
	
}
