package com.tharun.monopoly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tharun.monopoly.service.GameService;



@RestController
@RequestMapping("/")
public class GameController {
	
	@Autowired
	GameService service;
	

	@GetMapping("create-game/")
	public String loadData() {
		service.load();
		PlayerController.setP1StartAmount(1000);
		PlayerController.setP2StartAmount(1000);
		return "success";
	}

	
}
