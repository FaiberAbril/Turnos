package com.sena.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sena.Servicios.UsuarioServicios;
import com.sena.modelos.Usuario;

@Controller

public class usuariocontroller {

	@Autowired
	private UsuarioServicios usuarioservicio;

	@GetMapping("/indexusuario")
	public String index(Model model) {
		model.addAttribute("listausuarios",usuarioservicio.listaUsuario());
		return "indexusuario";
	}

	@GetMapping("/Formulariousuario")
	public String crearusuario(Model model) {
		model.addAttribute("Objusuario", new Usuario());
		
		return "Formulariousuario";
	}

	@PostMapping("/Guardarusuario")
	public String guardarusuario(@ModelAttribute("Objusuario") Usuario nuevousuario) {
		usuarioservicio.crearUsuario(nuevousuario);
		return "redirect:/usuario/indexusuario";
	}

	@PostMapping("/nuevousuario")
	public void crearUsuario(@RequestBody  Usuario nuevousuario) {
		usuarioservicio.crearUsuario(nuevousuario);
	}

	@GetMapping("/listausuario")
	public List<Usuario> listausuario() {
		return usuarioservicio.listaUsuario();
	}

	@PostMapping("/actualizarusuario/{usuario}")
	public void Actualizar(@PathVariable int idUsuario, @RequestBody Usuario actualizarUsuario) {
		usuarioservicio.actualizarUsuario(actualizarUsuario);
	}

	@GetMapping("/buscarusuario/{nombreusuario}")
	public Usuario buscarusuario(@PathVariable int idusuario) {
		return usuarioservicio.buscarporidUsuario(idusuario);
	}	

	@DeleteMapping("/eliminarusuario/{usuario}")
	public void eliminarusuario(@PathVariable int usuario) {
		usuarioservicio.eliminarUsuario(usuario);
	}


}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

