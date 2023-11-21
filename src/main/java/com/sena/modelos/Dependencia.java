package com.sena.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Dependencia")
public class Dependencia {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
 private int idDependencia;

@Column(length = 50)
 private String nombre;

@Column(length = 50)
 private String facturacion;

@Column(length = 50)
 private String radiografia;
 
 
 public Dependencia() {
	// TODO Auto-generated constructor stub
}


public Dependencia(int idDependencia, String nombre, String facturacion, String radiografia) {
	
	this.idDependencia = idDependencia;
	this.nombre = nombre;
	this.facturacion = facturacion;
	this.radiografia = radiografia;
}


public int getIdDependencia() {
	return idDependencia;
}


public void setIdDependencia(int idDependencia) {
	this.idDependencia = idDependencia;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getFacturacion() {
	return facturacion;
}


public void setFacturacion(String facturacion) {
	this.facturacion = facturacion;
}


public String getRadiografia() {
	return radiografia;
}


public void setRadiografia(String radiografia) {
	this.radiografia = radiografia;
}




 
 
 
}
