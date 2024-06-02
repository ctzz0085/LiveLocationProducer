package com.liveLocation.controller;

import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.KafkaService;

@RestController
@RequestMapping("/livelocation")
public class LiveLocationController {

	@Autowired
	private KafkaService kafkaService;
	
	
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){
		this.kafkaService.updateLocation("(Longitude "+Math.round(Math.random()*100)+",Latitude"+Math.round(Math.random()*100)
		+")");
		System.out.println("Location produced");
		return new ResponseEntity<>(Map.of("message","Live Location Updated"),HttpStatus.OK);
		
	}
	
	
	
}
