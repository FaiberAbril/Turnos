package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Repository.RolesRepository;
import com.sena.modelos.Roles;



@Service
public class servicioRoles {
	
	@Autowired
	private RolesRepository rolesrepositorio;
	
	public void crearRoles(Roles roles) {
		rolesrepositorio.save(roles);
	} 	
	
	public void actualizarRoles(Roles roles) {
		rolesrepositorio.save(roles);
		
	}
	
	public void eliminarRoles(int idRoles) {
		rolesrepositorio.deleteById(idRoles);
	}
	
	public List<Roles> listaRoles(){
		return rolesrepositorio.findAll();
	}
	
	public Roles buscarporidRoles(int idRoles) {
		return rolesrepositorio.findById(idRoles).get(); 
	}
	
	
	
	
}
