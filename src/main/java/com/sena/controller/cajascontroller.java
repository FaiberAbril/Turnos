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

import com.sena.Servicios.ServicioCajas;
import com.sena.modelos.Cajas;





public class cajascontroller {
	
	@Autowired
	private ServicioCajas  ServicioCajas;

	
	@GetMapping("/indexCajas")
	public String index(Model model) {
		model.addAttribute(" listaCajas", ServicioCajas.listaCajas());
		return "indexCajas";
	}
	
	@GetMapping("/FormularioCajas")
	public String crearRoles(Model model) {
		model.addAttribute("Cajas", new Cajas());
		return "FormularioCajas";
	}
	
	
	@PostMapping("/GuardarCajas")
	public String guardarCajas(@ModelAttribute("Roles") Cajas nuevaCaja) {
		ServicioCajas.crearCajas(nuevaCaja);
		return "redirect:/Cajas/indexCajas";
	}
	
	@PostMapping("/nuevaCaja")
	public void crearCajas(@RequestBody  Cajas nuevaCaja) {
		ServicioCajas.crearCajas( nuevaCaja);
	}
	
	@GetMapping("/listaCajas")
	public List<Cajas> listaCajas() {
		return ServicioCajas.listaCajas();
	}
	
	@PostMapping("/actualizarCajas /{Cajas }")
	public void Actualizar(@PathVariable int  idCaja, @RequestBody   Cajas  actualizarCajas) {
		ServicioCajas.actualizarCajas(actualizarCajas);
	}
	
	@GetMapping("/buscarCajas/{nombreCaja}")
	public Cajas buscarCajas(@PathVariable int idCaja) {
		return ServicioCajas.buscarporidCaja( idCaja);
	}
	
	@DeleteMapping("/eliminarCajas/{Cajas}")
	public void eliminarCajas(@PathVariable int Cajas) {
		ServicioCajas.eliminarCajas(Cajas);
	}
	
}
