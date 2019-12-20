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
	/* Prova hotfix */
/* Release 1.30 */
	@RequestMapping(value="/helloWorld", method = RequestMethod.GET)
	public ResponseEntity<String> gethelloWorld(){
		/* feat skip update version 2 */
		logger.info("Hello World");
		logger.info("logging");
		logger.info("logging2");
		logger.info("logging3");
		logger.info("logging rel");
		return ResponseEntity.ok().body("Hello World");
	}
	
	
}
