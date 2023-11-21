package com.sena.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Turnos")
public class Turnos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTurnos;
	
	@Column(length = 50)
	private String usuario;
	
	@Column(length = 50)
	private String caja;
	
	public Turnos() {
		// TODO Auto-generated constructor stub
	}

	

	public Turnos(int idTurnos, String usuario, String caja) {
		
		this.idTurnos = idTurnos;
		this.usuario = usuario;
		this.caja = caja;
	}



	public int getIdTurnos() {
		return idTurnos;
	}

	public void setIdTurnos(int idTurnos) {
		this.idTurnos = idTurnos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCaja() {
		return caja;
	}

	public void setCaja(String caja) {
		this.caja = caja;
	}

	
	


}
