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

import com.sena.Servicios.servicioDependencia;
import com.sena.modelos.Dependencia;






public class dependenciascontroller {

	@Autowired
	private servicioDependencia servicioDependencia ;

	@GetMapping("/indexDependencia")
	public String index(Model model) {
		model.addAttribute("listaDependencia",servicioDependencia.listaDependencia());
		return "indexDependencia";
}

	@GetMapping("/FormularioDependencia")
	public String crearDependencia(Model model) {
		model.addAttribute("Dependencia", new Dependencia());
		
		return "FormularioDependencia";
	}
	
	@PostMapping("/GuardarDependencia")
	public String guardarDependencia(@ModelAttribute("Dependencia")Dependencia nuevaDependencia) {
		servicioDependencia.crearDependencia(nuevaDependencia);
		return "redirect:/Dependencia/indexDependencia";
	}
	

	@PostMapping("/nuevaDependencia")
	public void crearDependencia(@RequestBody Dependencia nuevaDependencia) {
		servicioDependencia.crearDependencia(nuevaDependencia);
	}
	
	@GetMapping("/listaDependencia")
	public List<Dependencia> listaDependencia() {
		return servicioDependencia.listaDependencia();
	}
	
	@PostMapping("/actualizarDependencia/{Dependencia}")
	public void Actualizar(@PathVariable int idDependencia, @RequestBody Dependencia actualizarDependencia) {
		servicioDependencia.actualizarDependencia(actualizarDependencia);
	}
	@GetMapping("/buscarDependencia/{nombreDependencia}")
	public Dependencia buscarDependencia(@PathVariable int idDependencia) {
		return servicioDependencia.buscarporidDependencia(idDependencia);
	}	
	
	@DeleteMapping("/eliminarDependencia/{Dependencia}")
	public void eliminarDependencia(@PathVariable int Dependencia) {
		servicioDependencia.eliminarDependencia(Dependencia);
	}

}

