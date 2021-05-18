package com.tmobile.tfb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmobile.tfb.feign.ClientBFeign;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ClientAController {
	
	@Autowired
	ClientBFeign feignClient;
	
	@GetMapping("/do-a-stuff")
	public ResponseEntity<String> doAStuff() {
		log.info("Doing A's stuff...");
		return ResponseEntity.ok("Success from A");
	}
	
	@GetMapping("/test-b-feign")
	public ResponseEntity<String> testFeign() {
		return feignClient.doBStuff();
	}
	
}
