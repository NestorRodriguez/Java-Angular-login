package com.nestor.aplicacion.models.services;

import java.util.List;

import com.nestor.aplicacion.models.entity.Usuario;

public interface IUsuarioServices {
	
	public Usuario buscarUsuarioId(int id);
	
	public List<Usuario> findAll();
	
	public int counter();
	
	public Usuario findUsuarioUserPass(String user, String pass); 
	
}
