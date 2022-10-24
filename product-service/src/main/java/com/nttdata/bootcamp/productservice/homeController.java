package com.nttdata.bootcamp.productservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

	@Value("${server.port}")
	private String port;
	
	@GetMapping("/port")
	public String saludo() {
		
		return "El puerto del micro es el 8080"+ port;
		
	}

}
