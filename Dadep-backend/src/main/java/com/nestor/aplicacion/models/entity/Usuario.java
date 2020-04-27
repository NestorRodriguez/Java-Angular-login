package com.nestor.aplicacion.models.entity;

import java.io.Serializable;

public class Usuario implements Serializable {

	private long id;
	private String nombreCompleto;
	private String pass;
	private String email;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(long id, String nombreCompleto, String pass, String email) {
		super();
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.pass = pass;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreCompleto=" + nombreCompleto + ", pass=" + pass + ", email=" + email + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
