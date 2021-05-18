package com.tmobile.tfb.feign;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "discovery-client-b", fallback = FallbackFactory.Default.class)
public interface ClientBFeign {
	
	@GetMapping("/do-b-stuff")
	ResponseEntity<String> doBStuff();

}
