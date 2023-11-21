package com.sena.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Roles")
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRoles;
	
	@Column(length = 50)
	private String administrador;
	
	@Column(length = 50)
	private String cajero;
	
	public Roles() {
		// TODO Auto-generated constructor stub
	}

	public Roles(int idRoles, String administrador, String cajero) {
		
		this.idRoles = idRoles;
		this.administrador  = administrador;
		this.cajero = cajero;
	}

	public int getIdRoles() {
		return idRoles;
	}

	public void setIdRoles(int idRoles) {
		this.idRoles = idRoles;
	}

	public String getAdministrador() {
		return administrador;
	}

	public void setAdministrador(String administrador) {
		this.administrador  = administrador;
	}

	public String getCajero() {
		return cajero;
	}

	public void setCajero(String cajero) {
		this.cajero = cajero;
	}



	
}
