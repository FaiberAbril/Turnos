
package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Repository.UsuarioRepository;
import com.sena.modelos.Usuario;

@Service
public class UsuarioServicios { 
	
	@Autowired
	private UsuarioRepository usuariorepositorio;

	public void crearUsuario(Usuario usuario) {
		usuariorepositorio.save(usuario);
	} 	
		
	public void actualizarUsuario(Usuario usuario) {
		usuariorepositorio.save(usuario);
		
	}

	public void eliminarUsuario(int idUsuario) {
		usuariorepositorio.deleteById(idUsuario);
	}
	
	public List<Usuario> listaUsuario(){
		return usuariorepositorio.findAll();
	}
	
	public Usuario buscarporidUsuario(int idUsuario) {
		return usuariorepositorio.findById(idUsuario).get(); 
	}
   
	
}


