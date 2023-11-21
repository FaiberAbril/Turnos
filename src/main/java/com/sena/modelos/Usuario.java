package com.sena.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int  idUsuario;

@Column(length = 50)
 private String cedula;

@Column(length = 50)
 private String nombre;

@Column(length = 50)
 private String apellido;

@Column(length = 50)
 private String edad;

@Column(length = 50)
 private String email;

 public Usuario() {
	// TODO Auto-generated constructor stub
}
public Usuario(int idUsuario, String cedula, String nombre, String apellido, String edad, String email) {
	
	this.idUsuario = idUsuario;
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.email = email;
}
public int getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
}
public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getEdad() {
	return edad;
}
public void setEdad(String edad) {
	this.edad = edad;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
 

 
 
}
