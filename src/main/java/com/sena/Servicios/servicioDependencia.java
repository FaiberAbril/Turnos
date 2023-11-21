package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Repository.DependenciaRepository;
import com.sena.modelos.Dependencia;




@Service
public class servicioDependencia {
	
	@Autowired
	private DependenciaRepository dependenciarepositorio;
	
	public void crearDependencia(Dependencia dependencia) {
		dependenciarepositorio.save(dependencia);
	} 	
	
	public void actualizarDependencia(Dependencia dependencia) {
		dependenciarepositorio.save(dependencia);
	}
	
	public void eliminarDependencia(int idDependencia) {
		dependenciarepositorio.deleteById(idDependencia);
	}
	
	public List<Dependencia> listaDependencia(){
		return dependenciarepositorio.findAll();
	}
	
	public Dependencia buscarporidDependencia(int idDependencia) {
		return dependenciarepositorio.findById(idDependencia).get(); 
	}
   

	
	
}
