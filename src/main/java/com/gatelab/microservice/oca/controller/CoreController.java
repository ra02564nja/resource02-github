package com.gatelab.microservice.oca.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.gatelab.microservice.oca.client.bond.BondProxy;

@RestController
public class CoreController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
		
	@Autowired
	private BondProxy bondProxy;
	
	@RequestMapping(value="/getBond", method = RequestMethod.POST)
	public ResponseEntity<String> getCoreString(@RequestBody Long idRiga){
		logger.info("Acquisizione della stringa da Core a Gateway...");
		return bondProxy.readBondString(idRiga);
	}
	/* FIX conflitto */
	/* Gestione conflitto */
	/* Sviluppo su svia */
	/* Altro Sviluppo su svia */
	/* Prova hotfix 5.3.2 */
	@RequestMapping(value="/helloWorld", method = RequestMethod.GET)
	public ResponseEntity<String> gethelloWorld(){
		logger.info("Hello World");
		logger.info("logging v5.5.0 release");
		return ResponseEntity.ok().body("Hello World");
	}
	
	
}
