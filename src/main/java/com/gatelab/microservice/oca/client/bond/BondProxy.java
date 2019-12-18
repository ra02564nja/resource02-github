package com.gatelab.microservice.oca.client.bond;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient(name="pk-bond", url="${pk-bond.url}")
public interface BondProxy {

	@RequestMapping(value="/readBond", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> readBondString(@RequestBody Long idRow);
	
}
