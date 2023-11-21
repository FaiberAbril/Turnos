package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Repository.CajasRepository;
import com.sena.modelos.Cajas;




@Service
public class ServicioCajas {
	
	
   @Autowired
	private CajasRepository cajasrepositorio;
   
   
   public void crearCajas(Cajas cajas) {
	   cajasrepositorio.save(cajas);
	} 	
   
   public void actualizarCajas(Cajas cajas) {
	   cajasrepositorio.save(cajas);
	}
   
   public void eliminarCajas(int idCaja) {
	   cajasrepositorio.deleteById(idCaja);
	}
   public List<Cajas> listaCajas(){
		return cajasrepositorio.findAll();
	}
   
   public Cajas buscarporidCaja(int idCaja) {
		return cajasrepositorio.findById(idCaja).get(); 
	}

	
}
