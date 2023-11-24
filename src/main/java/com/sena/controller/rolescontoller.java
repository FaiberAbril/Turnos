package com.sena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sena.Servicios.servicioRoles;
import com.sena.modelos.Roles;




public class rolescontoller {
	
	@Autowired
	private servicioRoles servicioRoles;
	
	@GetMapping("/indexroles")
	public String index(Model model) {
		model.addAttribute(" listaRoles", servicioRoles.listaRoles());
		return "indexroles";
	}
	
	@GetMapping("/FormularioRoles")
	public String crearRoles(Model model) {
		model.addAttribute("Roles", new Roles());
		return "FormularioRoles";
	}
	
	@PostMapping("/GuardarRoles")
	public String guardarRol(@ModelAttribute("Roles") Roles nuevoRol) {
		servicioRoles.crearRoles(nuevoRol);
		return "redirect:/Roles/indexRoles";
	}
	
	@PostMapping("/nuevoRol")
	public void crearRol(@RequestBody  Roles  nuevoRol) {
		servicioRoles.crearRoles( nuevoRol);
	}
	@GetMapping("/listaRoles")
	public List<Roles> listaRoles() {
		return servicioRoles.listaRoles();
	}

	@PostMapping("/actualizarRoles /{Roles }")
	public void Actualizar(@PathVariable int  idRoles, @RequestBody Roles  actualizarRoles) {
		servicioRoles.actualizarRoles(actualizarRoles);
	}
	@GetMapping("/buscarRoles/{nombreRol}")
	public  Roles buscarRoles(@PathVariable int  idRoles) {
		return servicioRoles.buscarporidRoles( idRoles);
	}	

	@DeleteMapping("/eliminarRoles/{Roles}")
	public void eliminarRoles(@PathVariable int Roles) {
		servicioRoles.eliminarRoles(Roles);
	}
	

	
	
}
