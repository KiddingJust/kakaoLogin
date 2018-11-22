package org.gorany.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import lombok.extern.java.Log;

@Controller
@Log
public class HomeController {

	
	@GetMapping("/login")
	public void login() {
		log.info("login");
	}
	

}
