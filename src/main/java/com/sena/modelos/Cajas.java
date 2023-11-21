package com.sena.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cajas")
public class Cajas {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int idCaja;

@Column(length = 50)
 private String nombreCaja;

@Column(length = 50)
 private String dependencias;
 
 
 public Cajas() {
	// TODO Auto-generated constructor stub
}


public Cajas(int idCaja, String nombreCaja, String dependencias) {
	
	this.idCaja = idCaja;
	this.nombreCaja = nombreCaja;
	this.dependencias = dependencias;
}


public int getIdCaja() {
	return idCaja;
}


public void setIdCaja(int idCaja) {
	this.idCaja = idCaja;
}


public String getNombreCaja() {
	return nombreCaja;
}


public void setNombreCaja(String nombreCaja) {
	this.nombreCaja = nombreCaja;
}


public String getDependencias() {
	return dependencias;
}


public void setDependencias(String dependencias) {
	this.dependencias = dependencias;
}
 

 
}
