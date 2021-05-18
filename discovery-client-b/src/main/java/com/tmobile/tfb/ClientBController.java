package com.tmobile.tfb;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ClientBController {
	
	@GetMapping("/do-b-stuff")
	public ResponseEntity<String> doBStuff() {
		log.info("Doing B's stuff...");
		return ResponseEntity.ok("Success from B");
	}

}
