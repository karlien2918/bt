package com.search.index;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@Slf4j
@RestController
@RequiredArgsConstructor
public class IndexController {

	@GetMapping("/")
	public ResponseEntity<String> get(){
		log.info("IndexController.get()");
		return ResponseEntity.ok("ok3");
	}
}
