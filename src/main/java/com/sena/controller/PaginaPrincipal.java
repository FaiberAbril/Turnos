package com.sena.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Paginaprincipal")
public class PaginaPrincipal {

	@GetMapping("/")
	public String Paginaprincipal() {
		return "index";
	}
}
